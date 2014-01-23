package surajbab.evaluator;

public class Exp_evaluator {
    Eval_operations operations = new Eval_operations();

    public Double evaluate(String Exp) {
        Exp = Exp.replaceAll(" +", "");
        Exp = operations.solveBracket(Exp);
        return operations.solveExpression(Exp);
    }
}
