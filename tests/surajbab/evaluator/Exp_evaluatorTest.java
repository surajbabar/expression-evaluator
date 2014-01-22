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
        assertEquals(3.0, expression.evaluate("22/7"));
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
}
