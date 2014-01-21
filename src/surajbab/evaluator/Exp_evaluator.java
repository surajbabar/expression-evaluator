package surajbab.evaluator;

public class Exp_evaluator {
    public int evaluate(String Exp){
        Exp=Exp.replaceAll(" +", "");
        int result=0;
        Integer Numbers[] =getNumbers(Exp);

        if(Exp.charAt(1)=='+') {
            result =Numbers[0]+Numbers[1];
        }
        if(Exp.charAt(1)=='-') {
            result =Numbers[0]-Numbers[1];
        }
        if(Exp.charAt(1)=='*') {
            result =Numbers[0]*Numbers[1];
        }
        if(Exp.charAt(1)=='/') {
            result =Numbers[0]/Numbers[1];
        }
        if(Exp.charAt(1)=='^') {
            result =Numbers[0]^Numbers[1];
        }
        return result;
    }

    private Integer[] getNumbers(String numbers) {
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
