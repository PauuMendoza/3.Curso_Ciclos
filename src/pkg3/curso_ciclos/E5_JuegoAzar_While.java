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
 * Ejercicio 5: Realizar un juego para adivinar un nùmero. Para ello generar un
 * nùmero aleatorio entre 0-100, y luego ir pidiendo nùmeros indicando "es mayor"
 * o "es menor" segun sea mayor o menos con respecto a N. El proceso termina cuando
 * el usuario acierta y mostrar el nùmero de intentos.
 */
public class E5_JuegoAzar_While {
    
    public static void main(String[] args) {
        
        int count = 0;
        int random = (int) (Math.random()*100+1);
        System.out.println(random);
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "LET`S PLAY!!", JOptionPane.INFORMATION_MESSAGE));
        
        while(number!=random){
            if(number>random){
                JOptionPane.showMessageDialog(null, "The number is greater!!", "LET`S PLAY!!", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "The number is smaller!!", "LET`S PLAY!!", JOptionPane.INFORMATION_MESSAGE);
            } 
        count++;
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter other number: ", "LET`S PLAY!!", JOptionPane.INFORMATION_MESSAGE));
        }
        JOptionPane.showMessageDialog(null, "You win!!! The number is: "+random+" Your attempts are: "+count, "LET`S PLAY!!", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
