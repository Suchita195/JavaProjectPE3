package com.stackroute.javape3;

public class ExceptionTryCatchFinally {
    public String exceptionTryCatchFinally() {
        try {
            throw new Exception("Exception found\n");
        } catch (Exception err) {
            System.out.print(err.getMessage());
        } finally {
            return "Done with this question\n";
        }

    }
}
