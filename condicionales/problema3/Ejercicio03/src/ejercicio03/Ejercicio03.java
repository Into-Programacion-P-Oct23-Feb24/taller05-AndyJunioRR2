/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precio_venta;

        System.out.println("Ingrese la marca del automovil por favor");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del automovil por favor");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automovil por favor");
        costo = entrada.nextDouble();

        if (origen.equals("Alemania") || origen.equals("alemania")) {
            impuesto = costo * 0.20;
            precio_venta = costo + impuesto;
            System.out.printf("El impuesto por pagar es: %.2f\n",
                    impuesto);
            System.out.printf("El precio de venta es: %.2f\n",
                    precio_venta);

        } else {
            if (origen.equals("Japon") || origen.equals("japon")) {
                impuesto = costo * 0.30;
                precio_venta = costo + impuesto;
                System.out.printf("El impuesto por pagar es: %.2f\n",
                        impuesto);
                System.out.printf("El precio de venta es: %.2f\n",
                        precio_venta);
            } else {
                if (origen.equals("Italia") || origen.equals("italia")) {
                impuesto = costo * 0.15;
                precio_venta = costo + impuesto;
                System.out.printf("El impuesto por pagar es: %.2f\n",
                        impuesto);
                System.out.printf("El precio de venta es: %.2f\n",
                        precio_venta);
                } else {
                    if (origen.equals("Usa") || origen.equals("usa")) {
                impuesto = costo * 0.08;
                precio_venta = costo + impuesto;
                System.out.printf("El impuesto por pagar es: %.2f\n",
                        impuesto);
                System.out.printf("El precio de venta es: %.2f\n",
                        precio_venta);
                    }
                }
            }    
        }
    }
}    