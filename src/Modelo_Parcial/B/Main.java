package Modelo_Parcial.B;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Caramelos */
        // naranja = 1
        // fuxia = 2
        // verde = 3
        // azul = 4

        //carga de matriz con mas de 2 filas y columnas con numeros aleatorios del 1 al 4
        //mostrar por pantalla

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int F = 0;
        int C = 0;

        System.out.print("Ingrese numero de filas: ");
        F = teclado.nextInt();
        if(F <= 2){
            System.out.println("No puede ingresar un numero de filas menor a 2, ingrese el numero nuevamente: ");
            F = teclado.nextInt();
        }
        System.out.print("Ingrese numero de columnas: ");

        C = teclado.nextInt();
        if(C <= 2){
            System.out.println("No puede ingresar un numero de columnas menor a 2, ingrese el numero nuevamente: ");
            F = teclado.nextInt();
        }

        //matriz
        int [][] matriz = new int[F][C];

        //carga de matriz
        for(int x = 0; x < F; x++){
            for(int y = 0; y < C; y++){
                matriz[x][y] = random.nextInt(1,4);
            }
        }

        //imprimir por pantalla la matriz
        for(int x = 0; x < F; x++){
            for(int y = 0; y < C; y++){
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }


        System.out.println();
        //metodos
        filasConCaramelosFuxia(matriz, F, C);
        porcentajeCaramelosColorNaranjaFila2(matriz, F, C);

    }

    //filas con mas de 3 caramelos color fuxia
    public static void filasConCaramelosFuxia(int [][] matriz, int F, int C){
        int contadorGlobal = 0;

        for(int x = 0; x < F; x++){
            int contFuxias = 0;
            for(int j = 0; j < C; j++){
                if(matriz[x][j] == 2){
                    contFuxias = contFuxias + 1;
                }
            }
            if(contFuxias > 3){
                contadorGlobal = contadorGlobal + 1;
            }
        }

        if(contadorGlobal > 0){
            System.out.println("Existen filas con mas de 3 caramelos color Fuxia, en total son: "+ contadorGlobal + " filas.");
        }else{
            System.out.println("NO Existe ninguna fila que tenga mas de 3 caramelos color Fuxia");
        }
    }

    // naranja = 1
    //de la columna 2
    public static void porcentajeCaramelosColorNaranjaFila2(int [][] matriz, int F, int C){
        int contCaramelosNaranja = 0;
        double porcentaje = 0.00;

        for(int j = 0; j < C; j++){
            if(j == 1){
                for (int x = 0; x < F; x++){
                    if(matriz[x][j] == 1){
                        contCaramelosNaranja = contCaramelosNaranja + 1;
                    }
                }
            }
        }

        System.out.println("cant caramelos naranja: "+contCaramelosNaranja);
        System.out.println("cant Filas: "+F);
        porcentaje = ((double) contCaramelosNaranja / F) * 100;

        System.out.printf("El porcentaje de caramelos color Naranja en la columna 2 es: %.2f", porcentaje);
    }
}
