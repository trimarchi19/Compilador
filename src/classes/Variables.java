/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

public class Variables {
    public String amper;
    public Value id;
    public AssignmentProc assignmentProc;
    public Variables vars;

    public Variables(Value id, AssignmentProc assignmentProc) {
        this.id = id;
        this.assignmentProc = assignmentProc;
    }

    public Variables(String amper, Variables vars) {
        this.amper = amper;
        this.vars = vars;
    }

    @Override
    public String toString() {
        return "Variables{" + "amper=" + amper + ", id=" + id + ", assignmentProc=" + assignmentProc + ", vars=" + vars + '}';
    }
        
}
