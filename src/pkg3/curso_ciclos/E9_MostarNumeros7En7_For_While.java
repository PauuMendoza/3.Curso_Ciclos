/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.curso_ciclos;

/**
 *
 * @author Paulina
 * Ejercicio 9: Escribir todos los nùmeros del 100 al 0 de 7 en 7.
 */
public class E9_MostarNumeros7En7_For_While {
    
    public static void main(String[] args) {
        
        for(int i=100;i>=0;i-=7){
            System.out.println(i);
        }
        //LAS DOS FORMAS FUNCIONAN CORRECTAMENTE
        /*
        int i=100;
        while(i>=0){
            System.out.println(i);
            i-=7;
        }
        */
    }
    
}
