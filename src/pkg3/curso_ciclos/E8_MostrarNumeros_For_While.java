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
 * Ejercicio 8: Pedir un nùmero N y mostrar todos los nùmeros del 1 al N.
 */
public class E8_MostrarNumeros_For_While {
    
    public static void main(String[] args) {
        int n=1;
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "TRAVEL OF NUMBERS", 
                JOptionPane.INFORMATION_MESSAGE));
        
       /* for(int i=1;i<=number;i++){
            System.out.println(i);
        }*/
        
        while(n<=number){
            System.out.println(n);
            n++;
        }
        
    }
    
}//Las dos formas funcionan correctamente, utilizando el for o while
