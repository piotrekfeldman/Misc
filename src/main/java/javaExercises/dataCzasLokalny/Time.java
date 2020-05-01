package javaExercises.dataCzasLokalny;

import javax.swing.text.DateFormatter;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Time {

    public static void main (String [] args)
    {

        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId strefa1 = ZoneId.of("America/New_York");
        ZoneId strefa2= ZoneId.of("Europe/Warsaw");

        System.out.println(strefa1);
        System.out.println(strefa2);


        LocalTime local1 = LocalTime.now(strefa1);
        LocalTime local2= LocalTime.now(strefa2);
        int difference = local1.compareTo(local2);
        System.out.println("D "+ difference);
        LocalTime czas1=local2.plusHours(2);
        System.out.println("Czas to "+czas1);

        System.out.println(local1);
        System.out.println(local2);

        long roznicaGodziny=ChronoUnit.HOURS.between(local1,local2);
        long roznicaMinut=ChronoUnit.MINUTES.between(local1,local2);

        System.out.println("Różnica godzin między Warszawą a Nowym Jorkiem wynosi : "+roznicaGodziny);
        System.out.println("Różnica minut między Warszawą a Nowym Jorkiem wynosi : "+roznicaMinut);

        DateTimeFormatter formatter= DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.US);
        LocalTime czas= LocalTime.parse("06:35 PM", formatter);
        System.out.println(czas);

        LocalTime zwyklyCzas= LocalTime.of(12,25);
        System.out.println("Zwykły czas "+zwyklyCzas);
    }
}
