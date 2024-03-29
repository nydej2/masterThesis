import antlr4 from 'antlr4';
import VizRepLexer from './VizRepLexer.js';
import VizRepParser from './VizRepParser';
import VizRepListener from './VizRepListener';

export class HtmlVizRepListener extends VizRepListener {

  constructor(res){
    super();
    this.widthString = "width";
    this.depthString = "depth";
    this.heightString = "height";
  }

enterCommandChain(ctx){
  this.Res = "async function vizRep(gc){";
  this.addZeilenUmbruch();
  }

exitCommandChain(ctx){
    this.Res = this.Res + "};"
  }

enterCondition(ctx){
    this.executeIfBlock = false;
    this.executeElseBlock = false;
    switch(ctx.OPERATOR().getText()){
      case '<=':
        if(parseInt(ctx.DIGITS()[0]) <= parseInt(ctx.DIGITS()[1])){
          this.executeIfBlock = true;
        } else {
          this.executeElseBlock = true;
        }
        break;
      case '==':
        if(parseInt(ctx.DIGITS()[0]) == parseInt(ctx.DIGITS()[1])){
          this.executeIfBlock = true;
        } else {
          this.executeElseBlock = true;
        }
        break;
      case '>=':
        if(parseInt(ctx.DIGITS()[0]) >= parseInt(ctx.DIGITS()[1])){
          this.executeIfBlock = true;
        } else {
          this.executeElseBlock = true;
        }
        break;
      case '>':
        if(parseInt(ctx.DIGITS()[0]) > parseInt(ctx.DIGITS()[1])){
          this.executeIfBlock = true;
        } else {
          this.executeElseBlock = true;
        }
        break;
      case '<':
        if(parseInt(ctx.DIGITS()[0]) < parseInt(ctx.DIGITS()[1])){
          this.executeIfBlock = true;
        } else {
          this.executeElseBlock = true;
        }
        break;
    }
  }

enterRelCommandFrom(ctx){

    if(ctx.getText().includes('TEXT')){
      this.Res = this.Res + "await gc.rel_graphic_text_from("
      console.log("its a text");
    } else {
      this.addAwait();
      this.Res = this.Res + "gc.rel_from_object(";
      console.log("its a regular shape");
    }
  }

enterRelCommandTo(ctx){
  if(ctx.getText().includes('TEXT')){
    this.Res = this.Res + "await gc.rel_graphic_text_to("
  } else {
    this.addAwait();
    this.Res = this.Res + "gc.rel_to_object(";
    console.log("its a regular shape");
  }
}


exitRelCommandFrom(ctx){
    this.Res = this.Res + ");";
    this.addZeilenUmbruch();
  }

exitRelCommandTo(ctx){
    this.Res = this.Res + ");";
    this.addZeilenUmbruch();
  }

  exitSetVariable(ctx){

    var variables = [];
  
    var varName = ctx.STRING()[0].getText();
  
    //Workaround for assigning value dynamically depending on input type.
    if(ctx.STRING()[1]){
      var varValue = ctx.STRING()[1];
    }
  
    if(ctx.DIGITS()){
      var varValue = ctx.DIGITS();
    }
    if(ctx.DYNVALSTRING()){
      var varValue = ctx.DYNVALSTRING().getText();
    }
  
    for(var i=0; i < ctx.BOOLEANSTRING().length; i++){
      var booleanName = ctx.VARASSPARAMS()[i].getText();
      var booleanValue = ctx.BOOLEANSTRING()[i].getText();
      variables.push({booleanName: booleanName, booleanValue: booleanValue})
    }
  
    this.Res = this.Res 
    + "await gc.setVariable('" 
    + varName 
    + "',";
  
    if(variables.find(o => o.booleanName === "isDynval").booleanValue == 'True'){
      this.Res  = this.Res 
      +"await gc.dynval('" + varValue + "', await gc.get_current_class_instance_uuid()),"
    } else {
      this.Res = this.Res 
      + varValue + ",";
    }
    
    this.Res = this.Res
    + variables.find(o => o.booleanName === "instanceAdaptable").booleanValue.toLowerCase() + ");"
  
    this.addZeilenUmbruch();
  }
  
