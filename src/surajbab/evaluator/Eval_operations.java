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

    public double calculate(double first, char operator, double second) {
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
        return 0;
    }
}
