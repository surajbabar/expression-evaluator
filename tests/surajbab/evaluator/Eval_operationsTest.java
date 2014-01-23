package surajbab.evaluator;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class Eval_operationsTest {
    Eval_operations operations = new Eval_operations();

    @Test
    public void testGetNumbers() throws Exception {
        Integer[] expected = {22, 43, 23, 12};
        assertArrayEquals(expected, operations.getNumbers("22 43 23 12"));

    }

    @Test
    public void testGetOperators() throws Exception {
        Character[] expected={'+', '-', '*', '^', '+'};
        Character[] actual=operations.getOperators("a+c-d*a^p+");
        assertArrayEquals(expected, actual);
    }
}
