package com.stackroute.javape3;

public class CheckConsecutiveNumbers {
    boolean areConsecutive(int []array,int no_of_elements)
    {
        int min=0,max=0;
        for(int index=0;index<array.length;index++)
        {
            min=array[0];
            if (array[index] < min) {
                min = array[index];
            }
        }

        for(int index=0;index<array.length;index++)
        {
            max=array[0];
            if(array[index] > max)
            {
                max=array[index];
            }
        }
        if (max - min + 1 == no_of_elements)
        {
            boolean visited[] = new boolean[no_of_elements];
            int i;
            for (i = 0; i < no_of_elements; i++)
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
        return false; // if (max - min  + 1 != no_of_elements)
    }
}
