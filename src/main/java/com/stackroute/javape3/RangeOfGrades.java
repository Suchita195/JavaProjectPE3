package com.stackroute.javape3;

public class RangeOfGrades {
    public String rangeOfGrades(int numOfStudents, int[] stuGrades) {
        String output = "";
        for (int index = 0; index < stuGrades.length; index++) {
            //checking if the value is in range
            if (stuGrades[index] > 0 && stuGrades[index] < 100) {
                output = "value is in range";
            }
            else {
                output = "value is out of range";
                return output;
            }
        }
        return output;
    }
}
