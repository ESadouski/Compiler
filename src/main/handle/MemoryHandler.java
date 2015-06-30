package main.handle;

import main.model.Memory;
import main.model.Variable;

import java.util.HashMap;

public class MemoryHandler {

    public String scope = "global";

    public void addVar(Variable variable, String scope) {
        if (Memory.vars.get(variable.getName() + scope) == null && !variable.getScope().equals(Memory.vars.get(variable.getName() + scope))) {
            Memory.vars.put(variable.getName() + scope, variable);
        } else {
            System.out.println("!!! Exception: variable " + variable.getName() + " already exists");
        }

    }

    public Variable getVarByName(String name, String scope) {
        if (Memory.vars.get(name + scope) == null) {
            System.out.println("!!! Exception: variable " + name + " was not exists");
        }
            return Memory.vars.get(name + scope);
    }

    public static void test() {
        HashMap vars = Memory.vars;
        System.out.println("ok");
    }

}
