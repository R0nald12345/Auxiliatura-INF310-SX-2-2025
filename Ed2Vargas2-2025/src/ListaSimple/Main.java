/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        ClaseListaSimple l1 = new ClaseListaSimple();
        l1.insertarPrimero(2);
        l1.insertarPrimero(10);
        
        System.out.println(l1.mostrarLista());
    }
}
