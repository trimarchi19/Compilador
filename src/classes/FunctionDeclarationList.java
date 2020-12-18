/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class FunctionDeclarationList {

    public FunctionDeclarationList functionDeclarationL;
    public FunctionDeclaration functionDeclaration;

    public FunctionDeclarationList(FunctionDeclarationList functionDeclarationL, FunctionDeclaration functionDeclaration) {
        this.functionDeclarationL = functionDeclarationL;
        this.functionDeclaration = functionDeclaration;
    }

    public FunctionDeclarationList(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

 
    @Override
    public String toString() {
        return "Function Declaration List";
    }
   
}
