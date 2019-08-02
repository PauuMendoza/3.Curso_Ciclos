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
 * Ejercicio 7: Pedir nùmeros hasta que se introduzca un negativo, y calcular
 * la media.
 */
public class E7_CalcularMedia_DoWhile {
    
    public static void main(String[] args) {
        
        int number, sum=0,  count=0;
        float media=0;
        
        do{
           number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number", "MEDIA NUMBERS", JOptionPane.INFORMATION_MESSAGE));
           if(number>=0){
               sum += number;
               count++;    
           }    
        }while(!(number<0));
        media = sum/count;
        JOptionPane.showMessageDialog(null, "The media of the all numbers is: "+media, "MEDIA NUMBERS", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
