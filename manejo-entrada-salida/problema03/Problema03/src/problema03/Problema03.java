/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costo_minutos;
        double numero_minutos;
        double valor_planilla;
        System.out.println("Ingrese el costo por minutos");
        costo_minutos = entrada.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos en el mes");
        numero_minutos = entrada.nextDouble();
        
        valor_planilla = costo_minutos * numero_minutos;
        System.out.printf("El valor de su planilla de telefono por pagar es "
                + ": %.2f\n", valor_planilla);
    }   
}
