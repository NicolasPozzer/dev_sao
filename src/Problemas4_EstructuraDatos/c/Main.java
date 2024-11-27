package Problemas4_EstructuraDatos.c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //String texto;
        Scanner teclado = new Scanner(System.in);

        //texto = teclado.next();
        int longitud = teclado.nextInt();


        int contadorDiagonal = 0;
        int primerValorDiagonal = 0;

        int [][] matriz = new int [longitud][longitud];

        for(int i = 0; i < longitud; i++){
            for(int j = 0; j < longitud; j++){
                matriz[i][j] = teclado.nextInt();
            }
        }

        primerValorDiagonal = matriz[0][0];

        //recorrido para calcular y validar si son iguales
        for(int i = 0; i < longitud; i++){
            for(int j = 0; j < longitud; j++){

                if(i == j){
                    if(matriz[i][j] == primerValorDiagonal){
                        contadorDiagonal++;
                    }
                }
            }
        }

        //Verificamos si el contador tiene el mismo numero que la longitud, es decir que el contador de diagonal
        //se incremento las veces que la diagonal tenia un numero igual al indice 1,1
        if(contadorDiagonal == longitud){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
