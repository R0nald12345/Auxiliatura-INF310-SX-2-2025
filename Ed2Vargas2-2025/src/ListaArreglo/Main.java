/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaArreglo;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        ListaArreglo L1 = new ListaArreglo();
//        ListaArreglo L2 = new ListaArreglo();
//        ListaArreglo L3 = new ListaArreglo();
        
        L1.insertarFinal(0, 2);
        L1.insertarFinal(1, 10);
        L1.insertarFinal(2, 4); 
        L1.insertarFinal(3, 3);
        L1.insertarFinal(4, 8);
        
        
        //ver los datos
        System.out.println(L1.toString() );
        System.out.println("la cantidad de Pares: " + L1.contarPares());
        System.out.println("la cantidad de Impares: " + L1.contarImpares());
        System.out.println("Obtener Menor: " + L1.obtenerMenor());
        System.out.println("Multilpicacion: " + L1.multiplicarDigitoPar());
        
       
        
        
    } 

}
