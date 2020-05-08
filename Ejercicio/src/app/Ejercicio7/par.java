package app.Ejercicio7;

public class par extends Thread {
    public void run() {
        int contador = 0;
        for (int i= 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i + "\n");
                contador = contador + i;
            }
        }
        System.out.print("Resultado de Pares: " + contador + "\n");
        System.out.print("\n");
    }
}