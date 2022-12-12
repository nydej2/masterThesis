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
  this.Res = "function vizRep(gc){";
  }

exitCommandChain(ctx){
    this.Res = this.Res + "};"
  }

enterCondition(ctx){
  console.log("condition entered");
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
    console.log("condition if triggered " + this.executeIfBlock);
  }

enterRelCommandFrom(ctx){

    if(ctx.getText().includes('TEXT')){
      this.Res = this.Res + "rel_graphic_text_from("
      console.log("its a text");
    } else {
      this.Res = this.Res + "rel_from_object(";
      console.log("its a regular shape");
    }
  }
  
exitRelCommandFrom(ctx){
    this.Res = this.Res + ");";
  }

exitCube(ctx){

    var dimensions = [];
    for(var i=0; i < ctx.DIGITS().length; i++){
      var dimension = ctx.DIMENSION3D()[i].getText();
      var dimensionValue = ctx.DIGITS()[i].getText();
      dimensions.push({dimension: dimension, dimensionValue :dimensionValue})
    }

    this.Res = this.Res
    + "gc.graphic_cube(" 
    + this.widthString + ": " + dimensions.find(o => o.dimension === this.widthString).dimensionValue + "," 
    + this.heightString + ": " + dimensions.find(o => o.dimension === this.heightString).dimensionValue + ","
    + this.depthString + ": " + dimensions.find(o => o.dimension === this.depthString).dimensionValue ; 

    if(this.color){
      this.Res = this.Res + ", color: \"" + this.color + "\"";
    } 
    if (this.map){
      this.Res = this.Res + ", map: \"" + this.map + "\""; 
    }

    this.Res = this.Res + ");"
  }

