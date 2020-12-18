/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class Expression {
    public VariableDeclaration variableDeclaration;
    public Statements statements;
    public Scanners scanners;
    public Printers printers;
    public String breakE;
    public ReturnStatement retState;
    public Assignment assignment;
    public ArithmeticExp exp;
    
    public Expression(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Expression(Statements statements) {
        this.statements = statements;
    }

    public Expression(Scanners scanners) {
        this.scanners = scanners;
    }

    public Expression(Printers printers) {
        this.printers = printers;
    }

    public Expression(String breakE) {
        this.breakE = breakE;
    }

    public Expression(ReturnStatement retState) {
        this.retState = retState;
    }

    public Expression(Assignment assignment) {
        this.assignment = assignment;
    }

    public Expression(ArithmeticExp exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Expression{" + "variableDeclaration=" + variableDeclaration + ", statements=" + statements + ", scanners=" + scanners + ", printers=" + printers + ", breakE=" + breakE + ", retState=" + retState + ", assignment=" + assignment + ", exp=" + exp + '}';
    }
    
}
