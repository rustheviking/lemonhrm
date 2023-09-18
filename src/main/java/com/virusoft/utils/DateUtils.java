package com.virusoft.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    // Formatting date to look like this: Sep 21, 2023
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MMM dd, yyyy");

    // From Date Object to String date
    public static String formatDate(Date date){
        return DATE_FORMAT.format(date);
    }

    // From String date to Date Object
    public static Date parseDate(String dateString) throws ParseException {
        return DATE_FORMAT.parse(dateString);
    }


}
