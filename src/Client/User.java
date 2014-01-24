package Client;

import surajbab.evaluator.Exp_evaluator;

import java.text.ParseException;

public class User {
    public static void main(String[] args) throws ParseException {
        Exp_evaluator evaluator = new Exp_evaluator();
        System.out.println(evaluator.evaluate(args[0]));
    }
}
