package groom.servlet_main.chap00_thread_lecture_source.section01.thread;

public class Plane implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Plane Flight...");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
