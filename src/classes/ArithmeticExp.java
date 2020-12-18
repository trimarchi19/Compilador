/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class ArithmeticExp {
    public ArithmeticExp aE;
    public String opsum;
    public Term term;

    public ArithmeticExp(ArithmeticExp aE, String opsum, Term term) {
        this.aE = aE;
        this.opsum = opsum;
        this.term = term;
    }

    public ArithmeticExp(Term term) {
        this.term = term;
    }

    public ArithmeticExp(ArithmeticExp aE) {
        this.aE = aE;
    }

    @Override
    public String toString() {
        return "ArithmeticExp{" + "aE=" + aE + ", opsum=" + opsum + ", term=" + term + '}';
    }
    
    
}
