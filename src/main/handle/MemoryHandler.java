package main.handle;

import main.model.Memory;
import main.model.Variable;

import java.util.HashMap;

public class MemoryHandler {

    public String scope = "global";

    public void addVar(Variable variable) {
        if (Memory.vars.get(variable.getName()) == null && !variable.getScope().equals(Memory.vars.get(variable.getName()))) {
            Memory.vars.put(variable.getName(), variable);
        } else {
            System.out.println("Variable Already Exists!!!");
        }

    }

    public Variable getVar(Variable variable) {
        if (Memory.vars.get(variable.getName()) != null) {
            return Memory.vars.get(variable.getName());
        } else {
            System.out.println("No variable!!!");
            return Memory.vars.get(variable.getName());
        }
    }

    public Variable getVarByName(String name) {
        if (Memory.vars.get(name) != null) {
            return Memory.vars.get(name);
        } else {
            System.out.println("No variable!!!");
            return Memory.vars.get(name);
        }
    }

    public static void test() {
        HashMap vars = Memory.vars;
        System.out.println("ok");
    }

    public static void main(String[] args) {
        test();
    }
}
