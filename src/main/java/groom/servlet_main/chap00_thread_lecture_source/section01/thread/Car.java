package groom.servlet_main.chap00_thread_lecture_source.section01.thread;

public class Car extends Thread {

    @Override
    public void run() {
        for(int i=0; i<1000; i++ ){
            System.out.println("Car driving...");

            try{
                /* 스레드를 일시 정지 시키는 메소드 */
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
