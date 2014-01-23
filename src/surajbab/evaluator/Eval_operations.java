package surajbab.evaluator;

public class Eval_operations {
    public Integer[] getNumbers(String numbers) {
        char Operators[] ={'+','-','*','/','^'};
        for (char operator : Operators)
            numbers =numbers.replace(operator,' ');

        String numbersInString[] = numbers.split(" ");
        Integer[] Numbers=new Integer[numbersInString.length];

        for (int i = 0; i < numbersInString.length; i++)
            Numbers[i]=Integer.parseInt(numbersInString[i]);

        return Numbers;
    }
}
