/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class WhileStatement {
    public String whileS;
    public Condition c;
    public Expressions e;

    public WhileStatement(String whileS, Condition c, Expressions e) {
        this.whileS = whileS;
        this.c = c;
        this.e = e;
    }

    @Override
    public String toString() {
        return "WhileStatement{" + "whileS=" + whileS + ", c=" + c + ", e=" + e + '}';
    }
    
    
}
