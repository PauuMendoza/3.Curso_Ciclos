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
 * Ejercicio 16: Pide un nùmero (que debe estar entre 0 y 10) y mostrar la tabla
 * de multiplicar de dicho nùmero.
 */
public class E16_TablaMultiplicar_Do_For {
    
    public static void main(String[] args) {
        
        int Number;
      
        do{
            Number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "MULTIPLICATION TABLE",
                JOptionPane.INFORMATION_MESSAGE));
  
        }while(Number<0 || Number>10);
        
        System.out.println("The multiplication table of "+Number+" is: ");
        
        for(int i=1;i<=10;i++){
            
            System.out.println(Number +" *"+ i+" ="+ Number*i);
            
        }
            
            
        
        
    }
    
}
