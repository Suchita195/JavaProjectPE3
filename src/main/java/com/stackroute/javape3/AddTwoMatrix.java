package com.stackroute.javape3;

import java.util.Arrays;

public class AddTwoMatrix {
    public String addTwoMatrix(int row, int column,int[][]first,int[][]second)
    {
        int sum[][]=new int[row][column];
        String result="";
        for(int index = 0; index < row; index++) {
            for (int inner_index = 0; inner_index < column; inner_index++) {
                sum[index][inner_index] = first[index][inner_index] + second[index][inner_index];//calculating the sum of both the matrix
            }
        }
        for (int index = 0; index < row; index++) {
            for (int inner_index = 0; inner_index < column; inner_index++) {
                result =result+ sum[index][inner_index]+" ";
            }
            result=result+"\n";
        }
        return "No of rows input:" + row + "\n" + "No of columns input:" + column + "\n" +"Input elements of first matrix:" + Arrays.deepToString(first) + "\n" +
                "Input elements of second matrix:" + Arrays.deepToString(second) + "\n" + "Sum of matrices:" + "\n" + result;
    }
}
