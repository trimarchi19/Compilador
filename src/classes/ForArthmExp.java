/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class ForArthmExp {
    public String id, aE, aE1, eq;
    public int num;

    public ForArthmExp(String id, String aE, String aE1) {
        this.id = id;
        this.aE = aE;
        this.aE1 = aE1;
    }

    public ForArthmExp(String id, String aE, String eq, int num) {
        this.id = id;
        this.aE = aE;
        this.num = num;
    }

    @Override
    public String toString() {
        return "ForArthmExp{" + "id=" + id + ", aE=" + aE + ", aE1=" + aE1 + ", eq=" + eq + ", num=" + num + '}';
    }
    
    
}
