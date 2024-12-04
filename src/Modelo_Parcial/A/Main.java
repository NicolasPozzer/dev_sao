package Modelo_Parcial.A;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int F = 0;
        int C = 0;

        System.out.println("Ingrese el numero de filas: ");
        F = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        C = teclado.nextInt();

        //matriz
        int [][] matriz = new int[F][C];

        // Random para generar números aleatorios
        Random random = new Random();//
        
        // Poblar la matriz con valores aleatorios entre 100 y 999
        System.out.println("Matriz generada:");

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {

                // Números entre 100 y 999
                matriz[i][j] = random.nextInt(100, 900);
            }
        }

        // Mostrar la matriz generada
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matriz[i][j] + "\t"); // Mostrar cada elemento separado por tabulaciones
            }
            // Salto de línea en cada fila
            System.out.println();
        }

        //MENU
        int valor = 0;


        System.out.println("Elige una Opcion:" +
                "\n1 = Encontrar la cantidad de veces que aparece un numero en filas impares." +
                "\n2 = Obtener la cantidad de columnas con mas numero impares que pares." +
                "\n3 = Indicar si hay alguna fila que tenga más de 3 múltiplos de 5."+
                "\n4 = Obtener la cantidad de Numeros Primos de la Matriz"+
                "\n5 = SALIR.");

        valor = teclado.nextInt();


        while(valor != 5){

            switch(valor){
                case 1:
                    cantNumerosImpares(matriz, F, C);
                    break;
                case 2:
                    parImpar(matriz, F, C);
                    break;
                case 3:
                    filasConMultiplosDeCinco(matriz, F, C);
                    break;
                case 4:
                    contadorDeNumerosPrimos(matriz, F, C);
                    break;
                default:
                    System.out.println("Valor no valido!");
            }


            menu();
            valor = teclado.nextInt();
        }



    }


    public static void cantNumerosImpares(int [][] matriz, int F, int C){
        Scanner teclado2 = new Scanner(System.in);
        int valor = 0;

        //contador de veces
        int contVeces = 0;

        System.out.println("Ingrese el numero a buscar: ");
        valor = teclado2.nextInt();
        if(valor >= 100 && valor <= 999){
            for(int i = 0; i < F; i++){
                if ( i % 2 != 0){
                    for(int j = 0; j < C; j++){
                        if(matriz[i][j] == valor){
                            contVeces = contVeces + 1;
                        }
                    }
                }
            }
            System.out.println("La cantidad de veces que aparece el numero: " + valor + " es: " + contVeces);
        }else{
            System.out.println("El valor no se encuentra en el rango de [100, 999]");
        }
    }

    public static void parImpar(int [][] matriz, int F, int C){
        //contador global
        int cantColumnasPares = 0;

        for(int j = 0; j < C; j++){
            int contarPares = 0;
            for(int i = 0; i < F; i++){
                if(matriz[j][i] % 2 == 0){
                    contarPares = contarPares + 1;
                }
            }
            if(contarPares > (F / 2) ){
                cantColumnasPares = cantColumnasPares + 1;
            }
        }

        if(cantColumnasPares > 0){
            System.out.println("La cantidad de Columnas con mas numeros pares que impares es: " + cantColumnasPares);
        }else{
            System.out.println("Ninguna columna tiene mas numeros pares que impares.");
        }
    }


    public static void filasConMultiplosDeCinco(int [][] matriz, int F, int C){
        //contador global (NO SE RESETEA)
        int cantFilasMultiplosDeCinco = 0;

        for(int i = 0; i < F; i++){
            //Contador Local (inicializa en 0 cuando cambia de fila)
            int contMultiplo = 0;

            for(int j = 0; j < C; j++){
                if(matriz[i][j] % 5 == 0){
                    contMultiplo = contMultiplo + 1;
                }
            }
            if(contMultiplo > 3){
                cantFilasMultiplosDeCinco = cantFilasMultiplosDeCinco + 1;
            }
        }

        if(cantFilasMultiplosDeCinco > 0){
            System.out.println("Si hay filas con mas de 3 multiplos de 5");
        }else{
            System.out.println("No hay filas con mas de 3 multiplos de cinco");
        }
    }

    public static void contadorDeNumerosPrimos(int[][] matriz, int F, int C) {
        int contarCantidadDePrimos = 0;

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                if (matriz[i][j] > 1) { // Solo considerar números mayores que 1
                    boolean esPrimo = true;
                    for (int num = 2; num <= Math.sqrt(matriz[i][j]); num++) { // Mejor eficiencia
                        if (matriz[i][j] % num == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        contarCantidadDePrimos++;
                    }
                }
            }
        }

        System.out.println("La cantidad de números primos que existen en la matriz es: " + contarCantidadDePrimos);
    }


    public static void menu(){
        System.out.println("Elige una Opcion:" +
                "\n1 = Encontrar la cantidad de veces que aparece un numero en filas impares." +
                "\n2 = Obtener la cantidad de columnas con mas numero impares que pares." +
                "\n3 = Indicar si hay alguna fila que tenga más de 3 múltiplos de 5."+
                "\n4 = Obtener la cantidad de Numeros Primos de la Matriz"+
                "\n5 = SALIR.");
    }
}