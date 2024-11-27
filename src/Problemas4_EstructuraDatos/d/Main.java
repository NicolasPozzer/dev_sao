package Problemas4_EstructuraDatos.d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int longitud = teclado.nextInt();

        int [][] matriz = new int[longitud][longitud];

        int contadorFilasImpares = 0;

        if(longitud >= 3 && longitud <= 10) {

            //cargar matriz
            for (int i = 0; i < longitud; i++) {
                for (int j = 0; j < longitud; j++) {
                    matriz[i][j] = teclado.nextInt();
                }
            }

            for (int i = 0; i < longitud; i++) {
                int contador = 0;
                for (int j = 0; j < longitud; j++) {

                    if(matriz[i][j] % 2 != 0){
                        contador = contador + 1;
                    }
                }
                //solo incrementamos contador filas impares si todas las columnas son impares y por ende conto
                //la misma cantidad de veces que tiene la longitud(tamanio de columnas).
                if(contador == longitud){
                    contadorFilasImpares = contadorFilasImpares + 1;
                }
            }

            if(contadorFilasImpares == 2){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}
