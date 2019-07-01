package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class RangeOfGradesTest {
    RangeOfGrades check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new RangeOfGrades();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before");

    }
    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("After");

    }
    @Test
    public void givenInput1ShouldReturnSuccessMessage(){
        //arrange


        //act
        String result=check.rangeOfGrades(5,new int[]{45,67,26,78,97});

        //assert
        assertEquals("value is in range",result);
    }

    @Test
    public void givenInput2ShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.rangeOfGrades(4, new int[]{78,76,145,89});

        //assert
        assertEquals("value is out of range",result);
    }

    @Test
    public void givenInput3ShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.rangeOfGrades(4, new int[]{178,76,145,89});

        //assert
        assertEquals("value is out of range",result);
    }

    @Test
    public void givenInput4ShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.rangeOfGrades(4, new int[]{-78,76,145,89});

        //assert
        assertEquals("value is out of range",result);
    }



}