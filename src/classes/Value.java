/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class Value {
    public String type, token;

    public Value(String token, String type) {
        this.token = token;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Value{" + "type=" + type + ", token=" + token + '}';
    }

    
}
