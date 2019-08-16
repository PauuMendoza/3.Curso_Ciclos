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
 * Ejercicio 21: Pedir 10 nùmeros, y mostrar al final si se ha introducido
 * alguno negativo.
 */
public class E21_NumerosNegativos_Boolean {
    
    public static void main(String[] args) {
        
        int number;
        boolean negative= false;
        
        for(int i=1;i<=10;i++){
            
            number= Integer.parseInt(JOptionPane.showInputDialog(null, "Number "+i+": Enter a number: ",
                "NEGATIVE NUMBERS", JOptionPane.INFORMATION_MESSAGE));
            
            if(number<0){
                negative=true;    
            }      
        }
        if(negative==true){
            JOptionPane.showMessageDialog(null, "Al least one negative number",
                        "NEGATIVE NUMBERS", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Don`t exist a negative number",
                        "NEGATIVE NUMBERS", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }
    
}
