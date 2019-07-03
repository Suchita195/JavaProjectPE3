package com.stackroute.javape3;

public class DisplayAllException {
    String message = " ";
    public String displayNegativeArrayException() {
        try {
            int arrSize = -8;
            int[] myArray = new int[arrSize];//NegativeArrayException
        } catch (NegativeArraySizeException err) {
            message = "Can't create an array of negative size";
        }
        return message;
    }
         public String displayArrayIndexOutofBoundException() {
             try {
                 int array[] = new int[5];
                 array[10] = 50; //ArrayIndexOutOfBoundsException
             } catch (ArrayIndexOutOfBoundsException err) {
                 message = "Array Index Out Of Bounds Exception";
         }
             return message;
         }

            public String displayNullPointerException() {
                try {

                    String string = null;//NullPointerException
                    System.out.println("Length :"+string.length());
                } catch (NullPointerException e) {
                    message ="Null Pointer Exception";
                }
                return message;
            }
}