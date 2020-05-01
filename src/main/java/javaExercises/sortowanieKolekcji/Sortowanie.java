package javaExercises.sortowanieKolekcji;

import java.util.*;

public class Sortowanie {

    public static void main (String[] arg)
    {

        List<String> slowa=new ArrayList<>();
        slowa.add("jeden");
        slowa.add("dwa");
        slowa.add("trzy");
        slowa.add("cztery");
        slowa.add("pięć");
        slowa.add("sześć");

        System.out.println(slowa);

        Collections.sort(slowa, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(slowa);
        Collections.sort(slowa);
        System.out.println("2"+"\n"+slowa);
        System.out.println("coś"+"\n"+"coś tam");
    }
}
