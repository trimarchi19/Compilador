package TicTacToe;

import java_cup.runtime.*;
import java_cup.*;
import java.io.IOException;;
import java_cup.runtime.Symbol;

%% 
%class TicTacCompiler
%unicode
%int
%cup
%char
%line
%column
%caseless

%{
    StringBuffer string = new StringBuffer();
    int stCom = 0;
    int ctLine;
    private Symbol symbol(String namesym, int sym) {
            return new Symbol(sym, yyline, yycolumn, namesym);
    }

    private Symbol symbol(String namesym, int sym, Object obj) {
            return new Symbol(sym, yyline, yycolumn, obj);
    }

    private void error(String message) {
            System.err.println("Error léxico en línea "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
    }
%}

letter = [a-zA-Z]
digit = [0-9]
space = (" "|"\t"|"\n")+
integer = {digit}+ 
sumres = "+"|"-" 
multdiv = "*"|"/"
boolex = "<"|">"|"<="|">="|"!="|"=="
boolVal = "true" | "false"
id = {letter}({letter}|{digit})*
constchar = "'"{letter}"'"|"'"(" ")"'"

list = ({integer}",")*{integer}
listc = ({constchar}",")*{constchar}   
array1D = ("int"|"char")"["{integer}"]"
array2D = ("int"|"char")"["{integer}"]["{integer}"]"

array1DVarI = "["{list}"]" 
array1DVarC = "["{listc}"]" 

arrayListI =({array1DVarI}",")*{array1DVarI}
arrayListC =({array1DVarC}",")*{array1DVarC}


array2DVarI = "["{arrayListI}"]"
array2DVarC = "["{arrayListC}"]"
null = "null"|"NULL" 

%state COMMENT
%state LINECOMMENT
%state STRING

%%

<YYINITIAL>{
    \"			{ string.setLength(0); string.append(yytext()); yybegin(STRING); }    
    {array1D}         { return symbol("arrayd", sym.ARRAYD, yytext()); }
    {array2D}         { return symbol("arraydd", sym.ARRAYDD,yytext()); }
    {array1DVarI}         { return symbol("arrayd", sym.ARRAYDVALI, yytext()); }
    {array2DVarI}         { return symbol("arraydd", sym.ARRAYDDVALI,yytext()); }
    {array1DVarC}         { return symbol("arrayd", sym.ARRAYDVALC, yytext()); }
    {array2DVarC}         { return symbol("arraydd", sym.ARRAYDDVALC,yytext()); }
    "{!"                { ctLine = yyline+1; stCom++; yybegin(COMMENT); }
    "!}"                { System.out.println("Missing {! for expression"); }
    "!!"                { yybegin(LINECOMMENT); }
    "set"           { return symbol("set", sym.SET); }
    "as"           { return symbol("as", sym.AS); }
    "bool"           { return symbol("bool", sym.BOOL); }
    "void"              { return symbol("void", sym.VOID); }
    "func"              { return symbol("func", sym.FUNC); }
    "main"              { return symbol("main", sym.MAIN); }
    "write"            { return symbol("write", sym.WRITE); }
    "writeln"            { return symbol("writeln", sym.WRITELN); }
    "read"             { return symbol("read", sym.READ); }
    "#"                 { return symbol("#", sym.DELIM );}
    "=>"              { return symbol("=>", sym.OPENFUNC); }
    "toe"              { return symbol("toe", sym.CLOSEFUNC); }
    ","                 { return symbol(",", sym.COMMA); }
    "("                 { return symbol("(", sym.PARIZQ); }
    ")"                 { return symbol(")", sym.PARDER, "hola"); }
    "="                 { return symbol("=", sym.IGUAL); }
    "|"                { return symbol("|", sym.OR); }
    "&"                { return symbol("&", sym.AND); }
    "tic4"               { return symbol("ticf4", sym.FOR); }
    "tac4"               { return symbol("ticf4", sym.CFOR); }
    "ticwhile"             { return symbol("tocwhile", sym.WHILE); }
   "tacwhile"             { return symbol("tacwhile", sym.CWHILE); }
    "ticif"                { return symbol("ticif", sym.IF); }
    "elsif"                { return symbol("elsif", sym.ELSIF); }
    "else"              { return symbol("else", sym.ELSE); }
    "tacif"                { return symbol("tacif", sym.CIF); }
    "tichoose"                { return symbol("tichoose", sym.SWITCH); }
    "tachoose"                { return symbol("tachoose", sym.CSWITCH); }
    ":"                { return symbol(":", sym.CASE); }
    "end"                { return symbol("end", sym.ENDCASE); }
    "def"                { return symbol("def", sym.DEFCASE); }        
    "return"            { return symbol("return", sym.RETURN); }
    "break"             { return symbol("break", sym.BREAK); }
    "int"               { return symbol("int", sym.INT); }
    "char"              { return symbol("char", sym.CHAR); }
    
    {sumres}       { return symbol("sumred", sym.SUMRES,yytext()); }
    {multdiv}       { return symbol("multdiv", sym.MULTDIV,yytext()); }
    {boolex}           { return symbol("boolex", sym.BOOLEX,yytext()); }
    {null}              { return symbol("null", sym.NULL, yytext()); }
    {boolVal}           { return symbol("boolVal", sym.BOOLVAL, yytext()); }
    {constchar}         { return symbol("char", sym.CHARVAL,yytext()); }
    "String"             { return symbol("String", sym.TSTRING,yytext()); }
    
    {integer}		{ return symbol("integer", sym.INTEGER, yytext()); }
    {id}                { return symbol("id", sym.ID, yytext()); }
    {space}             { }
    .                   { error("Caracter inválido <"+ yytext()+"> en la línea:" + (yyline+1)); }
}

<COMMENT>{
    "!}"    { stCom--; if(stCom==0) yybegin(YYINITIAL); }
    [^]     { }
}

<LINECOMMENT>{
    "\n"    {yybegin(YYINITIAL);}
    [^]     { }



<STRING> {
      \"                             { string.append( yytext() ); 
                                       yybegin(YYINITIAL);
                                       //return symbol("char", sym.CHARVAL,yytext());
                                       return symbol("conststr", sym.STRING, string.toString()); }
      [^\n\r\"\\]+                   { string.append( yytext() ); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }
      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
 }

}


