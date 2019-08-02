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
 * Ejercicio 6: Pedir nùmeros hasta que se teclee un 0, mostrar la suma de los
 * nùmeros introducidos.
 */
public class E6_SumaIterativa_DoWhile {
    
     public static void main(String[] args) {
        int sum=0, number; 
      
        do{
           number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "ITERATIVE SUM", JOptionPane.INFORMATION_MESSAGE));
           sum += number;
           
          }while(number!=0);
                JOptionPane.showMessageDialog(null, "The sum of all numbers is: "+sum, "ITERATIVE SUM", JOptionPane.INFORMATION_MESSAGE);

}
        /*
        while(number!=0){
            sum += number;
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter other number: ", "ITERATIVE SUM", JOptionPane.INFORMATION_MESSAGE));

        }
        JOptionPane.showMessageDialog(null, "The sum of all numbers is: "+sum, "ITERATIVE SUM", JOptionPane.INFORMATION_MESSAGE);
     }*/
    
        
}