package com.stackroute.javape3;

public class ExceptionTryCatchFinally {
    public String exceptionTryCatchFinally() {
        //try block
        try {
            throw new Exception("Exception found\n");
        }
        //catch block
        catch (Exception err) {
            System.out.print(err.getMessage());
        }
        //finally block
        finally {
            return "Done with this question\n";
        }

    }
}
