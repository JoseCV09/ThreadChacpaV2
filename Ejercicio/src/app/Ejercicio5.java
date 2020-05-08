package app;

import java.util.*;

public class Ejercicio5 extends Thread {
    Scanner dato = new Scanner(System.in);

    public void run() {
        int n;
        int promedio = 0, nota = 1;
        int contador = 0;

        while (nota <= 5) {
            System.out.println(" ");
            System.out.print("Ingresar Nota " + nota + ": ");
            n = dato.nextInt();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }       
            contador = contador + n;
            promedio = contador / nota;
            nota++;        
        }
        System.out.println(" ");
        System.out.print("El promedio es : " + promedio);
    }

    public static void main(String[] args) {
        Ejercicio5 ejercicio = new Ejercicio5();
        ejercicio.start();
    }
}