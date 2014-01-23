package surajbab.evaluator;

import java.util.ArrayList;

public class Eval_operations {
    char Operators[] = {'+', '-', '*', '/', '^'};

    public Integer[] getNumbers(String numbers) {
        for (char operator : Operators)
            numbers = numbers.replace(operator, ' ');

        String numbersInString[] = numbers.split(" ");
        Integer[] Numbers = new Integer[numbersInString.length];

        for (int i = 0; i < numbersInString.length; i++)
            Numbers[i] = Integer.parseInt(numbersInString[i]);

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
}
