package app;

import java.util.Scanner;

public class Ejercicio4 extends Thread {
    Scanner teclado = new Scanner(System.in);
    String estacion;

    public void run() {
        System.out.print("Ingrese el nombre de la estacion: ");
        estacion = teclado.nextLine();
        if (estacion.equals("Primavera")) {
            try {
                Thread.sleep(70);
                System.out.print("Setiembre - ");
                Thread.sleep(70);
                System.out.print("Octubre - ");
                Thread.sleep(70);
                System.out.print("Noviembre");
            } catch (Exception e) {
            }

        } else if (estacion.equals("Otonio")) {
            try {
                Thread.sleep(70);
                System.out.print("Marzo - ");
                Thread.sleep(70);
                System.out.print("Abril - ");
                Thread.sleep(70);
                System.out.print("Mayo");
            } catch (Exception e) {
            }
        } else if (estacion.equals("Verano")) {
            try {
                Thread.sleep(70);
                System.out.print("Diciembre - ");
                Thread.sleep(70);
                System.out.print("Enero - ");
                Thread.sleep(70);
                System.out.print("Febrero");
            } catch (Exception e) {
            }

        } else if (estacion.equals("Invierno")) {
            try {
                Thread.sleep(70);
                System.out.print("Junio - ");
                Thread.sleep(70);
                System.out.print("Julio - ");
                Thread.sleep(70);
                System.out.print("Agosto");
            } catch (Exception e) {
            }
        }
    }

    public static void main(String args[]) {
        Ejercicio4 estacion = new Ejercicio4();
        estacion.start();
    }
}