/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer_arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * ALUMNO: ###### JORGE CARLOS BASAGAÑA RIOS - 46796341N ######
 */
public class Exer_arrays {

    private static final Scanner teclado = new Scanner(System.in); // Teclado definido
    private static final Random aleatorio = new Random();

    /**
     * @param args the command line arguments
     */
    public static void ejercicio1() {
        /*
        Hacer el algoritmo correspondiente a un programa, que:
            a) Crea una tabla unidimensional de 10 elementos de tipo numérico entero y
            nombre 'numeros'.
            b) Carga la tabla con valores positivos y negativos.
            c) Muestra en pantalla cada elemento de la tabla junto con su cuadrado y su
            cubo.
         */

        int i;
        int[] numeros = new int[10];

        System.out.println("Introduce una serie de 10 números: ");
        for (i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print("TABLA NÚMEROS: { " + numeros[i] + " ");
                System.out.print("[ " + Math.pow(numeros[i], 2) + " / " + Math.pow(numeros[i], 3) + " ]" + ", ");
            } else if (i > 0 && i < (10 - 1)) {
                System.out.print(numeros[i] + " ");
                System.out.print("[ " + Math.pow(numeros[i], 2) + " / " + Math.pow(numeros[i], 3) + " ]" + ", ");
            } else {
                System.out.println(numeros[i] + Math.pow(numeros[i], 2) + " - " + Math.pow(numeros[i], 3) + " ]" + " }");
            }
        }
    }

    public static void ejercicio2() {
        /*
        Diseñar el algoritmo correspondiente a un programa, que:
            a) Crea una tabla unidimensional de 15 elementos de tipo entero y nombre
            'vector'.
            b) Carga la tabla con valores aleatorios.
            c) Calcula la suma de los 'N' primeros elementos de la tabla.
            d) Muestra el resultado obtenido, así como el contenido de la tabla en pantalla.
         */

        int i, n;
        int[] vector = new int[15];
        int suma = 0;

        System.out.println("Serie de 10 números aleatorios. ");
        for (i = 0; i < 10; i++) {
            vector[i] = aleatorio.nextInt();

            if (i == 0) {
                System.out.print("TABLA NÚMEROS: { " + vector[i] + ", ");
            } else if (i > 0 && i < (10 - 1)) {
                System.out.print(vector[i] + ", ");
            } else {
                System.out.println(vector[i] + " }");
            }
        }

        System.out.println("Introduce un número de elementos a sumar desde el primero: ");
        n = teclado.nextInt();
        for (i = 0; i < n; i++) {
            suma = suma + vector[i];
        }
        System.out.println(suma);

    }

    public static void ejercicio3() {
        /*
        Diseñar el algoritmo correspondiente a un programa, que:
            a) Crea un vector de 20 elementos de tipo entero y nombre 'tabla'.
            b) Carga el vector con valores aleatorios.
            c) Muestra en pantalla todos aquellos elementos mayores de 30 junto con la
            posición que ocupan en el vector. En caso de no existir ninguno se mostrará el siguiente
            mensaje:
            "NO HAY NUMEROS MAYORES DE 30".
         */

        int i, n;
        boolean count = false;
        int[] tabla = new int[20];

        System.out.println("Serie de 20 números aleatorios. ");
        for (i = 0; i < 10; i++) {
            tabla[i] = aleatorio.nextInt(40);

            if (i == 0) {
                System.out.print("TABLA NÚMEROS: { " + tabla[i] + ", ");
            } else if (i > 0 && i < (10 - 1)) {
                System.out.print(tabla[i] + ", ");
            } else {
                System.out.println(tabla[i] + " }");
            }
        }

        System.out.println("Buscaremos si hay algún número mayor que 30: ");
        for (i = 0; i < tabla.length; i++) {
            if (tabla[i] > 30) {
                System.out.println("En la posición " + (i + 1) + " se encuentra el número " + tabla[i]);
                count = true;
            }
        }
        if (count == false) {
            System.out.println("NO HAY NUMEROS MAYORES DE 30");
        }
    }

    public static void ejercicio4() {
        /*
        Diseñar un algoritmo en el que dado el siguiente vector de nombre 'origen':
            --- --- ---- ---- ---- ---- ---- ---- ---- ---- ----
            | 1 | 4 | 10 | 32 | 60 | 91 | 34 | 56 | 73 | 88 | 86 |
            --- --- ---- ---- ---- ---- ---- ---- ---- ---- ----
            a) Lo recorra metiendo en un segundo vector de nombre 'destino' todos aquellos
            elementos pares, mayores de 25.
            b) Muestre en pantalla el contenido de los dos vectores.
         */

        int pares = 0;
        int i;
        int[] origen = {1, 4, 10, 32, 60, 91, 34, 56, 73, 88, 86};
        int[] destino = new int[origen.length];

        for (i = 0; i < origen.length; i++) {
            if ((origen[i] % 2 == 0) && origen[i] > 25) {
                destino[pares] = origen[i];
                System.out.print(destino[pares] + " ");
                pares++;
            }
        }
    }

    public static void ejercicio5() {
        /*
        Diseñar el algoritmo correspondiente a un programa, que:
            a) Crea una matriz de 10x10 (filas x columnas) y nombre 'tabla'.
            b) Carga la matriz de manera que las filas pares se rellenan con 1 y las filas
            impares con 0.
            c) Una vez inicializada la matriz muestra su contenido en pantalla.
         */
        int i, j;
        int[][] tabla = new int[10][10];
        System.out.println("Valores aleatorios para array tabla entre 0 y 1. ");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i % 2 == 0) {
                    tabla[i][j] = 1;
                    System.out.print(tabla[i][j] + " ");
                } else {
                    tabla[i][j] = 0;
                    System.out.print(tabla[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void ejercicio6() {
        /*
        Diseñar el algoritmo correspondiente a un programa, que:
            a) Crea una tabla bidimensional de longitud 5x5 y nombre 'diagonal'.
            b) Carga la tabla de forma que los componentes pertenecientes
            a la diagonal de la matriz tomen el valor 1 y el resto el valor 0.
            c) Muestra el contenido de la tabla en pantalla.
         */
        int i, j;
        int[][] diagonal = new int[5][5];
        System.out.println("Matriz en la que la diagonal está formada de 1 y el resto 0. ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (j != i) {
                    diagonal[i][j] = 0;
                    System.out.print(diagonal[i][j] + " ");
                } else {
                    diagonal[i][j] = 1;
                    System.out.print(diagonal[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void ejercicio7() {
        /*
        Diseñar el algoritmo correspondiente a un programa, que:
            a) Crea una tabla bidimensional de longitud 10x10 y nombre 'matriz'.
            b) Carga la tabla con valores numéricos enteros.
            c) Suma todos los elementos de cada fila y todos los elementos de cada columna
            visualizando los resultados en pantalla.
         */
        int i, j, signos = 0;
        int sumFila, sumCol;
        int[][] matriz = new int[10][10];
        System.out.println("Sumar filas y columnas. ");

        /*Recorremos el array por filas para introducir valores aleatorios y
          la suma de valores de cada columnas.*/
        for (i = 0; i < 10; i++) {
            sumFila = 0; //Se pone a cero el sumador de filas en cada nueva fila.
            for (j = 0; j < 10; j++) {
                matriz[i][j] = aleatorio.nextInt(2);
                sumFila = sumFila + matriz[i][j]; //Sumador de los valores de las filas.
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.print("=  " + sumFila);
            System.out.println("");
        }

        //Bloque de los iguales "=" para la suma de valores de columnas.
        while (signos < 10) {
            System.out.print("=  ");
            signos++;
        }
        System.out.println("");

        //Ahora recorremos el array por columnas para realizar la suma de valores de cada columna.
        for (i = 0; i < 10; i++) {
            sumCol = 0;
            for (j = 0; j < 10; j++) {
                sumCol = sumCol + matriz[j][i];
            }
            if (sumCol < 10) {
                System.out.print(sumCol + "  ");
            } else {
                System.out.print(sumCol + " ");
            }
        }
    }

    public static void ejercicio8() {
        /*
            Diseñar el algoritmo correspondiente a un programa, que:
                a) Crea una tabla bidimensional de longitud 5x15 y nombre 'marco'.
                b) Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las
                posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras que el
                resto de los elementos contendrán el valor 0.
                111111111111111
                100000000000001
                100000000000001
                100000000000001
                111111111111111
                c) Visualiza el contenido de la matriz en pantalla.
         */
        int[][] marco = new int[5][15];
        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 15; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1;
                    System.out.print(marco[i][j] + "  ");
                } else {
                    marco[i][j] = 0;
                    System.out.print(marco[i][j] + "  ");
                }
            }
            System.out.println("");
        }
    }

    public static void ejercicio9() {
        /*
            Programa que declare un vector de diez enteros, pida al usuario valores para
            rellenarlo y muestre las cinco sumas de los elementos impares con los pares siguientes
            (es decir, el 1 con el 2, el 2 con el 3...).
         */
        int[] vector = new int[10];
        int i, suma = 0;
        int contPar = 0, sumaPar = 0;
        System.out.println("Introduce los valores del array:");
        for (i = 0; i < 10; i++) {
            vector[i] = teclado.nextInt();
        }
        System.out.println("");
        for (i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vector[i] + ", ");
            } else {
                System.out.print(vector[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("");
        for (i = 0; i < 10; i++) {
            if (vector[i] % 2 != 0) {
                sumaPar = sumaPar + vector[i];
                contPar++;

            } else if (vector[i] % 2 == 0) {
                sumaPar = sumaPar + vector[i];
                contPar++;
                if (contPar == 2) {
                    System.out.println("Suma de impar con par siguiente: " + sumaPar);
                    contPar = 0;
                    sumaPar = 0;
                }
            }
        }
    }

    public static void ejercicio10() {
        /*
            Programa que declare un vector de cinco enteros, lo rellene con los datos
            introducidos por el usuario y muestre las sumas parciales de los dos primeros
            elementos, de los tres primeros, etc.
         */
        int[] vector = new int[5];
        int i, j, suma = 0;

        int count = 0;
        System.out.println("Introduce los valores del array:");
        for (i = 0; i < 5; i++) {
            vector[i] = teclado.nextInt();
        }
        System.out.println("");
        for (i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(vector[i] + ", ");
            } else {
                System.out.print(vector[i] + " ");
            }
        }

        System.out.println("");
        System.out.println("");

        for (i = 0; i < 5; i++) {
            suma = suma + vector[i];
            count++;
            if (count > 1) {
                System.out.println("Suma de los primeros " + (i + 1) + " números: " + suma);
            }
        }
    }

    public static void ejercicio11() {
        /*
            Programa que declare un vector de diez reales, lo rellene y calcule el índice del
            elemento menor.
         */
        int[] vector = new int[10];
        int i, min = 0, indice = 0;
        System.out.println("Rellenamos con valores aleatorios el array:");
        for (i = 0; i < 10; i++) {
            vector[i] = aleatorio.nextInt(10);
        }
        System.out.println("");
        for (i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(vector[i] + ", ");
            } else {
                System.out.print(vector[i] + " ");
                System.out.println("");
            }
        }
        for (i = 0; i < 10; i++) {
            if (i == 0) {
                min = vector[i];
            }
            if (vector[i] < min) {
                min = vector[i];
                indice = i;
            }
        }
        System.out.println("");
        System.out.println("El valor más pequeño es: " + min + " y su índice es: " + indice);
    }

    public static void ejercicio12() {
        /*
            Programa que declare dos vectores 'v' y 'w' de cinco enteros cada uno, pida valores
            para 'v' y los copie en orden inverso a 'w'.
         */
        int[] v = new int[5];
        int[] w = new int[5];
        int i, j = 4;

        for (i = 0; i < 5; i++) {
            v[i] = aleatorio.nextInt(5);
        }

        System.out.println("Rellenamos con valores aleatorios el array v: ");
        System.out.print("Array v: ");
        for (i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(v[i] + ", ");
            } else {
                System.out.print(v[i] + " ");
                System.out.println("");
            }
        }

        for (i = 0; i < 5; i++) {
            if (j > - 1) {
                w[i] = v[j];
                j--;
            }
        }

        System.out.println("");
        System.out.println("Rellenamos el array w con los valores de v al revés: ");
        System.out.print("Array w: ");
        for (i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(w[i] + ", ");
            } else {
                System.out.print(w[i] + " ");
                System.out.println("");
            }
        }
    }

    public static void ejercicio13() {
        /*
            Programa que declare tres vectores 'v', 'w' y 'x' de cinco enteros cada uno, pida
            valores para 'v' y 'w' y calcule x=v+w.
         */
        int[] v = new int[5];
        int[] w = new int[5];
        int[] x = new int[5];
        int i, j = 0;

        for (i = 0; i < 5; i++) {
            v[i] = aleatorio.nextInt(5);
            w[i] = aleatorio.nextInt(5);
        }

        System.out.println("Rellenamos con valores aleatorios los arrays v y w: ");
        System.out.print("Array v: ");
        for (i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(v[i] + ", ");
            } else {
                System.out.print(v[i] + " ");
                System.out.println("");
            }
        }

        System.out.print("Array w: ");
        for (i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(w[i] + ", ");
            } else {
                System.out.print(w[i] + " ");
                System.out.println("");
            }
        }

        for (i = 0; i < 5; i++) {
            if (j < 5) {
                x[i] = v[j] + w[j];
                j++;
            }
        }

        System.out.println("");
        System.out.println("Rellenamos el array x con la suma de los valores de v y w: ");
        System.out.print("Array x: ");
        for (i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(x[i] + ", ");
            } else {
                System.out.print(x[i] + " ");
                System.out.println("");
            }
        }
    }

    public static void ejercicio14() {
        /*
            Programa que declare un vector de diez elementos enteros y pida números para
            rellenarlo hasta que se llene el vector o se introduzca un número negativo. Entonces se
            debe imprimir el vector (sólo los elementos introducidos).
         */
        int[] vector = new int[10];
        int i = 0, j, num = 0, indiceTotal = 0;
        while (num >= 0 && i < 10) {
            num = teclado.nextInt();
            if (num >= 0) {
                vector[i] = num;
                indiceTotal = i;
            } else {
                System.out.println("Has introducido un número negativo, fin del array.");
            }
            i++;
        }
        System.out.println("Imprimimos en pantalla el array: ");
        for (j = 0; j < (indiceTotal + 1); j++) {
            if (j < (indiceTotal)) {
                System.out.print(vector[j] + ", ");
            } else {
                System.out.print(vector[j] + " ");
                System.out.println("");
            }
        }
    }

    public static void ejercicio15() {
        /*
            Programa que declare tres vectores 'v', 'w' y 'x' de cinco, cinco y diez enteros
            respectivamente, pida valores para 'v' y 'w' y rellene 'x' con valores alternos de 'v' y 'w',
            es decir, el primer elemento de 'v', el primero de 'w', el segundo de 'v', el segundo de
            'w'... Al final debe mostrar 'x' por pantalla.
         */
        int[] v = new int[5];
        int[] w = new int[5];
        int[] x = new int[10];
        int i = 0, j = 0;

        for (i = 0; i < 5; i++) {
            v[i] = aleatorio.nextInt(10);
            w[i] = aleatorio.nextInt(10);
        }
        System.out.print("Creamos el array v: ");
        for (i = 0; i < 5; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
        System.out.print("Creamos el array w: ");
        for (j = 0; j < 5; j++) {
            System.out.print(w[j] + " ");
        }
        System.out.println("");
        System.out.print("Array x resultante: ");
        i = 0;
        int k = 1;
        for (j = 0; j < 5; j++) {
            if (i < 10) {
                x[i] = v[j];
                i = i + 2;
            }
            if (k < 10) {
                x[k] = w[j];
                k = k + 2;
            }
        }
        
        for (i = 0; i < 10; i++) {
            System.out.print(x[i] + " ");
        }
        
    }

    public static void ejercicio16() {
        /*
            Programa que declare tres vectores 'i', 'p' y 'v' de cinco, cinco y diez enteros
            respectivamente, pida valores para 'v' y rellene 'i' con los elementos de índice par de 'v',
            y 'p' con los de índice impar. Al final debe mostrar 'v' por pantalla.
         */
        
        int[] u = new int[5];
        int[] p = new int[5];
        int[] v = new int[10];
        int i = 0, j = 0, k = 0;

        for (i = 0; i < 10; i++) {
            v[i] = aleatorio.nextInt(10);
        }
        System.out.print("Creamos el array v: ");
        for (i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
        
        for (i = 0; i < 10; i++) {
            if(i%2==0 || i == 0){
                u[j] = v[i];
                j++;
            }
            if(i%2!=0 || i == 1){
                p[k] = v[i];
                k++;
            }
        }
        System.out.println("");
        System.out.print("Así queda el array u: ");
        for (i = 0; i < 5; i++) {
            System.out.print(u[i] + " ");
        }
        
        System.out.println("");
        System.out.print("Así queda el array p: ");
        for (i = 0; i < 5; i++) {
            System.out.print(p[i] + " ");
        }
    }
    
    public static void ejercicio17() {
        /*
            Programa que declare tres vectores 'may', 'men' y 'v' de cinco enteros cada uno, pida
            valores para 'v', calcule su media ('m') y rellene 'may' con los elementos de 'v' mayores o
            iguales que 'm' y 'men' con los elementos de 'v' menores que 'm'. Al final debe mostrar
            'may' y 'men' por pantalla.
         */

        int[] may = new int[5];
        int[] men = new int[5];
        int[] v = new int[5];
        int i = 0, j = 0, k = 0, m = 0, suma = 0;

        for (i = 0; i < 5; i++) {
            v[i] = aleatorio.nextInt(10);
            suma = suma + v[i];
        }
        System.out.println("Creamos el vector v: ");

        for (i = 0; i < 5; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("Calculamos la media de los valores del vector v: ");
        m = suma / v.length;
        System.out.print("m = " + m);

        for (i = 0; i < 5; i++) {
            if (v[i] >= m) {
                may[j] = v[i];
                j++;
            }
            if (v[i] < m) {
                men[k] = v[i];
                k++;
            }
        }

        System.out.println("");
        System.out.print("Así queda el array may (mayores que la media): ");
        for (i = 0; i < j; i++) {
            System.out.print(may[i] + " ");
        }

        System.out.println("");
        System.out.print("Así queda el array men (menores que la media): ");
        for (i = 0; i < k; i++) {
            System.out.print(men[i] + " ");
        }
    }
    
    public static void ejercicio18() {
        /*
            Programa que calcule, según la siguiente tabla, el impuesto a pagar según el salario
            anual. Se pedirán como datos al usuario el salario mensual y el número de pagas. No
            se deben usar decisiones anidadas sino tres vectores 'liminf', 'limsup' y 'pct' que darán el
            límite inferior, el superior y el impuesto asociado, respectivamente.
        */
        
        int[] liminf = { 1000000, 2500000 };
        int[] limsup = { 3800000, 6000000 };
        int[] pct = { 5, 12, 15, 22, 30 };
        int i = 0, j = 0, k = 0, m = 0, suma = 0;
        
        int sal = 0, pagas = 0;
        
        
        System.out.println("Introduzca el salario anual: ");
        sal = teclado.nextInt();
        System.out.println("Introduzca el número de pagas: ");
        pagas = teclado.nextInt();
        
        if(sal < liminf[0]){
            System.out.println("Impuesto: " + pct[0] + "%");
        }else if (sal >= liminf[0] && sal <= liminf[1]){
            System.out.println("Impuesto: " + pct[1] + "%");
        }else if (sal > liminf[1] && sal < limsup[0]){
            System.out.println("Impuesto: " + pct[2] + "%");
        }else if (sal >= limsup[0] && sal <= limsup[1]){
            System.out.println("Impuesto: " + pct[3] + "%");
        }else if (sal > limsup[2]){
            System.out.println("Impuesto: " + pct[4] + "%");
        }
    }

    public static void imprimirArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        //Exer_arrays.ejercicio1();
        //Exer_arrays.ejercicio2();
        //Exer_arrays.ejercicio3();
        //Exer_arrays.ejercicio4();
        //Exer_arrays.ejercicio5();
        //Exer_arrays.ejercicio6();
        //Exer_arrays.ejercicio7();
        //Exer_arrays.ejercicio7_1();
        //Exer_arrays.ejercicio8();
        //Exer_arrays.ejercicio9();
        //Exer_arrays.ejercicio10();
        //Exer_arrays.ejercicio11();
        //Exer_arrays.ejercicio12();
        //Exer_arrays.ejercicio13();
        //Exer_arrays.ejercicio14();
        //Exer_arrays.ejercicio15();
        //Exer_arrays.ejercicio16();
        //Exer_arrays.ejercicio17();
        Exer_arrays.ejercicio18();
    }
}
