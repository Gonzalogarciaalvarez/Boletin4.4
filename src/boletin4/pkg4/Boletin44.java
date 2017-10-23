/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4.pkg4;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Polbo rest1=new Polbo();
        System.out.println("Engadir kilos de patacas");
        rest1.engadirPatacas(sc.nextInt());
        System.out.println("Engadir kilos de polbo");
        rest1.engadirPolbo(sc.nextInt());
        System.out.println("El numero de clientes es "+rest1.calcClientes());
        
    }
    
}
