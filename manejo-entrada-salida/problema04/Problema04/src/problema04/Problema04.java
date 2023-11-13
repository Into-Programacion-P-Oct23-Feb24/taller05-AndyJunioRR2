/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double costo_total;
        
        System.out.println("Ingrese el costo del cpu");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el costo del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el costo de la pantalla");
        pantalla = entrada.nextDouble();
        System.out.println("Ingrese el costo del raton");
        raton = entrada.nextDouble();
        
        costo_total = cpu + teclado + pantalla + raton;
        System.out.printf("El costo total de una computadora de escritorio es "
                + ": %.2f\n", costo_total);
    }
}
