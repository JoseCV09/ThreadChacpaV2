package app.Ejercicio7;

public class impar extends Thread {
    public void run() {
        int impar = 0;
        int cont = 0;
        for (int i = 1; i <= 15; i++) {
            impar = i % 2;
            if (impar != 0) {
                cont = cont + i;
                System.out.println(" " + i);
            }
        }
        System.out.print("Resultado de Impares: " + cont + "\n");
    }
}