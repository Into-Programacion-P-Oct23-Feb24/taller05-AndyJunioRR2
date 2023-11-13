/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double netflix;
        double youtube_premium;
        double dropbox;
        double spotify;
        int edad;
        double descuento;
        double valor_total;
        
        System.out.println("Ingrese el costo mensual de netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el costo mensual de youtube premium");
        youtube_premium = entrada.nextDouble();
        System.out.println("Ingrese el costo mensual de dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el costo mensual de spotify");
        spotify = entrada.nextDouble();
        System.out.println("Ingrese su edad por favor");
        edad = entrada.nextInt();
        valor_total= netflix + youtube_premium + dropbox + spotify;
        
        if (edad < 30 ) {
           descuento = valor_total * 0.20;
           valor_total = valor_total - descuento;
           System.out.printf("El valor total a pagar mensual es: %.2f\n", valor_total);
        } else {
            System.out.printf("El valor total a pagar mensual es: %.2f\n", valor_total);
        }
    }
}    
