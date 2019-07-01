package com.stackroute.javape3;

public class CheckConsecutiveNumbers {
    boolean areConsecutive(int []array,int n)
    {
        int min=0,max=0;
        for(int i=0;i<array.length;i++)
        {
            min=array[0];
            if (array[i] < min) {
                min = array[i];
            }
        }

        for(int i=0;i<array.length;i++)
        {
            max=array[0];
            if(array[i] > max)
            {
                max=array[i];
            }
        }
        if (max - min + 1 == n)
        {
            boolean visited[] = new boolean[n];
            int i;
            for (i = 0; i < n; i++)
            {
                /* If we see an element again, then return false */
                if (visited[array[i] - min] != false)
                    return false;

                /* If visited first time, then mark the element as visited */
                visited[array[i] - min] = true;
            }

            /* If all elements occur once, then return true */
            return true;
        }
        return false; // if (max - min  + 1 != n)
    }
}
