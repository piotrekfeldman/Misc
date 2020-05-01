package javaExercises.WarunekIfInaczej;

public class Inaczej {

    public static void main (String[] arg){

        Inaczej in = new  Inaczej();

        int x = 1;

        if(x < 5)
            System.out.println("x < 5");
        else
            System.out.println("x > 5");


        String st = (x < 5) ? "x < 5" : "x > 5";

        System.out.println(st);

        String st2 = (x < 5) ? in.m1() : in.m2();

        System.out.println(st2);

        System.out.println("++++++++++++++++++++");
        String st3 = in.m3((x < 5) ? "x < 5" : "x > 5");
        System.out.println(st3);

        System.out.println(in.m4(6));

    }

    public String m1(){
        return "x < 5";
    }

    public String m2(){
        return "x > 5";
    }

    public String m3(String mt){
        return mt;
    }

    public String m4(int x){
        return (x < 5) ? "x < 5" : "x > 5";
    }
}
