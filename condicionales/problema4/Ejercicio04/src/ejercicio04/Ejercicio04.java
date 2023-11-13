/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int dias;
        double precio_habitacion;
        double subtotal;
        double descuento;
        double total_pagar;

        System.out.println("Ingrese el numero de dias que se hospedara");
        dias = entrada.nextInt();
        System.out.println("Ingrese el precio diario de habitacion");
        precio_habitacion = entrada.nextDouble();

        if (dias > 5 && dias < 10) {
            subtotal = dias * precio_habitacion;
            descuento = subtotal * 0.10;
            total_pagar = subtotal - descuento;
            System.out.printf("El subtotal por pagar es: %.2f\n",
                    subtotal);
            System.out.printf("Su descuento es: %.2f\n",
                    descuento);
            System.out.printf("El total a pagar es: %.2f\n",
                    total_pagar);
        } else {
            if (dias > 10 && dias < 15) {
                subtotal = dias * precio_habitacion;
                descuento = subtotal * 0.15;
                total_pagar = subtotal - descuento;
                System.out.printf("El subtotal por pagar es: %.2f\n",
                        subtotal);
                System.out.printf("Su descuento es: %.2f\n",
                        descuento);
                System.out.printf("El total a pagar es: %.2f\n",
                        total_pagar);
            } else {
                if (dias > 15) {
                    subtotal = dias * precio_habitacion;
                    descuento = subtotal * 0.20;
                    total_pagar = subtotal - descuento;
                    System.out.printf("El subtotal por pagar es: %.2f\n",
                            subtotal);
                    System.out.printf("Su descuento es: %.2f\n",
                            descuento);
                    System.out.printf("El total a pagar es: %.2f\n",
                            total_pagar);
                    } else {
                    subtotal = dias * precio_habitacion;
                    descuento = 0;
                    total_pagar = subtotal;
                    System.out.printf("El subtotal por pagar es: %.2f\n",
                            subtotal);
                    System.out.printf("Su descuento es: %.2f\n",
                            descuento);
                    System.out.printf("El total a pagar es: %.2f\n",
                            total_pagar);
                }
            }
        }
    }
}