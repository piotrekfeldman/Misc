package javaExercises.kolekcje;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetInterfejs {
    public static void main(String [] args)
    {
        Set<String>setStr=new HashSet<>();
        setStr.add("Jeden");
        setStr.add("Dwa");
        setStr.add("Trzy");
        setStr.add("Jeden");

        for(String t:setStr)
        {
            System.out.println(setStr);
        }

    }
}
