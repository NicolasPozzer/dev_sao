package Problemas4_EstructuraDatos.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //De una lista de numeros ver que numero aparece mas veces y guardarlo


        int longitud = 0;
        int mayor = 0;
        int numeroBuscado = 0;

        Scanner teclado = new Scanner(System.in);
        longitud = teclado.nextInt();

        int[] lista = new int[longitud];

        for(int i = 0; i < longitud; i++){
            lista[i] = teclado.nextInt();
        }

        for(int i = 0; i < longitud; i++){
            int contador = 0;
            for(int j = 0; j < longitud; j++){
                if(lista[i] == lista[j]){
                    contador = contador + 1;
                }
            }
            if(contador > mayor){
                mayor = contador;
                numeroBuscado = lista[i];
            }
        }

        System.out.println(numeroBuscado);

    }
}
