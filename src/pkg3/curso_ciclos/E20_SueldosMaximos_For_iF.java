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
 * Ejercicio 20: Pedir un nùmero N, introducir N sueldos, y mostrar el sueldo
 * maximo.
 */
public class E20_SueldosMaximos_For_iF {
    
    public static void main(String[] args) {
        
        int N;
        float salary, max=0;
        
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of salarys: ",
                "MAXIMUN SALARY", JOptionPane.INFORMATION_MESSAGE));
        
        for(int i=1;i<=N;i++){
            
            salary = Float.parseFloat(JOptionPane.showInputDialog(null, "SALARY "+i+": Enter a salary",
                    "MAXIMUN SALARY", JOptionPane.INFORMATION_MESSAGE));
            
            if(salary>max){
                max = salary;
            } 
        }
        
        JOptionPane.showMessageDialog(null, "The maximun salary is: $"+max,
                "MAXIMUN SALARY", JOptionPane.INFORMATION_MESSAGE);
        
       
        
    }
    
}
