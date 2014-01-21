package surajbab.evaluator;

public class Exp_evaluator {
    public int evaluate(String Exp){
        int result=0;
       Exp=Exp.replaceAll(" +", "");
        char Operators[] ={'+','-','*','/','^'};
        String numbers =Exp;
        for (char operator : Operators)
          numbers =numbers.replace(operator,' ');
        String Numbers[] = numbers.split(" ");
        if(Exp.charAt(1)=='+')
            result =Integer.parseInt(Numbers[0])+Integer.parseInt(Numbers[1]);
        if(Exp.charAt(1)=='-')
            result =Integer.parseInt(Numbers[0])-Integer.parseInt(Numbers[1]);
        if(Exp.charAt(1)=='*')
            result =Integer.parseInt(Numbers[0])*Integer.parseInt(Numbers[1]);
        if(Exp.charAt(1)=='/')
            result =Integer.parseInt(Numbers[0])/Integer.parseInt(Numbers[1]);
        if(Exp.charAt(1)=='^')
            result =Integer.parseInt(Numbers[0])^Integer.parseInt(Numbers[1]);
        return result;
    }
}
