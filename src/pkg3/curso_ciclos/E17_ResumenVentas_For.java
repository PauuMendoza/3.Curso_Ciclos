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
 * Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita
 * un programa para gestionar las facturas. En cada factura figura: el còdigo del
 * articulo, la cantidad vendida en litros y el precio por litro. Se pide de 5
 * facturas introducidas: Facturaciòn total, cantidad de litros vendidos del
 * articulo 1 y cuàntas facturas de emitieron de mas de $600.
 * 
 * CADA FACTURA LLEVA: 
 *          CODIGO DEL ARTICULO
 *          CANTIDAD VENDIDA EN LITROS
 *          PRECIO POR LITRO
 * 
 * DESPUES DE INGRESAR ESOS DATOS DE 5 FACTURAS SACAR:
 * 
 * FACTURACION TOTAL, CANTIDAD VENDIDA DEL ARTICULO 1, Y CUANTAS FACTURAS > $600
 * 
 */
public class E17_ResumenVentas_For {
    
    public static void main(String[] args) {
        
        int code, liter, Sumliters=0, count=0;
        float price, total,FacTotal=0 ;
        for(int i=1;i<=5;i++){
           
            code = Integer.parseInt(JOptionPane.showInputDialog(null, "Article "+i+" Enter a "
                    + "code: ", "SALES SUMARY", JOptionPane.INFORMATION_MESSAGE));
            
            liter = Integer.parseInt(JOptionPane.showInputDialog(null,"Article "+i+" Enter a "
                    + "liters: ", "SALES SUMARY", JOptionPane.INFORMATION_MESSAGE));
            
            price = Float.parseFloat(JOptionPane.showInputDialog(null, "Article "+i+" Enter a "
                    + "price: ", "SALES SUMARY", JOptionPane.INFORMATION_MESSAGE));
            
            total= (float) liter * price;
            FacTotal+=total;
            
            if(code==1){
                Sumliters+=liter;
            }
            if(total>600){
                count++;
            }
        }
        JOptionPane.showMessageDialog(null, "The total of all invoices is : $"+FacTotal+"\n"
                +"The litter sold of code 1 are: "+Sumliters+"\n"
                +"Invoices greater than 600 are: "+count, "SALES SUMARY", JOptionPane.INFORMATION_MESSAGE);
                   
       
    }
        
}
    

