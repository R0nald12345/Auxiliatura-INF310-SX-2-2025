/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaArreglo;

/**
 *
 * @author ROnald
 */
public class ListaArreglo {

    //Atributos
    public static final int MAX = 50;
    public int vector[];
    public int cant;

    //Constructor
    public ListaArreglo() {
        vector = new int[50];
        this.cant = 0;
    }

    public int obtenerDato(int pos) {
        return this.vector[pos];
    }

    public int cantidadDeDatos() {
        return this.cant;
    }

    public void insertarFinal(int dato) {
        
        this.vector[cant] = dato;
        this.cant++;

    }

  
    
    // AYUDANTIA 28/08/2025-----------------
    public int contarParIterativo(){
        int totalPar = 0;
        for (int i = 0; i < this.cant; i++) {
            if(this.vector[i] %2 == 0){
                totalPar++;
            }
        }
        return totalPar;   
    }
    
    
    
    public int contarPares1(){
        return contarParesRecursivo1(this.cant);
    }
    
    private int contarParesRecursivo1(int cantAux){
        //Caso Base 2
        if(cantAux == 1){
            if(this.vector[cantAux-1]%2 == 0){
                return 1;
            }else{
                return 0;
            }
        }
        //Caso General
        cantAux = cantAux - 1;
        int total = contarParesRecursivo1(cantAux); //4
        
        if(this.vector[cantAux-1] % 2 == 0){
            return total + 1;
        }else{
            return total;
        }
        
    }
    
    public void invertir1(){
        invertirRecursivo1(0,this.cant-1);
    }
    
    private void invertirRecursivo1(int inicio, int fin){
        if(inicio>=fin){
            return;
        }
        int aux = this.vector[inicio];
        this.vector[inicio] = this.vector[fin];
        this.vector[fin] = aux;
        invertirRecursivo1(inicio+1,fin-1);
    }
    
            
    public boolean verificarTodosIguales1(){
        return verificarTodosIguales1(this.cant);
    }
    
    private boolean verificarTodosIguales1(int cantAux){
       //CB1
       //Esta vacio mi Vector
       if(cantAux == 0){
           return false;
       }
       //CB2
       //Tengo 1 Dato en mi vector
       if(cantAux == 1){
           return true;
       }
       cantAux = cantAux - 1;
       boolean res = verificarTodosIguales1(cantAux);
       if(!res){
           return res;
       }else{
           if( this.vector[cantAux-1] == this.vector[cantAux] ){
               return true;
           }else{
               return false;
           }
       }
       
    }
    
    
    
    
    
    
    
    
    //Recursivo
    
    
    
    
    public int contarImpares(){
        return contarImparesRecursivo(this.cant);
    }
    
    
    //5
    private int contarImparesRecursivo(int cantAux ){
        if(cantAux ==1 ){ //Caso Base
            if(this.vector[cantAux-1] %2 != 0 ){
                return 1;
            }else{
                return 0;
            }
        }else{ //Caso general
            cantAux = cantAux -1; //4
            int totalPar = contarImparesRecursivo(cantAux); // 3
            if(this.vector[cantAux-1] % 2 != 0){
                return totalPar+1;
            }else{
                return totalPar;
            }
        }
    }
    
    public int obtenerMenor(){
        return obtenerMenorRecursivo(this.cant);
    }
    
    
    private int obtenerMenorRecursivo(int cantAux){ //1
        if(cantAux == 1 ){ //Caso base
           return this.vector[cantAux -1]; 
        }else{
            int menor = obtenerMenorRecursivo(cantAux-1); // 3
            if(this.vector[cantAux -1] < menor){
                return this.vector[cantAux-1];
            }else{
                return menor;
            }
        }
    }
    
   
    
    public int multiplicarDigitoPar(){
       return multiplicarDigitoParRecursivo(this.cant);
    }
    
    /**
     * 
     * @param cantAux
     * @return 
     * 
     * si retorna -1 quiere decir que no hay pares en mi vector
     */
    
    private int multiplicarDigitoParRecursivo(int cantAux){ //1
        if(cantAux == 1){
            if(this.vector[cantAux-1] %2 == 0 ){
                return this.vector[cantAux -1];
            }else{
                return -1;
            }
        }else{
           cantAux = cantAux -1;
           int totalMul = multiplicarDigitoParRecursivo(cantAux); //80
           if(this.vector[cantAux -1] %2 == 0 ){
               return totalMul * this.vector[cantAux -1];
           }else{
               return totalMul;
           }
        }
    }
    
  

    public String toString() { //Muestra los datos de mi arrgelo
        String cadena = "[ ";
        for (int i = 0; i < this.cant; i++) {
            cadena = cadena + vector[i] + " ";
        }
        return cadena + "]";
    }

}



 