/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class FunctionDeclaration {
    public Types type;
    public String id;
    public ArgumentList argumentlist;

    public FunctionDeclaration(Types type, String id, ArgumentList argumentlist) {
        this.type = type;
        this.id = id;
        this.argumentlist = argumentlist;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" + "type=" + type + ", id=" + id + ", argumentlist=" + argumentlist + '}';
    }
    
    
}