  exitGetVariable(ctx){
      console.log(ctx.STRING());
  }
  
/**
 * CUBE CREATION FUNCTIONS 
 */

exitCube(ctx){
  this.cubeCreation(ctx);
  this.Res = this.Res + ";"
  this.addZeilenUmbruch();
  }

exitIfCube(ctx){

    if(this.executeIfBlock){
      this.exitCube(ctx);
    }
  }
  
exitElseCube(ctx){
    if(this.executeElseBlock){
      this.exitCube(ctx);
    }
  }

exitRelCube(ctx){
  this.cubeCreation(ctx);
  }

  //Alternative implementation of providing functionality for applying dynamic input values.
  /*
cubeCreation(ctx){

  var dimensions = [];
  for(var i=0; i < ctx.DIGITS().length; i++){
    var dimension = ctx.DIMENSION3D()[i].getText();
    var dimensionValue = ctx.DIGITS()[i].getText();
    dimensions.push({dimension: dimension, dimensionValue :dimensionValue})
  }

  var dimensionsDyn = [];
  if(ctx.STRING){
    for(var i=0; i < ctx.STRING().length; i++){
      var dimensionDyn = ctx.DIMENSION3DDYN()[i].getText();
      var dimensionDynValue = ctx.STRING()[i].getText();
      dimensionsDyn.push({dimensionDyn: dimensionDyn, dimensionDynValue: dimensionDynValue});
    }
  }

  this.addAwait();
  this.Res = this.Res
  + "gc.graphic_cube("; 
  if(dimensions.find(o => o.dimension === this.widthString)){
    this.Res = this.Res + dimensions.find(o => o.dimension === this.widthString).dimensionValue + ",";
  } else if (dimensionsDyn.find(o => o.dimensionDyn === 'widthDyn')){
    this.Res = this.Res + "await gc.getVariableValue(\'" + dimensionsDyn.find(o => o.dimensionDyn === 'widthDyn').dimensionDynValue + "\'),";
  }

  if(dimensions.find(o => o.dimension === this.heightString)){
    this.Res = this.Res + dimensions.find(o => o.dimension === this.heightString).dimensionValue + ",";
  } else if(dimensionsDyn.find(o => o.dimensionDyn === 'heightDyn')){
    this.Res = this.Res + "await gc.getVariableValue(\'" + dimensionsDyn.find(o => o.dimensionDyn === 'heightDyn').dimensionDynValue + "\'),";
  }

  if(dimensions.find(o => o.dimension === this.depthString)){
    this.Res = this.Res + dimensions.find(o => o.dimension === this.depthString).dimensionValue;
  } else if(dimensionsDyn.find(o => o.dimensionDyn === 'depthDyn')){
    this.Res = this.Res + "await gc.getVariableValue(\'" + dimensionsDyn.find(o => o.dimensionDyn === 'depthDyn').dimensionDynValue + "\')";

  }

  if(this.color){
    this.Res = this.Res + ",\'" + this.color + "\'";
  } 
  if (this.map){
    this.Res = this.Res + ", \'" + this.map + "\'"; 
  }

  this.Res = this.Res + ")"
}
*/

cubeCreation(ctx){

  var dimensions = [];
  for(var i=0; i < ctx.dimInput().length; i++){
    var dimension = ctx.dimInput()[i].DIMENSION3D().getText();
  
    if(ctx.dimInput()[i].DYNINPUT()){
      var dimensionValue = ctx.dimInput()[i].DYNINPUT().getText();
    }

    if(ctx.dimInput()[i].DIGITS()){
      var dimensionValue = ctx.dimInput()[i].DIGITS().getText();
    }

    dimensions.push({dimension: dimension, dimensionValue :dimensionValue});
  }

  this.addAwait();
  this.Res = this.Res + "gc.graphic_cube(";
  
  if(dimensions.find(o => o.dimension === this.widthString)){
    var widthValue = dimensions.find(o => o.dimension === this.widthString).dimensionValue;
    if(widthValue.includes('(')){
      this.Res = this.Res + "await gc.getVariableValue(\'" + widthValue.substring(1, widthValue.length -1) + "\'),";
    } else{
      this.Res = this.Res + widthValue + ",";
    }
  }

  if(dimensions.find(o => o.dimension === this.heightString)){
    var heightValue = dimensions.find(o => o.dimension === this.heightString).dimensionValue;
    if(heightValue.includes('(')){
      this.Res = this.Res + "await gc.getVariableValue(\'" + heightValue.substring(1, heightValue.length -1) + "\'),";
    } else{
      this.Res = this.Res + heightValue + ",";
    }
  }

  if(dimensions.find(o => o.dimension === this.depthString)){
    var depthValue = dimensions.find(o => o.dimension === this.depthString).dimensionValue;
    if(depthValue.includes('(')){
      this.Res = this.Res + "await gc.getVariableValue(\'" + depthValue.substring(1, depthValue.length -1) + "\')";
    } else{
      this.Res = this.Res + depthValue;
    }
  }

  if(this.color){
    this.Res = this.Res + ",\'" + this.color + "\'";
  } 
  if (this.map){
    this.Res = this.Res + ", \'" + this.map + "\'"; 
  }

  this.Res = this.Res + ")"
}

/**
 * SPHERE CREATION FUNCTIONS 
 */

exitSphere(ctx){
  this.sphereCreation(ctx);
  this.Res = this.Res + ";";
  this.addZeilenUmbruch();
}

exitIfSphere(ctx){
  if(this.executeIfBlock){
  this.sphereCreation(ctx);  
  this.Res = this.Res + ";";
  this.addZeilenUmbruch();

}
}

exitElseSphere(ctx){
  if(this.executeElseBlock){
    this.sphereCreation(ctx);
    this.Res = this.Res + ";";
    this.addZeilenUmbruch();
  }
}

exitRelSphere(ctx){
  this.sphereCreation(ctx);
}

sphereCreation(ctx){
  var dimensions = [];
  for(var i=0; i < ctx.sphereDimInput().length; i++){
    var dimension = ctx.sphereDimInput()[i].SPHEREPARAMS().getText();
    if(ctx.sphereDimInput()[i].DYNINPUT()){
      var dimensionValue = ctx.sphereDimInput()[i].DYNINPUT().getText();
    } else if(ctx.sphereDimInput()[i].DIGITS()){
      var dimensionValue = ctx.sphereDimInput()[i].DIGITS().getText();
    }
    dimensions.push({dimension: dimension, dimensionValue :dimensionValue});
  }
  this.Res = this.Res + "await gc.graphic_sphere(";
  if(dimensions.find(o => o.dimension === "radius")){
    var radius = dimensions.find(o => o.dimension === "radius").dimensionValue;
    if(radius.includes('(')){
      this.Res = this.Res 
      + "await gc.getVariableValue(\'" 
      + radius.substring(1, radius.length -1) 
      + "\')"; 
    } else {
      this.Res = this.Res + radius + ",";
    }
  }
  if(dimensions.find(o => o.dimension === "widthSegment")){
    var widthSegment = dimensions.find(o => o.dimension === "widthSegment").dimensionValue;
    if(widthSegment.includes('(')){
      this.Res = this.Res 
      + "await gc.getVariableValue(\'" 
      + widthSegment.substring(1, widthSegment.length -1) 
      + "\')"; 
    } else {
      this.Res = this.Res + widthSegment + ",";
    }
  }
  if(dimensions.find(o => o.dimension === "heightSegment")){
    var heightSegment = dimensions.find(o => o.dimension === "heightSegment").dimensionValue;
    if(heightSegment.includes('(')){
      this.Res = this.Res 
      + "await gc.getVariableValue(\'" 
      + heightSegment.substring(1, heightSegment.length -1) 
      + "\')"; 
    } else {
      this.Res = this.Res + heightSegment;
    }
  }
  if(this.color){
    this.Res = this.Res + ",\'" + this.color + "\'";
  } 
  if (this.map){
    this.Res = this.Res + ",\'" + this.map + "\'"; 
  }
  this.Res = this.Res + ")"
}

/**
 * PLANE CREATION FUNCTIONS 
 */

exitPlane(ctx){
  this.planeCreation(ctx);
  this.Res = this.Res + ";";
  this.addZeilenUmbruch();
}

exitIfPlane(ctx){
  if(this.executeIfBlock){
    this.planeCreation(ctx);
    this.Res = this.Res + ";";
    this.addZeilenUmbruch();
  }
}

exitElsePlane(ctx){
  if(this.executeElseBlock){
    this.planeCreation(ctx);
    this.Res = this.Res + ";";
    this.addZeilenUmbruch();
  }
}

exitRelPane(ctx){
  this.planeCreation(ctx);
}

planeCreation(ctx){
  var dimensions = [];
  for(var i=0; i < ctx.dimInput().length; i++){
    var dimension = ctx.dimInput()[i].DIMENSION3D().getText();
  
    if(ctx.dimInput()[i].DYNINPUT()){
      var dimensionValue = ctx.dimInput()[i].DYNINPUT().getText();
    }

    if(ctx.dimInput()[i].DIGITS()){
      var dimensionValue = ctx.dimInput()[i].DIGITS().getText();
    }

    dimensions.push({dimension: dimension, dimensionValue :dimensionValue});
  }

  this.Res = this.Res
  + "await gc.graphic_plane("; 

  if(dimensions.find(o => o.dimension === this.widthString)){
    var widthValue =  dimensions.find(o => o.dimension === this.widthString).dimensionValue;
    if(widthValue.includes('(')){
      this.Res = this.Res + "await gc.getVariableValue(\'" 
      + widthValue.substring(1, widthValue.length -1) + "\'),";
    } else {
      this.Res = this.Res + widthValue+ ',';
    }
  }

  if(dimensions.find(o => o.dimension === this.heightString)){
    var heightValue =  dimensions.find(o => o.dimension === this.heightString).dimensionValue;
    if(heightValue.includes('(')){
      this.Res = this.Res + "await gc.getVariableValue(\'" 
      + heightValue.substring(1, heightValue.length -1) + "\')";
    } else {
      this.Res = this.Res + heightValue ;
    }
  }

  if(this.color){
    this.Res = this.Res + ",\'" + this.color + "\'";
  } 
  if (this.map){
    this.Res = this.Res + ",\'" + this.map + "\'"; 
  }

  this.Res = this.Res + ")";
}

/**
 * LINE CREATION FUNCTIONS 
 */

exitLine(ctx){
  console.log("lineWidth" + ctx.DIGITS());
  this.lineCreation(ctx);
  this.addZeilenUmbruch();
}

exitIfLine(ctx){
  if(this.executeIfBlock){
    this.lineCreation(ctx);
    this.addZeilenUmbruch();
  }
}

exitElseLine(ctx){
  if(this.executeElseBlock){
    this.lineCreation(ctx);
    this.addZeilenUmbruch();
  }
}

lineCreation(ctx){
  this.addAwait();
  this.Res = this.Res 
  + "gc.rel_graphic_line("
  + "\'" + this.color + "\',"
  + ctx.DIGITS() + ","
  + this.isDashed + ","
  + this.dashScale + ","
  + this.dashSize + ","
  + this.gapSize + ");" 
}

/**
 * TEXT CREATION FUNCTIONS 
 */

exitText(ctx){
 this.textCreation(ctx);
 this.Res = this.Res + ";";
 this.addZeilenUmbruch();
}

exitIfText(ctx){
  if(this.executeIfBlock){
    this.textCreation(ctx);
    this.Res = this.Res + ";";
    this.addZeilenUmbruch();
  }
}

exitElseText(ctx){
  if(this.executeElseBlock){
    this.textCreation(ctx);
    this.Res = this.Res + ";";
    this.addZeilenUmbruch();
  }
}

exitRelText(ctx){
  this.textCreation(ctx);
}

textCreation(ctx){
  var textDimDigits = [];
    for(var i=0; i < ctx.TEXTPARAMDIGITS().length; i++){
      var dimension = ctx.TEXTPARAMDIGITS()[i].getText();
      var dimensionValue = ctx.DIGITS()[i].getText();
      textDimDigits.push({dimension: dimension, dimensionValue :dimensionValue})
    }

  var textDimString = [];
    for(var i=0; i < ctx.TEXTPARAMSTRING().length; i++){
      var dimension = ctx.TEXTPARAMSTRING()[i].getText();
      var dimensionValue = ctx.STRING()[i].getText();
      textDimString.push({dimension: dimension, dimensionValue :dimensionValue})
    }
  
  this.Res = this.Res
  + "await gc.graphic_text(" 
  + textDimDigits.find(o => o.dimension === "xRel").dimensionValue + "," 
  + textDimDigits.find(o => o.dimension === "yRel").dimensionValue + ","
  + textDimDigits.find(o => o.dimension === "zRel").dimensionValue + ","
  + textDimDigits.find(o => o.dimension === "size").dimensionValue + ","
  + "\'" +textDimString.find(o => o.dimension === "text").dimensionValue + "\'";
  

  //Optional parameters
  if(textDimString.find(o => o.dimension === "posNameX")){
    this.Res = this.Res + ", \'" + textDimString.find(o => o.dimension === "posNameX").dimensionValue + "\'";
  }
  if(textDimString.find(o => o.dimension === "posNameY")){
    this.Res = this.Res + ", \'" + textDimString.find(o => o.dimension === "posNameY").dimensionValue + "\'"; 
  }
  if(textDimString.find(o => o.dimension === "posNameZ")){
    this.Res = this.Res + ", \'" + textDimString.find(o => o.dimension === "posNameZ").dimensionValue + "\'";
  }
  this.Res = this.Res + ")";
  ; 
}

/**
 * COLOR CREATION FUNCTIONS 
 */

exitColor(ctx){
    this.color = ctx.STRING();
    console.log("color set to: " + this.color);
}

exitIfColor(ctx){
  if(this.executeIfBlock){
  this.color = ctx.STRING();
  console.log("color set to: " + this.color);
  }
}

exitElseColor(ctx){
  if(this.executeElseBlock){
  this.color = ctx.STRING();
  console.log("color set to: " + this.color);
  }
}

/**
 * MAP CREATION FUNCTIONS 
 */

exitMap(ctx){
    this.map = "data:image/png;base64,";
    this.map = this.map + ctx.MAPLEXER();
  }

exitIfMap(ctx){
  if(this.executeIfBlock){
    this.map = ctx.MAPLEXER();
  }
}

exitEleseMap(ctx){
  if(this.executeElseBlock){
    this.map = ctx.MAPLEXER();
  }
}

/**
 * PEN CREATION FUNCTIONS 
 */

exitPen(ctx){
  this.createPen(ctx);
}

exitIfPen(ctx){
  if(this.executeIfBlock){
    this.createPen(ctx);
  }
}

exitElsePen(ctx){
  if(this.executeElseBlock){
    this.createPen(ctx);
  }
}

createPen(ctx){
  this.isDashed = ctx.STRING();
  var penParams = [];
    for(var i=0; i < ctx.DIGITS().length; i++){
      var penParam = ctx.PENPARAMS()[i].getText();
      var penParamValue = ctx.DIGITS()[i].getText();
      penParams.push({penParam: penParam, penParamValue :penParamValue})
    }

  this.dashScale = penParams.find(o => o.penParam === 'dashScale').penParamValue;
  this.gapSize = penParams.find(o => o.penParam === 'gapSize').penParamValue;
  this.dashSize = penParams.find(o => o.penParam === 'dashSize').penParamValue;

  console.log("Pen setted to: isDashed: " + this.isDashed + ", dashScale: " + this.dashScale + ", gapSize: " + this.gapSize + ", dashSize: " + this.dashSize);
}

addZeilenUmbruch(){
  this.Res = this.Res + "\n"
}

addAwait(){
  this.Res = this.Res + "await ";
}

exitVarAssignment(ctx){

}
}
