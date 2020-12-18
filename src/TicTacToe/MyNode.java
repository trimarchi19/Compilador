/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class MyNode {
    public String value;
    public boolean visitado;
    ArrayList<MyNode> hijos;

    public MyNode(String value, boolean visitado) {
        this.value = value;
        this.visitado = visitado;
        this.hijos = new ArrayList();
    }
    public MyNode(String value) {
        this.value = value;
        this.visitado = false;
        this.hijos = new ArrayList();
    }

    public void addExpresiones(MyNode e, MyNode root){
        root.hijos.add(new MyNode(e.value));
        for (MyNode hijo : e.getHijos()) {
            root.addExpresiones(hijo, root);
        }
    }
    public String getValue() {
        return value;
    }
//AÑADIR METODO QUE RECIBA ARRAYLIST DE HIJOS U LO HAGA TUANI
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public ArrayList<MyNode> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<MyNode> hijos) {
        this.hijos = hijos;
    }
    public void addHijo(MyNode hijo) {
        this.hijos.add(hijo);
    }
    public void addHijos(ArrayList<MyNode> hijos,MyNode dad) {
        
            
            for (MyNode hijo : hijos) {
                this.hijos.add(hijo);
            }
        
    }
    
    /*public void print(MyNode raiz, int profundidad) {
        
        for (int i = 0; i < profundidad; i++) {
            
            System.out.print("\t");
        }
        System.out.println(raiz.value);
        if(raiz.value.contains("->")){
            profundidad++;
        }
        
        for (MyNode hijo : raiz.hijos) {
            print(hijo, profundidad++);
        }
    }*/
  

    @Override
    public String toString() {
        return "MyNode{" + "value=" + value + '}';
    }
    
}
    
