package TicTacToe;

import java.util.ArrayList;

public class CuadrupleTable {

    ArrayList<Cuadruple> cTable = new ArrayList();
    String arg1 = "";
    String arg2 = "";

    public void CuadrupleTable() {
    }

    public void addCuadruple(String a1, String a2, String opr, String r) {
        cTable.add(new Cuadruple(opr, a1, a2, r));
    }

    public int GEN(String op, String arg1, String resultado){
        int indice = cTable.size();
        cTable.add(new Cuadruple(indice, op, arg1, resultado));
        return cTable.size() - 1;
    }
    public void GEN_LABEL(String labelName) {
        addCuadruple("LABEL", labelName, arg2, "");
    }

    public void GEN_JUMP_TRUE(String destination, String condition) {
        addCuadruple("JTRUE", destination, condition, "");
    }

    public void GEN_JUMP_FALSE(String destination, String condition) {
        addCuadruple("JFALSE", destination, condition, "");
    }

    public void GEN_GOTO(String destination) {
        addCuadruple("GOTO", destination, "", "");
    }

    public void GEN_PARAM(String Param) {
        addCuadruple("PARAM", Param, "", "");
    }

    public void GEN_CALL(String FuncName) {
        addCuadruple("CALL", FuncName, "", "");
    }

    public void GEN_PRINT(String var) {
        addCuadruple("WRITE", var, "", "");
    }

    public void GEN_READ(String var) {
        addCuadruple("READ", var, "", "");
    }

    /*
    private Cuadruple Table

    llenarTablaCuad(MyNode padre, Cuadruple Table
    CuadT, int nivel

    
        ) {
        // Aqui hay que recorrer el arbol y en cada nivel que encuentre ir guardando todos los nodos.
        MyNode hijo;
        for (int i = 0; i < padre.getHijos().size(); i++) {
            hijo = padre.getHijos().get(i);
            if ("VARIABLE DEC :".equals(hijo.value)) {
                System.out.println("TRUE");
                CuadT = buscarDec(hijo, CuadT);
            } else if ("EXPRESSION".equals(hijo.value)) {
                // aqui se guardan en la tabla de cTable
                SymbolTable TablaHijo = new SymbolTable("Hijo" + nivel, CuadT, Offset);
                TablaHijo = llenarTablaCuad(hijo, TablaHijo, nivel + 1);
                CuadT.addSymbolTableHijo(TablaHijo);
            } else {
                // y aqui too
                CuadT = llenarTablaSymbolos(hijo, CuadT, nivel);
            }
        }
        return CuadT;
    }*/
}
