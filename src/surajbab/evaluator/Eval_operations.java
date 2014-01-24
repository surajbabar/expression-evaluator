package surajbab.evaluator;

import java.util.ArrayList;

public class Eval_operations {
    char Operators[] = {'+', '-', '*', '^', '/', '_', '@', '#'};

    public Double[] getNumbers(String numbers) {
        String Number[] = numbers.replaceAll("[-*/^+]", "a").split("a");
        ArrayList<Double> Numbers = new ArrayList<Double>();

        for (String number : Number) {
            if (number.isEmpty()) continue;
            Numbers.add(Double.parseDouble(number));
        }
        return Numbers.toArray(new Double[Numbers.size()]);
    }

    public Character[] getOperators(String expression) {
        ArrayList<Character> operators = new ArrayList<Character>();
        expression = expression.replaceAll("\\++|\\--", "+");
        expression = expression.replaceAll("\\+-|\\-+", "-");
        expression = expression.replaceAll("\\*-", "@");
        expression = expression.replaceAll("/-", "#");
        expression = expression.replaceAll("\\^-", "_");

        for (char c : expression.toCharArray())
            for (char operator : Operators)
                if (c == operator) operators.add(c);

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
            case '_':
                return Math.pow(first, -second);
            case '@':
                return first * -second;
            case '#':
                return first / -second;
        }
        return 0.0;
    }

    public Double solveExpression(String Exp) {
        if (Exp.length() <= 2) return Double.parseDouble(Exp);
        Double Numbers[] = getNumbers(Exp);
        if (Numbers.length <= 1)
            return Double.parseDouble(Exp);
        double result = Numbers[0];
        if(Exp.startsWith("-")){
               result=-result;
               Exp=Exp.substring(1);
        }
        Character Operators[] = getOperators(Exp);

        int i = 1;
        for (char operator : Operators)
            result = calculate(result, operator, Numbers[i++]);
        return result;
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