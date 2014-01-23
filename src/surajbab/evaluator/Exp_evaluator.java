package surajbab.evaluator;

public class Exp_evaluator {
    Eval_operations operations = new Eval_operations();

    public Double evaluate(String Exp) {
        Exp = Exp.replaceAll(" +", "");
        double result = 1;
        int i=1;
        Double Numbers[] = operations.getNumbers(Exp);
        Character[] Operators = operations.getOperators(Exp);

        if (Numbers.length == 1)
            return Numbers[0];
        result=Numbers[0];
        for (char operator : Operators)
       result= operations.calculate(result,operator,Numbers[i++]);
        result = Math.round(result*100);
        return result/100;
    }


}
