import { VizRepPreviewer } from './../vizRep_previewer/vizRep_previewer';
import antlr4 from "antlr4";
const { CommonTokenStream, InputStream } = antlr4;
import VizRepLexer from './parser/VizRepLexer.js';
import VizRepParser from './parser/VizRepParser';
import { HtmlVizRepListener } from './parser/HtmlVizRepListener.js';

export class MiddeBody{
  
  public input = '';
  public parsedResult = '';

  constructor(){

/*    var input = `
    COLOR: fill: red;
    IF(4 <= 5)
    THEN
    CUBE: height:14, width: 1, depth:7;
    ELSE
    CUBE: height:3, width: 2, depth:1;
    END IF
    `;

    var input = `
    IF(4 >= 5)
    THEN
    CUBE: height:1, width: 33, depth:7;
    ELSE
    CUBE: height:999, width: 999, depth:999;
    END IF
    CUBE: height: 12,width:2, depth:34;
    COLOR: fill: red;
    CUBE: height:14, width: 1, depth:7;
    COLOR: fill: green;
    MAP: map: someString;
    CUBE: height: 1,width: 33, depth:7;
    SPHERE:  radius: 3, widthSegment: 2, heightSegment: 1;`

    var input3 = `
    COLOR: fill: red; 
    PEN: dashed: true , dashScale: 1, gapSize: 2, dashSize: 3;
    LINE: linewidth: 4;
    START 
    TEXT: xRel: 1, yRel: 2, zRel: 3, size: 4, text: someString, posNameX: a, posNameY: b, posNameZ: c;
    PLANE: width: 12, height: 7;
    END
    CUBE: height:14, width: 1, depth:7;`;
*/

  }

  parse(){
    var chars = new InputStream(this.input, true);
    var lexer = new VizRepLexer(chars);
    var tokens = new CommonTokenStream(lexer);
    var parser = new VizRepParser(tokens);
    var tree = parser.commandChain();

    var htmlVizRep = new HtmlVizRepListener(this.input);
    antlr4.tree.ParseTreeWalker.DEFAULT.walk(htmlVizRep, tree);
    console.log("response from parser: " + htmlVizRep.Res);

    this.parsedResult = htmlVizRep.Res;
  }

  attached(){

  }
}
