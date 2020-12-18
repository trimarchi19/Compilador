/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class Statements {
    public IfStatement ifStatement;
    public WhileStatement whileStatement;
    public ForStatement forStatement;
    public SwitchStatement switchStatement;

    public Statements(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public Statements(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
    }

    public Statements(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public Statements(SwitchStatement switchStatementStatement) {
        this.switchStatement = switchStatementStatement;
    }

    @Override
    public String toString() {
        return "Statements{" + "ifStatement=" + ifStatement + ", whileStatement=" + whileStatement + ", forStatement=" + forStatement + '}';
    }
    
}
