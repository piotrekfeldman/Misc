package javaExercises.wątki;

class NowyWatek implements Runnable {

    private String name;
    Thread t;

    NowyWatek(String name) {
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {

        try {
            System.out.println("Wątek potomny " + name + " uśpiony");
            Thread.sleep(2000);
            System.out.println("Wątek potomny " + name + " wznowiony");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakończono działanie wątku potomnego "+ name);
    }
}

      public class Main{
        public static void main(String[] args)
        {

            NowyWatek nw1= new NowyWatek("JEDEN");
            NowyWatek nw2= new NowyWatek("DWA");
            NowyWatek nw3= new NowyWatek("TRZY");
            NowyWatek nw4= new NowyWatek("CZTERY");

            System.out.println("WĄTEK "+nw1.t.getName()+ " " + nw1.t.isAlive());
            System.out.println("WĄTEK "+nw2.t.getName()+ " " + nw2.t.isAlive());
            System.out.println("WĄTEK "+nw3.t.getName()+ " " + nw3.t.isAlive());
            System.out.println("WĄTEK "+nw4.t.getName()+ " " + nw4.t.isAlive());



            try {
              //  System.out.println("Wątek główny uśpiony");
              //  Thread.sleep(6000);
              //  System.out.println("Wątek główny wznowiony");

                nw1.t.join();
                nw2.t.join();
                nw3.t.join();
                nw4.t.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Przerwano główny wątek");
            }
            System.out.println("Zakończono główny wątek");

        /*    System.out.println("WĄTEK "+nw1.t.getName()+ " " + nw1.t.isAlive());
            System.out.println("WĄTEK "+nw2.t.getName()+ " " + nw2.t.isAlive());
            System.out.println("WĄTEK "+nw3.t.getName()+ " " + nw3.t.isAlive());
            System.out.println("WĄTEK "+nw4.t.getName()+ " " + nw4.t.isAlive());
*/
        }

      }

