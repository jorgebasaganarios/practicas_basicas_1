/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_string;

import java.util.Random;
import java.util.Scanner;

/**
 * ALUMNO: ###### JORGE CARLOS BASAGAÑA RIOS - 46796341N ######
 */
public class Exer_string {

    private static final Scanner teclado = new Scanner(System.in); // Teclado definido
    private static final Random aleatorio = new Random();

    /**
     * @param args the command line arguments
     */
    public static void string1() {

        /*
            Programa que muestra los campos de un array en función de los
            valores que da el FOR.
         */
        int x;
        int[] nuevoArray = {10, 1, 3, 4, 2, 8, 6, 9, 5, 7};

        for (x = 0; x < 10; x++) {
            System.out.println(nuevoArray[x]);
        }
    }

    public static void string2() {

        /*
            Programa que rellena un array con los valores que proporciona el
            contador del FOR.
         */
        
        int x;
        int[] nuevoArray = new int[10];

        for (x = 0; x < 10; x++) {
            nuevoArray[x] = x;
            System.out.println(nuevoArray[x]);
        }
    }

    public static void string3() {

        int x;
        int consulta;
        int[] nuevoArray = new int[5];

        for (x = 0; x < 5; x++) {
            nuevoArray[x] = teclado.nextInt();
            //System.out.println(nuevoArray[n]);
        }

        System.out.println("Introduce el número de campo del Array: ");
        consulta = teclado.nextInt();
        System.out.println(nuevoArray[consulta]);

    }

    public static void string4() {

        int x;
        int consulta, cantidad = 0;
        int[] nuevoArray = new int[5];

        String salida = "";

        for (x = 0; x < 5; x++) {
            nuevoArray[x] = teclado.nextInt();
            cantidad++;
            if (x < 4) {
                salida = salida + nuevoArray[x] + ", ";
            } else {

                salida = salida + nuevoArray[x];
            }
            //System.out.println(nuevoArray[n]);
            //System.out.print(salida);
        }

        System.out.println("nuevoArray" + "[ " + salida + " ]");
        System.out.println("Introduce el número de campo del Array (de 1 a " + cantidad + "): ");
        consulta = teclado.nextInt();

        while (consulta > cantidad || consulta <= 0) {
            System.out.println("Introduce el número de campo del Array (de 1 a " + cantidad + "): ");
            consulta = teclado.nextInt();
            System.out.println("En la posición " + consulta + " del array se encuentra el valor " + nuevoArray[cantidad - 1]);
        }
        System.out.println("En la posición " + consulta + " del array se encuentra el valor " + nuevoArray[consulta - 1]);
    }
    
    public static void string4_1() {
        
        /* Prueba haciendo un array con palabras */

        int x;
        int consulta, cantidad = 0;
        String[] nuevoArray = new String[5];

        String salida = "";

        for (x = 0; x < 5; x++) {
            nuevoArray[x] = teclado.next();
            cantidad++;
            if (x < 4) {
                salida = salida + nuevoArray[x] + ", ";
            } else {

                salida = salida + nuevoArray[x];
            }
            //System.out.println(nuevoArray[n]);
            //System.out.print(salida);
        }

        System.out.println("nuevoArray" + "[ " + salida + " ]");
        System.out.println("Introduce el número de campo del Array (de 1 a " + cantidad + "): ");
        consulta = teclado.nextInt();

        while (consulta > cantidad || consulta <= 0) {
            System.out.println("Introduce el número de campo del Array (de 1 a " + cantidad + "): ");
            consulta = teclado.nextInt();
            System.out.println("En la posición " + consulta + " del array se encuentra el valor " + nuevoArray[cantidad - 1]);
        }
        System.out.println("En la posición " + consulta + " del array se encuentra el valor " + nuevoArray[consulta - 1]);
    }

    public static void ejercicio_arrays1() {

        /*
            Encontrar el menor de una serie de números
         */
        int[] vector = {10, 2, 4, 1, 7, 2};
        int i, minimo = vector[0];

        for (i = 1; i < vector.length; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }
        System.out.println(minimo);
    }

    public static void ejercicio_arrays2() {

        /*
            Sumar todos los números del array
         */
        int[] vector = {10, 2, 4, 1, 7, 2};
        int i, total = vector[0];

        for (i = 1; i < vector.length; i++) {
            total = total + vector[i];
        }
        System.out.println(total);
    }

