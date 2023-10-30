package calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testAdd() {
        
        int result = App.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        
        int result = App.subtract(8, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        
        int result = App.multiply(4, 6);
        assertEquals(24, result);
    }

    @Test
    public void testDivide() {
        
        double result = App.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        
        App.divide(10, 0);
    }
}
