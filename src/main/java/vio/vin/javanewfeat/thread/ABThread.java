package vio.vin.javanewfeat.thread;

class Printer implements Runnable {
    private static final int MAX_COUNT = 100;
    private static volatile int count = 0;
    private final String message;

    public Printer(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (count < MAX_COUNT) {
            synchronized (Printer.class) {
                if ((count % 2 == 0 && message.equals("A")) || (count % 2 != 0 && message.equals("B"))) {
                    System.out.println(message);
                    count++;

                    Printer.class.notifyAll();

                    if (count < MAX_COUNT) {
                        try {
                            Printer.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    try {
                        Printer.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class ABThread {
    public static void main(String[] args) {
        Printer printerA = new Printer("A");
        Printer printerB = new Printer("B");

        Thread threadA = new Thread(printerA);
        Thread threadB = new Thread(printerB);

        threadA.start();
        threadB.start();
    }
}

