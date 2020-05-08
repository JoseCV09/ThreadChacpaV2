package app.Ejercicio7;

public class principal {
    public static void main(String[] args) throws Exception {
        par pares = new par();
        pares.start();
        Thread.sleep(2000);
        impar impares = new impar();
        impares.start();
    }

}