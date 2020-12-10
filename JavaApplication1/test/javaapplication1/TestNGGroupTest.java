/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Matthdub
 */
import org.testng.annotations.*;
public class TestNGGroupTest {
        
    @Test(groups = {"init"})
        public void method1() {
            System.out.println("@Test: method1");
}
        @Test(groups = {"init", "post-init"})
            public void method2() {
                System.out.println("@Test: method2");
    }
        @Test(groups = {"main"})
            public void method3() {
        System.out.println("@Test: method3");
    }

}
