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
 * Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000.
 */
public class E14_SueldosMayores_For {
    public static void main(String[] args) {
        
        int count=0;
        float salary, sum=0;
        
        for(int i=1;i<=10;i++){
            salary = Float.parseFloat(JOptionPane.showInputDialog(null, 
                    "Enter a salary: ", "SALARIES", JOptionPane.INFORMATION_MESSAGE));
            
            sum+=salary;
            
            if(salary>=1000){
                count++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "The sum of the salaries is: $"+sum
        +" and the salaries greater than 1000 are: "+count, "SALARIES", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
}
