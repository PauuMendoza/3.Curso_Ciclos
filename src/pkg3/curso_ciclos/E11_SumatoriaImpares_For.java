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
 * Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros
 * numeros impares.
 */
public class E11_SumatoriaImpares_For {
    
    public static void main(String[] args) {
        
        int product = 1;
        
        for(int i=1;i<=20;i+=2){
           // if(i%2!=0){
                product *= i;   
            //}   
        }
        JOptionPane.showMessageDialog(null, "The product of the numbers is: "+product, 
                    "MULTIPLICATION", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
