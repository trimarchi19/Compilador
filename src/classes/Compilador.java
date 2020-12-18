/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

public class Compilador {
    public FunctionDeclarationList functionDeclarationL;
    public MainClause mainClause;
    public FunctionList functionList;

    public Compilador(FunctionDeclarationList functionDeclarationL, MainClause mainClause, FunctionList functionList) {
        this.functionDeclarationL = functionDeclarationL;
        this.mainClause = mainClause;
        this.functionList = functionList;
    }

    public Compilador(MainClause mainClause) {
        this.mainClause = mainClause;
    }

    @Override
    public String toString() {
        return "Compilador";
    }
    
    
}
