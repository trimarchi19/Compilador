/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class AndOR {
    public String s;
    public Condition c;

    public AndOR(String s, Condition c) {
        this.s = s;
        this.c = c;
    }

    @Override
    public String toString() {
        return "AndOR{" + "s=" + s + ", c=" + c + '}';
    }


    
    
}
