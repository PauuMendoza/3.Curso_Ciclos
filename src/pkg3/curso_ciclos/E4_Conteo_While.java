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
 * Ejercicio 4: Pedir nùmeros hasta que se teclee un negativo, y mostrar cuàntos
 * nùmeros se han introducido.
 */
public class E4_Conteo_While {
    
    public static void main(String[] args) {
        
        int number, count =0;
        
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number", "COUNT", JOptionPane.INFORMATION_MESSAGE));

        while(number>0){
            
            count++;
            
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter other number", "COUNT", JOptionPane.INFORMATION_MESSAGE));

        }
        
        JOptionPane.showMessageDialog(null, "The total numbers is: "+count, "COUNT", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
