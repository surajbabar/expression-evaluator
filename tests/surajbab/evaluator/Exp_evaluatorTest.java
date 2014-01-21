package surajbab.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Exp_evaluatorTest {
    @Test
    public void testEvaluateForTwoPositiveIntegersAndPlus() throws Exception {
        Exp_evaluator expEval = new Exp_evaluator();
        assertEquals(1,expEval.evaluate("0   +1"));
    }
    @Test
    public void testEvaluateForTwoPositiveIntegersAndMinus() throws Exception {
        Exp_evaluator expEval = new Exp_evaluator();
        assertEquals(0,expEval.evaluate("1   -1"));
    }
    @Test
    public void testEvaluateForTwoPositiveIntegersAndDivide() throws Exception {
        Exp_evaluator expEval = new Exp_evaluator();
        assertEquals(1,expEval.evaluate("1   /1"));
    }
    @Test
    public void testEvaluateForTwoPositiveIntegersAndMultiplication() throws Exception {
        Exp_evaluator expEval = new Exp_evaluator();
        assertEquals(1,expEval.evaluate("1   *1"));
    }
    @Test
    public void testEvaluateForTwoPositiveIntegersAndPower() throws Exception {
        Exp_evaluator expEval = new Exp_evaluator();
        assertEquals(0,expEval.evaluate("1   ^1"));
    }
}
