// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';
import VizRepListener from './VizRepListener.js';
const serializedATN = [4,1,39,684,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,
7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,7,
34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,39,7,39,2,40,7,40,2,41,7,41,
1,0,1,0,1,0,1,0,1,0,4,0,90,8,0,11,0,12,0,91,1,0,1,0,1,1,1,1,3,1,98,8,1,1,
1,1,1,3,1,102,8,1,1,1,3,1,105,8,1,1,1,3,1,108,8,1,1,1,1,1,3,1,112,8,1,1,
1,3,1,115,8,1,1,1,4,1,118,8,1,11,1,12,1,119,1,1,1,1,3,1,124,8,1,1,1,3,1,
127,8,1,1,1,4,1,130,8,1,11,1,12,1,131,1,1,1,1,3,1,136,8,1,1,1,3,1,139,8,
1,1,2,1,2,4,2,143,8,2,11,2,12,2,144,1,2,1,2,4,2,149,8,2,11,2,12,2,150,1,
2,1,2,3,2,155,8,2,1,2,1,2,4,2,159,8,2,11,2,12,2,160,1,2,1,2,1,2,4,2,166,
8,2,11,2,12,2,167,1,2,1,2,3,2,172,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,
3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,
4,1,4,1,5,1,5,1,5,4,5,205,8,5,11,5,12,5,206,1,6,1,6,1,6,4,6,212,8,6,11,6,
12,6,213,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,223,8,7,1,8,1,8,1,8,1,8,1,8,1,8,
1,8,3,8,232,8,8,1,9,1,9,3,9,236,8,9,1,10,1,10,1,10,1,10,3,10,242,8,10,1,
11,1,11,1,11,3,11,247,8,11,1,12,1,12,1,12,1,12,3,12,253,8,12,1,13,1,13,1,
13,1,13,3,13,259,8,13,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,3,14,269,8,
14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,3,14,279,8,14,1,14,1,14,1,14,
1,14,1,14,1,14,1,14,1,14,3,14,289,8,14,1,14,1,14,1,15,1,15,1,15,1,15,1,15,
1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,16,1,16,1,16,1,16,1,16,1,
16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,17,1,17,1,17,1,17,1,17,1,17,
1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,1,18,1,
18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,19,1,19,
1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,
20,1,20,1,20,1,20,1,20,1,20,1,20,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,
1,21,1,21,1,21,1,21,1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,
22,1,22,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,24,1,24,1,24,
1,24,1,24,1,24,1,24,1,24,1,24,1,24,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,
25,1,25,1,25,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,
1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,3,26,455,8,26,
1,26,1,26,1,26,1,26,3,26,461,8,26,1,26,1,26,1,26,1,26,3,26,467,8,26,1,26,
1,26,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,
27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,3,27,495,8,27,1,27,
1,27,1,27,1,27,3,27,501,8,27,1,27,1,27,1,27,1,27,3,27,507,8,27,1,27,1,27,
1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,
28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,3,28,535,8,28,1,28,1,28,
1,28,1,28,3,28,541,8,28,1,28,1,28,1,28,1,28,3,28,547,8,28,1,28,1,28,1,29,
1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,
29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,3,29,575,8,29,1,29,1,29,1,29,
1,29,3,29,581,8,29,1,29,1,29,1,29,1,29,3,29,587,8,29,1,29,1,29,1,30,1,30,
1,30,1,30,1,30,1,31,1,31,1,31,1,31,1,31,1,32,1,32,1,32,1,32,1,32,1,33,1,
33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,
1,33,1,33,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,
34,1,34,1,34,1,34,1,34,1,34,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,
1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,36,1,36,1,36,1,36,1,37,1,
37,1,37,1,37,1,38,1,38,1,38,1,38,1,39,1,39,1,39,1,39,1,40,1,40,1,40,1,40,
1,41,1,41,1,41,1,41,1,41,6,119,131,144,150,160,167,0,42,0,2,4,6,8,10,12,
14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,
62,64,66,68,70,72,74,76,78,80,82,0,2,1,1,37,37,2,0,33,34,39,39,709,0,89,
1,0,0,0,2,95,1,0,0,0,4,140,1,0,0,0,6,173,1,0,0,0,8,187,1,0,0,0,10,204,1,
0,0,0,12,211,1,0,0,0,14,222,1,0,0,0,16,231,1,0,0,0,18,235,1,0,0,0,20,241,
1,0,0,0,22,246,1,0,0,0,24,252,1,0,0,0,26,258,1,0,0,0,28,260,1,0,0,0,30,292,
1,0,0,0,32,306,1,0,0,0,34,320,1,0,0,0,36,334,1,0,0,0,38,348,1,0,0,0,40,362,
1,0,0,0,42,376,1,0,0,0,44,390,1,0,0,0,46,400,1,0,0,0,48,410,1,0,0,0,50,420,
1,0,0,0,52,430,1,0,0,0,54,470,1,0,0,0,56,510,1,0,0,0,58,550,1,0,0,0,60,590,
1,0,0,0,62,595,1,0,0,0,64,600,1,0,0,0,66,605,1,0,0,0,68,623,1,0,0,0,70,641,
1,0,0,0,72,659,1,0,0,0,74,663,1,0,0,0,76,667,1,0,0,0,78,671,1,0,0,0,80,675,
1,0,0,0,82,679,1,0,0,0,84,90,3,18,9,0,85,90,5,37,0,0,86,90,3,2,1,0,87,90,
3,6,3,0,88,90,3,8,4,0,89,84,1,0,0,0,89,85,1,0,0,0,89,86,1,0,0,0,89,87,1,
0,0,0,89,88,1,0,0,0,90,91,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,93,1,0,
0,0,93,94,7,0,0,0,94,1,1,0,0,0,95,97,3,60,30,0,96,98,5,37,0,0,97,96,1,0,
0,0,97,98,1,0,0,0,98,99,1,0,0,0,99,101,5,1,0,0,100,102,5,37,0,0,101,100,
1,0,0,0,101,102,1,0,0,0,102,104,1,0,0,0,103,105,3,72,36,0,104,103,1,0,0,
0,104,105,1,0,0,0,105,107,1,0,0,0,106,108,5,37,0,0,107,106,1,0,0,0,107,108,
1,0,0,0,108,109,1,0,0,0,109,111,3,24,12,0,110,112,5,37,0,0,111,110,1,0,0,
0,111,112,1,0,0,0,112,114,1,0,0,0,113,115,3,24,12,0,114,113,1,0,0,0,114,
115,1,0,0,0,115,117,1,0,0,0,116,118,5,37,0,0,117,116,1,0,0,0,118,119,1,0,
0,0,119,120,1,0,0,0,119,117,1,0,0,0,120,121,1,0,0,0,121,123,5,2,0,0,122,
124,5,37,0,0,123,122,1,0,0,0,123,124,1,0,0,0,124,126,1,0,0,0,125,127,3,72,
36,0,126,125,1,0,0,0,126,127,1,0,0,0,127,129,1,0,0,0,128,130,5,37,0,0,129,
128,1,0,0,0,130,131,1,0,0,0,131,132,1,0,0,0,131,129,1,0,0,0,132,133,1,0,
0,0,133,135,3,26,13,0,134,136,5,37,0,0,135,134,1,0,0,0,135,136,1,0,0,0,136,
138,1,0,0,0,137,139,3,26,13,0,138,137,1,0,0,0,138,139,1,0,0,0,139,3,1,0,
0,0,140,142,3,60,30,0,141,143,5,37,0,0,142,141,1,0,0,0,143,144,1,0,0,0,144,
145,1,0,0,0,144,142,1,0,0,0,145,146,1,0,0,0,146,148,5,1,0,0,147,149,5,37,
0,0,148,147,1,0,0,0,149,150,1,0,0,0,150,151,1,0,0,0,150,148,1,0,0,0,151,
152,1,0,0,0,152,154,3,20,10,0,153,155,3,20,10,0,154,153,1,0,0,0,154,155,
1,0,0,0,155,156,1,0,0,0,156,158,5,3,0,0,157,159,5,37,0,0,158,157,1,0,0,0,
159,160,1,0,0,0,160,161,1,0,0,0,160,158,1,0,0,0,161,162,1,0,0,0,162,163,
3,52,26,0,163,165,5,2,0,0,164,166,5,37,0,0,165,164,1,0,0,0,166,167,1,0,0,
0,167,168,1,0,0,0,167,165,1,0,0,0,168,169,1,0,0,0,169,171,3,20,10,0,170,
172,3,20,10,0,171,170,1,0,0,0,171,172,1,0,0,0,172,5,1,0,0,0,173,174,5,4,
0,0,174,175,5,33,0,0,175,176,5,38,0,0,176,177,5,33,0,0,177,178,5,5,0,0,178,
179,5,37,0,0,179,180,5,6,0,0,180,181,5,37,0,0,181,182,3,10,5,0,182,183,5,
37,0,0,183,184,5,7,0,0,184,185,3,12,6,0,185,186,5,8,0,0,186,7,1,0,0,0,187,
188,5,9,0,0,188,189,5,34,0,0,189,190,5,10,0,0,190,191,7,1,0,0,191,192,5,
11,0,0,192,193,5,32,0,0,193,194,5,10,0,0,194,195,5,23,0,0,195,196,5,11,0,
0,196,197,5,32,0,0,197,198,5,10,0,0,198,199,5,23,0,0,199,200,5,12,0,0,200,
9,1,0,0,0,201,205,3,14,7,0,202,205,3,2,1,0,203,205,5,37,0,0,204,201,1,0,
0,0,204,202,1,0,0,0,204,203,1,0,0,0,205,206,1,0,0,0,206,204,1,0,0,0,206,
207,1,0,0,0,207,11,1,0,0,0,208,212,3,16,8,0,209,212,3,2,1,0,210,212,5,37,
0,0,211,208,1,0,0,0,211,209,1,0,0,0,211,210,1,0,0,0,212,213,1,0,0,0,213,
211,1,0,0,0,213,214,1,0,0,0,214,13,1,0,0,0,215,223,3,32,16,0,216,223,3,40,
20,0,217,223,3,48,24,0,218,223,3,56,28,0,219,223,3,74,37,0,220,223,3,80,
40,0,221,223,3,68,34,0,222,215,1,0,0,0,222,216,1,0,0,0,222,217,1,0,0,0,222,
218,1,0,0,0,222,219,1,0,0,0,222,220,1,0,0,0,222,221,1,0,0,0,223,15,1,0,0,
0,224,232,3,34,17,0,225,232,3,42,21,0,226,232,3,50,25,0,227,232,3,58,29,
0,228,232,3,76,38,0,229,232,3,82,41,0,230,232,3,70,35,0,231,224,1,0,0,0,
231,225,1,0,0,0,231,226,1,0,0,0,231,227,1,0,0,0,231,228,1,0,0,0,231,229,
1,0,0,0,231,230,1,0,0,0,232,17,1,0,0,0,233,236,3,20,10,0,234,236,3,22,11,
0,235,233,1,0,0,0,235,234,1,0,0,0,236,19,1,0,0,0,237,242,3,28,14,0,238,242,
3,36,18,0,239,242,3,44,22,0,240,242,3,52,26,0,241,237,1,0,0,0,241,238,1,
0,0,0,241,239,1,0,0,0,241,240,1,0,0,0,242,21,1,0,0,0,243,247,3,72,36,0,244,
247,3,78,39,0,245,247,3,66,33,0,246,243,1,0,0,0,246,244,1,0,0,0,246,245,
1,0,0,0,247,23,1,0,0,0,248,253,3,30,15,0,249,253,3,38,19,0,250,253,3,46,
23,0,251,253,3,54,27,0,252,248,1,0,0,0,252,249,1,0,0,0,252,250,1,0,0,0,252,
251,1,0,0,0,253,25,1,0,0,0,254,259,3,30,15,0,255,259,3,38,19,0,256,259,3,
46,23,0,257,259,3,54,27,0,258,254,1,0,0,0,258,255,1,0,0,0,258,256,1,0,0,
0,258,257,1,0,0,0,259,27,1,0,0,0,260,268,5,13,0,0,261,262,5,25,0,0,262,263,
5,10,0,0,263,269,5,33,0,0,264,265,5,26,0,0,265,266,5,10,0,0,266,267,5,14,
0,0,267,269,5,34,0,0,268,261,1,0,0,0,268,264,1,0,0,0,269,270,1,0,0,0,270,
278,5,11,0,0,271,272,5,25,0,0,272,273,5,10,0,0,273,279,5,33,0,0,274,275,
5,26,0,0,275,276,5,10,0,0,276,277,5,14,0,0,277,279,5,34,0,0,278,271,1,0,
0,0,278,274,1,0,0,0,279,280,1,0,0,0,280,288,5,11,0,0,281,282,5,25,0,0,282,
283,5,10,0,0,283,289,5,33,0,0,284,285,5,26,0,0,285,286,5,10,0,0,286,287,
5,14,0,0,287,289,5,34,0,0,288,281,1,0,0,0,288,284,1,0,0,0,289,290,1,0,0,
0,290,291,5,12,0,0,291,29,1,0,0,0,292,293,5,13,0,0,293,294,5,25,0,0,294,
295,5,10,0,0,295,296,5,33,0,0,296,297,5,11,0,0,297,298,5,25,0,0,298,299,
5,10,0,0,299,300,5,33,0,0,300,301,5,11,0,0,301,302,5,25,0,0,302,303,5,10,
0,0,303,304,5,33,0,0,304,305,5,12,0,0,305,31,1,0,0,0,306,307,5,13,0,0,307,
308,5,25,0,0,308,309,5,10,0,0,309,310,5,33,0,0,310,311,5,11,0,0,311,312,
5,25,0,0,312,313,5,10,0,0,313,314,5,33,0,0,314,315,5,11,0,0,315,316,5,25,
0,0,316,317,5,10,0,0,317,318,5,33,0,0,318,319,5,12,0,0,319,33,1,0,0,0,320,
321,5,13,0,0,321,322,5,25,0,0,322,323,5,10,0,0,323,324,5,33,0,0,324,325,
5,11,0,0,325,326,5,25,0,0,326,327,5,10,0,0,327,328,5,33,0,0,328,329,5,11,
0,0,329,330,5,25,0,0,330,331,5,10,0,0,331,332,5,33,0,0,332,333,5,12,0,0,
333,35,1,0,0,0,334,335,5,15,0,0,335,336,5,24,0,0,336,337,5,10,0,0,337,338,
5,33,0,0,338,339,5,11,0,0,339,340,5,24,0,0,340,341,5,10,0,0,341,342,5,33,
0,0,342,343,5,11,0,0,343,344,5,24,0,0,344,345,5,10,0,0,345,346,5,33,0,0,
346,347,5,12,0,0,347,37,1,0,0,0,348,349,5,15,0,0,349,350,5,24,0,0,350,351,
5,10,0,0,351,352,5,33,0,0,352,353,5,11,0,0,353,354,5,24,0,0,354,355,5,10,
0,0,355,356,5,33,0,0,356,357,5,11,0,0,357,358,5,24,0,0,358,359,5,10,0,0,
359,360,5,33,0,0,360,361,5,12,0,0,361,39,1,0,0,0,362,363,5,15,0,0,363,364,
5,24,0,0,364,365,5,10,0,0,365,366,5,33,0,0,366,367,5,11,0,0,367,368,5,24,
0,0,368,369,5,10,0,0,369,370,5,33,0,0,370,371,5,11,0,0,371,372,5,24,0,0,
372,373,5,10,0,0,373,374,5,33,0,0,374,375,5,12,0,0,375,41,1,0,0,0,376,377,
5,15,0,0,377,378,5,24,0,0,378,379,5,10,0,0,379,380,5,33,0,0,380,381,5,11,
0,0,381,382,5,24,0,0,382,383,5,10,0,0,383,384,5,33,0,0,384,385,5,11,0,0,
385,386,5,24,0,0,386,387,5,10,0,0,387,388,5,33,0,0,388,389,5,12,0,0,389,
43,1,0,0,0,390,391,5,16,0,0,391,392,5,25,0,0,392,393,5,10,0,0,393,394,5,
33,0,0,394,395,5,11,0,0,395,396,5,25,0,0,396,397,5,10,0,0,397,398,5,33,0,
0,398,399,5,12,0,0,399,45,1,0,0,0,400,401,5,16,0,0,401,402,5,25,0,0,402,
403,5,10,0,0,403,404,5,33,0,0,404,405,5,11,0,0,405,406,5,25,0,0,406,407,
5,10,0,0,407,408,5,33,0,0,408,409,5,12,0,0,409,47,1,0,0,0,410,411,5,16,0,
0,411,412,5,25,0,0,412,413,5,10,0,0,413,414,5,33,0,0,414,415,5,11,0,0,415,
416,5,25,0,0,416,417,5,10,0,0,417,418,5,33,0,0,418,419,5,12,0,0,419,49,1,
0,0,0,420,421,5,16,0,0,421,422,5,25,0,0,422,423,5,10,0,0,423,424,5,33,0,
0,424,425,5,11,0,0,425,426,5,25,0,0,426,427,5,10,0,0,427,428,5,33,0,0,428,
429,5,12,0,0,429,51,1,0,0,0,430,431,5,17,0,0,431,432,5,28,0,0,432,433,5,
10,0,0,433,434,5,33,0,0,434,435,5,11,0,0,435,436,5,28,0,0,436,437,5,10,0,
0,437,438,5,33,0,0,438,439,5,11,0,0,439,440,5,28,0,0,440,441,5,10,0,0,441,
442,5,33,0,0,442,443,5,11,0,0,443,444,5,28,0,0,444,445,5,10,0,0,445,446,
5,33,0,0,446,447,5,11,0,0,447,448,5,29,0,0,448,449,5,10,0,0,449,454,5,34,
0,0,450,451,5,11,0,0,451,452,5,29,0,0,452,453,5,10,0,0,453,455,5,34,0,0,
454,450,1,0,0,0,454,455,1,0,0,0,455,460,1,0,0,0,456,457,5,11,0,0,457,458,
5,29,0,0,458,459,5,10,0,0,459,461,5,34,0,0,460,456,1,0,0,0,460,461,1,0,0,
0,461,466,1,0,0,0,462,463,5,11,0,0,463,464,5,29,0,0,464,465,5,10,0,0,465,
467,5,34,0,0,466,462,1,0,0,0,466,467,1,0,0,0,467,468,1,0,0,0,468,469,5,12,
0,0,469,53,1,0,0,0,470,471,5,17,0,0,471,472,5,28,0,0,472,473,5,10,0,0,473,
474,5,33,0,0,474,475,5,11,0,0,475,476,5,28,0,0,476,477,5,10,0,0,477,478,
5,33,0,0,478,479,5,11,0,0,479,480,5,28,0,0,480,481,5,10,0,0,481,482,5,33,
0,0,482,483,5,11,0,0,483,484,5,28,0,0,484,485,5,10,0,0,485,486,5,33,0,0,
486,487,5,11,0,0,487,488,5,29,0,0,488,489,5,10,0,0,489,494,5,34,0,0,490,
491,5,11,0,0,491,492,5,29,0,0,492,493,5,10,0,0,493,495,5,34,0,0,494,490,
1,0,0,0,494,495,1,0,0,0,495,500,1,0,0,0,496,497,5,11,0,0,497,498,5,29,0,
0,498,499,5,10,0,0,499,501,5,34,0,0,500,496,1,0,0,0,500,501,1,0,0,0,501,
506,1,0,0,0,502,503,5,11,0,0,503,504,5,29,0,0,504,505,5,10,0,0,505,507,5,
34,0,0,506,502,1,0,0,0,506,507,1,0,0,0,507,508,1,0,0,0,508,509,5,12,0,0,
509,55,1,0,0,0,510,511,5,17,0,0,511,512,5,28,0,0,512,513,5,10,0,0,513,514,
5,33,0,0,514,515,5,11,0,0,515,516,5,28,0,0,516,517,5,10,0,0,517,518,5,33,
0,0,518,519,5,11,0,0,519,520,5,28,0,0,520,521,5,10,0,0,521,522,5,33,0,0,
522,523,5,11,0,0,523,524,5,28,0,0,524,525,5,10,0,0,525,526,5,33,0,0,526,
527,5,11,0,0,527,528,5,29,0,0,528,529,5,10,0,0,529,534,5,34,0,0,530,531,
5,11,0,0,531,532,5,29,0,0,532,533,5,10,0,0,533,535,5,34,0,0,534,530,1,0,
0,0,534,535,1,0,0,0,535,540,1,0,0,0,536,537,5,11,0,0,537,538,5,29,0,0,538,
539,5,10,0,0,539,541,5,34,0,0,540,536,1,0,0,0,540,541,1,0,0,0,541,546,1,
0,0,0,542,543,5,11,0,0,543,544,5,29,0,0,544,545,5,10,0,0,545,547,5,34,0,
0,546,542,1,0,0,0,546,547,1,0,0,0,547,548,1,0,0,0,548,549,5,12,0,0,549,57,
1,0,0,0,550,551,5,17,0,0,551,552,5,28,0,0,552,553,5,10,0,0,553,554,5,33,
0,0,554,555,5,11,0,0,555,556,5,28,0,0,556,557,5,10,0,0,557,558,5,33,0,0,
558,559,5,11,0,0,559,560,5,28,0,0,560,561,5,10,0,0,561,562,5,33,0,0,562,
563,5,11,0,0,563,564,5,28,0,0,564,565,5,10,0,0,565,566,5,33,0,0,566,567,
5,11,0,0,567,568,5,29,0,0,568,569,5,10,0,0,569,574,5,34,0,0,570,571,5,11,
0,0,571,572,5,29,0,0,572,573,5,10,0,0,573,575,5,34,0,0,574,570,1,0,0,0,574,
575,1,0,0,0,575,580,1,0,0,0,576,577,5,11,0,0,577,578,5,29,0,0,578,579,5,
10,0,0,579,581,5,34,0,0,580,576,1,0,0,0,580,581,1,0,0,0,581,586,1,0,0,0,
582,583,5,11,0,0,583,584,5,29,0,0,584,585,5,10,0,0,585,587,5,34,0,0,586,
582,1,0,0,0,586,587,1,0,0,0,587,588,1,0,0,0,588,589,5,12,0,0,589,59,1,0,
0,0,590,591,5,18,0,0,591,592,5,19,0,0,592,593,5,33,0,0,593,594,5,12,0,0,
594,61,1,0,0,0,595,596,5,18,0,0,596,597,5,19,0,0,597,598,5,33,0,0,598,599,
5,12,0,0,599,63,1,0,0,0,600,601,5,18,0,0,601,602,5,19,0,0,602,603,5,33,0,
0,603,604,5,12,0,0,604,65,1,0,0,0,605,606,5,20,0,0,606,607,5,30,0,0,607,
608,5,10,0,0,608,609,5,34,0,0,609,610,5,11,0,0,610,611,5,31,0,0,611,612,
5,10,0,0,612,613,5,33,0,0,613,614,5,11,0,0,614,615,5,31,0,0,615,616,5,10,
0,0,616,617,5,33,0,0,617,618,5,11,0,0,618,619,5,31,0,0,619,620,5,10,0,0,
620,621,5,33,0,0,621,622,5,12,0,0,622,67,1,0,0,0,623,624,5,20,0,0,624,625,
5,30,0,0,625,626,5,10,0,0,626,627,5,34,0,0,627,628,5,11,0,0,628,629,5,31,
0,0,629,630,5,10,0,0,630,631,5,33,0,0,631,632,5,11,0,0,632,633,5,31,0,0,
633,634,5,10,0,0,634,635,5,33,0,0,635,636,5,11,0,0,636,637,5,31,0,0,637,
638,5,10,0,0,638,639,5,33,0,0,639,640,5,12,0,0,640,69,1,0,0,0,641,642,5,
20,0,0,642,643,5,30,0,0,643,644,5,10,0,0,644,645,5,34,0,0,645,646,5,11,0,
0,646,647,5,31,0,0,647,648,5,10,0,0,648,649,5,33,0,0,649,650,5,11,0,0,650,
651,5,31,0,0,651,652,5,10,0,0,652,653,5,33,0,0,653,654,5,11,0,0,654,655,
5,31,0,0,655,656,5,10,0,0,656,657,5,33,0,0,657,658,5,12,0,0,658,71,1,0,0,
0,659,660,5,21,0,0,660,661,5,34,0,0,661,662,5,12,0,0,662,73,1,0,0,0,663,
664,5,21,0,0,664,665,5,34,0,0,665,666,5,12,0,0,666,75,1,0,0,0,667,668,5,
21,0,0,668,669,5,34,0,0,669,670,5,12,0,0,670,77,1,0,0,0,671,672,5,22,0,0,
672,673,5,35,0,0,673,674,5,12,0,0,674,79,1,0,0,0,675,676,5,22,0,0,676,677,
5,34,0,0,677,678,5,12,0,0,678,81,1,0,0,0,679,680,5,22,0,0,680,681,5,34,0,
0,681,682,5,12,0,0,682,83,1,0,0,0,46,89,91,97,101,104,107,111,114,119,123,
126,131,135,138,144,150,154,160,167,171,204,206,211,213,222,231,235,241,
246,252,258,268,278,288,454,460,466,494,500,506,534,540,546,574,580,586];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class VizRepParser extends antlr4.Parser {

    static grammarFileName = "java-escape";
    static literalNames = [ null, "'START'", "'END'", "'MIDDLE'", "'IF('", 
                            "')'", "'THEN'", "'ELSE'", "'END IF'", "'SET: '", 
                            "':'", "','", "';'", "'CUBE:'", "'GET:'", "'SPHERE:'", 
                            "'PLANE:'", "'TEXT:'", "'LINE:'", "'lineWidth:'", 
                            "'PEN:'", "'COLOR: fill:'", "'MAP: map:'", null, 
                            null, null, null, null, null, null, "'dashed'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, null, null, "BOOLEANSTRING", 
                             "SPHEREDIMENSIONS", "DIMENSION3D", "DIMENSION3DDYN", 
                             "DIMENSION2D", "TEXTDIMDIGITS", "TEXTDIMSTRING", 
                             "PENPARAMSBOOL", "PENPARAMS", "VARASSVALUES", 
                             "DIGITS", "STRING", "MAP", "WHITESPACE", "NEWLINE", 
                             "OPERATOR", "SOMERULE" ];
    static ruleNames = [ "commandChain", "relation", "relMiddle", "condition", 
                         "setVariable", "ifBlock", "elseBlock", "ifCommand", 
                         "elseCommand", "command", "shapeCommand", "styleCommand", 
                         "relCommandFrom", "relCommandTo", "cube", "relCube", 
                         "ifCube", "elseCube", "sphere", "relSphere", "ifSphere", 
                         "elseSphere", "plane", "relPane", "ifPlane", "elsePlane", 
                         "text", "relText", "ifText", "elseText", "line", 
                         "ifLine", "elseLine", "pen", "ifPen", "elsePen", 
                         "color", "ifColor", "elseColor", "map", "ifMap", 
                         "elseMap" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = VizRepParser.ruleNames;
        this.literalNames = VizRepParser.literalNames;
        this.symbolicNames = VizRepParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	commandChain() {
	    let localctx = new CommandChainContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, VizRepParser.RULE_commandChain);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 89; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 89;
	        		this._errHandler.sync(this);
	        		switch(this._input.LA(1)) {
	        		case 13:
	        		case 15:
	        		case 16:
	        		case 17:
	        		case 20:
	        		case 21:
	        		case 22:
	        		    this.state = 84;
	        		    this.command();
	        		    break;
	        		case 37:
	        		    this.state = 85;
	        		    this.match(VizRepParser.NEWLINE);
	        		    break;
	        		case 18:
	        		    this.state = 86;
	        		    this.relation();
	        		    break;
	        		case 4:
	        		    this.state = 87;
	        		    this.condition();
	        		    break;
	        		case 9:
	        		    this.state = 88;
	        		    this.setVariable();
	        		    break;
	        		default:
	        		    throw new antlr4.error.NoViableAltException(this);
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 91; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,1, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 93;
	        _la = this._input.LA(1);
	        if(!(_la===-1 || _la===37)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relation() {
	    let localctx = new RelationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, VizRepParser.RULE_relation);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 95;
	        this.line();
	        this.state = 97;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===37) {
	            this.state = 96;
	            this.match(VizRepParser.NEWLINE);
	        }

	        this.state = 99;
	        this.match(VizRepParser.T__0);
	        this.state = 101;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
	        if(la_===1) {
	            this.state = 100;
	            this.match(VizRepParser.NEWLINE);

	        }
	        this.state = 104;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===21) {
	            this.state = 103;
	            this.color();
	        }

	        this.state = 107;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===37) {
	            this.state = 106;
	            this.match(VizRepParser.NEWLINE);
	        }

	        this.state = 109;
	        this.relCommandFrom();
	        this.state = 111;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,6,this._ctx);
	        if(la_===1) {
	            this.state = 110;
	            this.match(VizRepParser.NEWLINE);

	        }
	        this.state = 114;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & 237568) !== 0)) {
	            this.state = 113;
	            this.relCommandFrom();
	        }

	        this.state = 117; 
	        this._errHandler.sync(this);
	        var _alt = 1+1;
	        do {
	        	switch (_alt) {
	        	case 1+1:
	        		this.state = 116;
	        		this.match(VizRepParser.NEWLINE);
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 119; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,8, this._ctx);
	        } while ( _alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 121;
	        this.match(VizRepParser.T__1);
	        this.state = 123;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
	        if(la_===1) {
	            this.state = 122;
	            this.match(VizRepParser.NEWLINE);

	        }
	        this.state = 126;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===21) {
	            this.state = 125;
	            this.color();
	        }

	        this.state = 129; 
	        this._errHandler.sync(this);
	        var _alt = 1+1;
	        do {
	        	switch (_alt) {
	        	case 1+1:
	        		this.state = 128;
	        		this.match(VizRepParser.NEWLINE);
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 131; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,11, this._ctx);
	        } while ( _alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 133;
	        this.relCommandTo();
	        this.state = 135;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,12,this._ctx);
	        if(la_===1) {
	            this.state = 134;
	            this.match(VizRepParser.NEWLINE);

	        }
	        this.state = 138;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,13,this._ctx);
	        if(la_===1) {
	            this.state = 137;
	            this.relCommandTo();

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relMiddle() {
	    let localctx = new RelMiddleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, VizRepParser.RULE_relMiddle);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 140;
	        this.line();
	        this.state = 142; 
	        this._errHandler.sync(this);
	        var _alt = 1+1;
	        do {
	        	switch (_alt) {
	        	case 1+1:
	        		this.state = 141;
	        		this.match(VizRepParser.NEWLINE);
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 144; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,14, this._ctx);
	        } while ( _alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 146;
	        this.match(VizRepParser.T__0);
	        this.state = 148; 
	        this._errHandler.sync(this);
	        var _alt = 1+1;
	        do {
	        	switch (_alt) {
	        	case 1+1:
	        		this.state = 147;
	        		this.match(VizRepParser.NEWLINE);
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 150; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,15, this._ctx);
	        } while ( _alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 152;
	        this.shapeCommand();
	        this.state = 154;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & 237568) !== 0)) {
	            this.state = 153;
	            this.shapeCommand();
	        }

	        this.state = 156;
	        this.match(VizRepParser.T__2);
	        this.state = 158; 
	        this._errHandler.sync(this);
	        var _alt = 1+1;
	        do {
	        	switch (_alt) {
	        	case 1+1:
	        		this.state = 157;
	        		this.match(VizRepParser.NEWLINE);
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 160; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,17, this._ctx);
	        } while ( _alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 162;
	        this.text();
	        this.state = 163;
	        this.match(VizRepParser.T__1);
	        this.state = 165; 
	        this._errHandler.sync(this);
	        var _alt = 1+1;
	        do {
	        	switch (_alt) {
	        	case 1+1:
	        		this.state = 164;
	        		this.match(VizRepParser.NEWLINE);
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 167; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,18, this._ctx);
	        } while ( _alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 169;
	        this.shapeCommand();
	        this.state = 171;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & 237568) !== 0)) {
	            this.state = 170;
	            this.shapeCommand();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condition() {
	    let localctx = new ConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, VizRepParser.RULE_condition);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 173;
	        this.match(VizRepParser.T__3);
	        this.state = 174;
	        this.match(VizRepParser.DIGITS);
	        this.state = 175;
	        this.match(VizRepParser.OPERATOR);
	        this.state = 176;
	        this.match(VizRepParser.DIGITS);
	        this.state = 177;
	        this.match(VizRepParser.T__4);
	        this.state = 178;
	        this.match(VizRepParser.NEWLINE);
	        this.state = 179;
	        this.match(VizRepParser.T__5);
	        this.state = 180;
	        this.match(VizRepParser.NEWLINE);
	        this.state = 181;
	        this.ifBlock();
	        this.state = 182;
	        this.match(VizRepParser.NEWLINE);
	        this.state = 183;
	        this.match(VizRepParser.T__6);
	        this.state = 184;
	        this.elseBlock();
	        this.state = 185;
	        this.match(VizRepParser.T__7);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	setVariable() {
	    let localctx = new SetVariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, VizRepParser.RULE_setVariable);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 187;
	        this.match(VizRepParser.T__8);
	        this.state = 188;
	        this.match(VizRepParser.STRING);
	        this.state = 189;
	        this.match(VizRepParser.T__9);
	        this.state = 190;
	        _la = this._input.LA(1);
	        if(!(((((_la - 33)) & ~0x1f) == 0 && ((1 << (_la - 33)) & 67) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 191;
	        this.match(VizRepParser.T__10);
	        this.state = 192;
	        this.match(VizRepParser.VARASSVALUES);
	        this.state = 193;
	        this.match(VizRepParser.T__9);
	        this.state = 194;
	        this.match(VizRepParser.BOOLEANSTRING);
	        this.state = 195;
	        this.match(VizRepParser.T__10);
	        this.state = 196;
	        this.match(VizRepParser.VARASSVALUES);
	        this.state = 197;
	        this.match(VizRepParser.T__9);
	        this.state = 198;
	        this.match(VizRepParser.BOOLEANSTRING);
	        this.state = 199;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifBlock() {
	    let localctx = new IfBlockContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, VizRepParser.RULE_ifBlock);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 204; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 204;
	        		this._errHandler.sync(this);
	        		switch(this._input.LA(1)) {
	        		case 13:
	        		case 15:
	        		case 16:
	        		case 17:
	        		case 20:
	        		case 21:
	        		case 22:
	        		    this.state = 201;
	        		    this.ifCommand();
	        		    break;
	        		case 18:
	        		    this.state = 202;
	        		    this.relation();
	        		    break;
	        		case 37:
	        		    this.state = 203;
	        		    this.match(VizRepParser.NEWLINE);
	        		    break;
	        		default:
	        		    throw new antlr4.error.NoViableAltException(this);
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 206; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,21, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseBlock() {
	    let localctx = new ElseBlockContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, VizRepParser.RULE_elseBlock);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 211; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 211;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 13:
	            case 15:
	            case 16:
	            case 17:
	            case 20:
	            case 21:
	            case 22:
	                this.state = 208;
	                this.elseCommand();
	                break;
	            case 18:
	                this.state = 209;
	                this.relation();
	                break;
	            case 37:
	                this.state = 210;
	                this.match(VizRepParser.NEWLINE);
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 213; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(((((_la - 13)) & ~0x1f) == 0 && ((1 << (_la - 13)) & 16778173) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifCommand() {
	    let localctx = new IfCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, VizRepParser.RULE_ifCommand);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 222;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	            this.state = 215;
	            this.ifCube();
	            break;
	        case 15:
	            this.state = 216;
	            this.ifSphere();
	            break;
	        case 16:
	            this.state = 217;
	            this.ifPlane();
	            break;
	        case 17:
	            this.state = 218;
	            this.ifText();
	            break;
	        case 21:
	            this.state = 219;
	            this.ifColor();
	            break;
	        case 22:
	            this.state = 220;
	            this.ifMap();
	            break;
	        case 20:
	            this.state = 221;
	            this.ifPen();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseCommand() {
	    let localctx = new ElseCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, VizRepParser.RULE_elseCommand);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 231;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	            this.state = 224;
	            this.elseCube();
	            break;
	        case 15:
	            this.state = 225;
	            this.elseSphere();
	            break;
	        case 16:
	            this.state = 226;
	            this.elsePlane();
	            break;
	        case 17:
	            this.state = 227;
	            this.elseText();
	            break;
	        case 21:
	            this.state = 228;
	            this.elseColor();
	            break;
	        case 22:
	            this.state = 229;
	            this.elseMap();
	            break;
	        case 20:
	            this.state = 230;
	            this.elsePen();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	command() {
	    let localctx = new CommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, VizRepParser.RULE_command);
	    try {
	        this.state = 235;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	        case 15:
	        case 16:
	        case 17:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 233;
	            this.shapeCommand();
	            break;
	        case 20:
	        case 21:
	        case 22:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 234;
	            this.styleCommand();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	shapeCommand() {
	    let localctx = new ShapeCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, VizRepParser.RULE_shapeCommand);
	    try {
	        this.state = 241;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 237;
	            this.cube();
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 238;
	            this.sphere();
	            break;
	        case 16:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 239;
	            this.plane();
	            break;
	        case 17:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 240;
	            this.text();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	styleCommand() {
	    let localctx = new StyleCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, VizRepParser.RULE_styleCommand);
	    try {
	        this.state = 246;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 21:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 243;
	            this.color();
	            break;
	        case 22:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 244;
	            this.map();
	            break;
	        case 20:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 245;
	            this.pen();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relCommandFrom() {
	    let localctx = new RelCommandFromContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, VizRepParser.RULE_relCommandFrom);
	    try {
	        this.state = 252;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 248;
	            this.relCube();
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 249;
	            this.relSphere();
	            break;
	        case 16:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 250;
	            this.relPane();
	            break;
	        case 17:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 251;
	            this.relText();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relCommandTo() {
	    let localctx = new RelCommandToContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, VizRepParser.RULE_relCommandTo);
	    try {
	        this.state = 258;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 254;
	            this.relCube();
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 255;
	            this.relSphere();
	            break;
	        case 16:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 256;
	            this.relPane();
	            break;
	        case 17:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 257;
	            this.relText();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	cube() {
	    let localctx = new CubeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, VizRepParser.RULE_cube);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 260;
	        this.match(VizRepParser.T__12);
	        this.state = 268;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 25:
	            this.state = 261;
	            this.match(VizRepParser.DIMENSION3D);
	            this.state = 262;
	            this.match(VizRepParser.T__9);
	            this.state = 263;
	            this.match(VizRepParser.DIGITS);
	            break;
	        case 26:
	            this.state = 264;
	            this.match(VizRepParser.DIMENSION3DDYN);
	            this.state = 265;
	            this.match(VizRepParser.T__9);
	            this.state = 266;
	            this.match(VizRepParser.T__13);
	            this.state = 267;
	            this.match(VizRepParser.STRING);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this.state = 270;
	        this.match(VizRepParser.T__10);
	        this.state = 278;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 25:
	            this.state = 271;
	            this.match(VizRepParser.DIMENSION3D);
	            this.state = 272;
	            this.match(VizRepParser.T__9);
	            this.state = 273;
	            this.match(VizRepParser.DIGITS);
	            break;
	        case 26:
	            this.state = 274;
	            this.match(VizRepParser.DIMENSION3DDYN);
	            this.state = 275;
	            this.match(VizRepParser.T__9);
	            this.state = 276;
	            this.match(VizRepParser.T__13);
	            this.state = 277;
	            this.match(VizRepParser.STRING);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this.state = 280;
	        this.match(VizRepParser.T__10);
	        this.state = 288;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 25:
	            this.state = 281;
	            this.match(VizRepParser.DIMENSION3D);
	            this.state = 282;
	            this.match(VizRepParser.T__9);
	            this.state = 283;
	            this.match(VizRepParser.DIGITS);
	            break;
	        case 26:
	            this.state = 284;
	            this.match(VizRepParser.DIMENSION3DDYN);
	            this.state = 285;
	            this.match(VizRepParser.T__9);
	            this.state = 286;
	            this.match(VizRepParser.T__13);
	            this.state = 287;
	            this.match(VizRepParser.STRING);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this.state = 290;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relCube() {
	    let localctx = new RelCubeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, VizRepParser.RULE_relCube);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 292;
	        this.match(VizRepParser.T__12);
	        this.state = 293;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 294;
	        this.match(VizRepParser.T__9);
	        this.state = 295;
	        this.match(VizRepParser.DIGITS);
	        this.state = 296;
	        this.match(VizRepParser.T__10);
	        this.state = 297;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 298;
	        this.match(VizRepParser.T__9);
	        this.state = 299;
	        this.match(VizRepParser.DIGITS);
	        this.state = 300;
	        this.match(VizRepParser.T__10);
	        this.state = 301;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 302;
	        this.match(VizRepParser.T__9);
	        this.state = 303;
	        this.match(VizRepParser.DIGITS);
	        this.state = 304;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifCube() {
	    let localctx = new IfCubeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, VizRepParser.RULE_ifCube);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 306;
	        this.match(VizRepParser.T__12);
	        this.state = 307;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 308;
	        this.match(VizRepParser.T__9);
	        this.state = 309;
	        this.match(VizRepParser.DIGITS);
	        this.state = 310;
	        this.match(VizRepParser.T__10);
	        this.state = 311;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 312;
	        this.match(VizRepParser.T__9);
	        this.state = 313;
	        this.match(VizRepParser.DIGITS);
	        this.state = 314;
	        this.match(VizRepParser.T__10);
	        this.state = 315;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 316;
	        this.match(VizRepParser.T__9);
	        this.state = 317;
	        this.match(VizRepParser.DIGITS);
	        this.state = 318;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseCube() {
	    let localctx = new ElseCubeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, VizRepParser.RULE_elseCube);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 320;
	        this.match(VizRepParser.T__12);
	        this.state = 321;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 322;
	        this.match(VizRepParser.T__9);
	        this.state = 323;
	        this.match(VizRepParser.DIGITS);
	        this.state = 324;
	        this.match(VizRepParser.T__10);
	        this.state = 325;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 326;
	        this.match(VizRepParser.T__9);
	        this.state = 327;
	        this.match(VizRepParser.DIGITS);
	        this.state = 328;
	        this.match(VizRepParser.T__10);
	        this.state = 329;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 330;
	        this.match(VizRepParser.T__9);
	        this.state = 331;
	        this.match(VizRepParser.DIGITS);
	        this.state = 332;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sphere() {
	    let localctx = new SphereContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 36, VizRepParser.RULE_sphere);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 334;
	        this.match(VizRepParser.T__14);
	        this.state = 335;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 336;
	        this.match(VizRepParser.T__9);
	        this.state = 337;
	        this.match(VizRepParser.DIGITS);
	        this.state = 338;
	        this.match(VizRepParser.T__10);
	        this.state = 339;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 340;
	        this.match(VizRepParser.T__9);
	        this.state = 341;
	        this.match(VizRepParser.DIGITS);
	        this.state = 342;
	        this.match(VizRepParser.T__10);
	        this.state = 343;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 344;
	        this.match(VizRepParser.T__9);
	        this.state = 345;
	        this.match(VizRepParser.DIGITS);
	        this.state = 346;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relSphere() {
	    let localctx = new RelSphereContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, VizRepParser.RULE_relSphere);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 348;
	        this.match(VizRepParser.T__14);
	        this.state = 349;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 350;
	        this.match(VizRepParser.T__9);
	        this.state = 351;
	        this.match(VizRepParser.DIGITS);
	        this.state = 352;
	        this.match(VizRepParser.T__10);
	        this.state = 353;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 354;
	        this.match(VizRepParser.T__9);
	        this.state = 355;
	        this.match(VizRepParser.DIGITS);
	        this.state = 356;
	        this.match(VizRepParser.T__10);
	        this.state = 357;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 358;
	        this.match(VizRepParser.T__9);
	        this.state = 359;
	        this.match(VizRepParser.DIGITS);
	        this.state = 360;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifSphere() {
	    let localctx = new IfSphereContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, VizRepParser.RULE_ifSphere);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 362;
	        this.match(VizRepParser.T__14);
	        this.state = 363;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 364;
	        this.match(VizRepParser.T__9);
	        this.state = 365;
	        this.match(VizRepParser.DIGITS);
	        this.state = 366;
	        this.match(VizRepParser.T__10);
	        this.state = 367;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 368;
	        this.match(VizRepParser.T__9);
	        this.state = 369;
	        this.match(VizRepParser.DIGITS);
	        this.state = 370;
	        this.match(VizRepParser.T__10);
	        this.state = 371;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 372;
	        this.match(VizRepParser.T__9);
	        this.state = 373;
	        this.match(VizRepParser.DIGITS);
	        this.state = 374;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseSphere() {
	    let localctx = new ElseSphereContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 42, VizRepParser.RULE_elseSphere);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 376;
	        this.match(VizRepParser.T__14);
	        this.state = 377;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 378;
	        this.match(VizRepParser.T__9);
	        this.state = 379;
	        this.match(VizRepParser.DIGITS);
	        this.state = 380;
	        this.match(VizRepParser.T__10);
	        this.state = 381;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 382;
	        this.match(VizRepParser.T__9);
	        this.state = 383;
	        this.match(VizRepParser.DIGITS);
	        this.state = 384;
	        this.match(VizRepParser.T__10);
	        this.state = 385;
	        this.match(VizRepParser.SPHEREDIMENSIONS);
	        this.state = 386;
	        this.match(VizRepParser.T__9);
	        this.state = 387;
	        this.match(VizRepParser.DIGITS);
	        this.state = 388;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	plane() {
	    let localctx = new PlaneContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 44, VizRepParser.RULE_plane);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 390;
	        this.match(VizRepParser.T__15);
	        this.state = 391;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 392;
	        this.match(VizRepParser.T__9);
	        this.state = 393;
	        this.match(VizRepParser.DIGITS);
	        this.state = 394;
	        this.match(VizRepParser.T__10);
	        this.state = 395;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 396;
	        this.match(VizRepParser.T__9);
	        this.state = 397;
	        this.match(VizRepParser.DIGITS);
	        this.state = 398;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relPane() {
	    let localctx = new RelPaneContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 46, VizRepParser.RULE_relPane);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 400;
	        this.match(VizRepParser.T__15);
	        this.state = 401;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 402;
	        this.match(VizRepParser.T__9);
	        this.state = 403;
	        this.match(VizRepParser.DIGITS);
	        this.state = 404;
	        this.match(VizRepParser.T__10);
	        this.state = 405;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 406;
	        this.match(VizRepParser.T__9);
	        this.state = 407;
	        this.match(VizRepParser.DIGITS);
	        this.state = 408;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifPlane() {
	    let localctx = new IfPlaneContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 48, VizRepParser.RULE_ifPlane);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 410;
	        this.match(VizRepParser.T__15);
	        this.state = 411;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 412;
	        this.match(VizRepParser.T__9);
	        this.state = 413;
	        this.match(VizRepParser.DIGITS);
	        this.state = 414;
	        this.match(VizRepParser.T__10);
	        this.state = 415;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 416;
	        this.match(VizRepParser.T__9);
	        this.state = 417;
	        this.match(VizRepParser.DIGITS);
	        this.state = 418;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elsePlane() {
	    let localctx = new ElsePlaneContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 50, VizRepParser.RULE_elsePlane);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 420;
	        this.match(VizRepParser.T__15);
	        this.state = 421;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 422;
	        this.match(VizRepParser.T__9);
	        this.state = 423;
	        this.match(VizRepParser.DIGITS);
	        this.state = 424;
	        this.match(VizRepParser.T__10);
	        this.state = 425;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 426;
	        this.match(VizRepParser.T__9);
	        this.state = 427;
	        this.match(VizRepParser.DIGITS);
	        this.state = 428;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	text() {
	    let localctx = new TextContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 52, VizRepParser.RULE_text);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 430;
	        this.match(VizRepParser.T__16);
	        this.state = 431;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 432;
	        this.match(VizRepParser.T__9);
	        this.state = 433;
	        this.match(VizRepParser.DIGITS);
	        this.state = 434;
	        this.match(VizRepParser.T__10);
	        this.state = 435;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 436;
	        this.match(VizRepParser.T__9);
	        this.state = 437;
	        this.match(VizRepParser.DIGITS);
	        this.state = 438;
	        this.match(VizRepParser.T__10);
	        this.state = 439;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 440;
	        this.match(VizRepParser.T__9);
	        this.state = 441;
	        this.match(VizRepParser.DIGITS);
	        this.state = 442;
	        this.match(VizRepParser.T__10);
	        this.state = 443;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 444;
	        this.match(VizRepParser.T__9);
	        this.state = 445;
	        this.match(VizRepParser.DIGITS);
	        this.state = 446;
	        this.match(VizRepParser.T__10);
	        this.state = 447;
	        this.match(VizRepParser.TEXTDIMSTRING);
	        this.state = 448;
	        this.match(VizRepParser.T__9);
	        this.state = 449;
	        this.match(VizRepParser.STRING);
	        this.state = 454;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,34,this._ctx);
	        if(la_===1) {
	            this.state = 450;
	            this.match(VizRepParser.T__10);
	            this.state = 451;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 452;
	            this.match(VizRepParser.T__9);
	            this.state = 453;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 460;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,35,this._ctx);
	        if(la_===1) {
	            this.state = 456;
	            this.match(VizRepParser.T__10);
	            this.state = 457;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 458;
	            this.match(VizRepParser.T__9);
	            this.state = 459;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 466;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===11) {
	            this.state = 462;
	            this.match(VizRepParser.T__10);
	            this.state = 463;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 464;
	            this.match(VizRepParser.T__9);
	            this.state = 465;
	            this.match(VizRepParser.STRING);
	        }

	        this.state = 468;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relText() {
	    let localctx = new RelTextContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 54, VizRepParser.RULE_relText);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 470;
	        this.match(VizRepParser.T__16);
	        this.state = 471;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 472;
	        this.match(VizRepParser.T__9);
	        this.state = 473;
	        this.match(VizRepParser.DIGITS);
	        this.state = 474;
	        this.match(VizRepParser.T__10);
	        this.state = 475;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 476;
	        this.match(VizRepParser.T__9);
	        this.state = 477;
	        this.match(VizRepParser.DIGITS);
	        this.state = 478;
	        this.match(VizRepParser.T__10);
	        this.state = 479;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 480;
	        this.match(VizRepParser.T__9);
	        this.state = 481;
	        this.match(VizRepParser.DIGITS);
	        this.state = 482;
	        this.match(VizRepParser.T__10);
	        this.state = 483;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 484;
	        this.match(VizRepParser.T__9);
	        this.state = 485;
	        this.match(VizRepParser.DIGITS);
	        this.state = 486;
	        this.match(VizRepParser.T__10);
	        this.state = 487;
	        this.match(VizRepParser.TEXTDIMSTRING);
	        this.state = 488;
	        this.match(VizRepParser.T__9);
	        this.state = 489;
	        this.match(VizRepParser.STRING);
	        this.state = 494;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,37,this._ctx);
	        if(la_===1) {
	            this.state = 490;
	            this.match(VizRepParser.T__10);
	            this.state = 491;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 492;
	            this.match(VizRepParser.T__9);
	            this.state = 493;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 500;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,38,this._ctx);
	        if(la_===1) {
	            this.state = 496;
	            this.match(VizRepParser.T__10);
	            this.state = 497;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 498;
	            this.match(VizRepParser.T__9);
	            this.state = 499;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 506;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===11) {
	            this.state = 502;
	            this.match(VizRepParser.T__10);
	            this.state = 503;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 504;
	            this.match(VizRepParser.T__9);
	            this.state = 505;
	            this.match(VizRepParser.STRING);
	        }

	        this.state = 508;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifText() {
	    let localctx = new IfTextContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 56, VizRepParser.RULE_ifText);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 510;
	        this.match(VizRepParser.T__16);
	        this.state = 511;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 512;
	        this.match(VizRepParser.T__9);
	        this.state = 513;
	        this.match(VizRepParser.DIGITS);
	        this.state = 514;
	        this.match(VizRepParser.T__10);
	        this.state = 515;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 516;
	        this.match(VizRepParser.T__9);
	        this.state = 517;
	        this.match(VizRepParser.DIGITS);
	        this.state = 518;
	        this.match(VizRepParser.T__10);
	        this.state = 519;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 520;
	        this.match(VizRepParser.T__9);
	        this.state = 521;
	        this.match(VizRepParser.DIGITS);
	        this.state = 522;
	        this.match(VizRepParser.T__10);
	        this.state = 523;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 524;
	        this.match(VizRepParser.T__9);
	        this.state = 525;
	        this.match(VizRepParser.DIGITS);
	        this.state = 526;
	        this.match(VizRepParser.T__10);
	        this.state = 527;
	        this.match(VizRepParser.TEXTDIMSTRING);
	        this.state = 528;
	        this.match(VizRepParser.T__9);
	        this.state = 529;
	        this.match(VizRepParser.STRING);
	        this.state = 534;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,40,this._ctx);
	        if(la_===1) {
	            this.state = 530;
	            this.match(VizRepParser.T__10);
	            this.state = 531;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 532;
	            this.match(VizRepParser.T__9);
	            this.state = 533;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 540;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,41,this._ctx);
	        if(la_===1) {
	            this.state = 536;
	            this.match(VizRepParser.T__10);
	            this.state = 537;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 538;
	            this.match(VizRepParser.T__9);
	            this.state = 539;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 546;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===11) {
	            this.state = 542;
	            this.match(VizRepParser.T__10);
	            this.state = 543;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 544;
	            this.match(VizRepParser.T__9);
	            this.state = 545;
	            this.match(VizRepParser.STRING);
	        }

	        this.state = 548;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseText() {
	    let localctx = new ElseTextContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 58, VizRepParser.RULE_elseText);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 550;
	        this.match(VizRepParser.T__16);
	        this.state = 551;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 552;
	        this.match(VizRepParser.T__9);
	        this.state = 553;
	        this.match(VizRepParser.DIGITS);
	        this.state = 554;
	        this.match(VizRepParser.T__10);
	        this.state = 555;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 556;
	        this.match(VizRepParser.T__9);
	        this.state = 557;
	        this.match(VizRepParser.DIGITS);
	        this.state = 558;
	        this.match(VizRepParser.T__10);
	        this.state = 559;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 560;
	        this.match(VizRepParser.T__9);
	        this.state = 561;
	        this.match(VizRepParser.DIGITS);
	        this.state = 562;
	        this.match(VizRepParser.T__10);
	        this.state = 563;
	        this.match(VizRepParser.TEXTDIMDIGITS);
	        this.state = 564;
	        this.match(VizRepParser.T__9);
	        this.state = 565;
	        this.match(VizRepParser.DIGITS);
	        this.state = 566;
	        this.match(VizRepParser.T__10);
	        this.state = 567;
	        this.match(VizRepParser.TEXTDIMSTRING);
	        this.state = 568;
	        this.match(VizRepParser.T__9);
	        this.state = 569;
	        this.match(VizRepParser.STRING);
	        this.state = 574;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,43,this._ctx);
	        if(la_===1) {
	            this.state = 570;
	            this.match(VizRepParser.T__10);
	            this.state = 571;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 572;
	            this.match(VizRepParser.T__9);
	            this.state = 573;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 580;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,44,this._ctx);
	        if(la_===1) {
	            this.state = 576;
	            this.match(VizRepParser.T__10);
	            this.state = 577;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 578;
	            this.match(VizRepParser.T__9);
	            this.state = 579;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 586;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===11) {
	            this.state = 582;
	            this.match(VizRepParser.T__10);
	            this.state = 583;
	            this.match(VizRepParser.TEXTDIMSTRING);
	            this.state = 584;
	            this.match(VizRepParser.T__9);
	            this.state = 585;
	            this.match(VizRepParser.STRING);
	        }

	        this.state = 588;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	line() {
	    let localctx = new LineContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 60, VizRepParser.RULE_line);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 590;
	        this.match(VizRepParser.T__17);
	        this.state = 591;
	        this.match(VizRepParser.T__18);
	        this.state = 592;
	        this.match(VizRepParser.DIGITS);
	        this.state = 593;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifLine() {
	    let localctx = new IfLineContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 62, VizRepParser.RULE_ifLine);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 595;
	        this.match(VizRepParser.T__17);
	        this.state = 596;
	        this.match(VizRepParser.T__18);
	        this.state = 597;
	        this.match(VizRepParser.DIGITS);
	        this.state = 598;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseLine() {
	    let localctx = new ElseLineContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 64, VizRepParser.RULE_elseLine);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 600;
	        this.match(VizRepParser.T__17);
	        this.state = 601;
	        this.match(VizRepParser.T__18);
	        this.state = 602;
	        this.match(VizRepParser.DIGITS);
	        this.state = 603;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	pen() {
	    let localctx = new PenContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 66, VizRepParser.RULE_pen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 605;
	        this.match(VizRepParser.T__19);
	        this.state = 606;
	        this.match(VizRepParser.PENPARAMSBOOL);
	        this.state = 607;
	        this.match(VizRepParser.T__9);
	        this.state = 608;
	        this.match(VizRepParser.STRING);
	        this.state = 609;
	        this.match(VizRepParser.T__10);
	        this.state = 610;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 611;
	        this.match(VizRepParser.T__9);
	        this.state = 612;
	        this.match(VizRepParser.DIGITS);
	        this.state = 613;
	        this.match(VizRepParser.T__10);
	        this.state = 614;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 615;
	        this.match(VizRepParser.T__9);
	        this.state = 616;
	        this.match(VizRepParser.DIGITS);
	        this.state = 617;
	        this.match(VizRepParser.T__10);
	        this.state = 618;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 619;
	        this.match(VizRepParser.T__9);
	        this.state = 620;
	        this.match(VizRepParser.DIGITS);
	        this.state = 621;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifPen() {
	    let localctx = new IfPenContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 68, VizRepParser.RULE_ifPen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 623;
	        this.match(VizRepParser.T__19);
	        this.state = 624;
	        this.match(VizRepParser.PENPARAMSBOOL);
	        this.state = 625;
	        this.match(VizRepParser.T__9);
	        this.state = 626;
	        this.match(VizRepParser.STRING);
	        this.state = 627;
	        this.match(VizRepParser.T__10);
	        this.state = 628;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 629;
	        this.match(VizRepParser.T__9);
	        this.state = 630;
	        this.match(VizRepParser.DIGITS);
	        this.state = 631;
	        this.match(VizRepParser.T__10);
	        this.state = 632;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 633;
	        this.match(VizRepParser.T__9);
	        this.state = 634;
	        this.match(VizRepParser.DIGITS);
	        this.state = 635;
	        this.match(VizRepParser.T__10);
	        this.state = 636;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 637;
	        this.match(VizRepParser.T__9);
	        this.state = 638;
	        this.match(VizRepParser.DIGITS);
	        this.state = 639;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elsePen() {
	    let localctx = new ElsePenContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 70, VizRepParser.RULE_elsePen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 641;
	        this.match(VizRepParser.T__19);
	        this.state = 642;
	        this.match(VizRepParser.PENPARAMSBOOL);
	        this.state = 643;
	        this.match(VizRepParser.T__9);
	        this.state = 644;
	        this.match(VizRepParser.STRING);
	        this.state = 645;
	        this.match(VizRepParser.T__10);
	        this.state = 646;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 647;
	        this.match(VizRepParser.T__9);
	        this.state = 648;
	        this.match(VizRepParser.DIGITS);
	        this.state = 649;
	        this.match(VizRepParser.T__10);
	        this.state = 650;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 651;
	        this.match(VizRepParser.T__9);
	        this.state = 652;
	        this.match(VizRepParser.DIGITS);
	        this.state = 653;
	        this.match(VizRepParser.T__10);
	        this.state = 654;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 655;
	        this.match(VizRepParser.T__9);
	        this.state = 656;
	        this.match(VizRepParser.DIGITS);
	        this.state = 657;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	color() {
	    let localctx = new ColorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 72, VizRepParser.RULE_color);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 659;
	        this.match(VizRepParser.T__20);
	        this.state = 660;
	        this.match(VizRepParser.STRING);
	        this.state = 661;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifColor() {
	    let localctx = new IfColorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 74, VizRepParser.RULE_ifColor);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 663;
	        this.match(VizRepParser.T__20);
	        this.state = 664;
	        this.match(VizRepParser.STRING);
	        this.state = 665;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseColor() {
	    let localctx = new ElseColorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 76, VizRepParser.RULE_elseColor);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 667;
	        this.match(VizRepParser.T__20);
	        this.state = 668;
	        this.match(VizRepParser.STRING);
	        this.state = 669;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	map() {
	    let localctx = new MapContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 78, VizRepParser.RULE_map);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 671;
	        this.match(VizRepParser.T__21);
	        this.state = 672;
	        this.match(VizRepParser.MAP);
	        this.state = 673;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	ifMap() {
	    let localctx = new IfMapContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 80, VizRepParser.RULE_ifMap);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 675;
	        this.match(VizRepParser.T__21);
	        this.state = 676;
	        this.match(VizRepParser.STRING);
	        this.state = 677;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	elseMap() {
	    let localctx = new ElseMapContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 82, VizRepParser.RULE_elseMap);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 679;
	        this.match(VizRepParser.T__21);
	        this.state = 680;
	        this.match(VizRepParser.STRING);
	        this.state = 681;
	        this.match(VizRepParser.T__11);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

VizRepParser.EOF = antlr4.Token.EOF;
VizRepParser.T__0 = 1;
VizRepParser.T__1 = 2;
VizRepParser.T__2 = 3;
VizRepParser.T__3 = 4;
VizRepParser.T__4 = 5;
VizRepParser.T__5 = 6;
VizRepParser.T__6 = 7;
VizRepParser.T__7 = 8;
VizRepParser.T__8 = 9;
VizRepParser.T__9 = 10;
VizRepParser.T__10 = 11;
VizRepParser.T__11 = 12;
VizRepParser.T__12 = 13;
VizRepParser.T__13 = 14;
VizRepParser.T__14 = 15;
VizRepParser.T__15 = 16;
VizRepParser.T__16 = 17;
VizRepParser.T__17 = 18;
VizRepParser.T__18 = 19;
VizRepParser.T__19 = 20;
VizRepParser.T__20 = 21;
VizRepParser.T__21 = 22;
VizRepParser.BOOLEANSTRING = 23;
VizRepParser.SPHEREDIMENSIONS = 24;
VizRepParser.DIMENSION3D = 25;
VizRepParser.DIMENSION3DDYN = 26;
VizRepParser.DIMENSION2D = 27;
VizRepParser.TEXTDIMDIGITS = 28;
VizRepParser.TEXTDIMSTRING = 29;
VizRepParser.PENPARAMSBOOL = 30;
VizRepParser.PENPARAMS = 31;
VizRepParser.VARASSVALUES = 32;
VizRepParser.DIGITS = 33;
VizRepParser.STRING = 34;
VizRepParser.MAP = 35;
VizRepParser.WHITESPACE = 36;
VizRepParser.NEWLINE = 37;
VizRepParser.OPERATOR = 38;
VizRepParser.SOMERULE = 39;

VizRepParser.RULE_commandChain = 0;
VizRepParser.RULE_relation = 1;
VizRepParser.RULE_relMiddle = 2;
VizRepParser.RULE_condition = 3;
VizRepParser.RULE_setVariable = 4;
VizRepParser.RULE_ifBlock = 5;
VizRepParser.RULE_elseBlock = 6;
VizRepParser.RULE_ifCommand = 7;
VizRepParser.RULE_elseCommand = 8;
VizRepParser.RULE_command = 9;
VizRepParser.RULE_shapeCommand = 10;
VizRepParser.RULE_styleCommand = 11;
VizRepParser.RULE_relCommandFrom = 12;
VizRepParser.RULE_relCommandTo = 13;
VizRepParser.RULE_cube = 14;
VizRepParser.RULE_relCube = 15;
VizRepParser.RULE_ifCube = 16;
VizRepParser.RULE_elseCube = 17;
VizRepParser.RULE_sphere = 18;
VizRepParser.RULE_relSphere = 19;
VizRepParser.RULE_ifSphere = 20;
VizRepParser.RULE_elseSphere = 21;
VizRepParser.RULE_plane = 22;
VizRepParser.RULE_relPane = 23;
VizRepParser.RULE_ifPlane = 24;
VizRepParser.RULE_elsePlane = 25;
VizRepParser.RULE_text = 26;
VizRepParser.RULE_relText = 27;
VizRepParser.RULE_ifText = 28;
VizRepParser.RULE_elseText = 29;
VizRepParser.RULE_line = 30;
VizRepParser.RULE_ifLine = 31;
VizRepParser.RULE_elseLine = 32;
VizRepParser.RULE_pen = 33;
VizRepParser.RULE_ifPen = 34;
VizRepParser.RULE_elsePen = 35;
VizRepParser.RULE_color = 36;
VizRepParser.RULE_ifColor = 37;
VizRepParser.RULE_elseColor = 38;
VizRepParser.RULE_map = 39;
VizRepParser.RULE_ifMap = 40;
VizRepParser.RULE_elseMap = 41;

class CommandChainContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_commandChain;
    }

	EOF() {
	    return this.getToken(VizRepParser.EOF, 0);
	};

	NEWLINE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.NEWLINE);
	    } else {
	        return this.getToken(VizRepParser.NEWLINE, i);
	    }
	};


	command = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CommandContext);
	    } else {
	        return this.getTypedRuleContext(CommandContext,i);
	    }
	};

	relation = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(RelationContext);
	    } else {
	        return this.getTypedRuleContext(RelationContext,i);
	    }
	};

	condition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ConditionContext);
	    } else {
	        return this.getTypedRuleContext(ConditionContext,i);
	    }
	};

	setVariable = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SetVariableContext);
	    } else {
	        return this.getTypedRuleContext(SetVariableContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterCommandChain(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitCommandChain(this);
		}
	}


}



class RelationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_relation;
    }

	line() {
	    return this.getTypedRuleContext(LineContext,0);
	};

	relCommandFrom = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(RelCommandFromContext);
	    } else {
	        return this.getTypedRuleContext(RelCommandFromContext,i);
	    }
	};

	relCommandTo = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(RelCommandToContext);
	    } else {
	        return this.getTypedRuleContext(RelCommandToContext,i);
	    }
	};

	NEWLINE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.NEWLINE);
	    } else {
	        return this.getToken(VizRepParser.NEWLINE, i);
	    }
	};


	color = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ColorContext);
	    } else {
	        return this.getTypedRuleContext(ColorContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterRelation(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitRelation(this);
		}
	}


}



class RelMiddleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_relMiddle;
    }

	line() {
	    return this.getTypedRuleContext(LineContext,0);
	};

	shapeCommand = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ShapeCommandContext);
	    } else {
	        return this.getTypedRuleContext(ShapeCommandContext,i);
	    }
	};

	text() {
	    return this.getTypedRuleContext(TextContext,0);
	};

	NEWLINE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.NEWLINE);
	    } else {
	        return this.getToken(VizRepParser.NEWLINE, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterRelMiddle(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitRelMiddle(this);
		}
	}


}



class ConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_condition;
    }

	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	OPERATOR() {
	    return this.getToken(VizRepParser.OPERATOR, 0);
	};

	NEWLINE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.NEWLINE);
	    } else {
	        return this.getToken(VizRepParser.NEWLINE, i);
	    }
	};


	ifBlock() {
	    return this.getTypedRuleContext(IfBlockContext,0);
	};

	elseBlock() {
	    return this.getTypedRuleContext(ElseBlockContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterCondition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitCondition(this);
		}
	}


}



class SetVariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_setVariable;
    }

	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.STRING);
	    } else {
	        return this.getToken(VizRepParser.STRING, i);
	    }
	};


	VARASSVALUES = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.VARASSVALUES);
	    } else {
	        return this.getToken(VizRepParser.VARASSVALUES, i);
	    }
	};


	BOOLEANSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.BOOLEANSTRING);
	    } else {
	        return this.getToken(VizRepParser.BOOLEANSTRING, i);
	    }
	};


	SOMERULE() {
	    return this.getToken(VizRepParser.SOMERULE, 0);
	};

	DIGITS() {
	    return this.getToken(VizRepParser.DIGITS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterSetVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitSetVariable(this);
		}
	}


}



class IfBlockContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifBlock;
    }

	ifCommand = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(IfCommandContext);
	    } else {
	        return this.getTypedRuleContext(IfCommandContext,i);
	    }
	};

	relation = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(RelationContext);
	    } else {
	        return this.getTypedRuleContext(RelationContext,i);
	    }
	};

	NEWLINE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.NEWLINE);
	    } else {
	        return this.getToken(VizRepParser.NEWLINE, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfBlock(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfBlock(this);
		}
	}


}



class ElseBlockContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elseBlock;
    }

	elseCommand = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ElseCommandContext);
	    } else {
	        return this.getTypedRuleContext(ElseCommandContext,i);
	    }
	};

	relation = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(RelationContext);
	    } else {
	        return this.getTypedRuleContext(RelationContext,i);
	    }
	};

	NEWLINE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.NEWLINE);
	    } else {
	        return this.getToken(VizRepParser.NEWLINE, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElseBlock(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElseBlock(this);
		}
	}


}



class IfCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifCommand;
    }

	ifCube() {
	    return this.getTypedRuleContext(IfCubeContext,0);
	};

	ifSphere() {
	    return this.getTypedRuleContext(IfSphereContext,0);
	};

	ifPlane() {
	    return this.getTypedRuleContext(IfPlaneContext,0);
	};

	ifText() {
	    return this.getTypedRuleContext(IfTextContext,0);
	};

	ifColor() {
	    return this.getTypedRuleContext(IfColorContext,0);
	};

	ifMap() {
	    return this.getTypedRuleContext(IfMapContext,0);
	};

	ifPen() {
	    return this.getTypedRuleContext(IfPenContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfCommand(this);
		}
	}


}



class ElseCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elseCommand;
    }

	elseCube() {
	    return this.getTypedRuleContext(ElseCubeContext,0);
	};

	elseSphere() {
	    return this.getTypedRuleContext(ElseSphereContext,0);
	};

	elsePlane() {
	    return this.getTypedRuleContext(ElsePlaneContext,0);
	};

	elseText() {
	    return this.getTypedRuleContext(ElseTextContext,0);
	};

	elseColor() {
	    return this.getTypedRuleContext(ElseColorContext,0);
	};

	elseMap() {
	    return this.getTypedRuleContext(ElseMapContext,0);
	};

	elsePen() {
	    return this.getTypedRuleContext(ElsePenContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElseCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElseCommand(this);
		}
	}


}



class CommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_command;
    }

	shapeCommand() {
	    return this.getTypedRuleContext(ShapeCommandContext,0);
	};

	styleCommand() {
	    return this.getTypedRuleContext(StyleCommandContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitCommand(this);
		}
	}


}



class ShapeCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_shapeCommand;
    }

	cube() {
	    return this.getTypedRuleContext(CubeContext,0);
	};

	sphere() {
	    return this.getTypedRuleContext(SphereContext,0);
	};

	plane() {
	    return this.getTypedRuleContext(PlaneContext,0);
	};

	text() {
	    return this.getTypedRuleContext(TextContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterShapeCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitShapeCommand(this);
		}
	}


}



class StyleCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_styleCommand;
    }

	color() {
	    return this.getTypedRuleContext(ColorContext,0);
	};

	map() {
	    return this.getTypedRuleContext(MapContext,0);
	};

	pen() {
	    return this.getTypedRuleContext(PenContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterStyleCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitStyleCommand(this);
		}
	}


}



class RelCommandFromContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_relCommandFrom;
    }

	relCube() {
	    return this.getTypedRuleContext(RelCubeContext,0);
	};

	relSphere() {
	    return this.getTypedRuleContext(RelSphereContext,0);
	};

	relPane() {
	    return this.getTypedRuleContext(RelPaneContext,0);
	};

	relText() {
	    return this.getTypedRuleContext(RelTextContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterRelCommandFrom(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitRelCommandFrom(this);
		}
	}


}



class RelCommandToContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_relCommandTo;
    }

	relCube() {
	    return this.getTypedRuleContext(RelCubeContext,0);
	};

	relSphere() {
	    return this.getTypedRuleContext(RelSphereContext,0);
	};

	relPane() {
	    return this.getTypedRuleContext(RelPaneContext,0);
	};

	relText() {
	    return this.getTypedRuleContext(RelTextContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterRelCommandTo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitRelCommandTo(this);
		}
	}


}



class CubeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_cube;
    }

	DIMENSION3D = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3D);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3D, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	DIMENSION3DDYN = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3DDYN);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3DDYN, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.STRING);
	    } else {
	        return this.getToken(VizRepParser.STRING, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterCube(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitCube(this);
		}
	}


}



class RelCubeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_relCube;
    }

	DIMENSION3D = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3D);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3D, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterRelCube(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitRelCube(this);
		}
	}


}



class IfCubeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifCube;
    }

	DIMENSION3D = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3D);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3D, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfCube(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfCube(this);
		}
	}


}



class ElseCubeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elseCube;
    }

	DIMENSION3D = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3D);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3D, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElseCube(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElseCube(this);
		}
	}


}



class SphereContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_sphere;
    }

	SPHEREDIMENSIONS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.SPHEREDIMENSIONS);
	    } else {
	        return this.getToken(VizRepParser.SPHEREDIMENSIONS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterSphere(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitSphere(this);
		}
	}


}



class RelSphereContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_relSphere;
    }

	SPHEREDIMENSIONS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.SPHEREDIMENSIONS);
	    } else {
	        return this.getToken(VizRepParser.SPHEREDIMENSIONS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterRelSphere(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitRelSphere(this);
		}
	}


}



class IfSphereContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifSphere;
    }

	SPHEREDIMENSIONS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.SPHEREDIMENSIONS);
	    } else {
	        return this.getToken(VizRepParser.SPHEREDIMENSIONS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfSphere(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfSphere(this);
		}
	}


}



class ElseSphereContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elseSphere;
    }

	SPHEREDIMENSIONS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.SPHEREDIMENSIONS);
	    } else {
	        return this.getToken(VizRepParser.SPHEREDIMENSIONS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElseSphere(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElseSphere(this);
		}
	}


}



class PlaneContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_plane;
    }

	DIMENSION3D = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3D);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3D, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterPlane(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitPlane(this);
		}
	}


}



class RelPaneContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_relPane;
    }

	DIMENSION3D = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3D);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3D, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterRelPane(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitRelPane(this);
		}
	}


}



class IfPlaneContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifPlane;
    }

	DIMENSION3D = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3D);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3D, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfPlane(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfPlane(this);
		}
	}


}



class ElsePlaneContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elsePlane;
    }

	DIMENSION3D = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIMENSION3D);
	    } else {
	        return this.getToken(VizRepParser.DIMENSION3D, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElsePlane(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElsePlane(this);
		}
	}


}



class TextContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_text;
    }

	TEXTDIMDIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTDIMDIGITS);
	    } else {
	        return this.getToken(VizRepParser.TEXTDIMDIGITS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	TEXTDIMSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTDIMSTRING);
	    } else {
	        return this.getToken(VizRepParser.TEXTDIMSTRING, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.STRING);
	    } else {
	        return this.getToken(VizRepParser.STRING, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterText(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitText(this);
		}
	}


}



class RelTextContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_relText;
    }

	TEXTDIMDIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTDIMDIGITS);
	    } else {
	        return this.getToken(VizRepParser.TEXTDIMDIGITS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	TEXTDIMSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTDIMSTRING);
	    } else {
	        return this.getToken(VizRepParser.TEXTDIMSTRING, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.STRING);
	    } else {
	        return this.getToken(VizRepParser.STRING, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterRelText(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitRelText(this);
		}
	}


}



class IfTextContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifText;
    }

	TEXTDIMDIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTDIMDIGITS);
	    } else {
	        return this.getToken(VizRepParser.TEXTDIMDIGITS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	TEXTDIMSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTDIMSTRING);
	    } else {
	        return this.getToken(VizRepParser.TEXTDIMSTRING, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.STRING);
	    } else {
	        return this.getToken(VizRepParser.STRING, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfText(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfText(this);
		}
	}


}



class ElseTextContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elseText;
    }

	TEXTDIMDIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTDIMDIGITS);
	    } else {
	        return this.getToken(VizRepParser.TEXTDIMDIGITS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	TEXTDIMSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTDIMSTRING);
	    } else {
	        return this.getToken(VizRepParser.TEXTDIMSTRING, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.STRING);
	    } else {
	        return this.getToken(VizRepParser.STRING, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElseText(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElseText(this);
		}
	}


}



class LineContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_line;
    }

	DIGITS() {
	    return this.getToken(VizRepParser.DIGITS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterLine(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitLine(this);
		}
	}


}



class IfLineContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifLine;
    }

	DIGITS() {
	    return this.getToken(VizRepParser.DIGITS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfLine(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfLine(this);
		}
	}


}



class ElseLineContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elseLine;
    }

	DIGITS() {
	    return this.getToken(VizRepParser.DIGITS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElseLine(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElseLine(this);
		}
	}


}



class PenContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_pen;
    }

	PENPARAMSBOOL() {
	    return this.getToken(VizRepParser.PENPARAMSBOOL, 0);
	};

	STRING() {
	    return this.getToken(VizRepParser.STRING, 0);
	};

	PENPARAMS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.PENPARAMS);
	    } else {
	        return this.getToken(VizRepParser.PENPARAMS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterPen(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitPen(this);
		}
	}


}



class IfPenContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifPen;
    }

	PENPARAMSBOOL() {
	    return this.getToken(VizRepParser.PENPARAMSBOOL, 0);
	};

	STRING() {
	    return this.getToken(VizRepParser.STRING, 0);
	};

	PENPARAMS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.PENPARAMS);
	    } else {
	        return this.getToken(VizRepParser.PENPARAMS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfPen(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfPen(this);
		}
	}


}



class ElsePenContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elsePen;
    }

	PENPARAMSBOOL() {
	    return this.getToken(VizRepParser.PENPARAMSBOOL, 0);
	};

	STRING() {
	    return this.getToken(VizRepParser.STRING, 0);
	};

	PENPARAMS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.PENPARAMS);
	    } else {
	        return this.getToken(VizRepParser.PENPARAMS, i);
	    }
	};


	DIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.DIGITS);
	    } else {
	        return this.getToken(VizRepParser.DIGITS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElsePen(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElsePen(this);
		}
	}


}



class ColorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_color;
    }

	STRING() {
	    return this.getToken(VizRepParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterColor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitColor(this);
		}
	}


}



class IfColorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifColor;
    }

	STRING() {
	    return this.getToken(VizRepParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfColor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfColor(this);
		}
	}


}



class ElseColorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elseColor;
    }

	STRING() {
	    return this.getToken(VizRepParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElseColor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElseColor(this);
		}
	}


}



class MapContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_map;
    }

	MAP() {
	    return this.getToken(VizRepParser.MAP, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterMap(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitMap(this);
		}
	}


}



class IfMapContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_ifMap;
    }

	STRING() {
	    return this.getToken(VizRepParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterIfMap(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitIfMap(this);
		}
	}


}



class ElseMapContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_elseMap;
    }

	STRING() {
	    return this.getToken(VizRepParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterElseMap(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitElseMap(this);
		}
	}


}




VizRepParser.CommandChainContext = CommandChainContext; 
VizRepParser.RelationContext = RelationContext; 
VizRepParser.RelMiddleContext = RelMiddleContext; 
VizRepParser.ConditionContext = ConditionContext; 
VizRepParser.SetVariableContext = SetVariableContext; 
VizRepParser.IfBlockContext = IfBlockContext; 
VizRepParser.ElseBlockContext = ElseBlockContext; 
VizRepParser.IfCommandContext = IfCommandContext; 
VizRepParser.ElseCommandContext = ElseCommandContext; 
VizRepParser.CommandContext = CommandContext; 
VizRepParser.ShapeCommandContext = ShapeCommandContext; 
VizRepParser.StyleCommandContext = StyleCommandContext; 
VizRepParser.RelCommandFromContext = RelCommandFromContext; 
VizRepParser.RelCommandToContext = RelCommandToContext; 
VizRepParser.CubeContext = CubeContext; 
VizRepParser.RelCubeContext = RelCubeContext; 
VizRepParser.IfCubeContext = IfCubeContext; 
VizRepParser.ElseCubeContext = ElseCubeContext; 
VizRepParser.SphereContext = SphereContext; 
VizRepParser.RelSphereContext = RelSphereContext; 
VizRepParser.IfSphereContext = IfSphereContext; 
VizRepParser.ElseSphereContext = ElseSphereContext; 
VizRepParser.PlaneContext = PlaneContext; 
VizRepParser.RelPaneContext = RelPaneContext; 
VizRepParser.IfPlaneContext = IfPlaneContext; 
VizRepParser.ElsePlaneContext = ElsePlaneContext; 
VizRepParser.TextContext = TextContext; 
VizRepParser.RelTextContext = RelTextContext; 
VizRepParser.IfTextContext = IfTextContext; 
VizRepParser.ElseTextContext = ElseTextContext; 
VizRepParser.LineContext = LineContext; 
VizRepParser.IfLineContext = IfLineContext; 
VizRepParser.ElseLineContext = ElseLineContext; 
VizRepParser.PenContext = PenContext; 
VizRepParser.IfPenContext = IfPenContext; 
VizRepParser.ElsePenContext = ElsePenContext; 
VizRepParser.ColorContext = ColorContext; 
VizRepParser.IfColorContext = IfColorContext; 
VizRepParser.ElseColorContext = ElseColorContext; 
VizRepParser.MapContext = MapContext; 
VizRepParser.IfMapContext = IfMapContext; 
VizRepParser.ElseMapContext = ElseMapContext; 
