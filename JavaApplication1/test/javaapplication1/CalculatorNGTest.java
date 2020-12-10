/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author Matthdub
 */
public class CalculatorNGTest {
    
    public CalculatorNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    @Parameters({"number1" , "number2","expResult"})
    public void testAdd(int number1 , int number2,int expResult) {
        System.out.println("add");
        //int number1 = 5;
        //int number2 = 5;
        //int expResult = 10;
        int result = Calculator.add(number1, number2);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divInt method, of class Calculator.
     */
    @Test(dependsOnMethods={"testAdd"})
    public void testDivInt() {
        System.out.println("divInt");
        int number1 = 10;
        int number2 = 2;
        int expResult = 5;
        int result = Calculator.divInt(number1, number2);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divReal method, of class Calculator.
     */
    @Test(dependsOnMethods={"testAdd","testDivInt"})
    public void testDivReal() {
        System.out.println("divReal");
        int number1 = 15;
        int number2 = 2;
        double expResult = 7.5;
        double result = Calculator.divReal(number1, number2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
