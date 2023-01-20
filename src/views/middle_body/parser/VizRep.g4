grammar VizRep;

/*
 * Parser Rules
 */
 
 commandChain	  : (command | relation | condition | setVariable | NEWLINE)+ (EOF | NEWLINE);

 command	      : shapeCommand | styleCommand | text;

 relation       : line NEWLINE? 'START' NEWLINE? color? NEWLINE? relCommandFrom NEWLINE? text? NEWLINE+? 
                  'END' NEWLINE? color? NEWLINE+? relCommandTo NEWLINE? text?;

 relCommandFrom : relCube | relSphere | relPane | relText;

 relCommandTo   : relCube | relSphere | relPane | relText;

 condition      : 'IF(' DIGITS OPERATOR DIGITS ')' NEWLINE 'THEN' NEWLINE ifBlock NEWLINE 'ELSE' elseBlock 
                  'END IF';

/* The if and else blocks are necessary since it's the most straight forward way to differenciate which node belongs to what 
conditional block
 */

 ifBlock        : (ifCommand | relation | NEWLINE)+;

 elseBlock      : (elseCommand | relation | NEWLINE)+;

 ifCommand      : (ifCube | ifSphere | ifPlane | ifText | ifColor | ifMap | ifPen);

 elseCommand    : (elseCube | elseSphere | elsePlane | elseText | elseColor | elseMap | elsePen);

 setVariable    : 'SET: ' STRING ':' (DYNVALSTRING | STRING | DIGITS) ',' VARASSPARAMS ':' BOOLEANSTRING ',' 
                  VARASSPARAMS ':' BOOLEANSTRING  ';';

 shapeCommand   : cube | sphere | plane;

 styleCommand   : color | map | pen;
 
 cube	    	    : 'CUBE:' dimInput ',' dimInput ',' dimInput';';
 relCube        : 'CUBE:' dimInput ',' dimInput ',' dimInput ';';
 ifCube         : 'CUBE:' dimInput ',' dimInput ',' dimInput ';';
 elseCube       : 'CUBE:' dimInput ',' dimInput ',' dimInput ';';

 sphere         : 'SPHERE:' sphereDimInput ',' sphereDimInput ',' sphereDimInput ';';
 relSphere      : 'SPHERE:' sphereDimInput ',' sphereDimInput ',' sphereDimInput ';';
 ifSphere       : 'SPHERE:' sphereDimInput ',' sphereDimInput ',' sphereDimInput ';';
 elseSphere     : 'SPHERE:' sphereDimInput ',' sphereDimInput ',' sphereDimInput ';';

 plane          : 'PLANE:' dimInput ',' dimInput ';';
 relPane        : 'PLANE:' dimInput ',' dimInput ';';
 ifPlane        : 'PLANE:' dimInput ',' dimInput ';';
 elsePlane      : 'PLANE:' dimInput ',' dimInput ';';

 text           : 'TEXT:' TEXTPARAMDIGITS ':' DIGITS ',' TEXTPARAMDIGITS ':' DIGITS ',' TEXTPARAMDIGITS
                  ':' DIGITS ',' TEXTPARAMDIGITS ':' DIGITS',' TEXTPARAMSTRING ':' STRING (',' TEXTPARAMSTRING 
                  ':' STRING)? (',' TEXTPARAMSTRING ':' STRING)? (',' TEXTPARAMSTRING ':' STRING)?';';
 relText        : 'TEXT:' TEXTPARAMDIGITS ':' DIGITS ',' TEXTPARAMDIGITS ':' DIGITS ',' TEXTPARAMDIGITS
                  ':' DIGITS ',' TEXTPARAMDIGITS ':' DIGITS',' TEXTPARAMSTRING ':' STRING (',' TEXTPARAMSTRING 
                  ':' STRING)? (',' TEXTPARAMSTRING ':' STRING)? (',' TEXTPARAMSTRING ':' STRING)?';';
 ifText        : 'TEXT:' TEXTPARAMDIGITS ':' DIGITS ',' TEXTPARAMDIGITS ':' DIGITS ',' TEXTPARAMDIGITS
                  ':' DIGITS ',' TEXTPARAMDIGITS ':' DIGITS',' TEXTPARAMSTRING ':' STRING (',' TEXTPARAMSTRING 
                  ':' STRING)? (',' TEXTPARAMSTRING ':' STRING)? (',' TEXTPARAMSTRING ':' STRING)?';';
 elseText        : 'TEXT:' TEXTPARAMDIGITS ':' DIGITS ',' TEXTPARAMDIGITS ':' DIGITS ',' TEXTPARAMDIGITS
                  ':' DIGITS ',' TEXTPARAMDIGITS ':' DIGITS',' TEXTPARAMSTRING ':' STRING (',' TEXTPARAMSTRING 
                  ':' STRING)? (',' TEXTPARAMSTRING ':' STRING)? (',' TEXTPARAMSTRING ':' STRING)?';';
                  
 line           : 'LINE:' 'lineWidth:' DIGITS ';';
 ifLine         : 'LINE:' 'lineWidth:' DIGITS ';';
 elseLine       : 'LINE:' 'lineWidth:' DIGITS ';';  

 color          : 'COLOR: fill:' STRING ';';
 ifColor        : 'COLOR: fill:' STRING ';'; 
 elseColor      : 'COLOR: fill:' STRING ';';

 pen            : 'PEN:' PENPARAMSBOOL ':' STRING ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ',' 
                  PENPARAMS ':' DIGITS ';';
 ifPen          : 'PEN:' PENPARAMSBOOL ':' STRING ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ',' 
                  PENPARAMS ':' DIGITS ';';
 elsePen        : 'PEN:' PENPARAMSBOOL ':' STRING ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ',' 
                  PENPARAMS ':' DIGITS ';';
 

 map            : 'MAP: map:' MAPLEXER ';';
 ifMap          : 'MAP: map:' MAPLEXER ';';
 elseMap        : 'MAP: map:' MAPLEXER ';';

 dimInput       : DIMENSION3D ':' (DYNINPUT | DIGITS);

 sphereDimInput : SPHEREPARAMS ':' (DYNINPUT | DIGITS);
 
 /*
 * Lexer Rules
 */
 
fragment LOWERCASE  : [a-z] ;

fragment UPPERCASE  : [A-Z] ;

BOOLEANSTRING   : ('True' | 'False');

SPHEREPARAMS: ('radius' | 'widthSegment' | 'heightSegment');

DIMENSION3D			: (DIMENSION2D | 'depth');

DIMENSION2D			: ('height' | 'width');

TEXTPARAMDIGITS : ('xRel' | 'yRel' | 'zRel' | 'size');

TEXTPARAMSTRING : ('text' | 'posNameX' | 'posNameY' | 'posNameZ');

PENPARAMSBOOL   : 'dashed';

PENPARAMS       : ('dashScale'|'gapSize' | 'dashSize') ;

VARASSPARAMS    : ('instanceAdaptable' | 'isDynval');

DIGITS				  : [0-9.-]+;

STRING 				  : (LOWERCASE | UPPERCASE | '_')+;

MAPLEXER        : ([a-zA-Z0-9_/.+=])+;

WHITESPACE      : (' ' | '\t')+  -> skip;

NEWLINE         : ('\r'? '\n' | '\r')+ ;

OPERATOR        : ('<=' | '==' | '>=' | '<' | '>');

DYNVALSTRING     : (STRING | DIGITS | '-')+;

DYNINPUT        : '(' STRING ')';


