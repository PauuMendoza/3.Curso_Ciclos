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
 * Ejercicio 3: Leer nùmeros hasta que se introduzca un 0. Para cada uno indicar 
 * si es par o impar.
 */
public class E3_ParImpa_While {
    
    public static void main(String[] args) {
        
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "EVEN AND ODD UNMBERS", JOptionPane.INFORMATION_MESSAGE));
        
        while(number!=0){
            if(number%2==0){
                JOptionPane.showMessageDialog(null, "THE NUMER IS EVEN", "EVEN AND ODD UNMBERS", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "THE NUMER IS ODD", "EVEN AND ODD UNMBERS", JOptionPane.INFORMATION_MESSAGE);
                
            }
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter OTHER number: ", "EVEN AND ODD UNMBERS", JOptionPane.INFORMATION_MESSAGE));

        }
        
       
        
    }
    
}
