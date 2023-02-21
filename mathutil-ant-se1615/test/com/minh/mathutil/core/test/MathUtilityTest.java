package com.minh.mathutil.core.test;

import com.minh.mathutil.main.MathUtility;
import org.junit.Assert;
import org.junit.Test;


public class MathUtilityTest {
    //
    //
    //
    //
    ///
    //
    //
    //
    //
    
    
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-5);
    }
    
    
    
    //
    //
    //
    @Test
    
    public void testFactorialGivenRightArgumentReturnsWell(){
        //
        //
        //
        int n=0;
        long expected=1;    //
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected,actual);
        //
        //
        
        //Test case #2:
        //
        //
        n=1;
        expected=1;
        actual=MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //Test case #3: test getF() with n-2;
        //Expected 2!=2; check if 2! return 2
                Assert.assertEquals(120, MathUtility.getFactorial(n=5));

    }
    
    
     @Test
    public void testRedGreen(){
        Assert.assertEquals(69, 69);
    }

    
}
