package Modelo_Parcial.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int filas = 0;
        int columnas = 0;

        filas = teclado.nextInt();
        columnas = teclado.nextInt();

        //matriz
        int [][] matriz = new int[filas][columnas];

        //cargar matriz
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matriz[i][j] = teclado.nextInt();
            }
        }

    }

    public static void numeroEnFilasImpares(int [][] matriz, int fila, int columna){
        for(int i = 0; i < fila; i++){
            for(int j = 0; j < columna; j++){
                
            }
        }
    }
}
