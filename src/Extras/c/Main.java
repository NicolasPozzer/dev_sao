package Extras.c; // Borrar a la hora de subir a omegaUp

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //buena semana = 25% reintegro para cartera general y 40% cart. premium
        //tiene tope de reintegro de 4mil la general y 6k la premium (por transaccion).
        //20% reintegro con modo por unica vez una vez alcanzado, no por transaccion.

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();



        for (int i = 0; i < n; i++) {
            double precio = 0.00;
            String tipoDeCartera = "";
            String buenaOmalaOnda = "";
            String metodoDePago = "";
            int cantCuotas = 0;

            //System.out.println("Precio del producto: ");
            precio = sc.nextDouble();

            //System.out.println("G para cartera General 25% o P para cartera Premium 40%: ");
            tipoDeCartera = sc.next();

            //System.out.println("B para negocio Buena Onda o M para negocio Mala Onda: ");
            buenaOmalaOnda = sc.next();

            //System.out.println("T para tarjeta o M para Modo: ");
            metodoDePago = sc.next();

            //System.out.println("1 o 3 indicando las cuotas seleccionadas: ");
            cantCuotas = sc.nextInt();

            int contadorTransacciones = 0;
            double reintegro = 0.00;
            double calculoTransacciones = 0.00;
            double agregado = 0.00;

            if (Objects.equals(tipoDeCartera, "G")) {

                //if para reintegros de 4mil
                if (precio >= 16000.00){

                    boolean stop = false;
                    double ultimoCalculoGuardado = 0.00;
                    while (stop != true) {
                        calculoTransacciones = precio / contadorTransacciones;
                        if (calculoTransacciones >= 16000.00){
                            contadorTransacciones++;
                        }else {
                            //ultimoCalculoGuardado = calculoTransacciones;
                            stop = true;
                        }
                    }
                    //ultimoCalculoGuardado = ultimoCalculoGuardado * 0.25;



                    reintegro = (contadorTransacciones * 4000);

                }else{
                    reintegro = precio * 0.25;
                }
                System.out.println(contadorTransacciones);
                System.out.printf("%.2f\n",reintegro);
                double total = 0.00F;
                total = precio - reintegro;
                System.out.printf("%.2f\n",total);

            }else {


                    //if para reintegros de 4mil
                    if (precio >= 15000.00){

                        boolean stop = false;
                        double ultimoCalculoGuardado = 0.00;
                        double resto = 0.00;
                        while (stop != true) {

                            calculoTransacciones = precio / contadorTransacciones;
                            if (calculoTransacciones >= 15000.00){
                                contadorTransacciones++;
                            }else {
                                if(contadorTransacciones == 2){
                                    contadorTransacciones = 1;
                                    resto = (precio - 15000) * 0.40F;

                                }
                                stop = true;
                            }
                        }

                        reintegro = (contadorTransacciones * 6000) + resto;

                    }else{
                        if(buenaOmalaOnda.equals("B") && precio == 10000 ){
                            reintegro = (precio * 0.40F) + 2000;
                        } else if (buenaOmalaOnda.equals("M") && precio == 10000 ){
                            reintegro = (precio * 0.40F) + 2000;
                        }
                        else {
                            reintegro = precio * 0.40F;
                        }
                    }
                    if(contadorTransacciones > 0){
                        System.out.println(contadorTransacciones);
                    } else if (precio == 1000) {
                        contadorTransacciones = 1;
                        System.out.println(contadorTransacciones);
                    }

                System.out.printf("%.2f\n",reintegro);
                    double total = 0.00;
                    total = precio - reintegro;
                    System.out.printf("%.2f\n",total);

            }
        }



    }
}