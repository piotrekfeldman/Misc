package javaExercises;

import java.util.ArrayList;

public class Strings {

    public static void main(String[] args)
    {

        String s="Marta Hara";
        System.out.println(s.length());

        String t="";
       ArrayList<String> ar=new ArrayList<>();

        for(int i=s.length()-1; i>=0;i--)
        {
            t= t+ s.charAt(i);
        }

        if(s!=t){
            System.out.println("yes");
        }

        System.out.println(t);

    }
}
