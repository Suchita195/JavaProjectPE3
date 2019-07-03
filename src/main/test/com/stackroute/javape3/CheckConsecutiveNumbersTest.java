package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckConsecutiveNumbersTest {

    CheckConsecutiveNumbers check;
    @Before
    public void setUp(){
        check=new CheckConsecutiveNumbers();
    }
    @After
    public void tearDown()
    {
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){

    }
    @AfterClass
    public static void tearDownAfterClass()
    {

    }
    @Test
    public void givenInput1ShouldReturnSuccessMessage(){
        //arrange


        //act
        boolean result=check.areConsecutive(new int[]{9,8,7,6,5,4,3},7);

        //assert
        assertEquals(true,result);
    }


    @Test
    public void givenInput2ShouldReturnSuccessMessage(){
        //arrange

        //act
        boolean result=check.areConsecutive( new int[]{95,96,97,98,99,100,101},7);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenInput4ShouldReturnErrorMessage(){
        //arrange

        //act
        boolean result=check.areConsecutive(new int[]{78,76,145,89,76,88,65},7);

        //assert
        assertEquals(false,result);
    }




}