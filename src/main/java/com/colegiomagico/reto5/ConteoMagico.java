package com.colegiomagico.reto5;

/**
 * Suma todos los números desde 1 hasta limite usando un ciclo while.
 */
public class ConteoMagico {

    public static int contar(int limite) {
       int numero = 1;
       int suma = 0;

       while (numero <= limite) {
        suma = suma + numero;
        numero++;
       }
       return suma;
    }

    public static void main(String[] args) {
        System.out.println("Conteo hasta 4: " + contar(4));
    }
}
