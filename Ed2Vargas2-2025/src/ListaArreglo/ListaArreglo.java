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

    public void insertarFinal(int pos, int dato) {
        
        this.vector[pos] = dato;
        this.cant++;

    }

    //Procedimiento
    public void ejercicio7(ListaArreglo L2, ListaArreglo L3) {
        boolean bandera = true;
        int contadorL2 = 0;
        int contadorL3 = 0;
        while (contadorL2 < L2.cantidadDeDatos() && contadorL3 < L3.cantidadDeDatos()) {
            if (bandera == true) {
                //Saca de L2
                insertarFinal(cant, L2.obtenerDato(contadorL2));
                contadorL2++;
            } else {
                //Saca de L3
                insertarFinal(cant, L3.obtenerDato(contadorL3));
                contadorL3++;
            }
            bandera = !bandera;
        }

        //L2 es vacio
        while (contadorL3 < L3.cantidadDeDatos()) {
            insertarFinal(cant, L3.obtenerDato(contadorL3));
            contadorL3++;
        }

        //L3 es vacio
        while (contadorL2 < L2.cantidadDeDatos()) {
            insertarFinal(cant, L2.obtenerDato(contadorL2));
            contadorL2++;
        }

    }
    
    //5
    public int contarParIterativo(){
        int totalPar = 0;
        for (int i = 0; i < this.cant; i++) {
            if(this.vector[i] %2 == 0){
                totalPar++;
            }
        }
        return totalPar;   
    }
    
    
    //Recursivo
    
    public int contarPares(){
        return contarParesRecursivo(this.cant);
    }
    
    
    //5
    private int contarParesRecursivo(int cantAux ){
        
        // |8|
        if(cantAux ==1 ){ //Caso Base
            if(this.vector[cantAux-1] %2 == 0 ){
                return 1;
            }else{
                return 0;
            }
            // |8|7|5|    4|    cant = 3
        }else{ //Caso general
            cantAux = cantAux -1; // 3
            int totalPar = contarParesRecursivo(cantAux); // 3,, 2
            if(this.vector[cantAux-1] % 2 == 0){
                return totalPar+1;
            }else{
                return totalPar;
            }
        }
    }
    
    
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
