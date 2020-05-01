package javaExercises.liczbyLosowe;

import java.util.Random;

public class Losowe {

    public static void main(String[] arg)
    {

        Random r=new Random();

        int a=r.nextInt();
        System.out.println(a);

        int b= r.nextInt(4);
        System.out.println("od zera: "+b);

        int c=r.nextInt(10) + 1;
        System.out.println(c);

        float e=r.nextFloat();
        System.out.println(e);

        double f=r.nextDouble();
        System.out.println(f);

        boolean g= r.nextBoolean();
        System.out.println(g);

    }
}
