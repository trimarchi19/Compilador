/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class Argument {
    public Types type;
    public String id;

    public Argument(Types type, String id) {
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Argument{" + "type=" + type + ", id=" + id + '}';
    }
    
}
