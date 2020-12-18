/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.*;
/**
 *
 * @author Daniel
 */
public class FileCompiler {
    public static void main(String[] args){
        buildLexer();
        buildParser();
        
    }

    private static void buildLexer() {
        JFlex.Main.generate(new File("src/TicTacToe/TicTacFlex.flex"));
        System.out.println("-------------------------------------");

    }

    private static void buildParser() {
        String params[] = new String[5];

        params[0] = "-destdir";
        params[1] = "src/TicTacToe/";
        params[2] = "-parser";
        params[3] = "Sintax";//Nombre del archivo generado
        params[4] = "src/TicTacToe/TicTacSyntax_1.cup";
        

        try {
            java_cup.Main.main(params);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
