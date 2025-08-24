/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

/**
 *
 * @author Ronald C
 */
public class ClaseNodoSimple {
    
    public int data;
    public ClaseNodoSimple sig;
    
    //Constructor
    public ClaseNodoSimple(int x){
        this.data = x;
        this.sig = null;
    }
}
