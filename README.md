# MasterThesis Jonas Nydegger

The source code implemented for the artifact of this Master thesis. 

## Instructions

### Install the Node environment

To run the project you must install nodejs on your machine.

Further we recommend VSCode or IntelliJ IDEA for your project.

As student you can get your free IntelliJ license.

https://www.jetbrains.com/de-de/community/education/#students

  

Then you have to clone this repo to your prefered path. You must install typescript globally as well:

```

npm install typescript -g

```

You must install aurelia globally as well:

```
npm install aurelia-cli -g
```

Then you must install the project specific node modules:

```
npm install
```


Now you can run the application:

```
npm start
```


### Install ANTLR4
If you want to make changes on the lexer and parser rules, you have to download ANTLR4 (https://www.antlr.org/download.html) in the version 4.11. 

Important! ANTLR4 is a Java application and thus, JVM must be installed on your local machine. If you want to use ANTLR4 independently from the location of your command line, add the respective environment variable. A tutorial about how to do that can be found here: https://stackoverflow.com/questions/41021963/how-to-install-antlr4

### Generate parser with ANTLR4
The file containing the lexer and parser rules can be found under src/views/middle_body/parser/VizRep.g4. If you want to generate a new parser based on this .g4 file and its respective rules, go to the directory containing the .g4 and run the following command:

```
antlr4 -Dlanguage=JavaScript VizRep.g4
```

This will generate all necessary files for the parser which can be found in the same directory as the .g4 file. 
