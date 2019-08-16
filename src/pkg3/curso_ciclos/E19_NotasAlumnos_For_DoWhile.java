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
 * Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, 
 * condicionados (=4) y suspensos.
 */
public class E19_NotasAlumnos_For_DoWhile {
    
    public static void main(String[] args) {
        
        float note;
        int countA=0, countC=0, countS=0;
        
        for(int i=1;i<=6;i++){
            
            do{
               note = Float.parseFloat(JOptionPane.showInputDialog(null, "Note "+i+ " Enter "
                       + "a note: ", "NOTES OF STUDENTS", JOptionPane.INFORMATION_MESSAGE)); 
            }while(note<0 || note>10);
            
            if(note==4){
                countC++;
            }
            else if(note>=5){
                countA++;
            }
            else{
                countS++;
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "The number of students aproved is: "+countA+"\n"
        +"The number of conditioned students is: "+countC+"\n"
        +"The number of suspended students is: "+countS, "NOTES OF STUDENTS", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
