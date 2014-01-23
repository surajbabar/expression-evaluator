package surajbab.evaluator;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class Eval_operationsTest {
    Eval_operations operations = new Eval_operations();

    @Test
    public void testGetNumbersGivesOnlyNumbersFromString() throws Exception {
        Double[] expected = {22.00, 43.00, 23.00, 12.00};
        assertArrayEquals(expected, operations.getNumbers("22 43 23 12"));

    }

    @Test
    public void testGetOperatorsGivesOnlyOperatorsFromString() throws Exception {
        Character[] expected={'+', '-', '*', '^', '+'};
        Character[] actual=operations.getOperators("a+c-d*a^p+");
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testCalculateGivesResultOfTwoNumbersAndPlus() throws Exception {
        double actual=operations.calculate(34.43,'+',43.34);
        assertEquals(77.77000000000001, actual);
    }

    @Test
    public void testCalculateGivesResultOfTwoNumbersAndMinus() throws Exception {
        double actual=operations.calculate(34.43,'-',43.34);
        assertEquals(-8.910000000000004, actual);
    }

    @Test
    public void testCalculateGivesResultOfTwoNumbersAndMultiplication() throws Exception {
        double actual=operations.calculate(34.43,'*',43.34);
        assertEquals(1492.1962, actual);
    }

    @Test
    public void testCalculateGivesResultOfTwoNumbersAndDivision() throws Exception {
        double actual=operations.calculate(34.43,'/',43.34);
        assertEquals(0.7944162436548222, actual);
    }
    @Test
    public void testCalculateGivesResultOfTwoNumbersAndPower() throws Exception {
        double actual=operations.calculate(4.43,'^',3.34);
        assertEquals(144.20769845222625, actual);
    }
    @Test
    public void testCalculateGivesZeroOfTwoNumbersAndInvalidOperator() throws Exception {
        double actual=operations.calculate(4.43,'%',3.34);
        assertEquals(0.0, actual);
    }
}