exitRelCube(ctx){
    var dimensions = [];
    for(var i=0; i < ctx.DIGITS().length; i++){
      var dimension = ctx.DIMENSION3D()[i].getText();
      var dimensionValue = ctx.DIGITS()[i].getText();
      dimensions.push({dimension: dimension, dimensionValue :dimensionValue})
    }
  
    this.Res = this.Res
    + "graphic_cube(" 
    + this.widthString + ": " + dimensions.find(o => o.dimension === this.widthString).dimensionValue + "," 
    + this.heightString + ": " + dimensions.find(o => o.dimension === this.heightString).dimensionValue + ","
    + this.depthString + ": " + dimensions.find(o => o.dimension === this.depthString).dimensionValue ; 
  
    if(this.color){
      this.Res = this.Res + ", color: \"" + this.color + "\"";
    } 
    if (this.map){
      this.Res = this.Res + ", map: \"" + this.map + "\""; 
    }
  
    this.Res = this.Res + ")";
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

exitSphere(ctx){
  var dimensions = [];
  for(var i=0; i < ctx.DIGITS().length; i++){
    var dimension = ctx.SPHEREDIMENSIONS()[i].getText();
    var dimensionValue = ctx.DIGITS()[i].getText();
    dimensions.push({dimension: dimension, dimensionValue :dimensionValue})
  }

  this.Res = this.Res
  + "graphic_sphere("
  + "radius: " + dimensions.find(o => o.dimension === "radius").dimensionValue
  + ", widthSegment: " +  dimensions.find(o => o.dimension === "widthSegment").dimensionValue
  + ", heightSegment: " + dimensions.find(o => o.dimension === "heightSegment").dimensionValue

  if(this.color){
    this.Res = this.Res + ", color: \"" + this.color + "\"";
  } 
  if (this.map){
    this.Res = this.Res + ", map: \"" + this.map + "\""; 
  }

  this.Res = this.Res + ");"
}

exitPlane(ctx){
  var dimensions = [];
  for(var i=0; i < ctx.DIGITS().length; i++){
    var dimension = ctx.DIMENSION3D()[i].getText();
    var dimensionValue = ctx.DIGITS()[i].getText();
    dimensions.push({dimension: dimension, dimensionValue :dimensionValue})
  }

  this.Res = this.Res
  + "graphic_plane(" 
  + this.widthString + ": " + dimensions.find(o => o.dimension === this.widthString).dimensionValue + "," 
  + this.heightString + ": " + dimensions.find(o => o.dimension === this.heightString).dimensionValue
  if(this.color){
    this.Res = this.Res + ", color: \"" + this.color + "\"";
  } 
  if (this.map){
    this.Res = this.Res + ", map: \"" + this.map + "\""; 
  }

  this.Res = this.Res + ")";
}

exitLine(ctx){
  this.Res = this.Res 
  + "gc.rel_graphic_line("
  + "color: \"" + this.color + "\","
  + "line_width: " + ctx.DIGITS() + ","
  + "dashed: " + this.isDashed + ","
  + "dash_scale: " + this.dashScale + ","
  + "dash_size: " + this.dashSize + ","
  + "gap_size: " + this.gapSize + ");" 
}

exitText(ctx){
  var textDimDigits = [];
    for(var i=0; i < ctx.TEXTDIMDIGITS().length; i++){
      var dimension = ctx.TEXTDIMDIGITS()[i].getText();
      var dimensionValue = ctx.DIGITS()[i].getText();
      textDimDigits.push({dimension: dimension, dimensionValue :dimensionValue})
    }

  var textDimString = [];
    for(var i=0; i < ctx.TEXTDIMSTRING().length; i++){
      var dimension = ctx.TEXTDIMSTRING()[i].getText();
      var dimensionValue = ctx.STRING()[i].getText();
      textDimString.push({dimension: dimension, dimensionValue :dimensionValue})
    }
  
  this.Res = this.Res
  + "gc.graphic_text(" 
  + "x_rel: " + textDimDigits.find(o => o.dimension === "xRel").dimensionValue + "," 
  + "y_rel: " + textDimDigits.find(o => o.dimension === "yRel").dimensionValue + ","
  + "z_rel: " + textDimDigits.find(o => o.dimension === "zRel").dimensionValue + ","
  + "size: "  + textDimDigits.find(o => o.dimension === "size").dimensionValue + ","
  + "text: "  + textDimString.find(o => o.dimension === "text").dimensionValue + ","
  + "posNameX: "  + textDimString.find(o => o.dimension === "posNameX").dimensionValue + ","
  + "posNameY: "  + textDimString.find(o => o.dimension === "posNameY").dimensionValue + ","
  + "posNameZ: "  + textDimString.find(o => o.dimension === "posNameZ").dimensionValue + ");"
  ; 
}

exitRelText(ctx){
  var textDimDigits = [];
    for(var i=0; i < ctx.TEXTDIMDIGITS().length; i++){
      var dimension = ctx.TEXTDIMDIGITS()[i].getText();
      var dimensionValue = ctx.DIGITS()[i].getText();
      textDimDigits.push({dimension: dimension, dimensionValue :dimensionValue})
    }

  var textDimString = [];
    for(var i=0; i < ctx.TEXTDIMSTRING().length; i++){
      var dimension = ctx.TEXTDIMSTRING()[i].getText();
      var dimensionValue = ctx.STRING()[i].getText();
      textDimString.push({dimension: dimension, dimensionValue :dimensionValue})
    }
  
  this.Res = this.Res
  + "gc.graphic_text(" 
  + "x_rel: " + textDimDigits.find(o => o.dimension === "xRel").dimensionValue + "," 
  + "y_rel: " + textDimDigits.find(o => o.dimension === "yRel").dimensionValue + ","
  + "z_rel: " + textDimDigits.find(o => o.dimension === "zRel").dimensionValue + ","
  + "size: "  + textDimDigits.find(o => o.dimension === "size").dimensionValue + ","
  + "text: "  + textDimString.find(o => o.dimension === "text").dimensionValue + ","
  + "posNameX: "  + textDimString.find(o => o.dimension === "posNameX").dimensionValue + ","
  + "posNameY: "  + textDimString.find(o => o.dimension === "posNameY").dimensionValue + ","
  + "posNameZ: "  + textDimString.find(o => o.dimension === "posNameZ").dimensionValue + ")"
  ; 
}

exitColor(ctx){
    this.color = ctx.STRING();
    console.log("color set to: " + this.color);
  }

exitMap(ctx){
    this.map = ctx.STRING();
  }

exitPen(ctx){
  this.isDashed = ctx.STRING();
  console.log(ctx.STRING());
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

}
