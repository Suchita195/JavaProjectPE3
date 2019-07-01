package com.stackroute.javape3;

import java.util.Arrays;

public class RemoveVowels {
    public String removeVowels(String[]places)
    {
        String string= Arrays.toString(places);
        string = string.replaceAll("[aeiou]", "");
        System.out.println(string);
        String strArray[] = string.replaceAll("\\[|[]]","").split(", ");
        String result="";
        int len=places.length;
        for(int i=0;i<len;i++)
        {
            result=result+ "Place Name without Vowels:"+ i + " " + strArray[i] + "\n";
        }
        return result;
    }
}
