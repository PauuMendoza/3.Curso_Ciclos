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
 * Ejercicio 12: Pedir un nùmero y calcular su factorial.
 */
public class E12_FactorialNumero_For {
    
    public static void main(String[] args) {
        
        long factorial =1;
        
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a"
                + "number", "FACTORIAL", JOptionPane.INFORMATION_MESSAGE));
        
        for(int i=1;i<=number;i++){
            
            factorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, number+"! = " +factorial,
                "FACTORIAL", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
