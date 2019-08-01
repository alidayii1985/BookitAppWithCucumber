package com.cybertek.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static void main(String[] args) {
        System.out.println(todaysDate());
    }
    public static String todaysDate(){
        String today= new SimpleDateFormat("MMMM d, yyy").format(new Date());
        return today;

    }
}
