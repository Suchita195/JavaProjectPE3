package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard check;
    @Before
    public void setUp(){
        check=new ChessBoard();
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