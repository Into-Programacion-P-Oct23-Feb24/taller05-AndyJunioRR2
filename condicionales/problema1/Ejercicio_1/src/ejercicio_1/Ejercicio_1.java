/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valor_kv;
        double numero_kv;        
        int edad;
        double pago_total;
        double descuento;
        System.out.println("Ingresar el valor de kilovatio/hora");
        valor_kv = entrada.nextDouble();
        System.out.println("Ingresar el valor de kilovatios consumidos en el mes");
        numero_kv = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        descuento = 0.10;
        pago_total = (valor_kv * numero_kv);
        if (edad > 65 ) {
           pago_total = pago_total - (pago_total * descuento);
           System.out.printf("El valor total a pagar es: %.2f\n", pago_total);
        } else {
            System.out.printf("El valor total a pagar es: %.2f\n", pago_total);
        }
    }
    
}
