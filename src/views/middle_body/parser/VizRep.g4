grammar VizRep;

/*
 * Parser Rules
 */
 
 commandChain	  : (command | NEWLINE | relation | condition | setVariable)+ (EOF | NEWLINE);

 relation       : line NEWLINE? 'START' NEWLINE? relCommandFrom NEWLINE? relCommandFrom? NEWLINE+? 'END' NEWLINE+? relCommandTo NEWLINE? relCommandTo?;

 relMiddle      : line NEWLINE+? 'START' NEWLINE+? shapeCommand shapeCommand? 'MIDDLE' NEWLINE+? text 'END' NEWLINE+? shapeCommand shapeCommand? ;

 condition      : 'IF(' DIGITS OPERATOR DIGITS ')' NEWLINE 'THEN' NEWLINE ifBlock NEWLINE 'ELSE' elseBlock 'END IF';

 setVariable    : 'SET: ' STRING ':' SOMERULE ',' VARASSVALUES ':' BOOLEANSTRING ',' VARASSVALUES ':' BOOLEANSTRING  ';';

/* The if and else block is necessary since otherwise there is no chance that the context 
 * of te child nodes are aware if they belong to a conditional statement
 */
 ifBlock        : (ifCommand | relation | NEWLINE)+;

 elseBlock      : (elseCommand | relation | NEWLINE)+;

  /* I know its unlucky that we cannot reuse the same shapesCommand / styleCommand parser rules we've already defined. However 
  *  It seems simpler than catching all the cases(conditions, relations, standart) in one shape e.g. Cube. this would be possible
  *  too by accessing parent elements. 
  */
 ifCommand      : (ifCube | ifSphere | ifPlane | ifText | ifColor | ifMap | ifPen);

 elseCommand    : (elseCube | elseSphere | elsePlane | elseText | elseColor | elseMap | elsePen);

 command	    : shapeCommand | styleCommand;

 shapeCommand   : cube | sphere | plane | text;

 styleCommand   : color | map | pen;

 relCommandFrom : relCube | relSphere | relPane | relText;

 relCommandTo   : relCube | relSphere | relPane | relText;
 
 cube	    	    : 'CUBE:' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ';';

 relCube        : 'CUBE:' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ';';

 ifCube         : 'CUBE:' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ';';

 elseCube       : 'CUBE:' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ';';

 sphere         : 'SPHERE:' SPHEREDIMENSIONS ':' DIGITS ',' SPHEREDIMENSIONS ':' DIGITS ',' SPHEREDIMENSIONS ':' DIGITS ';';

 relSphere      : 'SPHERE:' SPHEREDIMENSIONS ':' DIGITS ',' SPHEREDIMENSIONS ':' DIGITS ',' SPHEREDIMENSIONS ':' DIGITS ';';

 ifSphere       : 'SPHERE:' SPHEREDIMENSIONS ':' DIGITS ',' SPHEREDIMENSIONS ':' DIGITS ',' SPHEREDIMENSIONS ':' DIGITS ';';

 elseSphere     : 'SPHERE:' SPHEREDIMENSIONS ':' DIGITS ',' SPHEREDIMENSIONS ':' DIGITS ',' SPHEREDIMENSIONS ':' DIGITS ';';

 plane          : 'PLANE:' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ';';

 relPane        : 'PLANE:' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ';';

 ifPlane        : 'PLANE:' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ';';

 elsePlane      : 'PLANE:' DIMENSION3D ':' DIGITS ',' DIMENSION3D ':' DIGITS ';';

 text           : 'TEXT:' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS
                 ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ';';

 relText        : 'TEXT:' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS
                 ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ';';

 ifText        : 'TEXT:' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS
                 ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ';';

 elseText        : 'TEXT:' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS ',' TEXTDIMDIGITS ':' DIGITS
                 ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ',' TEXTDIMSTRING ':' STRING ';';

 line           : 'LINE:' 'lineWidth:' DIGITS ';';

 ifLine         : 'LINE:' 'lineWidth:' DIGITS ';';

 elseLine       : 'LINE:' 'lineWidth:' DIGITS ';';  

 pen            : 'PEN:' PENPARAMSBOOL ':' STRING ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ';';
 
 ifPen          : 'PEN:' PENPARAMSBOOL ':' STRING ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ';';
 
 elsePen        : 'PEN:' PENPARAMSBOOL ':' STRING ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ',' PENPARAMS ':' DIGITS ';';

 color          : 'COLOR: fill:' STRING ';'; 

 ifColor        : 'COLOR: fill:' STRING ';'; 

 elseColor      : 'COLOR: fill:' STRING ';'; 

 map            : 'MAP: map:' STRING ';';

 ifMap          : 'MAP: map:' STRING ';';

 elseMap        : 'MAP: map:' STRING ';';

 
 /*
 * Lexer Rules
 */
 
fragment LOWERCASE  : [a-z] ;

fragment UPPERCASE  : [A-Z] ;

BOOLEANSTRING   : ('True' | 'False');

SPHEREDIMENSIONS: ('radius' | 'widthSegment' | 'heightSegment');

DIMENSION3D			: (DIMENSION2D | 'depth');

DIMENSION2D			: ('height' | 'width');

TEXTDIMDIGITS   : ('xRel' | 'yRel' | 'zRel' | 'size');

TEXTDIMSTRING   : ('text' | 'posNameX' | 'posNameY' | 'posNameZ');

PENPARAMSBOOL   : 'dashed';

PENPARAMS       : ('dashScale'|'gapSize' | 'dashSize') ;

VARASSVALUES    : ('instanceAdaptable' | 'isDynval');

STRING 				  : (LOWERCASE | UPPERCASE)+;

DIGITS				  : [0-9]+ ;

WHITESPACE      : (' ' | '\t')+  -> skip;

NEWLINE         : ('\r'? '\n' | '\r')+ ;

OPERATOR        : ('<=' | '==' | '>=' | '<' | '>');

SOMERULE        : (STRING | DIGITS | '-')+;

