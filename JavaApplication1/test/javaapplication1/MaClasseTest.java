/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Matthdub
 */
@RunWith(Parameterized.class)
public class MaClasseTest {
    
    private int numberA;
    private int numberB;
    private int expResult;
    
    @Parameters
    
    public static Iterable<Object[]> data() {
        System.out.println("Run @Parameters");
        return Arrays.asList(new Object[][] {
            {1,1,1},
            {2,2,4},
            {5,5,25}
        });
    }
    
        
    public MaClasseTest (int numberA , int numberB, int expResult) {
    System.out.println("Run constructor");
    this.numberA = numberA;
    this.numberB = numberB;
    this.expResult = expResult;
      } 
    
    @Test
        public void test() {
        System.out.println("résultat:  " +numberA +" * " + numberB + " = " + expResult);
        assertEquals(expResult,Multiplication.multiply(numberA, numberB));
        }

}
 