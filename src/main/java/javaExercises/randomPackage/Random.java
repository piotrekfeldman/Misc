package javaExercises.randomPackage;

public class Random {

    public static void main(String[] args) {


        String t="ROBERTO";
        String []s=t.split("E");
        String one=s[0].substring(0,3);

        System.out.println(one);
        String n="";

        for(int i=t.length()-1;i>=0;i--)
        {
            n=n+t.charAt(i);
        }

        System.out.println(n);
    }

}
