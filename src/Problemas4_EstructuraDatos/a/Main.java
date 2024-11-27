package Problemas4_EstructuraDatos.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cantEnteros;

        Scanner teclado = new Scanner(System.in);
        cantEnteros = teclado.nextInt();

        int[] primerSecuencia = new int[cantEnteros];
        int[] segundaSecuencia = new int[cantEnteros];

        //Secuencias sin números repetidos
        List<Integer> primerSecuenciaSinRepetido = new ArrayList<>();
        List<Integer> segundaSecuenciaSinRepetido = new ArrayList<>();

        // CARGA DE SECUENCIAS
        for (int i = 0; i < cantEnteros; i++) {
            primerSecuencia[i] = teclado.nextInt();
        }
        for (int i = 0; i < cantEnteros; i++) {
            segundaSecuencia[i] = teclado.nextInt();
        }

        //filtra numeros de la primarea secuencia
        for (int i = 0; i < cantEnteros; i++) {
            boolean estaEnSegunda = false;
            for (int j = 0; j < cantEnteros; j++) {
                if (primerSecuencia[i] == segundaSecuencia[j]) {
                    estaEnSegunda = true;
                    break;
                }
            }
            if (!estaEnSegunda) {
                primerSecuenciaSinRepetido.add(primerSecuencia[i]);
            }
        }

        //filtra numeros de la segunda secuencia
        for (int i = 0; i < cantEnteros; i++) {
            boolean estaEnPrimera = false;
            for (int j = 0; j < cantEnteros; j++) {
                if (segundaSecuencia[i] == primerSecuencia[j]) {
                    estaEnPrimera = true;
                    break;
                }
            }
            if (!estaEnPrimera) {
                segundaSecuenciaSinRepetido.add(segundaSecuencia[i]);
            }
        }

        //lista de enteros
        imprimirLista(primerSecuenciaSinRepetido);
        imprimirLista(segundaSecuenciaSinRepetido);
    }

    private static void imprimirLista(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
