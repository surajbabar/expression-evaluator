package surajbab.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Exp_evaluatorTest {
    Exp_evaluator expression = new Exp_evaluator();

    @Test
    public void testEvaluateForTwoPositiveIntegersAndPlus() throws Exception {
        assertEquals(1, expression.evaluate("0   +1"));
    }

    @Test
    public void testEvaluateForTwoPositiveIntegersAndMinus() throws Exception {
        assertEquals(0, expression.evaluate("1   -1"));
    }

    @Test
    public void testEvaluateForTwoPositiveIntegersAndDivide() throws Exception {
        assertEquals(1, expression.evaluate("1   /1"));
    }

    @Test
    public void testEvaluateForTwoPositiveIntegersAndMultiplication() throws Exception {
        assertEquals(1, expression.evaluate("1   *1"));
    }

    @Test
    public void testEvaluateForTwoPositiveIntegersAndPower() throws Exception {
        assertEquals(0, expression.evaluate("1   ^1"));
    }
}
