package surajbab.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Exp_evaluatorTest {
    @Test
    public void testEvaluate() throws Exception {
        Exp_evaluator expEval = new Exp_evaluator();
        assertEquals(1,expEval.evaluate("0+1"));
    }
}
