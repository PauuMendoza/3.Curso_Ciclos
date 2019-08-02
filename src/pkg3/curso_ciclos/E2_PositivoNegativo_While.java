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
 * Ejercicio 2: Leer un nùmero e indicar si es positivo o negativo. El proceso
 * se repetira hasta que se introduzca un 0.
 */
public class E2_PositivoNegativo_While {
    
    public static void main(String[] args) {
        
        int number;
        
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number", "POSITIVE OR NEGATIVE NUMBERS", JOptionPane.INFORMATION_MESSAGE));
        
    
        while(number!=0){
            if(number>0){
               JOptionPane.showMessageDialog(null, "The number is positive");
            }
            else{
               JOptionPane.showMessageDialog(null, "The number is negative");                
            }
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter other number", "POSITIVE OR NEGATIVE NUMBERS", JOptionPane.INFORMATION_MESSAGE));

        } 
        
    }
    
}
