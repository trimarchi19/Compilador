/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class SymbolTable {

    public SymbolTable Padre;
    public String name="";
    public int tableOffset=0;
    public ArrayList<SymbolT> SymbolTable = new ArrayList<>();
    public ArrayList<SymbolTable> SymTableHijos = new ArrayList<>();
    
    
    public SymbolTable() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTableOffset() {
        return tableOffset;
    }

    public void setTableOffset(int tableOffset) {
        this.tableOffset = tableOffset;
    }

    
    public SymbolTable(String name) {
        this.name = name;
    }
    public SymbolTable(String name,SymbolTable Padre) {
        this.name = name;
         this.Padre = Padre;
    }
    public SymbolTable(String name,SymbolTable Padre,int tableOffset) {
        this.name = name;
        this.Padre = Padre;
        this.tableOffset = tableOffset;
    }

    public SymbolTable(SymbolTable Padre) {
        this.Padre = Padre;
    }

    public SymbolTable getPadre() {
        return Padre;
    }

    public void setPadre(SymbolTable Padre) {
        this.Padre = Padre;
    }

    public void addSymbol(SymbolT s) {
        this.SymbolTable.add(s);
    }
    public void addSymbolTableHijo(SymbolTable st) {
        this.SymTableHijos.add(st);
    }

    public ArrayList<SymbolT> getSymbolTable() {
        return SymbolTable;
    }

    public void setSymbolTable(ArrayList<SymbolT> SymbolTable) {
        this.SymbolTable = SymbolTable;
    }

    public ArrayList<SymbolTable> getSymTableHijos() {
        return SymTableHijos;
    }

    public void setSymTableHijos(ArrayList<SymbolTable> SymTableHijos) {
        this.SymTableHijos = SymTableHijos;
    }

    
    
    public boolean searchSymbol(String value) {
        boolean found = false;
        System.out.println(Padre);
        for (int i = 0; i < SymbolTable.size(); i++) {
            SymbolT temp = SymbolTable.get(i);
            if ((temp.name).equals(value)) {
                return true;
            }
        }
        if (!(Padre == null)) {
            return Padre.searchSymbol(value);
        } else {
             return false;
        }

    }
    public boolean searchSymbolEnAmbito(String value) {
        boolean found = false;
        System.out.println(Padre);
        for (int i = 0; i < SymbolTable.size(); i++) {
            SymbolT temp = SymbolTable.get(i);
            if ((temp.name).equals(value)) {
                return true;
            }
        }
        return false;

    }


    public void Imprimir(){
        System.out.println("------------------------------------");
        if(name.equals("RAIZ")){
                    
                System.out.println("PADRE:"+"NO TIENE ES LA RAIZ"); 
        }else{
              if((Padre.name).equals("RAIZ")){
                   System.out.println("PADRE:"+Padre.name);
              }else{
                   System.out.println("PADRE:"+Padre + " - "+"SIMBOLOS" + Padre.SymTableHijos);
              }  
            
        }
         System.out.println("NiVEL NODO ACTUAL:"+ name );
        System.out.println("SIMBOLOS EN AMBITO:"+SymbolTable);
        for(int i = 0; i< SymTableHijos.size();i++){
            (SymTableHijos.get(i)).Imprimir();
        }
    }

    @Override
    public String toString() {
        return name ;
    }


}
