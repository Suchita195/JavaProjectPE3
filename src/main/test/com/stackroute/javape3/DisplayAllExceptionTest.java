package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayAllExceptionTest {
    DisplayAllException check;
    @Before
    public void setUp(){
        System.out.println("Before run");
        check=new DisplayAllException();
    }

    @After
    public void tearDown()
    {
        System.out.println("After tear");
        check=null;
    }

    @Test
    public void givenInput1ShouldReturnSuccessMessage(){
        //arrange
        try {

            //act
            String result = check.displayNegativeArrayException();

            //assert
            assertEquals( "Can't create an array of negative size", result);
        } catch(Exception err) {
            System.out.println((err));
        }
    }

    @Test
    public void givenInput2ShouldReturnSuccessMessage(){
        //arrange
        try {

            //act
            String result = check.displayArrayIndexOutofBoundException();

            //assert
            assertEquals( "Array Index Out Of Bounds Exception", result);
        } catch(Exception err) {
            System.out.println((err));
        }
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange
        try {

            //act
            String result = check.displayNullPointerException();

            //assert
            assertEquals( "Null Pointer Exception", result);
        } catch(Exception err) {
            System.out.println((err));
        }
    }

}