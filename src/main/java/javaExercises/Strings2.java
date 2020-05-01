package javaExercises;

import java.util.ArrayList;

public class Strings2 {

    public static void main(String[]args)
    {
        String ab=new String("Piotrek");
        System.out.println(ab.charAt(2));

        String bc=new String("");


        for(int i=ab.length()-1;i>=0 ;i--)
        {
            bc=bc+ab.charAt(i);
        }

        System.out.println(bc);
    }
}
