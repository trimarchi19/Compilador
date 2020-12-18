/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author Daniel
 */
public class SymbolT {
   public String name;
   public String value;
   public String type;
   public int offset;
   public int size;
   
    public SymbolT(String name, String value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public SymbolT(String name) {
        this.name = name;
    }

    public SymbolT(String name, String type) {
        this.name = name;
        this.type = type;
        this.value = "null";
    }

    public SymbolT(String name, String value, String type, int offset, int size) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.offset = offset;
        this.size = size;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SymbolT{" + "name=" + name + ", value=" + value + ", type=" + type + ", offset=" + offset + ", size=" + size + '}';
    }


   
    
   
    
    
}
