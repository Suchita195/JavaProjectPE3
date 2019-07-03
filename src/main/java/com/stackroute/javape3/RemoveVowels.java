package com.stackroute.javape3;

import java.util.Arrays;

public class RemoveVowels {
    public String removeVowels(String[]places)
    {
        String string= Arrays.toString(places);
        string = string.replaceAll("[aeiou]", "");//replacing the vowels with space
        String strArray[] = string.replaceAll("\\[|[]]","").split(", ");
        String result="";
        int len=places.length;
        //for loop
        for(int i=0;i<len;i++)
        {
            result=result+ "Place Name without Vowels:"+ i + " " + strArray[i] + "\n";
        }
        return result;
    }
}
