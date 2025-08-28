/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

/*
 *
 * @author Ronald C.
 */
public class ClaseListaSimple {
    
    public ClaseNodoSimple prim;
    public ClaseNodoSimple ult;
    public int cantidadNodos;
    
    //Contructor
    public ClaseListaSimple(){
        this.prim = null;
        this.ult = null;
    }
    
    //Insertar Primero
    public void insertarPrimero(int dato){
        ClaseNodoSimple nuevoNodo = new ClaseNodoSimple(dato);
        if(verificarListaVacia()){
            this.prim = nuevoNodo;
            this.ult = nuevoNodo;
        }else{
           nuevoNodo.sig = this.prim;
            this.prim = nuevoNodo;
        }
        cantidadNodos++; 
    }
    
    
    //Insertar en posicion i el dato x
    
    //Verificar Lista Vacia
    public boolean verificarListaVacia(){
        return this.prim == null && this.ult == null;
    }  
    
    public String mostrarLista(){
        ClaseNodoSimple p1 = this.prim;
        String cad =  "";
        while ( p1 != null ) {
            cad = cad + p1.data + " -> ";
            p1 = p1.sig;
        }
        return cad + "null";
    }
    
    
    
}
