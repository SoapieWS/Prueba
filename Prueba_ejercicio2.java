/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Prueba_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        double consumo_mensual;
        double consumo_total_anual;
        double promedio_mensual;
        
        
        System.out.println("Ingrese su consumo mensual de agua en litros de los ultimos 12 meses");
        consumo_mensual = entrada.nextDouble();
        
        promedio_mensual = consumo_mensual/30;
        consumo_total_anual = consumo_mensual*12;
        
        System.out.println("Su consumo mensual es: "+consumo_mensual);
        System.out.println("Su consumo anual es: "+consumo_total_anual);
        
        
        
        
        
        
        
    }
    
}
