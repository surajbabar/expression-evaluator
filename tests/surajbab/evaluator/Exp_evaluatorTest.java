package surajbab.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Exp_evaluatorTest {
    Exp_evaluator expression = new Exp_evaluator();

    @Test
    public void testEvaluateForTwoPositiveIntegersAndPlus() throws Exception {
        assertEquals(1.0, expression.evaluate("0   +1"));
    }

    @Test
    public void testEvaluateForTwoPositiveIntegersAndMinus() throws Exception {
        assertEquals(0.0, expression.evaluate("1   -1"));
    }

    @Test
    public void testEvaluateForTwoPositiveIntegersAndDivide() throws Exception {
        assertEquals(3.14, expression.evaluate("22/7"));
    }

    @Test
    public void testEvaluateForTwoPositiveIntegersAndMultiplication() throws Exception {
        assertEquals(1.0, expression.evaluate("1   *1"));
    }

    @Test
    public void testEvaluateForTwoPositiveIntegersAndPower() throws Exception {
        assertEquals(16.0, expression.evaluate("4   ^2"));
    }
    @Test
    public void testEvaluateForOneInteger() throws Exception {
        assertEquals(2.0, expression.evaluate("2"));
    }
    @Test
    public void testEvaluateForThreeIntegersAndTwoOperators() throws Exception {
        assertEquals(2.0, expression.evaluate("2+3-3"));
    }
    @Test
    public void testEvaluateForFiveIntegersAndFourOperators() throws Exception {
        assertEquals(1.33, expression.evaluate("2+3-3*2/3"));
    }
    @Test
    public void testEvaluateForSevenIntegersAndSixOperators() throws Exception {
        assertEquals(13.33, expression.evaluate("2+3-3*2/3*5*2"));
    }
    //float testing
    @Test
    public void testEvaluateForOneFloat() throws Exception {
        assertEquals(2.98, expression.evaluate("2.98"));
    }
    @Test
    public void testEvaluateForTwoPositiveFloatsAndPlus() throws Exception {
        assertEquals(1.6, expression.evaluate("0.3   +1.3"));
    }

    @Test
    public void testEvaluateForTwoPositiveFloatsAndMinus() throws Exception {
        assertEquals(0.0, expression.evaluate("1.5   -1.5"));
    }

    @Test
    public void testEvaluateForTwoPositiveFloatsAndDivide() throws Exception {
        assertEquals(3.14, expression.evaluate("22.00/7.00"));
    }

    @Test
    public void testEvaluateForTwoPositiveFloatsAndMultiplication() throws Exception {
        assertEquals(2.89, expression.evaluate("1.7   *1.7"));
    }
    @Test
    public void testEvaluateForTwoPositiveFloatsAndPower() throws Exception {
        assertEquals(65.26, expression.evaluate("4.7   ^2.7"));
    }

    @Test
    public void testEvaluateForThreeFloatsAndTwoOperators() throws Exception {
        assertEquals(2.50, expression.evaluate("2.5+3.5-3.5"));
    }

    @Test
    public void testEvaluateForFiveFloatsAndFourOperators() throws Exception {
        assertEquals(1.79, expression.evaluate("2.5+3.5-3.5*2.5/3.5"));
    }
    @Test
    public void testEvaluateForSevenFloatsAndSixOperators() throws Exception {
        assertEquals(24.55, expression.evaluate("2.5+3.5-3.5*2.5/3.5*5.5*2.5"));
    }
    //brackets testing
    @Test
    public void testEvaluateForTwoPositiveIntegersAndPlusWithBracket() throws Exception {
        assertEquals(346.0, expression.evaluate("345+(0   +1)"));
    }
    @Test
    public void testEvaluateForTwoPositiveIntegersWithTwoBracket() throws Exception {
        assertEquals(346.0, expression.evaluate("(345)+(0   +1)"));
    }
    @Test
    public void testEvaluateForTwoPositiveIntegersWithMultipleBrackets() throws Exception {
        assertEquals(346.0, expression.evaluate("((345)+(0   +1))"));
    }
    @Test
    public void testEvaluateForTwoPositiveIntegersWithMultipleBrackets1() throws Exception {
        assertEquals(350.0, expression.evaluate("((345)+5*(0   +1))"));
    }
    @Test
    public void testEvaluateForTwoPositiveIntegersWithMultipleBrackets2() throws Exception {
        assertEquals(376.0, expression.evaluate("((345)+32-(0   +1))"));
    }
    @Test
    public void testEvaluateForAnyNumberWithAnyOperatorAndMultipleBrackets() throws Exception {
        assertEquals(354.34, expression.evaluate("((345.34)+32-(0   +1*23.0))"));
    }


}
