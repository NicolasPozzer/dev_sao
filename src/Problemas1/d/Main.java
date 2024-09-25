package Problemas1.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Número de segundos a convertir
        Scanner teclado = new Scanner(System.in);
        int segundosTotales = teclado.nextInt();

        // Formato de hora del planeta
        int segundosPorMinuto = 50;
        int minutosPorHora = 70;
        int horasPorDia = 12;

        int segundosEnUnDia = segundosPorMinuto * minutosPorHora * horasPorDia;
        int dias = segundosTotales / segundosEnUnDia;
        int segundosRestantes = segundosTotales % segundosEnUnDia;

        // horas
        int segundosEnUnaHora = segundosPorMinuto * minutosPorHora;
        int horas = segundosRestantes / segundosEnUnaHora;
        segundosRestantes = segundosRestantes % segundosEnUnaHora;

        // segundos restantes en minutos
        int minutos = segundosRestantes / segundosPorMinuto;
        int segundos = segundosRestantes % segundosPorMinuto;

        System.out.println(dias+" "+horas+" "+minutos+" "+segundos);


    }
}
