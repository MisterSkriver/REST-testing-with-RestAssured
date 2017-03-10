/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hannibal
 */
public class CalculatorTest {
    
    Calculator c = new Calculator();
    
    public CalculatorTest() {
    }

    @Test
    public void testAddMethod() {
     
        assertTrue("Expected result 2: " ,c.add(1, 1) == 2);
        
    }
    @Test
    public void testSubethod() {
       
        assertTrue("Expected result 1: " ,c.sub(2, 1) == 1);
        
    }
    @Test
    public void testMulMethod() {
        
        assertTrue("Expected result 9: " ,c.mul(3, 3) == 9);
        
    }
    @Test
    public void testDivMethod() {
        assertTrue("Expected result 3: " ,c.div(9, 3) == 3);
    }
//    @Test
//    public void testDivByZero() {
//        assertTrue("Expected result 0: " ,c.div(9, 0) == 0);
//    }
}
