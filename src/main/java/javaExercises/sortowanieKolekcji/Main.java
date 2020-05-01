package javaExercises.sortowanieKolekcji;

import java.util.*;

public class Main {
    Map<String, String> slowa = new HashMap<String, String>();

    public static void main(String[] args) {
        Main sv = new Main();
        sv.createMap();
        System.out.println("Sorting values in ascending order:");
        sv.sortByValue(true);
        System.out.println("Sorting values in  descending order");
        sv.sortByValue(false);
    }

    void createMap() {


        slowa.put("one", "jeden");
        slowa.put("two", "dwa");
        slowa.put("three", "trzy");
        slowa.put("four", "cztery");
        slowa.put("five", "pięć");


        for (Map.Entry<String, String> entry : slowa.entrySet()) {
            System.out.println("K: " + entry.getKey() + " V: " + entry.getValue());
        }

        Map<String, String> slowa2 = new TreeMap<>(slowa);
        for (Map.Entry<String, String> entry2 : slowa2.entrySet()) {
            System.out.println("K2: " + entry2.getKey() + " V: " + entry2.getValue());
        }
    }

    void sortByValue(boolean order) {
        List<Map.Entry<String, String>> list = new LinkedList<Map.Entry<String, String>>(slowa.entrySet());
//sorting the list elements
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                if (order) {
//compare two object and return an integer
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });


        Map<String, String> sortedMap = new LinkedHashMap<String, String>();
        for (
                Map.Entry<String, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        printMap(sortedMap);
    }

    //method for printing the elements
    public void printMap(Map<String, String> slowa) {
        System.out.println("Company\t Price ");
        for (Map.Entry<String, String> entry : slowa.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        System.out.println("\n");
    }

}
