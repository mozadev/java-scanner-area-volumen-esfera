/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areavolumenesfera;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Areavolumenesfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        double radio;
        
        System.out.println(" ingrese el radio: ");
     radio= leer.nextDouble();
             
             
            
     
        System.out.println("EL AREA DE LA ESFERA es: " +4*Math.PI*Math.pow(radio, 2));
        System.out.println("EL VOLUMEN DE LA ESFERA es: " +4*Math.PI*Math.pow(radio, 3)/3);
        
    }
    
}
