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
 * Ejercicio 13: Pedir 10 nùmeros. Mostrar la media de los nùmeros positivos, 
 * la media de los nùmeros negativos y la cantidad de ceros.
 */
public class E13_NumerosMediaCeros_For {
    
    public static void main(String[] args) {
        
        float meanPositive=0, meanNegative=0;; 
        
        int countP=0, countN=0, countC=0;
        
        for(int i=1;i<=10;i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "MEDIA",
                    JOptionPane.INFORMATION_MESSAGE));
            
            if(num>0){
                meanPositive += num;
                countP++;
            }else if(num<0){
                meanNegative += num;
                countN++;
            }else
                countC++;  
        }
        
        if(countP==0){
            System.out.println("Don`t exist media of numbers positive");
        }else{
            meanPositive /= countP;
            System.out.println("The mean of positive numbers is: "+meanPositive);
        }
        if(countN==0){
            System.out.println("Don`t exist media of numbers negative");
        }else{
            meanNegative /= countN;
            System.out.println("The mean of negative numbers is: "+meanNegative);
        }
        if(countC==0){
            System.out.println("Don`t exist numbers equals a cero");
        }else{
            System.out.println("The amount of ceros is: "+countC);
        }
        
    }
    
}
