/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String descripcion;
        int cantidad;
        double precio_unitario;
        double descuento;
        double costopedido_total;
        
        System.out.println("Ingrese la descripcion del articulo por favor");
        descripcion = entrada.nextLine();
        System.out.println("Ingresar la cantidad de articulos que necesite");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio unitario del articulo");
        precio_unitario = entrada.nextDouble();
        descuento = 0.15;
        costopedido_total = (cantidad * precio_unitario);
        if (cantidad > 50) {
            costopedido_total = costopedido_total - (costopedido_total * descuento);
            System.out.printf("El costo del pedido total es: %.2f\n"
                    , costopedido_total);
        } else {
            System.out.printf("El costo del pedido total es: %.2f\n"
                    , costopedido_total);
        }
        
    }
    
}
