package com.stackroute.javape3;

public class DisplayAllException {
    String msg = " ";
    public String displayNegativeArrayException() {
        try {
            int arrSize = -8;
            int[] myArray = new int[arrSize];
        } catch (NegativeArraySizeException err) {
            msg = "Can't create an array of negative size";
        }
        return msg;
    }
         public String displayArrayIndexOutofBoundException() {
             try {
                 int a[] = new int[5];
                 a[10] = 50; //ArrayIndexOutOfBoundsException
             } catch (ArrayIndexOutOfBoundsException err) {
                 msg = "Array Index Out Of Bounds Exception";
         }
             return msg;
         }

            public String displayNullPointerException() {
                try {

                    String s = null;//NullPointerException
                    System.out.println("Length :"+s.length());
                } catch (NullPointerException e) {
                    msg="Null Pointer Exception";
                }
                return msg;
            }
}