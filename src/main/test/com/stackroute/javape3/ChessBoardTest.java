package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new ChessBoard();
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
        String result=check.chessBoard();

        //assert
        assertEquals("My Chess Board:\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n",result);
    }


}