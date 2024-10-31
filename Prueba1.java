/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        double precio;
        int PComprados;
        int productos;
        double CTotal;
        
       System.out.println("Bienvenido al sistema, ingrese la cantidad de producto");
       productos = entrada.nextInt();
       System.out.println("Ingrese el precio del producto");
       precio = entrada.nextDouble();
       System.out.println("Ingrese el precio del producto");
       
       CTotal = productos * precio;
       
       System.out.println("El resultado de su compra es: "+CTotal);
       
       
       
        
        
        
        
    }
    
}
