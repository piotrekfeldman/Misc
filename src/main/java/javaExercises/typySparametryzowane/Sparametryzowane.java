package javaExercises.typySparametryzowane;

public class Sparametryzowane {

    // Nie musimy się martwić, czy kompilator rozpozna
    // z jakim typem danych pracuje
    //Po to są klasy sparametryzowane.

        public static void main (String [] args) {

           TypS<Integer> ts= new TypS<Integer>(10);
           int x = ts.getObj();
            System.out.println(x);
        }

    }


    class TypS<T> {

        T obj;

        TypS(T obj){
            this.obj = obj;
        }


        void pokazTyp(){

            System.out.println(obj.getClass().getName());
        }

        public T getObj() {
            return obj;
        }
    }

