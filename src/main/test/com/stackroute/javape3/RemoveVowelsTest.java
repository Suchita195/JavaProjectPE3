package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels check;

    @Before
    public void setUp() {
        check = new RemoveVowels();
    }

    @After
    public void tearDown() {
        check = null;
    }

    @Test
    public void givenInput1ShouldReturnSuccessMessage() {
        //arrange

        //act
        String result = check.removeVowels(new String[]{"India", "Egypt", "Gemany"});

        //assert
        assertEquals("Place Name without Vowels:0 Ind\n" +
                "Place Name without Vowels:1 Egypt\n" +
                "Place Name without Vowels:2 Gmny\n", result);
    }

    @Test
    public void givenInput2ShouldReturnSuccessMessage() {
        //arrange

        //act
        String result = check.removeVowels(new String[]{"abcd", "boat", "tyre","juice","right"});

        //assert
        assertEquals("Place Name without Vowels:0 bcd\n" +
                "Place Name without Vowels:1 bt\n" +
                "Place Name without Vowels:2 tyr\n" +
                "Place Name without Vowels:3 jc\n" +
                "Place Name without Vowels:4 rght\n", result);
    }


}