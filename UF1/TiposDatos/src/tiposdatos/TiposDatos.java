/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TiposDatos {

    private static final Scanner teclado = new Scanner(System.in); // Teclado definido
    private static final Random aleatorio = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TiposDatos.ejercicio1(); // Este comando se denomina LLAMADA y en el paréntesis se podrían recibir datos externos
        //TiposDatos.ejercicio2();
        //TiposDatos.ejercicio3();
        //TiposDatos.ejercicio4();
        //TiposDatos.ejercicio4_1();
        //TiposDatos.ejercicio5();
        //TiposDatos.ejercicio5_1();
        //TiposDatos.ejercicio5_2();
        //TiposDatos.ejercicio5_3();
        //TiposDatos.ejercicio5_4();
        //TiposDatos.ejercicio5_5();
        //TiposDatos.ejercicio6();
        //TiposDatos.ejercicio7();
        //TiposDatos.ejercicio7_1();
        //TiposDatos.ejercicio8();
        //TiposDatos.ejercicio8_1();
        //TiposDatos.ejercicio8_2();
        //TiposDatos.ejercicio8_3();
        //TiposDatos.ejercicio8_4();
        //TiposDatos.ejercicio8_5();
        //TiposDatos.ejercicio8_6();
        //TiposDatos.ejercicio8_7();
        //TiposDatos.ejercicio9();
        TiposDatos.ejercicio10();
    }

    public static void ejercicio1() {
        // Parte 1
        System.out.println("Hola mundo"); // Para mostrar mensaje en pantalla
        // Parte 2
        int n1 = 4; // Declaración de una variable de números enteros y le damos un nombre n1 y un valor 4
        int n2;
        int resultado;

        boolean esMenor;
        System.out.println("Otro mensaje.");
        n2 = 7; // asignación de valor a las variables, tomará en cuenta el último valor asignado

        resultado = n1 + n2;
        System.out.println("El resultado es: " + resultado);
        System.out.println("Gracias");

        /* if (n1 < n2){
            esMenor = true;
        } else {
            esMenor = false;
        }
        
        if (esMenor=true){ 
            System.out.println("Verdadero"); // Muestra en pantalla verdadero
        } else {
            System.out.println("Falso"); // Muestra en pantalla falso
        } */
        // System.out.println(esMenor); /* Muestra en pantalla true o false */
    }

    public static void ejercicio2() {

        // Mayor - menor
        System.out.println("Inroduce un número");
        int n1 = teclado.nextInt();
        System.out.println("Inroduce un número");
        int n2 = teclado.nextInt();

        if (n1 < n2) {
            System.out.println("El primero menor");
        } else if (n2 < n1) {
            System.out.println("El segundo menor");
        } else {
            System.out.println("Son iguales");
        }

    }

    public static void ejercicio3() {

        // Suma
        System.out.println("Inroduce un número");
        int n1 = teclado.nextInt();
        System.out.println("Inroduce un número");
        int n2 = teclado.nextInt();

        int resultado = n1 + n2;

        System.out.println(n1 + " más " + n2 + " es: " + resultado);

    }

    public static void ejercicio4() {

        /**
         * Calculadora
         */
        System.out.println("Bienvenido a Calculadora");
        System.out.println("¿Qué operación quieres realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int n1 = teclado.nextInt();

        if (n1 > 0) {
            if (n1 < 5) {
                if (n1 == 1) {
                    System.out.println("Has elegido: 1. Suma");
                    System.out.println("Inroduce el primer número: ");
                    int v1 = teclado.nextInt();
                    System.out.println("Inroduce el segundo número: ");
                    int v2 = teclado.nextInt();
                    int v3 = v1 + v2;
                    System.out.println("Resultado: " + v1 + " + " + v2 + " = " + v3);
                } else if (n1 == 2) {
                    System.out.println("Has elegido: 2. Resta");
                    System.out.println("Inroduce el primer número: ");
                    int v1 = teclado.nextInt();
                    System.out.println("Inroduce el segundo número: ");
                    int v2 = teclado.nextInt();
                    int v3 = v1 - v2;
                    System.out.println("Resultado: " + v1 + " - " + v2 + " = " + v3);
                } else if (n1 == 3) {
                    System.out.println("Has elegido: 3. Multiplicación");
                    System.out.println("Inroduce el primer número: ");
                    int v1 = teclado.nextInt();
                    System.out.println("Inroduce el segundo número: ");
                    int v2 = teclado.nextInt();
                    int v3 = v1 * v2;
                    System.out.println("Resultado: " + v1 + " * " + v2 + " = " + v3);
                } else if (n1 == 4) {
                    System.out.println("Has elegido: 4. División");
                    System.out.println("Inroduce el primer número: ");
                    int v1 = teclado.nextInt();
                    System.out.println("Inroduce el segundo número: ");
                    int v2 = teclado.nextInt();
                    int v3 = v1 / v2;
                    System.out.println("Resultado: " + v1 + " / " + v2 + " = " + v3);
                }
            } else {
                System.out.println("Valor incorrecto, elige entre 1 y 5. Reinicia programa.");
            }
        } else {
            System.out.println("Valor incorrecto, elige entre 1 y 5. Reinicia programa.");
        }
    }

    public static void ejercicio4_1() {

        /**
         * Calculadora, versión Profe
         */
        int n1;
        int n2;
        int res;
        int opcion;

        System.out.println("Bienvenido a Calculadora");
        System.out.println("¿Qué operación quieres realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        opcion = teclado.nextInt();

        System.out.println("Inroduce el primer número: ");
        n1 = teclado.nextInt();

        System.out.println("Inroduce el segundo número: ");
        n2 = teclado.nextInt();

        if (opcion == 1) {
            res = n1 + n2;
        } else if (opcion == 2) {
            res = n1 - n2;
        } else if (opcion == 3) {
            res = n1 * n2;
        } else {

            /* Aquí no se pone (opcion == 4) porque ya le indicas que si no se da todo lo anterior entonces "else" lo siguiente
            no hace falta poner otra vez la condición.
            
            Si aquí pones else if entonces habría un error cuando el valor introducido para la operación no es 1, 2, 3 o 4;
            pero si pones else hará la operación sea cual sea el valor diferente a 1, 2 y 3.
             */
            res = (int) n1 / n2; // (int) es para asegurarte de que el resultado es un entero (quita decimales)
        }

        System.out.println("Resultado: " + res);
    }

    public static void ejercicio5() {

        /**
         * Calculadora del valor más alto
         */
        int n1;
        int n2;
        int n3;
        int mayor;

        System.out.println("Bienvenido a Calculadora del valor más alto");

        System.out.println("Inroduce el primer número: ");
        n1 = teclado.nextInt();

        System.out.println("Inroduce el segundo número: ");
        n2 = teclado.nextInt();

        System.out.println("Inroduce el tercer número: ");
        n3 = teclado.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }

        System.out.println("Resultado: " + mayor);
    }

    public static void ejercicio5_1() {

        /**
         * Ordenar 3 números de mayor a menor
         */
        int n1;
        int n2;
        int n3;

        System.out.println("Bienvenido a Calculadora del valor más alto");

        System.out.println("Inroduce el primer número: ");
        n1 = teclado.nextInt();

        System.out.println("Inroduce el segundo número: ");
        n2 = teclado.nextInt();

        System.out.println("Inroduce el tercer número: ");
        n3 = teclado.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.println("Ordenados: " + n1 + " " + n2 + " " + n3);
        }
        if (n1 > n2 && n3 > n2) {
            System.out.println("Ordenados: " + n1 + " " + n3 + " " + n2);
        }
        if (n2 > n3 && n3 > n1) {
            System.out.println("Ordenados: " + n2 + " " + n3 + " " + n1);
        }
        if (n2 > n1 && n1 > n3) {
            System.out.println("Ordenados: " + n2 + " " + n1 + " " + n3);
        }
        if (n3 > n1 && n1 > n2) {
            System.out.println("Ordenados: " + n3 + " " + n1 + " " + n2);
        }
        if (n3 > n2 && n2 > n1) {
            System.out.println("Ordenados: " + n3 + " " + n2 + " " + n1);
        }
    }

    public static void ejercicio5_2() {

        /**
         * Ordenar 3 números de mayor a menor VERSIÓN DEL PROFE 2
         */
        int n1, n2, n3;
        int mayor;

        System.out.println("Introduce el primer número");
        n1 = teclado.nextInt();

        System.out.println("Introduce el segundo número");
        n2 = teclado.nextInt();

        System.out.println("Introduce el tercer número");
        n3 = teclado.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }

        if (mayor == n1) {
            if (n2 > n3) {
                System.out.println("Orden: " + mayor + n2 + n3);
            } else {
                System.out.println("Orden: " + mayor + n3 + n2);
            }
        } else if (mayor == n2) {
            if (n1 > n3) {
                System.out.println("Orden: " + mayor + n1 + n3);
            } else {
                System.out.println("Orden: " + mayor + n3 + n1);
            }
        } else if (n1 > n2) {
            System.out.println("Orden: " + mayor + n1 + n2);
        } else {
            System.out.println("Orden: " + mayor + n2 + n1);
        }
    }

    public static void ejercicio5_3() {

        /**
         * Ordenar 3 números VERSIÓN DEL PROFE 2
         */
        int n1, n2, n3;
        int mayor;
        int medio;
        int menor;

        System.out.println("Introduce el primer número");
        n1 = teclado.nextInt();

        System.out.println("Introduce el segundo número");
        n2 = teclado.nextInt();

        System.out.println("Introduce el tercer número");
        n3 = teclado.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }

        if (mayor == n1) {
            if (n2 > n3) {
                medio = n2;
                menor = n3;
            } else {
                medio = n3;
                menor = n2;
            }
        } else if (mayor == n2) {
            if (n1 > n3) {
                medio = n1;
                menor = n3;
            } else {
                medio = n3;
                menor = n1;
            }
        } else if (n1 > n2) {
            medio = n1;
            menor = n2;
        } else {
            medio = n2;
            menor = n1;
        }
        System.out.println("Números ordenados: " + mayor + " " + medio + " " + menor);
    }

    public static void ejercicio5_4() {

        int nota1, nota2, nota3;
        int media;

        System.out.println("Introduce el primer número");
        nota1 = teclado.nextInt();

        System.out.println("Introduce el segundo número");
        nota2 = teclado.nextInt();

        System.out.println("Introduce el tercer número");
        nota3 = teclado.nextInt();

        media = (nota1 + nota2 + nota3) / 3;
        // Creamos la variable suma sólo si va a ser utilizado ese valor por separado para otra cosa.

        System.out.println("La media es: " + media);
    }

    public static void ejercicio5_5() {

        int nota1, nota2, nota3;
        int media;

        System.out.println("Introduce el primer número");
        nota1 = teclado.nextInt();
        if (nota1 < 5) {
            System.out.println("Nota trimestre: suspendido");
        } else if (nota1 == 5){
            System.out.println("Nota trimestre: aprobado");
        } else if (nota1 > 5 && nota1 < 7){
            System.out.println("Nota trimestre: bien");
        } else if (nota1 > 7 && nota1 < 9){
            System.out.println("Nota trimestre: notable");
        } else if (nota1 > 9 || nota1 == 10){
            System.out.println("Nota trimestre: Excelente");
        }

        System.out.println("Introduce el segundo número");
        nota2 = teclado.nextInt();
        if (nota2 < 5) {
            System.out.println("Nota trimestre: suspendido");
        } else if (nota2 == 5){
            System.out.println("Nota trimestre: aprobado");
        } else if (nota2 > 5 && nota2 < 7){
            System.out.println("Nota trimestre: bien");
        } else if (nota2 > 7 && nota2 < 9){
            System.out.println("Nota trimestre: notable");
        } else if (nota2 > 9 || nota2 == 10){
            System.out.println("Nota trimestre: Excelente");
        }

        System.out.println("Introduce el tercer número");
        nota3 = teclado.nextInt();
        if (nota3 < 5) {
            System.out.println("Nota trimestre: suspendido");
        } else if (nota3 == 5){
            System.out.println("Nota trimestre: aprobado");
        } else if (nota3 > 5 && nota3 < 7){
            System.out.println("Nota trimestre: bien");
        } else if (nota3 > 7 && nota3 < 9){
            System.out.println("Nota trimestre: notable");
        } else if (nota3 > 9 || nota3 == 10){
            System.out.println("Nota trimestre: Excelente");
        }

        media = (nota1 + nota2 + nota3) / 3;
        // Creamos la variable suma sólo si va a ser utilizado ese valor por separado para otra cosa.

        System.out.println("La media del curso es: " + media);
        if (media < 5) {
            System.out.println("Curso suspendido");
        } else {
            System.out.println("Curso aprobado");
        }
    }

    public static void ejercicio6() {

        // Número aleatorio
        int numComputer;
        int numUser = -1;

        numComputer = aleatorio.nextInt(5);

        System.out.println("Introduce un número del 0 al 5");

        if (numUser == -1) {
            numUser = teclado.nextInt();
            if (numUser == numComputer) {
                System.out.println("Acertaste!");
            } else {
                numUser = teclado.nextInt();
                if (numUser == numComputer) {
                    System.out.println("Acertaste!");
                } else {
                    numUser = teclado.nextInt();
                    if (numUser == numComputer) {
                        System.out.println("Acertaste!");
                    } else {
                        System.out.println("Lo siento, el número era: " + numComputer);
                    }
                }
            }
        }
    }

    public static void ejercicio7() {

        // Número aleatorio versión del Profe
        int n, n1;

        n = aleatorio.nextInt(5);
        n1 = teclado.nextInt();

        if (n1 == n) {
            // Acierto a la primera
        } else {
            n1 = teclado.nextInt();
            if (n1 == n) {
                // Acierto a la segunda
            } else {
                n1 = teclado.nextInt();
                if (n1 == n) {
                    // Acierto a la gtercera
                } else {
                    // No hay más intentos
                }
            }
        }
    }
    
    public static void ejercicio7_1() {
         
        // Para poner o solicitar decimales

        double nota;
        String calificacion;
        
        System.out.println("Introduce una nota: ");
        nota = teclado.nextDouble();
        
        if (nota < 5){
            calificacion = "Suspenso";
        } else if (nota >= 5 && nota < 6.5){
            calificacion = "Aprobado";
        } else if (nota >= 6.5 && nota < 7){
            calificacion = "Bien";
        } else if (nota >= 7 && nota < 8.5){
            calificacion = "Notable";
        } else if (nota >= 8.5 && nota < 9.75){
            calificacion = "Excelente";
        } else {
            calificacion = "Matrícula";
        }
        
        System.out.println(calificacion);
    }
     
    public static void ejercicio8() {
         
        int cnt;
        
       for(cnt = 1; cnt < 100; cnt=cnt+2){
           // Código a repetir
           System.out.println("Valor cnt: " + cnt);
       }
    }
    
    public static void ejercicio8_1() {
         
       int cnt;
        
       for(cnt = 1; cnt < 100; cnt=cnt+2){
           if(cnt != 53){
           System.out.println("Valor cnt: " + cnt);
           }
       }
    }
    
    public static void ejercicio8_2() {
         
       int cnt;
        
       for(cnt = 1; cnt < 100; cnt=cnt+2){
           if(!(cnt < 40 && cnt > 50)){
               // En este caso habría que poner un OR
               System.out.println("Valor cnt: " + cnt);
           }
       }
    }
    
    public static void ejercicio8_3() {
         
       int cnt;
        
       for(cnt = 1; cnt < 100; cnt=cnt+2){
           if(cnt < 40 || cnt > 50){
            // En este caso habría que poner un OR
            System.out.println("Valor cnt: " + cnt);
           }
       }
    }
    
    public static void ejercicio8_4() {
         
       int n1;
       int cnt;
       System.out.println("Tabla de multiplicar. Introduce un número: ");
       n1 = teclado.nextInt();
        
       for(cnt = 0; cnt < 10; cnt++){
            // Tabla de Multiplicar usando bucle FOR
            System.out.println("Tabla de multiplicar del nº" + n1 + ": " + n1 + "x" + cnt + " = " + (n1*cnt));
       }
    }
    
    public static void ejercicio8_5() {
         
       int n1;
       int cnt;
       int fact=1;
       
       System.out.println("Factorial. Introduce un número: ");
       n1 = teclado.nextInt();
       
       for(cnt = n1; cnt > 1; cnt--){
            // Tabla de Multiplicar usando bucle FOR
            fact = fact * cnt;
            System.out.println("- Factoriales: " + fact);
       }
       System.out.println("Resultado: " + fact);
    }
    
    public static void ejercicio8_6() {
       int n1;
       int cnt;
       int suma = 0;
       
       n1 = teclado.nextInt();
       System.out.println("Introduce un número: ");
       
       for(cnt = 1; cnt <= n1; cnt++){
            // Sumar usando bucle FOR con un valor acumulador
            suma = suma + cnt;
       }
       System.out.println("Resultado: " + suma);
    }
    
    public static void ejercicio8_7() {
       int cnt;
       int suma = 0;
       
       for(cnt = 0; cnt <= 100; cnt=cnt+2){
            // Sumar valores pares hasta 100
            suma = suma + cnt;
            System.out.println("Valor par: " + cnt + " y resultado de la suma: " + suma);
       }
       System.out.println("Resultado: " + suma);
    }
    
    public static void ejercicio9() {
       int nota = 0;
       int rand;
       int cnt;
       int media;
              
       for(cnt = 0; cnt < 100; cnt++){
            // Media de 100 números
            rand = aleatorio.nextInt(100);
            nota = nota + rand;
       }
       
       /* Sólo se utilizarían dos for si necesitara otra secuencia distinta 
          a parte de la realizada. */
       
       media = nota / cnt;
       System.out.println("La media de " + cnt + " números aleatorios es de " + media + ".");
    }
    
    public static void ejercicio10() {
       int nota = 0;
       int rand;
       int cnt;
       int media;
              
       for(cnt = 0; cnt < 100; cnt++){
            // Media de 100 números
            rand = aleatorio.nextInt(100);
            if(rand == 4){
                break;
            }
            nota = nota + rand;
       }
       
       /* Sólo se utilizarían dos for si necesitara otra secuencia distinta 
          a parte de la realizada. */
       
       media = nota / cnt;
       System.out.println("La media de " + cnt + " números aleatorios es de " + media + ".");
    }
}