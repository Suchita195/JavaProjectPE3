package com.stackroute.javape3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstAndLastDayOfWeek {
    public String firstAndLastDayOfWeek()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);


        Date objDate = new Date(); // Current System Date and time is assigned to objDate
        SimpleDateFormat objSDF = new SimpleDateFormat("EEE dd/MM/YY"); //Date format string is passed as an argument to the Date format object
        String first=  "First Day Of Week:" + objSDF.format(calendar.getTime()); //Date formatting is applied to the current date
        for (int index = 0; index <6; index++) {
            calendar.add(Calendar.DATE, 1);
        }

        String last=  "Last Day Of Week :" + objSDF.format(calendar.getTime());

        return  first + "\n" + last;
    }

}
