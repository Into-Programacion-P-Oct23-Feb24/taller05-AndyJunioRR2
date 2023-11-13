/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double gasto_hijo1;
        double gasto_hijo2;
        double gasto_hijo3;
        double total_gastos;
        System.out.println("Ingrese el gasto del primer hijo");
        gasto_hijo1 = entrada.nextDouble();
        System.out.println("Ingrese el gasto del segundo hijo");
        gasto_hijo2 = entrada.nextDouble();
        System.out.println("Ingrese el gasto del tercer hijo");
        gasto_hijo3 = entrada.nextDouble();
        
        total_gastos = gasto_hijo1 + gasto_hijo2 + gasto_hijo3;
        System.out.printf("El total de gastos por pagar es : %.2f\n", total_gastos);
    }
    
}
