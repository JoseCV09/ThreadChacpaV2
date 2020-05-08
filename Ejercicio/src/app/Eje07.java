package app;

public class Eje07 extends Thread {

    public void run() {
        int n;
        int n2;
        int contador = 0;
        int contador2 = 0;
        int impar = 0;
        do {
            for (n = 1; n <= 15; n++) {
                if (n % 2 == 0) {
                    System.out.print(" " + n + "\n");
                    contador = contador + n;
                }
            }

        } while (n <= 15);
        System.out.print("La suma de los pares es : " + contador + "\n");
        System.out.print("\n");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        do {
            for (n2 = 1; n2 <= 15; n2++) {
                impar = n2 % 2;
                if (impar != 0) {
                    contador2 = contador2 + n2;
                    System.out.println(" " + n2);
                }
            }

        } while (n2 <= 15);

        System.out.print("La suma de los impares es : " + contador2 + "\n");

    }

    public static void main(String[] args) throws Exception {
        Eje07 ejer7 = new Eje07();
        ejer7.start();
    }

}