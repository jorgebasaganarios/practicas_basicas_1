/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_exercicis;

import java.util.Random;
import java.util.Scanner;

/**
 * ######## ALUMNO: JORGE CARLOS BASAGAÑA RIOS 46796341N ########
 */
public class M03_Exercicis {

    private static final Scanner teclado = new Scanner(System.in); // Teclado definido
    private static final Random aleatorio = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        M03_Exercicis.ejercicio2();
        //M03_Exercicis.ejercicio3();
        //M03_Exercicis.ejercicio4();
        //M03_Exercicis.ejercicio5();
        //M03_Exercicis.ejercicio6();
        //M03_Exercicis.ejercicio7();
        //M03_Exercicis.ejercicio8();
        //M03_Exercicis.ejercicio9();
        //M03_Exercicis.ejercicio10();
        //M03_Exercicis.ejercicio11_1();
        //M03_Exercicis.ejercicio11_2();
        //M03_Exercicis.ejercicio11_3();
        //M03_Exercicis.ejercicio11_4();
        //M03_Exercicis.ejercicio12_1();
        //M03_Exercicis.ejercicio12_2();
        //M03_Exercicis.ejercicio12_3();
        //M03_Exercicis.ejercicio16();
        //M03_Exercicis.ejercicio17();
        //M03_Exercicis.ejercicio18();
        //M03_Exercicis.ejercicio19();
    }

    public static void ejercicio2() {

        /*
           Escriure un programa que llegeixi dos nombres enters i digui si el primer és
           divisible pel segon o no.
         */
        int numEntero1;
        int numEntero2;
        int res;

        System.out.println("El primer número: ");
        numEntero1 = teclado.nextInt();
        System.out.println("El segundo número: ");
        numEntero2 = teclado.nextInt();

        res = numEntero1 % numEntero2;

        if (res == 0) {
            System.out.println("El resto es: " + res + ". El número " + numEntero1 + " sí es divisible por el número " + numEntero2 + ".");
        } else {
            System.out.println("El resto es: " + res + ". El número " + numEntero1 + " no es divisible por el número " + numEntero2 + ".");
        }

    }

    public static void ejercicio3() {

        /*
            Escriure un programa que llegeixi tres nombres enters i digui quin és el màxim i
            quin el mínim, amb el menor nombre de comparacions possibles.
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
            System.out.println("1-Ordenados: " + n1 + " (mayor) " + " " + " " + n3 + " (menor) ");
        }
        if (n1 > n2 && n3 > n2) {
            System.out.println("2-Ordenados: " + n1 + " (mayor) " + " " + " " + n2 + " (menor) ");
        }
        if (n2 > n3 && n3 > n1) {
            System.out.println("3-Ordenados: " + n2 + " (mayor) " + " " + " " + n1 + " (menor) ");
        }
        if (n2 > n1 && n1 > n3) {
            System.out.println("4-Ordenados: " + n2 + " (mayor) " + " " + " " + n3 + " (menor) ");
        }
        if (n3 > n1 && n1 > n2) {
            System.out.println("5-Ordenados: " + n3 + " (mayor) " + " " + " " + n2 + " (menor) ");
        }
        if (n3 > n2 && n2 > n1) {
            System.out.println("6-Ordenados: " + n3 + " (mayor) " + " " + " " + n1 + " (menor) ");
        }

    }

    public static void ejercicio4() {

        /*
            Escriure un programa que llegeixi un caràcter i digui si correspon a una vocal o a
            una consonant. Si no és ni una vocal ni una consonant, s’haurà de donar un missatge
            d’error.        
         */
        char c;
        int valor;
        System.out.println("Introduce una letra:");
        c = teclado.next().charAt(0);
        valor = (int) c;

        if (valor < 65 && valor >= 32 || valor >= 58 && valor <= 63 || valor >= 91 && valor <= 96 || valor == 64) {
            System.out.println("ERROR");
        } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Vocal");
        } else {
            System.out.println("Consonante");
        }

    }

    public static void ejercicio5() {

        /*
            Escriure un programa, que a partir del valor numèric de la nota d’un alumne i fent
            servir el mínim nombre de comparacions, escrigui un caràcter que codifiqui la nota
            que li sortirà a l’acta, segons la taula següent:
         */
        double nota;
        char codi;
        String calificacion;

        System.out.println("Introduce una nota: ");
        nota = teclado.nextDouble();

        if (nota < 5) {
            calificacion = "Suspenso";
        } else if (nota >= 5 && nota < 6.5) {
            calificacion = "Aprobado";
        } else if (nota >= 6.5 && nota < 7) {
            calificacion = "Bien";
        } else if (nota >= 7 && nota < 8.5) {
            calificacion = "Notable";
        } else if (nota >= 8.5 && nota < 9.75) {
            calificacion = "Excelente";
        } else {
            calificacion = "Matrícula";
        }

        codi = calificacion.charAt(0);
        System.out.println("Código de nota:" + codi);
    }

    public static void ejercicio6() {

        /*
            Escriure un programa que llegeixi un nombre entre 1 i 7, i utilitzant l’estructura
            condicional switch/case, escrigui el nom del dia de la setmana corresponent. És a dir
            si s’introdueix un 1, ha d’escriure “dilluns”, si s’introdueix un 2, ha d’escriure
            “dimarts”, etc.
         */
        int numDia;
        String diaSemana;
        System.out.println("Introduce un número de día de la semana:");
        numDia = teclado.nextInt();

        switch (numDia) {
            case 1:
                diaSemana = "lunes";
                System.out.println("El día de la semana es: " + diaSemana);
                break;
            case 2:
                diaSemana = "martes";
                System.out.println("El día de la semana es: " + diaSemana);
                break;
            case 3:
                diaSemana = "miercoles";
                System.out.println("El día de la semana es: " + diaSemana);
                break;
            case 4:
                diaSemana = "jueves";
                System.out.println("El día de la semana es: " + diaSemana);
                break;
            case 5:
                diaSemana = "viernes";
                System.out.println("El día de la semana es: " + diaSemana);
                break;
            case 6:
                diaSemana = "sábado";
                System.out.println("El día de la semana es: " + diaSemana);
                break;
            case 7:
                diaSemana = "domingo";
                System.out.println("El día de la semana es: " + diaSemana);
                break;
        }
    }

    public static void ejercicio7() {

        /*
            Convertir l’estructura switch/case de l’exercici anterior a una estructura equivalent
            utilitzant if/else
         */
        int numDia;
        String diaSemana;
        System.out.println("Introduce un número de día de la semana:");
        numDia = teclado.nextInt();

        if (numDia == 1) {
            diaSemana = "lunes";
        } else if (numDia == 2) {
            diaSemana = "martes";
        } else if (numDia == 3) {
            diaSemana = "miercoles";
        } else if (numDia == 4) {
            diaSemana = "jueves";
        } else if (numDia == 5) {
            diaSemana = "viernes";
        } else if (numDia == 6) {
            diaSemana = "sábado";
        } else {
            diaSemana = "domingo";
        }
        System.out.println("El día de la semana es: " + diaSemana);
    }

    public static void ejercicio8() {

        /*
            Suposant que la variable nota només pot agafar valors enters, convertir l’estructura
            següent en una altra equivalent utilitzant la instrucció switch/case.
         */
        int nota;
        String calificacion;
        System.out.println("Introduce una nota (0 a 10):");
        nota = teclado.nextInt();

        switch (nota) {
            case 0:
                calificacion = "S";
            case 1:
                calificacion = "S";
            case 2:
                calificacion = "S";
            case 3:
                calificacion = "S";
            case 4:
                calificacion = "S";
                System.out.println(calificacion);
                break;
            case 5:
                calificacion = "A";
            case 6:
                calificacion = "A";
                System.out.println(calificacion);
                break;
            case 7:
                calificacion = "N";
            case 8:
                calificacion = "N";
                System.out.println(calificacion);
                break;
            case 9:
                calificacion = "E";
                System.out.println(calificacion);
                break;
            case 10:
                calificacion = "M";
                System.out.println(calificacion);
                break;
            default:
                System.out.println("Has introducido un valor erróneo.");
                System.exit(0);
        }

    }

    public static void ejercicio9() {

        /*  
            Escriure un programa que llegeixi el número d’un mes (entre 1 i 12), i un any, i
            indiqui el nombre de dies que té aquell mes. Recordar que el mes de febrer té 29
            dies si l’any és divisible per 4, menys quan també és divisible per 100 però no per
            400. Així, el mes de febrer de 1900 va tenir 28 dies, però el de 2000 en va tenir 29.
         */
        int mes;
        int any;
        int numDias;
        int resto4;
        int resto100;
        int resto400;

        System.out.println("Inroduce un mes: ");
        mes = teclado.nextInt();
        System.out.println("Inroduce un año: ");
        any = teclado.nextInt();

        if ((mes >= 1 && mes <= 12) && (any >= 1 && any <= 2016)) {

            System.out.println("La fecha introducida (mes/año) es: " + mes + "/" + any);

            switch (mes) {

                case 1:
                    numDias = 31;
                    System.out.println("El mes Enero tiene " + numDias + " días.");
                    break;
                case 2:
                    resto4 = any % 4;
                    resto100 = any % 100;
                    resto400 = any % 400;
                    /* System.out.println("          [ resto4: " + resto4 + " ]");
                    System.out.println("          [ resto100: " + resto100 + " ]");
                    System.out.println("          [ resto400: " + resto400 + " ]"); */
                    if (resto4 == 0) {
                        if (resto100 == 0 && resto400 != 0) {
                            numDias = 28;
                            System.out.println("El mes Febrero del año " + any + " tiene " + numDias + " días.");
                            System.out.println("El año " + any + " no es bisiesto.");

                        } else {
                            numDias = 29;
                            System.out.println("El mes Febrero del año " + any + " tiene " + numDias + " días.");
                            System.out.println("El año " + any + " sí es bisiesto.");
                        }
                    } else {
                        numDias = 28;
                        System.out.println("El mes Febrero del año " + any + " tiene " + numDias + " días.");
                        System.out.println("El año " + any + " no es bisiesto.");
                    }
                    break;
                case 3:
                    numDias = 31;
                    System.out.println("El mes Marzo tiene " + numDias + " días.");
                    break;
                case 4:
                    numDias = 30;
                    System.out.println("El mes Abril tiene " + numDias + " días.");
                    break;
                case 5:
                    numDias = 31;
                    System.out.println("El mes Mayo tiene " + numDias + " días.");
                    break;
                case 6:
                    numDias = 30;
                    System.out.println("El mes Junio tiene " + numDias + " días.");
                    break;
                case 7:
                    numDias = 31;
                    System.out.println("El mes Julio tiene " + numDias + " días.");
                    break;
                case 8:
                    numDias = 31;
                    System.out.println("El mes Agosto tiene " + numDias + " días.");
                    break;
                case 9:
                    numDias = 30;
                    System.out.println("El mes Septiembre tiene " + numDias + " días.");
                    break;
                case 10:
                    numDias = 31;
                    System.out.println("El mes Octubre tiene " + numDias + " días.");
                    break;
                case 11:
                    numDias = 30;
                    System.out.println("El mes Noviembre tiene" + numDias + " días.");
                    break;
                case 12:
                    numDias = 31;
                    System.out.println("El mes Diciembre tiene" + numDias + " días.");
                    break;
            }

        } else {
            System.out.println("Valores incorrectos. Debes introducir un mes entre 1 y 12 y un año entre 1 y 2016.");
        }
    }

    public static void ejercicio10() {

        /*
            Quin és l’error del següent tros de codi? Com es podria corregir?
         */
        int x, y, z;

        x = teclado.nextInt();
        y = teclado.nextInt();
        z = teclado.nextInt();

        if (x < y && y < z) {
            System.out.printf("%d < %d < %d\n", x, y, z);
        }

    }

    public static void ejercicio11_1() {

        /*  Escriure un programa que escrigui la suma dels n primers nombres parells,
            considerant que el primer nombre parell és el 2. Podeu suposar que n és sempre més
            gran o igual que 0. Si n val 0, el programa ha d’escriure també 0. El valor de n és
            introduït per teclat. Heu d’escriure tres versions diferents del programa, utilitzant les
            tres estructures iteratives del C: while ... , do ... while, for ... */
        int n;
        int count;
        int par = 0;
        int total = 0;
        System.out.println("¿Número de pares a sumar?:");
        n = teclado.nextInt();

        for (count = 1; count <= n; count++) {
            par = par + 2;
            total = total + par;
        }

        System.out.println("Suma de los primeros " + n + " pares es: " + total);

    }

    public static void ejercicio11_2() {

        /*  Escriure un programa que escrigui la suma dels n primers nombres parells,
            considerant que el primer nombre parell és el 2. Podeu suposar que n és sempre més
            gran o igual que 0. Si n val 0, el programa ha d’escriure també 0. El valor de n és
            introduït per teclat. Heu d’escriure tres versions diferents del programa, utilitzant les
            tres estructures iteratives del C: while ... , do ... while, for ... */
        int n;
        int count = 1;
        int par = 0;
        int total = 0;
        System.out.println("¿Número de pares a sumar?:");
        n = teclado.nextInt();

        while (count <= n) {
            count = count + 1;
            par = par + 2;
            total = total + par;
        }

        System.out.println("Suma de los primeros " + n + " pares es: " + total);

    }

    public static void ejercicio11_3() {

        /*  Escriure un programa que escrigui la suma dels n primers nombres parells,
            considerant que el primer nombre parell és el 2. Podeu suposar que n és sempre més
            gran o igual que 0. Si n val 0, el programa ha d’escriure també 0. El valor de n és
            introduït per teclat. Heu d’escriure tres versions diferents del programa, utilitzant les
            tres estructures iteratives del C: while ... , do ... while, for ... */
        int n;
        int count = 1;
        int par = 0;
        int total = 0;
        System.out.println("¿Número de pares a sumar?:");
        n = teclado.nextInt();

        do {
            count = count + 1;
            par = par + 2;
            total = total + par;
        } while (count <= n);

        System.out.println("Suma de los primeros " + n + " pares es: " + total);

    }

    public static void ejercicio12_1() {

        /*  Escriure un programa (amb les tres estructures iteratives, while..., do ... while i for
            ...) que llegeixi un nombre N més gran que zero i calculi la suma 1 + 2 + 3 + .... + N. */
        int n;
        int count;
        int total = 0;
        int suma = 0;
        System.out.println("Introduce un número: ");
        n = teclado.nextInt();

        if (n > 0) {
            for (count = 1; count <= n; count++) {
                suma = suma + 1;
                total = total + suma;
            }
            System.out.println("Suma de la serie de números hasta " + n + " es: " + total);
        }
    }

    public static void ejercicio12_2() {

        /*  Escriure un programa (amb les tres estructures iteratives, while..., do ... while i for
            ...) que llegeixi un nombre N més gran que zero i calculi la suma 1 + 2 + 3 + .... + N. */
        int n;
        int count = 1;
        int total = 0;
        int suma = 0;
        System.out.println("Introduce un número: ");
        n = teclado.nextInt();

        if (n > 0) {
            while (count <= n) {
                count++;
                suma = suma + 1;
                total = total + suma;
            }
        }
        System.out.println("Suma de la serie de números hasta " + n + " es: " + total);
    }

    public static void ejercicio12_3() {

        /*  Escriure un programa (amb les tres estructures iteratives, while..., do ... while i for
            ...) que llegeixi un nombre N més gran que zero i calculi la suma 1 + 2 + 3 + .... + N. */
        int n;
        int count = 1;
        int total = 0;
        int suma = 0;
        System.out.println("Introduce un número: ");
        n = teclado.nextInt();

        if (n > 0) {
            do {
                count++;
                suma = suma + 1;
                total = total + suma;
            } while (count <= n);
        }
        System.out.println("Suma de la serie de números hasta " + n + " es: " + total);
    }

    // Exercicis 13, 14 i 15 al fitxer de text "Ejercicis teòrics.txt"
    
    public static void ejercicio16() {

        /*  Escriure un programa que calculi el mínim, el màxim i la mitja d’una sèrie de
            nombres introduïts per l’usuari. La sèrie acaba quan l’usuari introdueix un nombre
            negatiu. */
        int count = 0;
        int num;
        int suma = 0;
        int media;
        int max;
        int min;

        System.out.println("Introduce un número (negativo para finalizar serie): ");
        num = teclado.nextInt();
        count++;
        max = num;
        min = num;
        suma = num;
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);

        while (num >= 0) {

            num = teclado.nextInt();
            if (num < 0) {
                break;
            }
            count++;
            suma = suma + num;
            if (num < max && num <= min) {
                // Para el caso en que se introduce un número menor.
                min = num;
                System.out.println("Máximo: " + max);
                System.out.println("Mínimo: " + min);
            } else if (num > max) {
                // Para el caso en que se introducen más números en la serie.
                max = num;
                System.out.println("Máximo: " + max);
                System.out.println("Mínimo: " + min);
            } else {
                // Mostrar max y min si no se cumplen las condiciones anteriores.
                System.out.println("Máximo: " + max);
                System.out.println("Mínimo: " + min);
            }
            /* Fin de la serie al introducir negativo.
            System.out.println("Has introducido un número negativo. Fin de la serie."); */
        }
        media = suma / count;

        System.out.println("");
        System.out.println("Cantidad de números introducidos: " + count);
        System.out.println("Suma total de los números introducidos: " + suma);
        System.out.println("");
        System.out.println("Procedemos a calcular la media de todos ellos. ");
        System.out.println("Media: " + media);
    }

    public static void ejercicio17() {

        /*  Escriure un programa que compti quants nombres positius i negatius d’introdueixen
            per teclat. El programa ha de parar quan el nombre introduït sigui el zero. */
        int num;
        int positiu = 0;
        int negatiu = 0;
        System.out.println("Introduce un número (cero para terminar serie): ");
        num = teclado.nextInt();

        if (num == 0) {
            System.out.println("Has introducido un cero. Fin de programa.");
        } else if (num>0){
            positiu = 1;
        } else {
            negatiu = 1;
        }

        while (num != 0) {
            num = teclado.nextInt();
            if (num > 0) {
                positiu++;
            } else if (num < 0) {
                negatiu++;
            } else {
                System.out.println("Has introducido el cero. Fin de programa.");
            }
        }

        System.out.println("¿Cuántos positivos? " + positiu);
        System.out.println("¿Cuántos negativos? " + negatiu);
    }

    public static void ejercicio18() {

        /*  Escriure un programa que llegeixi un nombre N més gran que zero i escrigui la
            sèrie: 2^1 ,2^2, 2^N */
        int n;
        int num;
        int total = 1;
        System.out.println("Introduce un número: ");
        num = teclado.nextInt();
        System.out.print("Número 2^: ");
        if (num > 0) {
            for (n = 1; n <= num; n++) {
                if(total != num){
                System.out.print("2^" + total + ", ");
                total = total + 1;
                }else{
                    System.out.print("2^" + total + ".");
                }
            }
            System.out.println("");
            System.out.println("Total: " + total);
        } else {
            System.out.println("ERROR");
        }
    }

    public static void ejercicio19() {

        /*  Escriure un programa que llegeixi un nombre N més gran que zero i digui quantes
            vegades és divisible aquest nombre per 2. */
        int num;
        int div;
        int sumador = 1;
        System.out.println("Introduce un número: ");
        num = teclado.nextInt();

        if (num > 0) {
            div = num / 2;
            //System.out.println("div1: " + div);
            while (div > 2) {
                div = div / 2;
                sumador++;
                //System.out.println("div2: " + div);
            }
            System.out.println("¿Cuántas veces es divisible por 2?: " + sumador);
        }
    }
    
    // Exercici 20 al fitxer de text "Ejercicis teòrics.txt"
    
}
