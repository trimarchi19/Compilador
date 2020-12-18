/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class Scanners {
    public String type, literal;
    public VarDeclarationList v;
    public Value val;

    public Scanners(String type, Value literal) {
        this.type = type;
        this.val = literal;
    }

    @Override
    public String toString() {
        return "Scanners{" + "type=" + type + ", literal=" + literal + ", v=" + v + ", val=" + val + '}';
    }
    
    
}
