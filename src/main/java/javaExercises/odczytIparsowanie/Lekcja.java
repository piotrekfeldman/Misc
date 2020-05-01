package javaExercises.odczytIparsowanie;

import java.util.Scanner;

public class Lekcja {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        int x;
        System.out.println("Wpisz coś :");
        //x=sc.nextInt();

        try {
            str = sc.nextLine();
            int o = Integer.parseInt(str);
            System.out.print("Wpisałeś: " + o);
        }
        catch (Exception e)
        {
            System.out.println("wpisz liczbę ponownie");
            main(null);
        }
    }
}
