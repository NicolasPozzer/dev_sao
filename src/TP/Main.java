package TP;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables globales
        int appRecomendada = 0;
        int cantAplicacion = 0;
        double montoAInvertir = 0.0;
        double mayorRetorno = 0.0;

        System.out.println("\t---INVERSIONES---\n");

        //scanner
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);//locale us para el punto

        System.out.print("Ingrese la cantidad de Dinero que desea invertir: ");
        montoAInvertir = teclado.nextDouble();

        System.out.println("\nIngrese con la cantidad de aplicaciones que desea comparar(max. 3): ");
        System.out.println("1 = Uala");
        System.out.println("2 = Uala y Naranja X");
        System.out.println("3 = Uala, Naranja X y PersonalPay");
        cantAplicacion = teclado.nextInt();

        //recorrido y evaluacion de cada App
        for (int i = 1; i <= cantAplicacion; i++) {
            double calcular = 0.0;

            switch (i) {
                case 1:
                    System.out.println("Tasa Nominal Anual de Uala (Ej. 0.45 = 45%): ");
                    break;
                case 2:
                    System.out.println("Tasa Nominal Anual de Naranja X: ");
                    break;
                case 3:
                    System.out.println("Tasa Nominal Anual de PersonalPay: ");
            }
            double tasaNominal = teclado.nextDouble();

            System.out.println("Tope de Inversion: ");
            double topeInversion = teclado.nextDouble();

            //llamamos a la funcion y guardamos su resultado para luego comparar su retorno
            calcular = calcularInteresDiario(montoAInvertir, tasaNominal, topeInversion);

            if (calcular > mayorRetorno) {
                mayorRetorno = calcular;
                appRecomendada = i; //guardamos el indice del for con la app recomendada
            }
        }


        //imprimimos el resultado con switch
        switch (appRecomendada) {
            case 1:
                System.out.println("La Aplicacion Mas recomendada a invertir es la: " + appRecomendada + " Uala con una " +
                        "tasa de 45% anual!!!");
                break;
            case 2:
                System.out.println("La Aplicacion Mas recomendada a invertir es la: " + appRecomendada + " Naranja X con una " +
                        "tasa de 42% anual!!!");
                break;
            case 3:
                System.out.println("La Aplicacion Mas recomendada a invertir es la: " + appRecomendada + " Personal Pay con una " +
                        "tasa de 37% anual sin tope de inversion!!!");
                break;
        }

    }


    public static double calcularInteresDiario(double montoInversion, double tasaNominal, double topeInversion) {
        double interesDiario = 0.0; //variable local

        double montoAInvertirFinal = montoInversion;

        //si la app tiene tope, ajustamos el monto a invertir al tope
        if (topeInversion != -1 && montoInversion > topeInversion) {
            montoAInvertirFinal = topeInversion;
        }

        interesDiario = (tasaNominal / 365) * montoAInvertirFinal;

        return interesDiario;
    }
}