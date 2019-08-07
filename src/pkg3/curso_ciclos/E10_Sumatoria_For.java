/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.curso_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 * Ejercicio 10: Pedir 10 nùmeros y escribir la suma total.
 */
public class E10_Sumatoria_For {
    
    public static void main(String[] args) {
        
        int sum = 0, number;
        
       for(int i=1;i<=10;i++){
           
           number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", 
                "SUMMATION", JOptionPane.INFORMATION_MESSAGE));
           sum += number;
           
       }
            JOptionPane.showMessageDialog(null, "The summation is: "+sum, 
                    "SUMMATION", JOptionPane.INFORMATION_MESSAGE);
     }
        
       
}
    
    

