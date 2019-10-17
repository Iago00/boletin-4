/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg2;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Boletin42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Satelite sat1= new Satelite();
       sat1.verPosicion();
       Satelite sat2= new Satelite(25,30,10);
       sat2.verPosicion();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Valor meridiano = ");
       double meridiano=sc.nextDouble();
       System.out.println("Valor paralelo= ");
       double paralelo= sc.nextDouble();
       System.out.println("Valor distancia terra= ");
       double distanciaTerra= sc.nextDouble();
       Satelite sat3= new Satelite(meridiano,paralelo,distanciaTerra);
       sat3.verPosicion();
       
    }
    
}
