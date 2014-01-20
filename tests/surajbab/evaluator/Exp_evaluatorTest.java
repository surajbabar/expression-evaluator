package surajbab.evaluator;

import org.junit.Test;

public class Exp_evaluatorTest {
    @Test
    public void testEvaluate() throws Exception {
        Exp_evaluator expEval = new Exp_evaluator();
        assert(1==expEval.evaluate("0+1"));
    }
}
