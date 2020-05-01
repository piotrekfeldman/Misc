package javaExercises.wątki;

class Pisz {
    void pisz(String message)
    {
        System.out.print("++ "+ message);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Przerwano wątek");
            e.printStackTrace();
        }
        System.out.println(" ++");

    }
}

class Pisarz implements Runnable {

    String message;
    Pisz p;
    Thread t;

    public Pisarz(Pisz p,String message)  {
        this.message = message;
        this.p = p;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (p) {
            p.pisz(message);
        }
    }

}
    public class Watki {

        public static void main(String[] args) {

            Pisz p = new Pisz();
            Pisarz p1 = new Pisarz(p, "To jest");
            Pisarz p2 = new Pisarz(p, "synchronizacja");
            Pisarz p3 = new Pisarz(p, "wątków");

            try {
                p1.t.join();
                p2.t.join();
                p3.t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("przerwano");
            }

        }
    }


