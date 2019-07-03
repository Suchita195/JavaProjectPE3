package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest {
    FirstAndLastDayOfWeek check;
    @Before
    public void setUp(){
        check=new FirstAndLastDayOfWeek();
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
            String result = check.firstAndLastDayOfWeek();

            //assert
            assertEquals("First Day Of Week:Mon 01/07/19\n" +
                    "Last Day Of Week :Sun 07/07/19", result);
        } catch(Exception err) {
            System.out.println((err));
        }
    }

}