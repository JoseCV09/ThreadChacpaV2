package app;

public class Ejercicio3 extends Thread {
    
    String corredor;
    
    public Ejercicio3(String corredor) {
        this.corredor = corredor;
    }

    public void run() {
        for (int metros = 1; metros <= 50; metros++) {
            System.out.print(metros +" ");
            yield();
        }
        System.out.println("\n Ya llego: " + corredor);
    }

    static Ejercicio3 corredor1;
    static Ejercicio3 corredor2;
    static Ejercicio3 corredor3;

    public static void main(String[] args) throws Exception {
        corredor1 = new Ejercicio3(" JOSE ");
        corredor2 = new Ejercicio3(" MANUEL ");
        corredor3 = new Ejercicio3(" SEBASTIAN ");
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor1.join();
        corredor2.join();
        corredor3.join();
    }
}
