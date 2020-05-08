package app;

public class Ejercicio2 extends Thread {

    public static void main(String[] args) throws Exception {
        for(int i=0;i<=25;i++){
            System.out.println(i);
            Thread.sleep(200);
        }
    }
    
}