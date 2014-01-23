package surajbab.evaluator;

public class Exp_evaluator {
    Eval_operations operations = new Eval_operations();

    public Double evaluate(String Exp) {
        Exp = Exp.replaceAll(" +", "");
        double result = 1;
        Integer Numbers[] = operations.getNumbers(Exp);
        Character[] Operators = operations.getOperators(Exp);

        if (Numbers.length == 1)
            return Double.valueOf(Numbers[0]);

        for (char operator : Operators)
            switch (operator) {
                case '+': {
                    result = Numbers[0] + Numbers[1];
                    break;
                }
                case '-': {
                    result = Numbers[0] - Numbers[1];
                    break;
                }
                case '*': {
                    result = Numbers[0] * Numbers[1];
                    break;
                }
                case '/': {
                    result = Numbers[0] / Numbers[1];
                    break;
                }
                case '^': {
                    result = Math.pow(Numbers[0], Numbers[1]);
                    break;
                }
            }
        return result;
    }


}
