/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class Printers {
    public String type;
    public VarDeclarationList v;
    public Value value;

    public Printers(String type, Value literal) {
        this.type = type;
        this.value = literal;
    }

    
    public Printers(String type, Value literal, VarDeclarationList v) {
        this.type = type;
        this.value = literal;
        this.v = v;
    }

    public Printers() {
        
    }

    @Override
    public String toString() {
        return "Printers{" + "type=" + type + ", v=" + v + ", value=" + value + '}';
    }
    
    
}
