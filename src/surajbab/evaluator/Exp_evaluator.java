package surajbab.evaluator;

import java.text.DecimalFormat;

public class Exp_evaluator {
    Eval_operations operations = new Eval_operations();

    public Double evaluate(String Exp){
        DecimalFormat df=new DecimalFormat("0.00");
        Exp = operations.solveBracket(Exp);
        String format = df.format(operations.solveExpression(Exp));
        return Double.parseDouble(format) ;
    }
}
