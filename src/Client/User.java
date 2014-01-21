package Client;

import surajbab.evaluator.Exp_evaluator;

public class User {
    public static void main(String[] args) {
        Exp_evaluator evaluator = new Exp_evaluator();
        System.out.println(evaluator.evaluate(args[0]));
    }
}
