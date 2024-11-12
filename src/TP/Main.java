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

        //scanner
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);//locale us para el punto

        montoAInvertir = teclado.nextDouble();
        cantAplicacion = teclado.nextInt();

        //recorrido y evaluacion de cada App
        for (int i = 1; i <= cantAplicacion; i++) {
            double calcular = 0.0;
            double tasaNominal = teclado.nextDouble();
            double topeInversion = teclado.nextDouble();

            //llamamos a la funcion y guardamos su resultado para luego comparar su retorno
            calcular = calcularInteresDiario(montoAInvertir, tasaNominal, topeInversion);

            if (calcular > mayorRetorno) {
                mayorRetorno = calcular;
                appRecomendada = i; //guardamos el indice del for con la app recomendada
            }
        }

        //imprimimos resultado
        System.out.println(appRecomendada);
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