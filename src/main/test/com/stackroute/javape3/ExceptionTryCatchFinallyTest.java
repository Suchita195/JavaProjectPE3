package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTryCatchFinallyTest {
    ExceptionTryCatchFinally check;

    @Before
    public void setUp() {
        check = new ExceptionTryCatchFinally();
    }

    @After
    public void tearDown() {
        check = null;
    }

    @Test
    public void givenInput1ShouldReturnSuccessMessage() {
        //arrange
        try {

            //act
            String result = check.exceptionTryCatchFinally();

            //assert
            assertEquals("Done with this question\n", result);
        } catch (Exception err) {
            System.out.println((err));
        }

    }
}