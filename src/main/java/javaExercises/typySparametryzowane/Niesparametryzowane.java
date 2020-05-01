package javaExercises.typySparametryzowane;

public class Niesparametryzowane {

    public static void main (String [] args) {
        TypN tn = new TypN(new String("Typ obiekt"));
        TypN tn1 = new TypN(new Double(22.5490));

        tn.pokazTyp();
        String str = (String) tn.getObj();   //(String) << rzutowanie
        Double dd = (Double) tn1.getObj();
        System.out.println(str + dd);
    }

}


class TypN {

    Object obj;

    public TypN(Object obj) {
        this.obj = obj;
    }

    void pokazTyp(){

        System.out.println(obj.getClass().getName());
    }

    public Object getObj() {
        return obj;
    }
}