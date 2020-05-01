package javaExercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args)
    {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");

        Calendar cal=  Calendar.getInstance();
        sdf.format(cal.getTime());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(d.toString());
    }
}
