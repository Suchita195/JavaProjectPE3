package com.stackroute.javape3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstAndLastDayOfWeek {
    public String firstAndLastDayOfWeek()
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);


        Date objDate = new Date(); // Current System Date and time is assigned to objDate
        SimpleDateFormat objSDF = new SimpleDateFormat("EEE dd/MM/YY"); //Date format string is passed as an argument to the Date format object
        String first=  "First Day Of Week:" + objSDF.format(c.getTime()); //Date formatting is applied to the current date
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }

        String last=  "Last Day Of Week :" + objSDF.format(c.getTime());

        return  first + "\n" + last;
    }

}
