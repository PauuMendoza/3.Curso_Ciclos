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
 * Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que
 * no se introduce el precio por litro. Solo existen 3 productos con precios:
 * 
 * 1- 0,6 $/litro
 * 2 - 3 $/litro
 * 3 - 1,25 $/litro
 */
public class E18_ModificacionesResumenVentas_For_Dwhie_Switch {
    
    public static void main(String[] args) {
        
        int code, liters, count=0, Sumliters=0;
        float price=0, totalFac=0;
        
        for(int i=1;i<=5;i++){
            
            do{
               code = Integer.parseInt(JOptionPane.showInputDialog(null,"Article "+i+" Enter a "
                    + "code: ", "SALES SUMARY", JOptionPane.INFORMATION_MESSAGE)); 
            }while(!(code>=1 && code<=3));// (code <1 || code>3)
            
            liters = Integer.parseInt(JOptionPane.showInputDialog(null,"Article "+i+" Enter a "
                    + "liters: ", "SALES SUMARY", JOptionPane.INFORMATION_MESSAGE));
            
            switch(code){
                case 1:
                    price = (float) liters * 0.6f;
                    break;
                case 2:
                    price = (float) liters * 3f;
                    break;
                case 3:
                    price = (float) liters * 1.25f;
                    break;
             
            }
            
            totalFac += price;
            
            if(code==1){
                Sumliters += liters;
            }
            if(price>600){
                count++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "The total of all invoices is : $"+totalFac+"\n"
                +"The litter sold of code 1 are: "+Sumliters+"\n"
                +"Invoices greater than 600 are: "+count, "SALES SUMARY", JOptionPane.INFORMATION_MESSAGE);
        
        
            
        
    }
    
}
