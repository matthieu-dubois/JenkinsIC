/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthdub
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int number1 = 5;
        int number2 = 5;
        int expResult = 10;
        int result = Calculator.add(number1, number2);
        assertEquals("error in add()", expResult, result);
        //assertEquals("error in add()", -5, Calculator.add(5, 0));
        //assertNotEquals("error in add()", 0, Calculator.add(1, 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divInt method, of class Calculator.
     */
     @Test(expected = IllegalArgumentException.class)
    public void testDivInt() {
        System.out.println("divInt");
        int number1 = 15;
        int number2 = 0;
        int expResult = 5;
        int result = Calculator.divInt(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divReal method, of class Calculator.
     */
    @Test
    public void testDivReal() {
        System.out.println("divReal");
        int number1 = 5;
        int number2 = 2;
        double expResult = 2.5;
        double result = Calculator.divReal(number1, number2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
}
