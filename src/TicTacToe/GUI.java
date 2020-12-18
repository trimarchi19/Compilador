/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import classes.*;
import java.awt.Color;
import java.io.StringReader;
import java.util.ArrayList;
import java_cup.runtime.Symbol;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java_cup.Lexer;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.text.TabableView;

/**
 *
 * @author Daniel
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("TicaTacToe");
        DefaultTreeModel modelo = new DefaultTreeModel(raiz);

    }

    public SymbolTable Table = new SymbolTable("RAIZ");
    public int Offset = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        btSin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSintactico = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtLex = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtreeS = new javax.swing.JTree();

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Analyzer");
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(234, 252, 252));

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane1.setViewportView(txtInput);

        btSin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btSin.setText("Analizar");
        btSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSinActionPerformed(evt);
            }
        });

        txtSintactico.setEditable(false);
        txtSintactico.setColumns(20);
        txtSintactico.setRows(5);
        jScrollPane2.setViewportView(txtSintactico);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        jLabel1.setText("Editor de Código");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        jLabel2.setText("Árbol Sintáctico Abstracto");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        jLabel3.setText("Consola");

        txtLex.setColumns(20);
        txtLex.setRows(5);
        jScrollPane5.setViewportView(txtLex);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 12)); // NOI18N
        jLabel4.setText("Análisis Léxico");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("ROOT");
        jtreeS.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(jtreeS);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btSin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(136, 136, 136)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSin)
                    .addComponent(jButton2))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:'
        txtSintactico.setText("");
        txtInput.setText("");
        txtLex.setText("");
        //txtSintactico1.setText("");
        txtSintactico.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSinActionPerformed
        // TODO add your handling code here:
        String ST = txtInput.getText();
        Sintax s = new Sintax(new TicTacToe.TicTacCompiler(new StringReader(ST)));

        try {
            s.parse();
            txtSintactico.setText("Analisis realizado correctamente");
            txtSintactico.setForeground(new Color(25, 111, 61));
            txtSintactico.setForeground(Color.red);
            String acum = "";

            ArrayList<StringBuilder> errores = s.errores;
            ArrayList<String> errores2 = s.errores2;
            //System.out.println("Errores" + s.errores.size());
            for (StringBuilder sym : errores) {
                acum = acum + "\n" + sym;
                System.out.println(sym);
            }
            acum = acum + "\n" + "--------------------------------------------";
            for (String sym : errores2) {
                acum = acum + "\n" + sym.toString();
                System.out.println(sym.toString());

            }
            txtSintactico.setText(acum);
            analizarLexico();
            cargarArbol(s.root);
            llenarTablaSymbolos(s.root, Table, 0);
            System.out.println("##############################################################");
            Table.Imprimir();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_btSinActionPerformed

    private void cargarArbol(MyNode raiz) throws IOException {

        DefaultMutableTreeNode root = new DefaultMutableTreeNode(raiz);
        llenarTree(raiz, root);
        DefaultTreeModel modeloARBOL = (DefaultTreeModel) jtreeS.getModel();

        DefaultMutableTreeNode jtreeSRoot = (DefaultMutableTreeNode) root;
        modeloARBOL.setRoot(root.getFirstChild());

    }

    private SymbolTable llenarTablaSymbolos(MyNode padre, SymbolTable SymT, int nivel) {

        MyNode hijo;
        for (int i = 0; i < padre.getHijos().size(); i++) {
            hijo = padre.getHijos().get(i);
            // System.out.println(hijo);
            if ("VARIABLE DEC :".equals(hijo.value)) {
                System.out.println("TRUE");
                SymT = buscarDec(hijo, SymT);

            } else if ("EXPRESSION".equals(hijo.value)) {
                //System.out.println(SymT.name);
                SymbolTable TablaHijo = new SymbolTable("Hijo" + nivel, SymT,Offset);
                TablaHijo = llenarTablaSymbolos(hijo, TablaHijo, nivel + 1);
                //TablaHijo.Imprimir();
                SymT.addSymbolTableHijo(TablaHijo);
            } else {
                //System.out.println(hijo.value);
                SymT = llenarTablaSymbolos(hijo, SymT, nivel);
            }

        }
        return SymT;
        //System.out.println("HOLA MUNDOOOO!!");
    }

    private SymbolTable buscarDec(MyNode nodo, SymbolTable SymTable) {
        MyNode type = nodo.getHijos().get(0);
        //if ((type.value).equals("int")) {
            MyNode Variables = type.getHijos().get(0);
            
            System.out.println("HMM ENTRO CUANTS VECES");
            for (int i = 0; i < Variables.getHijos().size(); i++) {
                MyNode SingleVarName = Variables.getHijos().get(i);
                    SymbolT tempSymbol;
                    String value = (SingleVarName.getHijos().get(0)).value;
                    value = value.replaceAll("INT:", "");
                    value = value.replaceAll("BOOL:", "");
                    value = value.replaceAll("CHAR:", "");
                    value = value.replaceAll("STRING:", "");
               System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+SymTable.searchSymbolEnAmbito(SingleVarName.value)); 
               switch (type.value) {
                    case "int":
                         tempSymbol = new SymbolT(SingleVarName.value,value , type.value,Offset, 4);
                         Offset = Offset+4;
                        break;
                    case "char":
                        System.out.println("ES TIPO CHAR");
                         tempSymbol= new SymbolT(SingleVarName.value, value, type.value,Offset, 3);
                         Offset = Offset+3;
                        break;
                    case "bool":
                        tempSymbol= new SymbolT(SingleVarName.value, value, type.value,Offset, 1);
                        Offset = Offset+1;
                        break;
                    case "string":
                        System.out.println("SOY UN STRING");
                        tempSymbol= new SymbolT(SingleVarName.value, value, type.value,Offset, value.length());
                        Offset = Offset+value.length();
                        break;
                    default: 
                        tempSymbol = new SymbolT(SingleVarName.value, value, type.value,SymTable.tableOffset, 10);
                        Offset = Offset+10;
                        break;
                }
                            
                // System.out.println(tempSymbol);
                SymTable.addSymbol(tempSymbol);
                //SymTable.setTableOffset(SymTable.tableOffset + size);
                
            }
            return SymTable;
            //System.out.println("ES de TIPO ENTERO");
        //} else {
           // System.out.println("NO ES DE TIPO ENTERO");
           // return null;
        //}
    }

    private void llenarTree(MyNode p_raiz, DefaultMutableTreeNode nodo) {
        for (MyNode hijo : p_raiz.hijos) {
            if (hijo.hijos.isEmpty()) {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(hijo.value);
                nodo.add(n);

            } else {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(hijo.value);
                nodo.add(n);
                llenarTree(hijo, n);
            }
        }
    }

    private void analizarLexico() throws IOException {
        int cont = 1;
        String expr = (String) txtInput.getText();
        TicTacCompiler lexer = new TicTacCompiler(new StringReader(expr));
        System.out.println(lexer.yytext());
        String resultado = "";
        Symbol token = lexer.next_token();
        while (token.sym != sym.EOF) {
            switch (token.sym) {
                case sym.CHAR:
                    System.out.println("entra");
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.MULTDIV:
                    cont++;
                    resultado += " <MULTDIV>\t\t" + lexer.yytext() + "\n";
                    break;
                case sym.ELSIF:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.CASE:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.INTEGER:
                    cont++;
                    resultado += " <INTEGER>\t" + lexer.yytext() + "\n";
                    break;
                case sym.INT:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.CHARVAL:
                    cont++;
                    resultado += " <CHARVAL>\t" + lexer.yytext() + "\n";
                    break;
                case sym.FOR:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.WRITE:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.DELIM:
                    cont++;
                    resultado += " <DELIM>\t" + lexer.yytext() + "\n";
                    break;
                case sym.SUMRES:
                    cont++;
                    resultado += " <SUMRES>\t" + lexer.yytext() + "\n";
                    break;
                case sym.AND:
                    cont++;
                    resultado += " <AND>\t" + lexer.yytext() + "\n";
                    break;
                case sym.IGUAL:
                    cont++;
                    resultado += " <EQUAL>\t" + lexer.yytext() + "\n";
                    break;
                case sym.CWHILE:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.ARRAYDDVALI:
                    cont++;
                    resultado += " <INTEGER LIST>\t" + lexer.yytext() + "\n";
                    break;
                case sym.OR:
                    cont++;
                    resultado += " <OR>\t" + lexer.yytext() + "\n";
                    break;
                case sym.BOOL:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.COMMA:
                    cont++;
                    resultado += " <COMMA>\t" + lexer.yytext() + "\n";
                    break;
                case sym.CLOSEFUNC:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.OPENFUNC:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.ARRAYDDVALC:
                    cont++;
                    resultado += " <CHAR LIST>\t" + lexer.yytext() + "\n";
                    break;
                case sym.MAIN:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.IF:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.WRITELN:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.ID:
                    cont++;
                    resultado += " <ID>\t" + lexer.yytext() + "\n";
                    break;

                case sym.EOF:
                    cont++;
                    resultado += " <EOF>\t" + lexer.yytext() + "\n";
                    break;
                case sym.PARIZQ:
                    cont++;
                    resultado += " <PARIZQ>\t" + lexer.yytext() + "\n";
                    break;
                case sym.RETURN:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.ARRAYDVALI:
                    cont++;
                    resultado += " <LIST>\t" + lexer.yytext() + "\n";
                    break;
                case sym.BOOLVAL:
                    cont++;
                    resultado += " <BOOLVAL>\t" + lexer.yytext() + "\n";
                    break;
                case sym.BOOLEX:
                    cont++;
                    resultado += " <BOOLEX>\t" + lexer.yytext() + "\n";
                    break;
                case sym.BREAK:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.VOID:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.SWITCH:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.CIF:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.ELSE:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.FUNC:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.READ:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.CFOR:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.WHILE:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.DEFCASE:
                    cont++;
                    resultado += " <DEFCASE>\t" + lexer.yytext() + "\n";
                    break;
                case sym.CSWITCH:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.AS:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.PARDER:
                    cont++;
                    resultado += " <PARDER>\t" + lexer.yytext() + "\n";
                    break;
                case sym.ENDCASE:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;
                case sym.SET:
                    cont++;
                    resultado += " <reserved>\t" + lexer.yytext() + "\n";
                    break;

                default:
                    cont++;
                    resultado += " < ERROR " + lexer.yytext() + " >\n";
                    break;
            }
            token = lexer.next_token();
            if (token.sym == sym.EOF) {
                txtLex.setText(resultado);
                return;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ScriptException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });

        aritmeticExpSolver("2+5*6/4");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jtreeS;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtLex;
    private javax.swing.JTextArea txtSintactico;
    // End of variables declaration//GEN-END:variables

    public void c(Compilador root) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setVisibilityChecker(mapper.getSerializationConfig().getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.writeValue(new File("./test/AST2.json"), root);

    }

    public static double aritmeticExpSolver(String math) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("JavaScript");
        Object result = se.eval(math); // TODO Auto-generated catch block
        //System.out.println(result.toString());

        String str = new String("Site is BeginnersBook.com 23");

        //System.out.print("String after replacing all 'o' with 'p' :");
        //System.out.println(str.replaceFirst("oo(.*)", "@"));
        //System.out.println("-------------------");
        if (result instanceof Double) {
            return (double) result;
        } else {
            return ((double) result);
        }

    }

}

/*

    public void listar_no_orden(Object p_raiz, DefaultMutableTreeNode nodo) {
        try {
            if (p_raiz instanceof Compilador) {
                for (Compilador p : ((Compilador) p_raiz).) {
                    if (p.getLista_empleados().isEmpty()) {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(p);
                        nodo.add(n);
                    } else {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(p);
                        nodo.add(n);
                        listar_no_orden(p, n);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public void listar_no_orden(Object p_raiz, DefaultMutableTreeNode nodo) {
        try {
            if (p_raiz instanceof Compilador) {
                for (Compilador p : ((Compilador) p_raiz)) {
                    if (p.getLista_empleados().isEmpty()) {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(p);
                        nodo.add(n);
                    } else {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(p);
                        nodo.add(n);
                        listar_no_orden(p, n);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
 */
