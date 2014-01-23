package surajbab.evaluator;

import java.util.ArrayList;

public class Eval_operations {
    char Operators[] = {'+', '-', '*', '/', '^'};

    public Double[] getNumbers(String numbers) {
        for (char operator : Operators)
            numbers = numbers.replace(operator, ' ');

        String numbersInString[] = numbers.split(" ");
        Double[] Numbers = new Double[numbersInString.length];

        for (int i = 0; i < numbersInString.length; i++)
            Numbers[i] = Double.parseDouble(numbersInString[i]);

        return Numbers;
    }

    public Character[] getOperators(String expression) {
        ArrayList<Character> operators = new ArrayList<Character>();

        for (char c : expression.toCharArray()) {
            for (char operator : Operators)
                if (c == operator) {
                    operators.add(c);
                }
        }
        return operators.toArray(new Character[operators.size()]);
    }

    public Double calculate(Double first, char operator, Double second) {
        switch (operator) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                return first / second;
            case '^':
                return Math.pow(first, second);
        }
        return 0.0;
    }

    public Double solveExpression(String Exp) {
        Double Numbers[] = getNumbers(Exp);
        Character Operators[] = getOperators(Exp);
        if (Numbers.length == 1)
            return Numbers[0];
        Double result = Numbers[0];
        int i = 1;
        for (char operator : Operators)
            result = calculate(result, operator, Numbers[i++]);
        result = (double) Math.round(result * 100);
        return result / 100;
    }

    public String solveBracket(String Exp) {
        int startIndex = Exp.lastIndexOf('(') + 1;
        int endIndex = Exp.indexOf(')', startIndex);
        while (startIndex - 1 != endIndex) {
            String subExp = Exp.substring(startIndex, endIndex);
            Exp = Exp.replace("(" + subExp + ")", "" + solveExpression(subExp) + "");
            startIndex = Exp.lastIndexOf('(') + 1;
            endIndex = Exp.indexOf(')', startIndex);
        }

        return Exp;
    }

}
