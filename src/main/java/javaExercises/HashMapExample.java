package javaExercises;

import java.util.*;

public class HashMapExample {

    public static void main(String [ ]args){

        HashMap<Integer,String> hsm=new HashMap<>();


        hsm.put(1,"Piotr");
        hsm.put(2,"Marta");
        hsm.put(3,"Marta");

        Set sn=hsm.entrySet();
        Iterator it=sn.iterator();

        while(it.hasNext()){

            Map.Entry mp=(Map.Entry)it.next();
            System.out.println(mp.getValue());


        }

        Hashtable<Integer, String> ht=new Hashtable<>();
        ht.put(1,"Lotr");
        ht.put(2,"Swir");
        Set st=ht.entrySet();
        Iterator ts=st.iterator();

        while(ts.hasNext()){

            Map.Entry me=(Map.Entry)ts.next();
            System.out.println("HashTablePrint "+me.getValue());
        }

    }
}
