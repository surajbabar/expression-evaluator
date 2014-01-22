package surajbab.evaluator;

public class Exp_evaluator {
    public Double evaluate(String Exp){
        Exp=Exp.replaceAll(" +", "");
         double result=1;
        Integer Numbers[] =getNumbers(Exp);
        if(Numbers.length ==1)
            return Double.valueOf(Numbers[0]);
        if(Exp.contains("+")) {
            result =Numbers[0]+Numbers[1];
        }
        if(Exp.contains("-")) {
            result =Numbers[0]-Numbers[1];
        }
        if(Exp.contains("*")) {
            result =Numbers[0]*Numbers[1];
        }
        if(Exp.contains("/")) {
            result =Numbers[0]/Numbers[1];
        }
        if(Exp.contains("^")) {
               result =Math.pow(Numbers[0],Numbers[1]);
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
