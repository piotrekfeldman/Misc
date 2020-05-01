package javaExercises.nowyPakiet;

public class NowaKlasa {
    public static void main (String [] args)
    {
        String[] tab = null;
        String str="Piotrek,to,fajny,gość";
        String str2=str.replace(",","  ");
        System.out.println(str2);
        System.out.println(str);
        tab =str.split(",");

        for(int i= 0; i<tab.length; i++)
        {
            System.out.println(tab[i]);
        }

        String[] tab2= new String[2];
        tab2[0]="Piotrek to";
        tab2[1]="łoś";

        System.out.println("Z pamiętnika nastolatki"+tab2[0]+tab2[1]);
    }
}
