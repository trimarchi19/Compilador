/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class SwitchStatement {
    public String swS;
     public String swClose;
    public String id;
    public Cases caS;
    public Expressions eS;

    public SwitchStatement(String swS, String id, Cases caS ,String swClose) {
        this.swS = swS;
        this.id = id;
        this.caS = caS;
        this.swClose = swClose;
    }

 
}
