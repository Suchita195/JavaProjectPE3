package com.stackroute.javape3;

public class RangeOfGrades {
    public String rangeOfGrades(int numOfStudents, int[] stuGrades) {
        String output = "";
        for (int i = 0; i < stuGrades.length; i++) {
            if (stuGrades[i] > 0 && stuGrades[i] < 100) {
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
