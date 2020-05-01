package javaExercises;

import java.util.HashSet;

public class HashExample
{

    public static void main(String[] args){

        HashSet<String> hs= new HashSet<String>();
        hs.add("Piotr");
        hs.add("Marta");
        hs.add("Piotr");

        System.out.println(hs.size());

        for(String s: hs)
        {
            System.out.println(hs);
        }


    }
}
