/* Author */
/* Pozzer, Jose Nicolas */

package Parcial;

import java.util.Random;
import java.util.Scanner;

public class PozzerJoseNicolas {
    public static void main(String[] args) {

        /* tipos de objetos */
        // honguinos = 7561
        // papillones = 7562
        // chopocleros =  7563
        // panes de cesped = 7564

        //carga de matriz con mas de 2 filas y columnas con numeros aleatorios del 7561 al 7564
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int F = 0;
        int C = 0;

        int honguinos = 7561;
        int papillones = 7562;
        int chopocleros =  7563;
        int panesDeCesped = 7564;

        System.out.println("\n===========================");
        System.out.println("\t PLANTS VS ZOMBIES");
        System.out.println("===========================\n");

        //Condicionales para reintento si la columna o fila es menor o igual a 2
        System.out.print("Ingrese numero de filas para el campo: ");
        F = teclado.nextInt();
        if(F <= 2){
            System.out.println("No puede ingresar un numero de filas menor a 2, ingrese el numero nuevamente: ");
            F = teclado.nextInt();
        }
        System.out.print("Ingrese numero de columnas para el campo: ");

        C = teclado.nextInt();
        if(C <= 2){
            System.out.println("No puede ingresar un numero de columnas menor a 2, ingrese el numero nuevamente: ");
            C = teclado.nextInt();
        }


        //matriz
        int [][] matriz = new int[F][C];

        //carga de matriz
        for(int x = 0; x < F; x++){
            for(int j = 0; j < C; j++){
                matriz[x][j] = random.nextInt(7561,7565);//rango desde 7561 al 7564
            }
        }
        System.out.println();

        //llamado de los metodos
        campoDePlantasvsZombies(matriz, F, C);
        mostrarPlantasPorCantidades(matriz, F, C);
        porcentajeDeChopoclerosEnFilasImpares(matriz, F, C, chopocleros);
        respuestasAPreguntas();
    }


    /* METODOS */

    public static void campoDePlantasvsZombies(int [][] matriz, int F, int C){
        System.out.println("\n=======================================");
        System.out.println("\t CAMPO DE PLANTAS VS ZOMBIES");
        System.out.println("=======================================\n");

        //imprimir por pantalla la matriz
        for(int x = 0; x < F; x++){
            for(int j = 0; j < C; j++){
                System.out.print("\t"+ matriz[x][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void mostrarPlantasPorCantidades(int [][] matriz, int F, int C){
        int acumPapillones = 0;
        int acumHonguinos = 0;

        for(int x = 0; x < F; x++){
            for(int j = 0; j< C; j++){

                switch (matriz[x][j]){

                    case 7562://papillones
                        acumPapillones = acumPapillones + 1;
                        break;
                    case 7561://honguinos
                        acumHonguinos = acumHonguinos + 1;
                }
            }
        }

        //comparar mayor, igual y imprimir resultados
        if(acumPapillones > acumHonguinos){
            System.out.println("Existen mas Papillones que Honguinos!");
            System.out.println("Con un total de: '" + acumPapillones+ "' Papillones y '"+ acumHonguinos + "' Honguinos");
        }
        //cantidad igual
        else if (acumPapillones == acumHonguinos) {
            System.out.println("La cantidad de Papillones y Honguinos es igual!");
            System.out.println("Con un total de: '" + acumPapillones+ "' Papillones y '"+ acumHonguinos + "' Honguinos");
        }
        //mas honguinos q papillones
        else{
            System.out.println("Existen mas Honguinos que Papillones!");
            System.out.println("Con un total de: '" + acumHonguinos+ "' Honguinos y '"+ acumPapillones + "' Papillones");
        }
    }


    public static void porcentajeDeChopoclerosEnFilasImpares(int [][] matriz, int F, int C, int chopocleros){

        System.out.println("\n<<<Porcentaje de Chopocleros en la filas impares del Campo>>>");
        for(int i = 0; i < F; i++){
            //condicional para recorrer solo las filas impares
            if ( i % 2 != 0){
                //variables locales que la reseteamos a 0 al cambiasr de fila
                double porcentajeEnFila = 0.00;
                int contadorChopocleros = 0;

                for(int j = 0; j < C; j++){
                    if(matriz[i][j] == chopocleros){
                        contadorChopocleros = contadorChopocleros + 1;
                    }
                }

                //calcular porcentaje
                porcentajeEnFila = ((double) contadorChopocleros / C) * 100;

                System.out.println("\nEl porcentaje de Plantas Pochocleros en la fila -> '" + i + "' es: ");
                System.out.printf("\t%.2f",porcentajeEnFila);
                System.out.println("\n<----------------------------------------------->");
            }
        }

    }


    public static void respuestasAPreguntas(){

        System.out.println("\n\n\t ----------------- Respuestas a preguntas -----------------");
        System.out.println("Respuesta 1: Los arreglos son estructuras de datos y son de tipo homogeneos, ya que " +
                "todos los elementos tienen el mismo tipo.\n" +
                "Respuesta 2: El Tope Logico de un arreglo es la posicion del ultimo elemento en el arreglo.\n" +
                "En una pila utilizamos el tope para indicar donde insertar o eliminar elementos. y en la cola se" +
                "utiliza para controlar el final de la estructura mientras el inicio se va eliminando." +
                "\nRespuesta 3: Para eliminar un elemento en el tope logico del arreglo, Primero deberiamos ver" +
                " si el arreglo no esta vacio y luego decrementar su indice del tope logico.\n" +
                "\t\t\t  Si intentamos eliminar un elemento de un arreglo vacio ocurre lo que se llama un error logico o underflow" +
                " ,ya que no hay elemntos para eliminar del arreglo.");
    }

}















