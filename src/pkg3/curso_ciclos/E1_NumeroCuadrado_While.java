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
 * Ejercicio 1: Leer un nùmero y mostrar su cuadrado, repetir el proceso hasta
 * que se introduzca un nùmero negativo.
 */
public class E1_NumeroCuadrado_While {

    public static void main(String[] args) {
        // TODO code application logic here
        int quadrate=0;
        
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "QUADRATE NUMBER", JOptionPane.INFORMATION_MESSAGE));
        
        while(number>=0){//mientras el numero sea 0 o positivo
            
            quadrate = (int) Math.pow(number, 2);
            
            JOptionPane.showMessageDialog(null, "The result is: "+quadrate);
            
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "QUADRATE NUMBER", JOptionPane.INFORMATION_MESSAGE));

        }
        
        
    }
    
}