    public static void ejercicio_arrays3() {

        /*
        Imprimir todos los números del array
         */
        int[] vector = {10, 2, 4, 1, 7, 2};
        int i;

        for (i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }

    public static void ejercicio_arrays4() {

        /*
        Imprimir todos los números del array
         */
        int[] vector = {10, 2, 4, 1, 7, 67, 5, 12, 14, 56};
        int num;
        int i = 0;
        boolean encontrado = false;

        System.out.println("Indicar posición de un número dado por el usuario, si está.");
        System.out.println("");
        System.out.println("Introduce un número de posición del número introducido por el usuario:");

        num = teclado.nextInt();

        /*for (i = 0; i < vector.length; i++) {
            if(num==vector[i]){
                System.out.println("El número está en al posición: " + i + " del array.");
            } 
        }*/
        // i=0;
        while (!encontrado && i < vector.length) {

            if (num == vector[i]) {
                encontrado = true;
            }
            i++;
        }

        if (encontrado) {
            System.out.println("El número está en al posición: " + i + " del array.");
        } else {
            System.out.println("El número no está.");
        }
    }

    public static void ejercicio_arrays5() {

        int i;
        int cantidad = 0, cantidad2 = 0;
        int num;

        System.out.println("Introduce la cantidad de valores del array: ");
        num = teclado.nextInt();
        int[] nuevoArray = new int[num];
        int[] nuevoArray2 = new int[num];
        int[] nuevoArray3 = new int[num];

        String salida = "";
        String salida2 = "";
        String salida3 = "";
        System.out.println("Introduce " + num + " valores para el primer array: ");
        for (i = 0; i < num; i++) {

            nuevoArray[i] = teclado.nextInt();
            cantidad++;

            if (i < (num - 1)) {
                salida = salida + nuevoArray[i] + ", ";
            } else {
                salida = salida + nuevoArray[i];
            }
        }

        System.out.println("Introduce " + num + " valores para el segundo array: ");

        for (i = 0; i < num; i++) {

            nuevoArray2[i] = teclado.nextInt();
            cantidad2++;

            if (i < (num - 1)) {
                salida2 = salida2 + nuevoArray2[i] + ", ";
            } else {
                salida2 = salida2 + nuevoArray2[i];
            }
        }

        System.out.println("nuevoArray" + "[ " + salida + " ]");
        System.out.println("nuevoArray" + "[ " + salida2 + " ]");

        System.out.println("Ahora sumaremos los valores de ambos Arrays 1 y 2: ");

        for (i = 0; i < num; i++) {

            nuevoArray3[i] = nuevoArray[i] + nuevoArray2[i];

            if (i < (num - 1)) {
                salida3 = salida3 + nuevoArray3[i] + ", ";
            } else {
                salida3 = salida3 + nuevoArray3[i];
            }
        }

        System.out.println("nuevoArray" + "[ " + salida3 + " ]");
    }

    public static void ejercicio_arrays6() {

        int i;
        int num;

        System.out.println("Introduce la cantidad de valores del array: ");
        num = teclado.nextInt();
        int[] nuevoArray = new int[num];
        int[] nuevoArray2 = new int[num];
        int[] nuevoArray3 = new int[num];

        String salida3 = "";
        System.out.println("Introduce " + num + " valores para cada array: ");

        for (i = 0; i <= num; i++) {
            if (i < num) {
                System.out.print(" " + (i+1) + "º valor del array 1: ");
                nuevoArray[i] = teclado.nextInt();
                System.out.print(" " + (i+1) + "º valor del array 2: ");
                nuevoArray2[i] = teclado.nextInt();
            } else {
                i = 0;
                while (i < num) {
                    nuevoArray3[i] = nuevoArray[i] + nuevoArray2[i];
                    if (i < (num - 1)) {
                        salida3 = salida3 + nuevoArray3[i] + ", ";
                    } else {
                        salida3 = salida3 + nuevoArray3[i];
                    }
                    i++;
                }
            }
        }
        System.out.println("Ahora sumaremos los valores de ambos Arrays 1 y 2: ");
        System.out.println("nuevoArray" + "[ " + salida3 + " ]");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Exer_string.string1();
        //Exer_string.string2();
        //Exer_string.string3();
        //Exer_string.string4_1();
        Exer_string.string4_1();
        //Exer_string.ejercicio_arrays1();
        //Exer_string.ejercicio_arrays2();
        //Exer_string.ejercicio_arrays3();
        //Exer_string.ejercicio_arrays4();
        //Exer_string.ejercicio_arrays5();
        //Exer_string.ejercicio_arrays6();
    }
}
