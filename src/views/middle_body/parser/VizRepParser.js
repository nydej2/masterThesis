// Generated from java-escape by ANTLR 4.11.1
// jshint ignore: start
import antlr4 from 'antlr4';
import VizRepListener from './VizRepListener.js';
const serializedATN = [4,1,37,579,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,
7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,7,
34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,39,7,39,2,40,7,40,2,41,7,41,
2,42,7,42,1,0,1,0,1,0,1,0,1,0,4,0,92,8,0,11,0,12,0,93,1,0,1,0,1,1,1,1,1,
1,3,1,101,8,1,1,2,1,2,3,2,105,8,2,1,2,1,2,3,2,109,8,2,1,2,3,2,112,8,2,1,
2,3,2,115,8,2,1,2,1,2,3,2,119,8,2,1,2,3,2,122,8,2,1,2,4,2,125,8,2,11,2,12,
2,126,1,2,1,2,3,2,131,8,2,1,2,3,2,134,8,2,1,2,4,2,137,8,2,11,2,12,2,138,
1,2,1,2,3,2,143,8,2,1,2,3,2,146,8,2,1,3,1,3,1,3,1,3,3,3,152,8,3,1,4,1,4,
1,4,1,4,3,4,158,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,
1,5,1,6,1,6,1,6,4,6,177,8,6,11,6,12,6,178,1,7,1,7,1,7,4,7,184,8,7,11,7,12,
7,185,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,195,8,8,1,9,1,9,1,9,1,9,1,9,1,9,1,
9,3,9,204,8,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,
1,10,1,10,1,11,1,11,1,11,3,11,223,8,11,1,12,1,12,1,12,3,12,228,8,12,1,13,
1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,
14,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,16,1,16,1,16,1,16,1,16,1,16,
1,16,1,16,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,
18,1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,20,1,20,1,20,
1,20,1,20,1,20,1,20,1,20,1,21,1,21,1,21,1,21,1,21,1,21,1,22,1,22,1,22,1,
22,1,22,1,22,1,23,1,23,1,23,1,23,1,23,1,23,1,24,1,24,1,24,1,24,1,24,1,24,
1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,
25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,3,25,342,8,25,1,25,1,25,
1,25,1,25,3,25,348,8,25,1,25,1,25,1,25,1,25,3,25,354,8,25,1,25,1,25,1,26,
1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,
26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,1,26,3,26,382,8,26,1,26,1,26,1,26,
1,26,3,26,388,8,26,1,26,1,26,1,26,1,26,3,26,394,8,26,1,26,1,26,1,27,1,27,
1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,
27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,3,27,422,8,27,1,27,1,27,1,27,1,27,
3,27,428,8,27,1,27,1,27,1,27,1,27,3,27,434,8,27,1,27,1,27,1,28,1,28,1,28,
1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,
28,1,28,1,28,1,28,1,28,1,28,1,28,3,28,462,8,28,1,28,1,28,1,28,1,28,3,28,
468,8,28,1,28,1,28,1,28,1,28,3,28,474,8,28,1,28,1,28,1,29,1,29,1,29,1,29,
1,29,1,30,1,30,1,30,1,30,1,30,1,31,1,31,1,31,1,31,1,31,1,32,1,32,1,32,1,
32,1,33,1,33,1,33,1,33,1,34,1,34,1,34,1,34,1,35,1,35,1,35,1,35,1,35,1,35,
1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,36,1,36,1,
36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,1,36,
1,36,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,
37,1,37,1,37,1,37,1,37,1,38,1,38,1,38,1,38,1,39,1,39,1,39,1,39,1,40,1,40,
1,40,1,40,1,41,1,41,1,41,1,41,1,42,1,42,1,42,1,42,1,42,2,126,138,0,43,0,
2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,
54,56,58,60,62,64,66,68,70,72,74,76,78,80,82,84,0,3,1,1,34,34,2,0,30,31,
36,36,2,0,30,30,37,37,594,0,91,1,0,0,0,2,100,1,0,0,0,4,102,1,0,0,0,6,151,
1,0,0,0,8,157,1,0,0,0,10,159,1,0,0,0,12,176,1,0,0,0,14,183,1,0,0,0,16,194,
1,0,0,0,18,203,1,0,0,0,20,205,1,0,0,0,22,222,1,0,0,0,24,227,1,0,0,0,26,229,
1,0,0,0,28,237,1,0,0,0,30,245,1,0,0,0,32,253,1,0,0,0,34,261,1,0,0,0,36,269,
1,0,0,0,38,277,1,0,0,0,40,285,1,0,0,0,42,293,1,0,0,0,44,299,1,0,0,0,46,305,
1,0,0,0,48,311,1,0,0,0,50,317,1,0,0,0,52,357,1,0,0,0,54,397,1,0,0,0,56,437,
1,0,0,0,58,477,1,0,0,0,60,482,1,0,0,0,62,487,1,0,0,0,64,492,1,0,0,0,66,496,
1,0,0,0,68,500,1,0,0,0,70,504,1,0,0,0,72,522,1,0,0,0,74,540,1,0,0,0,76,558,
1,0,0,0,78,562,1,0,0,0,80,566,1,0,0,0,82,570,1,0,0,0,84,574,1,0,0,0,86,92,
3,2,1,0,87,92,3,4,2,0,88,92,3,10,5,0,89,92,3,20,10,0,90,92,5,34,0,0,91,86,
1,0,0,0,91,87,1,0,0,0,91,88,1,0,0,0,91,89,1,0,0,0,91,90,1,0,0,0,92,93,1,
0,0,0,93,91,1,0,0,0,93,94,1,0,0,0,94,95,1,0,0,0,95,96,7,0,0,0,96,1,1,0,0,
0,97,101,3,22,11,0,98,101,3,24,12,0,99,101,3,50,25,0,100,97,1,0,0,0,100,
98,1,0,0,0,100,99,1,0,0,0,101,3,1,0,0,0,102,104,3,58,29,0,103,105,5,34,0,
0,104,103,1,0,0,0,104,105,1,0,0,0,105,106,1,0,0,0,106,108,5,1,0,0,107,109,
5,34,0,0,108,107,1,0,0,0,108,109,1,0,0,0,109,111,1,0,0,0,110,112,3,64,32,
0,111,110,1,0,0,0,111,112,1,0,0,0,112,114,1,0,0,0,113,115,5,34,0,0,114,113,
1,0,0,0,114,115,1,0,0,0,115,116,1,0,0,0,116,118,3,6,3,0,117,119,5,34,0,0,
118,117,1,0,0,0,118,119,1,0,0,0,119,121,1,0,0,0,120,122,3,50,25,0,121,120,
1,0,0,0,121,122,1,0,0,0,122,124,1,0,0,0,123,125,5,34,0,0,124,123,1,0,0,0,
125,126,1,0,0,0,126,127,1,0,0,0,126,124,1,0,0,0,127,128,1,0,0,0,128,130,
5,2,0,0,129,131,5,34,0,0,130,129,1,0,0,0,130,131,1,0,0,0,131,133,1,0,0,0,
132,134,3,64,32,0,133,132,1,0,0,0,133,134,1,0,0,0,134,136,1,0,0,0,135,137,
5,34,0,0,136,135,1,0,0,0,137,138,1,0,0,0,138,139,1,0,0,0,138,136,1,0,0,0,
139,140,1,0,0,0,140,142,3,8,4,0,141,143,5,34,0,0,142,141,1,0,0,0,142,143,
1,0,0,0,143,145,1,0,0,0,144,146,3,50,25,0,145,144,1,0,0,0,145,146,1,0,0,
0,146,5,1,0,0,0,147,152,3,28,14,0,148,152,3,36,18,0,149,152,3,44,22,0,150,
152,3,52,26,0,151,147,1,0,0,0,151,148,1,0,0,0,151,149,1,0,0,0,151,150,1,
0,0,0,152,7,1,0,0,0,153,158,3,28,14,0,154,158,3,36,18,0,155,158,3,44,22,
0,156,158,3,52,26,0,157,153,1,0,0,0,157,154,1,0,0,0,157,155,1,0,0,0,157,
156,1,0,0,0,158,9,1,0,0,0,159,160,5,3,0,0,160,161,5,30,0,0,161,162,5,35,
0,0,162,163,5,30,0,0,163,164,5,4,0,0,164,165,5,34,0,0,165,166,5,5,0,0,166,
167,5,34,0,0,167,168,3,12,6,0,168,169,5,34,0,0,169,170,5,6,0,0,170,171,3,
14,7,0,171,172,5,7,0,0,172,11,1,0,0,0,173,177,3,16,8,0,174,177,3,4,2,0,175,
177,5,34,0,0,176,173,1,0,0,0,176,174,1,0,0,0,176,175,1,0,0,0,177,178,1,0,
0,0,178,176,1,0,0,0,178,179,1,0,0,0,179,13,1,0,0,0,180,184,3,18,9,0,181,
184,3,4,2,0,182,184,5,34,0,0,183,180,1,0,0,0,183,181,1,0,0,0,183,182,1,0,
0,0,184,185,1,0,0,0,185,183,1,0,0,0,185,186,1,0,0,0,186,15,1,0,0,0,187,195,
3,30,15,0,188,195,3,38,19,0,189,195,3,46,23,0,190,195,3,54,27,0,191,195,
3,66,33,0,192,195,3,78,39,0,193,195,3,72,36,0,194,187,1,0,0,0,194,188,1,
0,0,0,194,189,1,0,0,0,194,190,1,0,0,0,194,191,1,0,0,0,194,192,1,0,0,0,194,
193,1,0,0,0,195,17,1,0,0,0,196,204,3,32,16,0,197,204,3,40,20,0,198,204,3,
48,24,0,199,204,3,56,28,0,200,204,3,68,34,0,201,204,3,80,40,0,202,204,3,
74,37,0,203,196,1,0,0,0,203,197,1,0,0,0,203,198,1,0,0,0,203,199,1,0,0,0,
203,200,1,0,0,0,203,201,1,0,0,0,203,202,1,0,0,0,204,19,1,0,0,0,205,206,5,
8,0,0,206,207,5,31,0,0,207,208,5,9,0,0,208,209,7,1,0,0,209,210,5,10,0,0,
210,211,5,29,0,0,211,212,5,9,0,0,212,213,5,21,0,0,213,214,5,10,0,0,214,215,
5,29,0,0,215,216,5,9,0,0,216,217,5,21,0,0,217,218,5,11,0,0,218,21,1,0,0,
0,219,223,3,26,13,0,220,223,3,34,17,0,221,223,3,42,21,0,222,219,1,0,0,0,
222,220,1,0,0,0,222,221,1,0,0,0,223,23,1,0,0,0,224,228,3,64,32,0,225,228,
3,76,38,0,226,228,3,70,35,0,227,224,1,0,0,0,227,225,1,0,0,0,227,226,1,0,
0,0,228,25,1,0,0,0,229,230,5,12,0,0,230,231,3,82,41,0,231,232,5,10,0,0,232,
233,3,82,41,0,233,234,5,10,0,0,234,235,3,82,41,0,235,236,5,11,0,0,236,27,
1,0,0,0,237,238,5,12,0,0,238,239,3,82,41,0,239,240,5,10,0,0,240,241,3,82,
41,0,241,242,5,10,0,0,242,243,3,82,41,0,243,244,5,11,0,0,244,29,1,0,0,0,
245,246,5,12,0,0,246,247,3,82,41,0,247,248,5,10,0,0,248,249,3,82,41,0,249,
250,5,10,0,0,250,251,3,82,41,0,251,252,5,11,0,0,252,31,1,0,0,0,253,254,5,
12,0,0,254,255,3,82,41,0,255,256,5,10,0,0,256,257,3,82,41,0,257,258,5,10,
0,0,258,259,3,82,41,0,259,260,5,11,0,0,260,33,1,0,0,0,261,262,5,13,0,0,262,
263,3,84,42,0,263,264,5,10,0,0,264,265,3,84,42,0,265,266,5,10,0,0,266,267,
3,84,42,0,267,268,5,11,0,0,268,35,1,0,0,0,269,270,5,13,0,0,270,271,3,84,
42,0,271,272,5,10,0,0,272,273,3,84,42,0,273,274,5,10,0,0,274,275,3,84,42,
0,275,276,5,11,0,0,276,37,1,0,0,0,277,278,5,13,0,0,278,279,3,84,42,0,279,
280,5,10,0,0,280,281,3,84,42,0,281,282,5,10,0,0,282,283,3,84,42,0,283,284,
5,11,0,0,284,39,1,0,0,0,285,286,5,13,0,0,286,287,3,84,42,0,287,288,5,10,
0,0,288,289,3,84,42,0,289,290,5,10,0,0,290,291,3,84,42,0,291,292,5,11,0,
0,292,41,1,0,0,0,293,294,5,14,0,0,294,295,3,82,41,0,295,296,5,10,0,0,296,
297,3,82,41,0,297,298,5,11,0,0,298,43,1,0,0,0,299,300,5,14,0,0,300,301,3,
82,41,0,301,302,5,10,0,0,302,303,3,82,41,0,303,304,5,11,0,0,304,45,1,0,0,
0,305,306,5,14,0,0,306,307,3,82,41,0,307,308,5,10,0,0,308,309,3,82,41,0,
309,310,5,11,0,0,310,47,1,0,0,0,311,312,5,14,0,0,312,313,3,82,41,0,313,314,
5,10,0,0,314,315,3,82,41,0,315,316,5,11,0,0,316,49,1,0,0,0,317,318,5,15,
0,0,318,319,5,25,0,0,319,320,5,9,0,0,320,321,5,30,0,0,321,322,5,10,0,0,322,
323,5,25,0,0,323,324,5,9,0,0,324,325,5,30,0,0,325,326,5,10,0,0,326,327,5,
25,0,0,327,328,5,9,0,0,328,329,5,30,0,0,329,330,5,10,0,0,330,331,5,25,0,
0,331,332,5,9,0,0,332,333,5,30,0,0,333,334,5,10,0,0,334,335,5,26,0,0,335,
336,5,9,0,0,336,341,5,31,0,0,337,338,5,10,0,0,338,339,5,26,0,0,339,340,5,
9,0,0,340,342,5,31,0,0,341,337,1,0,0,0,341,342,1,0,0,0,342,347,1,0,0,0,343,
344,5,10,0,0,344,345,5,26,0,0,345,346,5,9,0,0,346,348,5,31,0,0,347,343,1,
0,0,0,347,348,1,0,0,0,348,353,1,0,0,0,349,350,5,10,0,0,350,351,5,26,0,0,
351,352,5,9,0,0,352,354,5,31,0,0,353,349,1,0,0,0,353,354,1,0,0,0,354,355,
1,0,0,0,355,356,5,11,0,0,356,51,1,0,0,0,357,358,5,15,0,0,358,359,5,25,0,
0,359,360,5,9,0,0,360,361,5,30,0,0,361,362,5,10,0,0,362,363,5,25,0,0,363,
364,5,9,0,0,364,365,5,30,0,0,365,366,5,10,0,0,366,367,5,25,0,0,367,368,5,
9,0,0,368,369,5,30,0,0,369,370,5,10,0,0,370,371,5,25,0,0,371,372,5,9,0,0,
372,373,5,30,0,0,373,374,5,10,0,0,374,375,5,26,0,0,375,376,5,9,0,0,376,381,
5,31,0,0,377,378,5,10,0,0,378,379,5,26,0,0,379,380,5,9,0,0,380,382,5,31,
0,0,381,377,1,0,0,0,381,382,1,0,0,0,382,387,1,0,0,0,383,384,5,10,0,0,384,
385,5,26,0,0,385,386,5,9,0,0,386,388,5,31,0,0,387,383,1,0,0,0,387,388,1,
0,0,0,388,393,1,0,0,0,389,390,5,10,0,0,390,391,5,26,0,0,391,392,5,9,0,0,
392,394,5,31,0,0,393,389,1,0,0,0,393,394,1,0,0,0,394,395,1,0,0,0,395,396,
5,11,0,0,396,53,1,0,0,0,397,398,5,15,0,0,398,399,5,25,0,0,399,400,5,9,0,
0,400,401,5,30,0,0,401,402,5,10,0,0,402,403,5,25,0,0,403,404,5,9,0,0,404,
405,5,30,0,0,405,406,5,10,0,0,406,407,5,25,0,0,407,408,5,9,0,0,408,409,5,
30,0,0,409,410,5,10,0,0,410,411,5,25,0,0,411,412,5,9,0,0,412,413,5,30,0,
0,413,414,5,10,0,0,414,415,5,26,0,0,415,416,5,9,0,0,416,421,5,31,0,0,417,
418,5,10,0,0,418,419,5,26,0,0,419,420,5,9,0,0,420,422,5,31,0,0,421,417,1,
0,0,0,421,422,1,0,0,0,422,427,1,0,0,0,423,424,5,10,0,0,424,425,5,26,0,0,
425,426,5,9,0,0,426,428,5,31,0,0,427,423,1,0,0,0,427,428,1,0,0,0,428,433,
1,0,0,0,429,430,5,10,0,0,430,431,5,26,0,0,431,432,5,9,0,0,432,434,5,31,0,
0,433,429,1,0,0,0,433,434,1,0,0,0,434,435,1,0,0,0,435,436,5,11,0,0,436,55,
1,0,0,0,437,438,5,15,0,0,438,439,5,25,0,0,439,440,5,9,0,0,440,441,5,30,0,
0,441,442,5,10,0,0,442,443,5,25,0,0,443,444,5,9,0,0,444,445,5,30,0,0,445,
446,5,10,0,0,446,447,5,25,0,0,447,448,5,9,0,0,448,449,5,30,0,0,449,450,5,
10,0,0,450,451,5,25,0,0,451,452,5,9,0,0,452,453,5,30,0,0,453,454,5,10,0,
0,454,455,5,26,0,0,455,456,5,9,0,0,456,461,5,31,0,0,457,458,5,10,0,0,458,
459,5,26,0,0,459,460,5,9,0,0,460,462,5,31,0,0,461,457,1,0,0,0,461,462,1,
0,0,0,462,467,1,0,0,0,463,464,5,10,0,0,464,465,5,26,0,0,465,466,5,9,0,0,
466,468,5,31,0,0,467,463,1,0,0,0,467,468,1,0,0,0,468,473,1,0,0,0,469,470,
5,10,0,0,470,471,5,26,0,0,471,472,5,9,0,0,472,474,5,31,0,0,473,469,1,0,0,
0,473,474,1,0,0,0,474,475,1,0,0,0,475,476,5,11,0,0,476,57,1,0,0,0,477,478,
5,16,0,0,478,479,5,17,0,0,479,480,5,30,0,0,480,481,5,11,0,0,481,59,1,0,0,
0,482,483,5,16,0,0,483,484,5,17,0,0,484,485,5,30,0,0,485,486,5,11,0,0,486,
61,1,0,0,0,487,488,5,16,0,0,488,489,5,17,0,0,489,490,5,30,0,0,490,491,5,
11,0,0,491,63,1,0,0,0,492,493,5,18,0,0,493,494,5,31,0,0,494,495,5,11,0,0,
495,65,1,0,0,0,496,497,5,18,0,0,497,498,5,31,0,0,498,499,5,11,0,0,499,67,
1,0,0,0,500,501,5,18,0,0,501,502,5,31,0,0,502,503,5,11,0,0,503,69,1,0,0,
0,504,505,5,19,0,0,505,506,5,27,0,0,506,507,5,9,0,0,507,508,5,31,0,0,508,
509,5,10,0,0,509,510,5,28,0,0,510,511,5,9,0,0,511,512,5,30,0,0,512,513,5,
10,0,0,513,514,5,28,0,0,514,515,5,9,0,0,515,516,5,30,0,0,516,517,5,10,0,
0,517,518,5,28,0,0,518,519,5,9,0,0,519,520,5,30,0,0,520,521,5,11,0,0,521,
71,1,0,0,0,522,523,5,19,0,0,523,524,5,27,0,0,524,525,5,9,0,0,525,526,5,31,
0,0,526,527,5,10,0,0,527,528,5,28,0,0,528,529,5,9,0,0,529,530,5,30,0,0,530,
531,5,10,0,0,531,532,5,28,0,0,532,533,5,9,0,0,533,534,5,30,0,0,534,535,5,
10,0,0,535,536,5,28,0,0,536,537,5,9,0,0,537,538,5,30,0,0,538,539,5,11,0,
0,539,73,1,0,0,0,540,541,5,19,0,0,541,542,5,27,0,0,542,543,5,9,0,0,543,544,
5,31,0,0,544,545,5,10,0,0,545,546,5,28,0,0,546,547,5,9,0,0,547,548,5,30,
0,0,548,549,5,10,0,0,549,550,5,28,0,0,550,551,5,9,0,0,551,552,5,30,0,0,552,
553,5,10,0,0,553,554,5,28,0,0,554,555,5,9,0,0,555,556,5,30,0,0,556,557,5,
11,0,0,557,75,1,0,0,0,558,559,5,20,0,0,559,560,5,32,0,0,560,561,5,11,0,0,
561,77,1,0,0,0,562,563,5,20,0,0,563,564,5,32,0,0,564,565,5,11,0,0,565,79,
1,0,0,0,566,567,5,20,0,0,567,568,5,32,0,0,568,569,5,11,0,0,569,81,1,0,0,
0,570,571,5,23,0,0,571,572,5,9,0,0,572,573,7,2,0,0,573,83,1,0,0,0,574,575,
5,22,0,0,575,576,5,9,0,0,576,577,7,2,0,0,577,85,1,0,0,0,37,91,93,100,104,
108,111,114,118,121,126,130,133,138,142,145,151,157,176,178,183,185,194,
203,222,227,341,347,353,381,387,393,421,427,433,461,467,473];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class VizRepParser extends antlr4.Parser {

    static grammarFileName = "java-escape";
    static literalNames = [ null, "'START'", "'END'", "'IF('", "')'", "'THEN'", 
                            "'ELSE'", "'END IF'", "'SET: '", "':'", "','", 
                            "';'", "'CUBE:'", "'SPHERE:'", "'PLANE:'", "'TEXT:'", 
                            "'LINE:'", "'lineWidth:'", "'COLOR: fill:'", 
                            "'PEN:'", "'MAP: map:'", null, null, null, null, 
                            null, null, "'dashed'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, "BOOLEANSTRING", 
                             "SPHEREPARAMS", "DIMENSION3D", "DIMENSION2D", 
                             "TEXTPARAMDIGITS", "TEXTPARAMSTRING", "PENPARAMSBOOL", 
                             "PENPARAMS", "VARASSPARAMS", "DIGITS", "STRING", 
                             "MAPLEXER", "WHITESPACE", "NEWLINE", "OPERATOR", 
                             "DYNVALSTRING", "DYNINPUT" ];
    static ruleNames = [ "commandChain", "command", "relation", "relCommandFrom", 
                         "relCommandTo", "condition", "ifBlock", "elseBlock", 
                         "ifCommand", "elseCommand", "setVariable", "shapeCommand", 
                         "styleCommand", "cube", "relCube", "ifCube", "elseCube", 
                         "sphere", "relSphere", "ifSphere", "elseSphere", 
                         "plane", "relPane", "ifPlane", "elsePlane", "text", 
                         "relText", "ifText", "elseText", "line", "ifLine", 
                         "elseLine", "color", "ifColor", "elseColor", "pen", 
                         "ifPen", "elsePen", "map", "ifMap", "elseMap", 
                         "dimInput", "sphereDimInput" ];

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
	        this.state = 91; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 91;
	        		this._errHandler.sync(this);
	        		switch(this._input.LA(1)) {
	        		case 12:
	        		case 13:
	        		case 14:
	        		case 15:
	        		case 18:
	        		case 19:
	        		case 20:
	        		    this.state = 86;
	        		    this.command();
	        		    break;
	        		case 16:
	        		    this.state = 87;
	        		    this.relation();
	        		    break;
	        		case 3:
	        		    this.state = 88;
	        		    this.condition();
	        		    break;
	        		case 8:
	        		    this.state = 89;
	        		    this.setVariable();
	        		    break;
	        		case 34:
	        		    this.state = 90;
	        		    this.match(VizRepParser.NEWLINE);
	        		    break;
	        		default:
	        		    throw new antlr4.error.NoViableAltException(this);
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 93; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,1, this._ctx);
	        } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 95;
	        _la = this._input.LA(1);
	        if(!(_la===-1 || _la===34)) {
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



	command() {
	    let localctx = new CommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, VizRepParser.RULE_command);
	    try {
	        this.state = 100;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 12:
	        case 13:
	        case 14:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 97;
	            this.shapeCommand();
	            break;
	        case 18:
	        case 19:
	        case 20:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 98;
	            this.styleCommand();
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 99;
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



	relation() {
	    let localctx = new RelationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, VizRepParser.RULE_relation);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 102;
	        this.line();
	        this.state = 104;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===34) {
	            this.state = 103;
	            this.match(VizRepParser.NEWLINE);
	        }

	        this.state = 106;
	        this.match(VizRepParser.T__0);
	        this.state = 108;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,4,this._ctx);
	        if(la_===1) {
	            this.state = 107;
	            this.match(VizRepParser.NEWLINE);

	        }
	        this.state = 111;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===18) {
	            this.state = 110;
	            this.color();
	        }

	        this.state = 114;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===34) {
	            this.state = 113;
	            this.match(VizRepParser.NEWLINE);
	        }

	        this.state = 116;
	        this.relCommandFrom();
	        this.state = 118;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
	        if(la_===1) {
	            this.state = 117;
	            this.match(VizRepParser.NEWLINE);

	        }
	        this.state = 121;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===15) {
	            this.state = 120;
	            this.text();
	        }

	        this.state = 124; 
	        this._errHandler.sync(this);
	        var _alt = 1+1;
	        do {
	        	switch (_alt) {
	        	case 1+1:
	        		this.state = 123;
	        		this.match(VizRepParser.NEWLINE);
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 126; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,9, this._ctx);
	        } while ( _alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 128;
	        this.match(VizRepParser.T__1);
	        this.state = 130;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
	        if(la_===1) {
	            this.state = 129;
	            this.match(VizRepParser.NEWLINE);

	        }
	        this.state = 133;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===18) {
	            this.state = 132;
	            this.color();
	        }

	        this.state = 136; 
	        this._errHandler.sync(this);
	        var _alt = 1+1;
	        do {
	        	switch (_alt) {
	        	case 1+1:
	        		this.state = 135;
	        		this.match(VizRepParser.NEWLINE);
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 138; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,12, this._ctx);
	        } while ( _alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	        this.state = 140;
	        this.relCommandTo();
	        this.state = 142;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,13,this._ctx);
	        if(la_===1) {
	            this.state = 141;
	            this.match(VizRepParser.NEWLINE);

	        }
	        this.state = 145;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,14,this._ctx);
	        if(la_===1) {
	            this.state = 144;
	            this.text();

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
	    this.enterRule(localctx, 6, VizRepParser.RULE_relCommandFrom);
	    try {
	        this.state = 151;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 12:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 147;
	            this.relCube();
	            break;
	        case 13:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 148;
	            this.relSphere();
	            break;
	        case 14:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 149;
	            this.relPane();
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 150;
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
	    this.enterRule(localctx, 8, VizRepParser.RULE_relCommandTo);
	    try {
	        this.state = 157;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 12:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 153;
	            this.relCube();
	            break;
	        case 13:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 154;
	            this.relSphere();
	            break;
	        case 14:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 155;
	            this.relPane();
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 156;
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



	condition() {
	    let localctx = new ConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, VizRepParser.RULE_condition);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 159;
	        this.match(VizRepParser.T__2);
	        this.state = 160;
	        this.match(VizRepParser.DIGITS);
	        this.state = 161;
	        this.match(VizRepParser.OPERATOR);
	        this.state = 162;
	        this.match(VizRepParser.DIGITS);
	        this.state = 163;
	        this.match(VizRepParser.T__3);
	        this.state = 164;
	        this.match(VizRepParser.NEWLINE);
	        this.state = 165;
	        this.match(VizRepParser.T__4);
	        this.state = 166;
	        this.match(VizRepParser.NEWLINE);
	        this.state = 167;
	        this.ifBlock();
	        this.state = 168;
	        this.match(VizRepParser.NEWLINE);
	        this.state = 169;
	        this.match(VizRepParser.T__5);
	        this.state = 170;
	        this.elseBlock();
	        this.state = 171;
	        this.match(VizRepParser.T__6);
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
	    this.enterRule(localctx, 12, VizRepParser.RULE_ifBlock);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 176; 
	        this._errHandler.sync(this);
	        var _alt = 1;
	        do {
	        	switch (_alt) {
	        	case 1:
	        		this.state = 176;
	        		this._errHandler.sync(this);
	        		switch(this._input.LA(1)) {
	        		case 12:
	        		case 13:
	        		case 14:
	        		case 15:
	        		case 18:
	        		case 19:
	        		case 20:
	        		    this.state = 173;
	        		    this.ifCommand();
	        		    break;
	        		case 16:
	        		    this.state = 174;
	        		    this.relation();
	        		    break;
	        		case 34:
	        		    this.state = 175;
	        		    this.match(VizRepParser.NEWLINE);
	        		    break;
	        		default:
	        		    throw new antlr4.error.NoViableAltException(this);
	        		}
	        		break;
	        	default:
	        		throw new antlr4.error.NoViableAltException(this);
	        	}
	        	this.state = 178; 
	        	this._errHandler.sync(this);
	        	_alt = this._interp.adaptivePredict(this._input,18, this._ctx);
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
	    this.enterRule(localctx, 14, VizRepParser.RULE_elseBlock);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 183; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 183;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 12:
	            case 13:
	            case 14:
	            case 15:
	            case 18:
	            case 19:
	            case 20:
	                this.state = 180;
	                this.elseCommand();
	                break;
	            case 16:
	                this.state = 181;
	                this.relation();
	                break;
	            case 34:
	                this.state = 182;
	                this.match(VizRepParser.NEWLINE);
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 185; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(((((_la - 12)) & ~0x1f) == 0 && ((1 << (_la - 12)) & 4194783) !== 0));
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
	    this.enterRule(localctx, 16, VizRepParser.RULE_ifCommand);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 194;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 12:
	            this.state = 187;
	            this.ifCube();
	            break;
	        case 13:
	            this.state = 188;
	            this.ifSphere();
	            break;
	        case 14:
	            this.state = 189;
	            this.ifPlane();
	            break;
	        case 15:
	            this.state = 190;
	            this.ifText();
	            break;
	        case 18:
	            this.state = 191;
	            this.ifColor();
	            break;
	        case 20:
	            this.state = 192;
	            this.ifMap();
	            break;
	        case 19:
	            this.state = 193;
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
	    this.enterRule(localctx, 18, VizRepParser.RULE_elseCommand);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 203;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 12:
	            this.state = 196;
	            this.elseCube();
	            break;
	        case 13:
	            this.state = 197;
	            this.elseSphere();
	            break;
	        case 14:
	            this.state = 198;
	            this.elsePlane();
	            break;
	        case 15:
	            this.state = 199;
	            this.elseText();
	            break;
	        case 18:
	            this.state = 200;
	            this.elseColor();
	            break;
	        case 20:
	            this.state = 201;
	            this.elseMap();
	            break;
	        case 19:
	            this.state = 202;
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



	setVariable() {
	    let localctx = new SetVariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, VizRepParser.RULE_setVariable);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 205;
	        this.match(VizRepParser.T__7);
	        this.state = 206;
	        this.match(VizRepParser.STRING);
	        this.state = 207;
	        this.match(VizRepParser.T__8);
	        this.state = 208;
	        _la = this._input.LA(1);
	        if(!(((((_la - 30)) & ~0x1f) == 0 && ((1 << (_la - 30)) & 67) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 209;
	        this.match(VizRepParser.T__9);
	        this.state = 210;
	        this.match(VizRepParser.VARASSPARAMS);
	        this.state = 211;
	        this.match(VizRepParser.T__8);
	        this.state = 212;
	        this.match(VizRepParser.BOOLEANSTRING);
	        this.state = 213;
	        this.match(VizRepParser.T__9);
	        this.state = 214;
	        this.match(VizRepParser.VARASSPARAMS);
	        this.state = 215;
	        this.match(VizRepParser.T__8);
	        this.state = 216;
	        this.match(VizRepParser.BOOLEANSTRING);
	        this.state = 217;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 22, VizRepParser.RULE_shapeCommand);
	    try {
	        this.state = 222;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 12:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 219;
	            this.cube();
	            break;
	        case 13:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 220;
	            this.sphere();
	            break;
	        case 14:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 221;
	            this.plane();
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
	    this.enterRule(localctx, 24, VizRepParser.RULE_styleCommand);
	    try {
	        this.state = 227;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 18:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 224;
	            this.color();
	            break;
	        case 20:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 225;
	            this.map();
	            break;
	        case 19:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 226;
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



	cube() {
	    let localctx = new CubeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, VizRepParser.RULE_cube);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 229;
	        this.match(VizRepParser.T__11);
	        this.state = 230;
	        this.dimInput();
	        this.state = 231;
	        this.match(VizRepParser.T__9);
	        this.state = 232;
	        this.dimInput();
	        this.state = 233;
	        this.match(VizRepParser.T__9);
	        this.state = 234;
	        this.dimInput();
	        this.state = 235;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 28, VizRepParser.RULE_relCube);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 237;
	        this.match(VizRepParser.T__11);
	        this.state = 238;
	        this.dimInput();
	        this.state = 239;
	        this.match(VizRepParser.T__9);
	        this.state = 240;
	        this.dimInput();
	        this.state = 241;
	        this.match(VizRepParser.T__9);
	        this.state = 242;
	        this.dimInput();
	        this.state = 243;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 30, VizRepParser.RULE_ifCube);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 245;
	        this.match(VizRepParser.T__11);
	        this.state = 246;
	        this.dimInput();
	        this.state = 247;
	        this.match(VizRepParser.T__9);
	        this.state = 248;
	        this.dimInput();
	        this.state = 249;
	        this.match(VizRepParser.T__9);
	        this.state = 250;
	        this.dimInput();
	        this.state = 251;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 32, VizRepParser.RULE_elseCube);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 253;
	        this.match(VizRepParser.T__11);
	        this.state = 254;
	        this.dimInput();
	        this.state = 255;
	        this.match(VizRepParser.T__9);
	        this.state = 256;
	        this.dimInput();
	        this.state = 257;
	        this.match(VizRepParser.T__9);
	        this.state = 258;
	        this.dimInput();
	        this.state = 259;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 34, VizRepParser.RULE_sphere);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 261;
	        this.match(VizRepParser.T__12);
	        this.state = 262;
	        this.sphereDimInput();
	        this.state = 263;
	        this.match(VizRepParser.T__9);
	        this.state = 264;
	        this.sphereDimInput();
	        this.state = 265;
	        this.match(VizRepParser.T__9);
	        this.state = 266;
	        this.sphereDimInput();
	        this.state = 267;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 36, VizRepParser.RULE_relSphere);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 269;
	        this.match(VizRepParser.T__12);
	        this.state = 270;
	        this.sphereDimInput();
	        this.state = 271;
	        this.match(VizRepParser.T__9);
	        this.state = 272;
	        this.sphereDimInput();
	        this.state = 273;
	        this.match(VizRepParser.T__9);
	        this.state = 274;
	        this.sphereDimInput();
	        this.state = 275;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 38, VizRepParser.RULE_ifSphere);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 277;
	        this.match(VizRepParser.T__12);
	        this.state = 278;
	        this.sphereDimInput();
	        this.state = 279;
	        this.match(VizRepParser.T__9);
	        this.state = 280;
	        this.sphereDimInput();
	        this.state = 281;
	        this.match(VizRepParser.T__9);
	        this.state = 282;
	        this.sphereDimInput();
	        this.state = 283;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 40, VizRepParser.RULE_elseSphere);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 285;
	        this.match(VizRepParser.T__12);
	        this.state = 286;
	        this.sphereDimInput();
	        this.state = 287;
	        this.match(VizRepParser.T__9);
	        this.state = 288;
	        this.sphereDimInput();
	        this.state = 289;
	        this.match(VizRepParser.T__9);
	        this.state = 290;
	        this.sphereDimInput();
	        this.state = 291;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 42, VizRepParser.RULE_plane);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 293;
	        this.match(VizRepParser.T__13);
	        this.state = 294;
	        this.dimInput();
	        this.state = 295;
	        this.match(VizRepParser.T__9);
	        this.state = 296;
	        this.dimInput();
	        this.state = 297;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 44, VizRepParser.RULE_relPane);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 299;
	        this.match(VizRepParser.T__13);
	        this.state = 300;
	        this.dimInput();
	        this.state = 301;
	        this.match(VizRepParser.T__9);
	        this.state = 302;
	        this.dimInput();
	        this.state = 303;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 46, VizRepParser.RULE_ifPlane);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 305;
	        this.match(VizRepParser.T__13);
	        this.state = 306;
	        this.dimInput();
	        this.state = 307;
	        this.match(VizRepParser.T__9);
	        this.state = 308;
	        this.dimInput();
	        this.state = 309;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 48, VizRepParser.RULE_elsePlane);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 311;
	        this.match(VizRepParser.T__13);
	        this.state = 312;
	        this.dimInput();
	        this.state = 313;
	        this.match(VizRepParser.T__9);
	        this.state = 314;
	        this.dimInput();
	        this.state = 315;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 50, VizRepParser.RULE_text);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 317;
	        this.match(VizRepParser.T__14);
	        this.state = 318;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 319;
	        this.match(VizRepParser.T__8);
	        this.state = 320;
	        this.match(VizRepParser.DIGITS);
	        this.state = 321;
	        this.match(VizRepParser.T__9);
	        this.state = 322;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 323;
	        this.match(VizRepParser.T__8);
	        this.state = 324;
	        this.match(VizRepParser.DIGITS);
	        this.state = 325;
	        this.match(VizRepParser.T__9);
	        this.state = 326;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 327;
	        this.match(VizRepParser.T__8);
	        this.state = 328;
	        this.match(VizRepParser.DIGITS);
	        this.state = 329;
	        this.match(VizRepParser.T__9);
	        this.state = 330;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 331;
	        this.match(VizRepParser.T__8);
	        this.state = 332;
	        this.match(VizRepParser.DIGITS);
	        this.state = 333;
	        this.match(VizRepParser.T__9);
	        this.state = 334;
	        this.match(VizRepParser.TEXTPARAMSTRING);
	        this.state = 335;
	        this.match(VizRepParser.T__8);
	        this.state = 336;
	        this.match(VizRepParser.STRING);
	        this.state = 341;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,25,this._ctx);
	        if(la_===1) {
	            this.state = 337;
	            this.match(VizRepParser.T__9);
	            this.state = 338;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 339;
	            this.match(VizRepParser.T__8);
	            this.state = 340;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 347;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,26,this._ctx);
	        if(la_===1) {
	            this.state = 343;
	            this.match(VizRepParser.T__9);
	            this.state = 344;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 345;
	            this.match(VizRepParser.T__8);
	            this.state = 346;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 353;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===10) {
	            this.state = 349;
	            this.match(VizRepParser.T__9);
	            this.state = 350;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 351;
	            this.match(VizRepParser.T__8);
	            this.state = 352;
	            this.match(VizRepParser.STRING);
	        }

	        this.state = 355;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 52, VizRepParser.RULE_relText);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 357;
	        this.match(VizRepParser.T__14);
	        this.state = 358;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 359;
	        this.match(VizRepParser.T__8);
	        this.state = 360;
	        this.match(VizRepParser.DIGITS);
	        this.state = 361;
	        this.match(VizRepParser.T__9);
	        this.state = 362;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 363;
	        this.match(VizRepParser.T__8);
	        this.state = 364;
	        this.match(VizRepParser.DIGITS);
	        this.state = 365;
	        this.match(VizRepParser.T__9);
	        this.state = 366;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 367;
	        this.match(VizRepParser.T__8);
	        this.state = 368;
	        this.match(VizRepParser.DIGITS);
	        this.state = 369;
	        this.match(VizRepParser.T__9);
	        this.state = 370;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 371;
	        this.match(VizRepParser.T__8);
	        this.state = 372;
	        this.match(VizRepParser.DIGITS);
	        this.state = 373;
	        this.match(VizRepParser.T__9);
	        this.state = 374;
	        this.match(VizRepParser.TEXTPARAMSTRING);
	        this.state = 375;
	        this.match(VizRepParser.T__8);
	        this.state = 376;
	        this.match(VizRepParser.STRING);
	        this.state = 381;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,28,this._ctx);
	        if(la_===1) {
	            this.state = 377;
	            this.match(VizRepParser.T__9);
	            this.state = 378;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 379;
	            this.match(VizRepParser.T__8);
	            this.state = 380;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 387;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,29,this._ctx);
	        if(la_===1) {
	            this.state = 383;
	            this.match(VizRepParser.T__9);
	            this.state = 384;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 385;
	            this.match(VizRepParser.T__8);
	            this.state = 386;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 393;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===10) {
	            this.state = 389;
	            this.match(VizRepParser.T__9);
	            this.state = 390;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 391;
	            this.match(VizRepParser.T__8);
	            this.state = 392;
	            this.match(VizRepParser.STRING);
	        }

	        this.state = 395;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 54, VizRepParser.RULE_ifText);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 397;
	        this.match(VizRepParser.T__14);
	        this.state = 398;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 399;
	        this.match(VizRepParser.T__8);
	        this.state = 400;
	        this.match(VizRepParser.DIGITS);
	        this.state = 401;
	        this.match(VizRepParser.T__9);
	        this.state = 402;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 403;
	        this.match(VizRepParser.T__8);
	        this.state = 404;
	        this.match(VizRepParser.DIGITS);
	        this.state = 405;
	        this.match(VizRepParser.T__9);
	        this.state = 406;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 407;
	        this.match(VizRepParser.T__8);
	        this.state = 408;
	        this.match(VizRepParser.DIGITS);
	        this.state = 409;
	        this.match(VizRepParser.T__9);
	        this.state = 410;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 411;
	        this.match(VizRepParser.T__8);
	        this.state = 412;
	        this.match(VizRepParser.DIGITS);
	        this.state = 413;
	        this.match(VizRepParser.T__9);
	        this.state = 414;
	        this.match(VizRepParser.TEXTPARAMSTRING);
	        this.state = 415;
	        this.match(VizRepParser.T__8);
	        this.state = 416;
	        this.match(VizRepParser.STRING);
	        this.state = 421;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,31,this._ctx);
	        if(la_===1) {
	            this.state = 417;
	            this.match(VizRepParser.T__9);
	            this.state = 418;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 419;
	            this.match(VizRepParser.T__8);
	            this.state = 420;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 427;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,32,this._ctx);
	        if(la_===1) {
	            this.state = 423;
	            this.match(VizRepParser.T__9);
	            this.state = 424;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 425;
	            this.match(VizRepParser.T__8);
	            this.state = 426;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 433;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===10) {
	            this.state = 429;
	            this.match(VizRepParser.T__9);
	            this.state = 430;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 431;
	            this.match(VizRepParser.T__8);
	            this.state = 432;
	            this.match(VizRepParser.STRING);
	        }

	        this.state = 435;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 56, VizRepParser.RULE_elseText);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 437;
	        this.match(VizRepParser.T__14);
	        this.state = 438;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 439;
	        this.match(VizRepParser.T__8);
	        this.state = 440;
	        this.match(VizRepParser.DIGITS);
	        this.state = 441;
	        this.match(VizRepParser.T__9);
	        this.state = 442;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 443;
	        this.match(VizRepParser.T__8);
	        this.state = 444;
	        this.match(VizRepParser.DIGITS);
	        this.state = 445;
	        this.match(VizRepParser.T__9);
	        this.state = 446;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 447;
	        this.match(VizRepParser.T__8);
	        this.state = 448;
	        this.match(VizRepParser.DIGITS);
	        this.state = 449;
	        this.match(VizRepParser.T__9);
	        this.state = 450;
	        this.match(VizRepParser.TEXTPARAMDIGITS);
	        this.state = 451;
	        this.match(VizRepParser.T__8);
	        this.state = 452;
	        this.match(VizRepParser.DIGITS);
	        this.state = 453;
	        this.match(VizRepParser.T__9);
	        this.state = 454;
	        this.match(VizRepParser.TEXTPARAMSTRING);
	        this.state = 455;
	        this.match(VizRepParser.T__8);
	        this.state = 456;
	        this.match(VizRepParser.STRING);
	        this.state = 461;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,34,this._ctx);
	        if(la_===1) {
	            this.state = 457;
	            this.match(VizRepParser.T__9);
	            this.state = 458;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 459;
	            this.match(VizRepParser.T__8);
	            this.state = 460;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 467;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,35,this._ctx);
	        if(la_===1) {
	            this.state = 463;
	            this.match(VizRepParser.T__9);
	            this.state = 464;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 465;
	            this.match(VizRepParser.T__8);
	            this.state = 466;
	            this.match(VizRepParser.STRING);

	        }
	        this.state = 473;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===10) {
	            this.state = 469;
	            this.match(VizRepParser.T__9);
	            this.state = 470;
	            this.match(VizRepParser.TEXTPARAMSTRING);
	            this.state = 471;
	            this.match(VizRepParser.T__8);
	            this.state = 472;
	            this.match(VizRepParser.STRING);
	        }

	        this.state = 475;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 58, VizRepParser.RULE_line);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 477;
	        this.match(VizRepParser.T__15);
	        this.state = 478;
	        this.match(VizRepParser.T__16);
	        this.state = 479;
	        this.match(VizRepParser.DIGITS);
	        this.state = 480;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 60, VizRepParser.RULE_ifLine);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 482;
	        this.match(VizRepParser.T__15);
	        this.state = 483;
	        this.match(VizRepParser.T__16);
	        this.state = 484;
	        this.match(VizRepParser.DIGITS);
	        this.state = 485;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 62, VizRepParser.RULE_elseLine);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 487;
	        this.match(VizRepParser.T__15);
	        this.state = 488;
	        this.match(VizRepParser.T__16);
	        this.state = 489;
	        this.match(VizRepParser.DIGITS);
	        this.state = 490;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 64, VizRepParser.RULE_color);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 492;
	        this.match(VizRepParser.T__17);
	        this.state = 493;
	        this.match(VizRepParser.STRING);
	        this.state = 494;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 66, VizRepParser.RULE_ifColor);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 496;
	        this.match(VizRepParser.T__17);
	        this.state = 497;
	        this.match(VizRepParser.STRING);
	        this.state = 498;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 68, VizRepParser.RULE_elseColor);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 500;
	        this.match(VizRepParser.T__17);
	        this.state = 501;
	        this.match(VizRepParser.STRING);
	        this.state = 502;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 70, VizRepParser.RULE_pen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 504;
	        this.match(VizRepParser.T__18);
	        this.state = 505;
	        this.match(VizRepParser.PENPARAMSBOOL);
	        this.state = 506;
	        this.match(VizRepParser.T__8);
	        this.state = 507;
	        this.match(VizRepParser.STRING);
	        this.state = 508;
	        this.match(VizRepParser.T__9);
	        this.state = 509;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 510;
	        this.match(VizRepParser.T__8);
	        this.state = 511;
	        this.match(VizRepParser.DIGITS);
	        this.state = 512;
	        this.match(VizRepParser.T__9);
	        this.state = 513;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 514;
	        this.match(VizRepParser.T__8);
	        this.state = 515;
	        this.match(VizRepParser.DIGITS);
	        this.state = 516;
	        this.match(VizRepParser.T__9);
	        this.state = 517;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 518;
	        this.match(VizRepParser.T__8);
	        this.state = 519;
	        this.match(VizRepParser.DIGITS);
	        this.state = 520;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 72, VizRepParser.RULE_ifPen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 522;
	        this.match(VizRepParser.T__18);
	        this.state = 523;
	        this.match(VizRepParser.PENPARAMSBOOL);
	        this.state = 524;
	        this.match(VizRepParser.T__8);
	        this.state = 525;
	        this.match(VizRepParser.STRING);
	        this.state = 526;
	        this.match(VizRepParser.T__9);
	        this.state = 527;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 528;
	        this.match(VizRepParser.T__8);
	        this.state = 529;
	        this.match(VizRepParser.DIGITS);
	        this.state = 530;
	        this.match(VizRepParser.T__9);
	        this.state = 531;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 532;
	        this.match(VizRepParser.T__8);
	        this.state = 533;
	        this.match(VizRepParser.DIGITS);
	        this.state = 534;
	        this.match(VizRepParser.T__9);
	        this.state = 535;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 536;
	        this.match(VizRepParser.T__8);
	        this.state = 537;
	        this.match(VizRepParser.DIGITS);
	        this.state = 538;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 74, VizRepParser.RULE_elsePen);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 540;
	        this.match(VizRepParser.T__18);
	        this.state = 541;
	        this.match(VizRepParser.PENPARAMSBOOL);
	        this.state = 542;
	        this.match(VizRepParser.T__8);
	        this.state = 543;
	        this.match(VizRepParser.STRING);
	        this.state = 544;
	        this.match(VizRepParser.T__9);
	        this.state = 545;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 546;
	        this.match(VizRepParser.T__8);
	        this.state = 547;
	        this.match(VizRepParser.DIGITS);
	        this.state = 548;
	        this.match(VizRepParser.T__9);
	        this.state = 549;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 550;
	        this.match(VizRepParser.T__8);
	        this.state = 551;
	        this.match(VizRepParser.DIGITS);
	        this.state = 552;
	        this.match(VizRepParser.T__9);
	        this.state = 553;
	        this.match(VizRepParser.PENPARAMS);
	        this.state = 554;
	        this.match(VizRepParser.T__8);
	        this.state = 555;
	        this.match(VizRepParser.DIGITS);
	        this.state = 556;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 76, VizRepParser.RULE_map);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 558;
	        this.match(VizRepParser.T__19);
	        this.state = 559;
	        this.match(VizRepParser.MAPLEXER);
	        this.state = 560;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 78, VizRepParser.RULE_ifMap);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 562;
	        this.match(VizRepParser.T__19);
	        this.state = 563;
	        this.match(VizRepParser.MAPLEXER);
	        this.state = 564;
	        this.match(VizRepParser.T__10);
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
	    this.enterRule(localctx, 80, VizRepParser.RULE_elseMap);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 566;
	        this.match(VizRepParser.T__19);
	        this.state = 567;
	        this.match(VizRepParser.MAPLEXER);
	        this.state = 568;
	        this.match(VizRepParser.T__10);
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



	dimInput() {
	    let localctx = new DimInputContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 82, VizRepParser.RULE_dimInput);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 570;
	        this.match(VizRepParser.DIMENSION3D);
	        this.state = 571;
	        this.match(VizRepParser.T__8);
	        this.state = 572;
	        _la = this._input.LA(1);
	        if(!(_la===30 || _la===37)) {
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



	sphereDimInput() {
	    let localctx = new SphereDimInputContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 84, VizRepParser.RULE_sphereDimInput);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 574;
	        this.match(VizRepParser.SPHEREPARAMS);
	        this.state = 575;
	        this.match(VizRepParser.T__8);
	        this.state = 576;
	        _la = this._input.LA(1);
	        if(!(_la===30 || _la===37)) {
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
VizRepParser.BOOLEANSTRING = 21;
VizRepParser.SPHEREPARAMS = 22;
VizRepParser.DIMENSION3D = 23;
VizRepParser.DIMENSION2D = 24;
VizRepParser.TEXTPARAMDIGITS = 25;
VizRepParser.TEXTPARAMSTRING = 26;
VizRepParser.PENPARAMSBOOL = 27;
VizRepParser.PENPARAMS = 28;
VizRepParser.VARASSPARAMS = 29;
VizRepParser.DIGITS = 30;
VizRepParser.STRING = 31;
VizRepParser.MAPLEXER = 32;
VizRepParser.WHITESPACE = 33;
VizRepParser.NEWLINE = 34;
VizRepParser.OPERATOR = 35;
VizRepParser.DYNVALSTRING = 36;
VizRepParser.DYNINPUT = 37;

VizRepParser.RULE_commandChain = 0;
VizRepParser.RULE_command = 1;
VizRepParser.RULE_relation = 2;
VizRepParser.RULE_relCommandFrom = 3;
VizRepParser.RULE_relCommandTo = 4;
VizRepParser.RULE_condition = 5;
VizRepParser.RULE_ifBlock = 6;
VizRepParser.RULE_elseBlock = 7;
VizRepParser.RULE_ifCommand = 8;
VizRepParser.RULE_elseCommand = 9;
VizRepParser.RULE_setVariable = 10;
VizRepParser.RULE_shapeCommand = 11;
VizRepParser.RULE_styleCommand = 12;
VizRepParser.RULE_cube = 13;
VizRepParser.RULE_relCube = 14;
VizRepParser.RULE_ifCube = 15;
VizRepParser.RULE_elseCube = 16;
VizRepParser.RULE_sphere = 17;
VizRepParser.RULE_relSphere = 18;
VizRepParser.RULE_ifSphere = 19;
VizRepParser.RULE_elseSphere = 20;
VizRepParser.RULE_plane = 21;
VizRepParser.RULE_relPane = 22;
VizRepParser.RULE_ifPlane = 23;
VizRepParser.RULE_elsePlane = 24;
VizRepParser.RULE_text = 25;
VizRepParser.RULE_relText = 26;
VizRepParser.RULE_ifText = 27;
VizRepParser.RULE_elseText = 28;
VizRepParser.RULE_line = 29;
VizRepParser.RULE_ifLine = 30;
VizRepParser.RULE_elseLine = 31;
VizRepParser.RULE_color = 32;
VizRepParser.RULE_ifColor = 33;
VizRepParser.RULE_elseColor = 34;
VizRepParser.RULE_pen = 35;
VizRepParser.RULE_ifPen = 36;
VizRepParser.RULE_elsePen = 37;
VizRepParser.RULE_map = 38;
VizRepParser.RULE_ifMap = 39;
VizRepParser.RULE_elseMap = 40;
VizRepParser.RULE_dimInput = 41;
VizRepParser.RULE_sphereDimInput = 42;

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

	text() {
	    return this.getTypedRuleContext(TextContext,0);
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

	relCommandFrom() {
	    return this.getTypedRuleContext(RelCommandFromContext,0);
	};

	relCommandTo() {
	    return this.getTypedRuleContext(RelCommandToContext,0);
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

	text = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(TextContext);
	    } else {
	        return this.getTypedRuleContext(TextContext,i);
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


	VARASSPARAMS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.VARASSPARAMS);
	    } else {
	        return this.getToken(VizRepParser.VARASSPARAMS, i);
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


	DYNVALSTRING() {
	    return this.getToken(VizRepParser.DYNVALSTRING, 0);
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

	dimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DimInputContext);
	    } else {
	        return this.getTypedRuleContext(DimInputContext,i);
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

	dimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DimInputContext);
	    } else {
	        return this.getTypedRuleContext(DimInputContext,i);
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

	dimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DimInputContext);
	    } else {
	        return this.getTypedRuleContext(DimInputContext,i);
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

	dimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DimInputContext);
	    } else {
	        return this.getTypedRuleContext(DimInputContext,i);
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

	sphereDimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SphereDimInputContext);
	    } else {
	        return this.getTypedRuleContext(SphereDimInputContext,i);
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

	sphereDimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SphereDimInputContext);
	    } else {
	        return this.getTypedRuleContext(SphereDimInputContext,i);
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

	sphereDimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SphereDimInputContext);
	    } else {
	        return this.getTypedRuleContext(SphereDimInputContext,i);
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

	sphereDimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SphereDimInputContext);
	    } else {
	        return this.getTypedRuleContext(SphereDimInputContext,i);
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

	dimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DimInputContext);
	    } else {
	        return this.getTypedRuleContext(DimInputContext,i);
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

	dimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DimInputContext);
	    } else {
	        return this.getTypedRuleContext(DimInputContext,i);
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

	dimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DimInputContext);
	    } else {
	        return this.getTypedRuleContext(DimInputContext,i);
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

	dimInput = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(DimInputContext);
	    } else {
	        return this.getTypedRuleContext(DimInputContext,i);
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

	TEXTPARAMDIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTPARAMDIGITS);
	    } else {
	        return this.getToken(VizRepParser.TEXTPARAMDIGITS, i);
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


	TEXTPARAMSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTPARAMSTRING);
	    } else {
	        return this.getToken(VizRepParser.TEXTPARAMSTRING, i);
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

	TEXTPARAMDIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTPARAMDIGITS);
	    } else {
	        return this.getToken(VizRepParser.TEXTPARAMDIGITS, i);
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


	TEXTPARAMSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTPARAMSTRING);
	    } else {
	        return this.getToken(VizRepParser.TEXTPARAMSTRING, i);
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

	TEXTPARAMDIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTPARAMDIGITS);
	    } else {
	        return this.getToken(VizRepParser.TEXTPARAMDIGITS, i);
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


	TEXTPARAMSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTPARAMSTRING);
	    } else {
	        return this.getToken(VizRepParser.TEXTPARAMSTRING, i);
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

	TEXTPARAMDIGITS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTPARAMDIGITS);
	    } else {
	        return this.getToken(VizRepParser.TEXTPARAMDIGITS, i);
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


	TEXTPARAMSTRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VizRepParser.TEXTPARAMSTRING);
	    } else {
	        return this.getToken(VizRepParser.TEXTPARAMSTRING, i);
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

	MAPLEXER() {
	    return this.getToken(VizRepParser.MAPLEXER, 0);
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

	MAPLEXER() {
	    return this.getToken(VizRepParser.MAPLEXER, 0);
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

	MAPLEXER() {
	    return this.getToken(VizRepParser.MAPLEXER, 0);
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



class DimInputContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_dimInput;
    }

	DIMENSION3D() {
	    return this.getToken(VizRepParser.DIMENSION3D, 0);
	};

	DYNINPUT() {
	    return this.getToken(VizRepParser.DYNINPUT, 0);
	};

	DIGITS() {
	    return this.getToken(VizRepParser.DIGITS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterDimInput(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitDimInput(this);
		}
	}


}



class SphereDimInputContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VizRepParser.RULE_sphereDimInput;
    }

	SPHEREPARAMS() {
	    return this.getToken(VizRepParser.SPHEREPARAMS, 0);
	};

	DYNINPUT() {
	    return this.getToken(VizRepParser.DYNINPUT, 0);
	};

	DIGITS() {
	    return this.getToken(VizRepParser.DIGITS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.enterSphereDimInput(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VizRepListener ) {
	        listener.exitSphereDimInput(this);
		}
	}


}




VizRepParser.CommandChainContext = CommandChainContext; 
VizRepParser.CommandContext = CommandContext; 
VizRepParser.RelationContext = RelationContext; 
VizRepParser.RelCommandFromContext = RelCommandFromContext; 
VizRepParser.RelCommandToContext = RelCommandToContext; 
VizRepParser.ConditionContext = ConditionContext; 
VizRepParser.IfBlockContext = IfBlockContext; 
VizRepParser.ElseBlockContext = ElseBlockContext; 
VizRepParser.IfCommandContext = IfCommandContext; 
VizRepParser.ElseCommandContext = ElseCommandContext; 
VizRepParser.SetVariableContext = SetVariableContext; 
VizRepParser.ShapeCommandContext = ShapeCommandContext; 
VizRepParser.StyleCommandContext = StyleCommandContext; 
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
VizRepParser.ColorContext = ColorContext; 
VizRepParser.IfColorContext = IfColorContext; 
VizRepParser.ElseColorContext = ElseColorContext; 
VizRepParser.PenContext = PenContext; 
VizRepParser.IfPenContext = IfPenContext; 
VizRepParser.ElsePenContext = ElsePenContext; 
VizRepParser.MapContext = MapContext; 
VizRepParser.IfMapContext = IfMapContext; 
VizRepParser.ElseMapContext = ElseMapContext; 
VizRepParser.DimInputContext = DimInputContext; 
VizRepParser.SphereDimInputContext = SphereDimInputContext; 
