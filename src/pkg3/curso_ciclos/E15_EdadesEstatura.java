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
 * Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la
 * estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de
 * alumnos que miden màs de 1.75.
 */
public class E15_EdadesEstatura {
    
     public static void main(String[] args) {
         
         int Sage=0, countE=0, counte=0;
         float Sheight=0;
         
         for(int i=1;i<=5;i++){
             
             int ege = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a edge: ",
                     "EGE AND HEIGHT", JOptionPane.INFORMATION_MESSAGE));
             
             float height = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter a height: ",
                     "EGE AND HEIGHT", JOptionPane.INFORMATION_MESSAGE));
             
             if(ege>=18){
                 countE++;
             }
             if(height>1.75){
                 counte++;
             }
             
             Sage+=ege;
             Sage/=countE;
             
             Sheight+=height;
             Sheight/=counte;
             
         }
         JOptionPane.showMessageDialog(null, "The mean age of the students is: "+Sage+"\n"
         +"And the mean height of the students is: "+Sheight+"\n"
         +"Number of students older than or equal to 18 years is: "+Sage+"\n"
         +"Number of students with height greater than 1.75 is: "+Sheight);
         
     }
    
}
