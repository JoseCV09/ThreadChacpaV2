package app;

import java.util.Scanner;

public class Ejercicio1 extends Thread {
    Scanner teclado = new Scanner(System.in);
    String nombre, dia;
    int hora;

    public Ejercicio1() {
        System.out.print("Ingresar nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingresa dia: ");
        dia = teclado.nextLine();
        System.out.print("Ingresa hora: " );
        hora = teclado.nextInt();
        System.out.print('\n');
    }

    public void run() {
        if (hora > 13) {
            try {
                Thread.sleep(500);
                System.out.print("Llegó tarde: " + nombre);
                Thread.sleep(500);
                System.out.print('\n');
                System.out.print("A las: " + hora );
                System.out.println('\n');
            } catch (Exception e) {
            }

        } else {
            try {
                Thread.sleep(500);
                System.out.print("Llegó temprano: " + nombre);
                Thread.sleep(500);
                System.out.println('\n');
                System.out.print("A las: " + hora );
                System.out.println('\n');
            } catch (Exception e) {
            }

        }
    }

    public static void main(String[] args) throws Exception {
        Ejercicio1 alum1 = new Ejercicio1();
        alum1.start();
        Thread.sleep(2000);
        Ejercicio1 alum2 = new Ejercicio1();
        alum2.start();
    }
}