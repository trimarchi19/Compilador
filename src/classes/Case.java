package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Case {
    public Value value;
    public String init;
    public Expressions eS;
    public String closeC;

    
    public Case(Value value, String init, Expressions eS, String closeC) {
        this.value = value;
        this.init = init;
        this.eS = eS;
        this.closeC = closeC;
    }
    
    
}
