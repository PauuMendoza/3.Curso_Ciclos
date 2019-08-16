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
 * Ejercicio 22: Pedir 5 calificaciones de alumnos y decir y decir si hay algùn
 * suspenso.
 */
public class E22_CalificacionesSuspensas_Dowhile_Boolean {
    
    public static void main(String[] args) {
        
        float note;
        boolean suspense= false;
        
        for(int i=1;i<=5;i++){
            
            do{
            note = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the note "+i+" of the student: ",
                    "FAILED NOTES", JOptionPane.INFORMATION_MESSAGE));
            }while(note<0 || note>10);
            
            if(note<5){
                suspense=true;
            }
        }
        if(suspense==true){
            JOptionPane.showMessageDialog(null, "Al least one note is suspense",
                        "FAILED NOTES", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Any note is suspense!!!!",
                        "FAILED NOTES", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
}
