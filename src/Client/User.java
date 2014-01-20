package Client;

import surajbab.evaluator.Exp_evaluator;

public class User {
    public static void main(String[] args) {
        Exp_evaluator expEval = new Exp_evaluator();
        System.out.println(expEval.evaluate("2+3"));
    }
}
