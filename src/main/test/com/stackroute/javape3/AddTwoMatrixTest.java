package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoMatrixTest {

    AddTwoMatrix check;
    @Before
    public void setUp(){
        check=new AddTwoMatrix();
    }

    @After
    public void tearDown()
    {
        check=null;
    }

    @Test
    public void givenInputShouldReturnSuccessMessage(){
        //arrange
        try {

            //act
            String result = check.addTwoMatrix(3,2,new int [][]{{1,2},{3,4},{5,6}},new int [][]{{9,8},{7,6},{5,4}});

           //assert
            assertEquals( "No of rows input:3\n" +
                    "No of columns input:2\n" +
                    "Input elements of first matrix:[[1, 2], [3, 4], [5, 6]]\n" +
                    "Input elements of second matrix:[[9, 8], [7, 6], [5, 4]]\n" +
                    "Sum of matrices:\n" +
                    "10 10 \n" +
                    "10 10 \n" +
                    "10 10 \n", result);
        } catch(Exception err) {
            System.out.println((err));
        }
    }

    @Test
    public void givenInput2ShouldReturnSuccessMessage(){
        //arrange
        try {

            //act
            String result = check.addTwoMatrix(2,2,new int [][]{{10,22},{33,14}},new int [][]{{19,28},{17,16}});

            //assert
            assertEquals( "No of rows input:2\n" +
                    "No of columns input:2\n" +
                    "Input elements of first matrix:[[10, 22], [33, 14]]\n" +
                    "Input elements of second matrix:[[19, 28], [17, 16]]\n" +
                    "Sum of matrices:\n" +
                    "29 50 \n" +
                    "50 30 \n", result);
        } catch(Exception err) {
            System.out.println((err));
        }
    }

}