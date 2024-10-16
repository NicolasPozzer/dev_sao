package Extras.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definimos los topes de reintegro
        final double TOPE_GENERAL = 3000.0;
        final double TOPE_PREMIUM = 6000.0;
        final double TOPE_MODO = 2000.0;

        // Porcentajes de reintegro
        final double REINTEGRO_GENERAL = 0.25;
        final double REINTEGRO_PREMIUM = 0.40;
        final double REINTEGRO_MODO = 0.20;

        // Leemos la cantidad de compras a realizar
        int N = sc.nextInt();
        sc.nextLine(); // Para consumir el salto de línea

        for (int i = 0; i < N; i++) {
            // Leemos los datos de la compra
            double precio = sc.nextDouble();
            sc.nextLine();
            char cartera = sc.nextLine().charAt(0); // G para General o P para Premium
            char onda = sc.nextLine().charAt(0); // B para Buena Onda o M para Mala Onda
            char medio = sc.nextLine().charAt(0); // T para Tarjeta o M para Modo
            int cuotas = sc.nextInt();
            sc.nextLine(); // Consumimos el salto de línea

            double reintegro = 0;
            double topeReintegro = 0;

            // Determinamos el tipo de cartera y el reintegro correspondiente
            if (medio == 'T') {
                if (cartera == 'G') {
                    reintegro = precio * REINTEGRO_GENERAL;
                    topeReintegro = TOPE_GENERAL;
                } else if (cartera == 'P') {
                    reintegro = precio * REINTEGRO_PREMIUM;
                    topeReintegro = TOPE_PREMIUM;
                }
            } else if (medio == 'M') {
                reintegro = precio * REINTEGRO_MODO;
                topeReintegro = TOPE_MODO;
            }

            // Aplicamos el tope de reintegro
            if (reintegro > topeReintegro) {
                reintegro = topeReintegro;
            }

            // Calculamos el precio final
            double precioFinal = precio - reintegro;

            // Si el comercio es buena onda, dividimos en transacciones
            if (onda == 'B' && medio == 'T') {
                int transacciones = (int) Math.ceil(precio / topeReintegro);
                System.out.println(transacciones);
            } else if (onda == 'B' && medio == 'M') {
                // En el caso de Modo, se aplica una única vez el reintegro con tope mensual
                System.out.println(1);
            }

            // Imprimimos los resultados con 2 decimales de precisión
            System.out.printf("%.2f\n", reintegro);
            System.out.printf("%.2f\n", precioFinal);
        }

        sc.close();


    }
}
