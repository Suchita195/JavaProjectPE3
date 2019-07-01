package com.stackroute.javape3;

import java.util.Arrays;

public class AddTwoMatrix {
    public String addTwoMatrix(int row, int column,int[][]first,int[][]second)
    {
        int sum[][]=new int[row][column];
        String result="";
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result =result+ sum[i][j]+" ";
            }
            result=result+"\n";
        }
        return "No of rows input:" + row + "\n" + "No of columns input:" + column + "\n" +"Input elements of first matrix:" + Arrays.deepToString(first) + "\n" +
                "Input elements of second matrix:" + Arrays.deepToString(second) + "\n" + "Sum of matrices:" + "\n" + result;
    }
}
