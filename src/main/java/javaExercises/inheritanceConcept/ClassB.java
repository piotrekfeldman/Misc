package javaExercises.inheritanceConcept;

public class ClassB extends ClassA {


  //  public ClassB(){
       // super();
  //  }

 //   public ClassB(String name){
      //  System.out.println(name);
  //  }


    public void metodaClassB() {
        System.out.println("To jest metoda z klasy B");

    }

    /*public void metodaClassA() {
      //  super.metodaClassA();
        System.out.println("To jest metoda z klasy A ale skopiowana");
    }*/


        public static void main(String [] args){
        ClassB b= new ClassB();
      //  b.metodaClassA();
          //  System.out.println(b.name);

        }


    }

