package ensayo4;

import java.util.ArrayList;

public class Ensayo4 {
    public static void main(String[] args) {
        //ArrayList();//si capacidad definida
        //ArrayList(int);//la capacidad
        //ArrayList(collection)//es decir de uan coleccion
        
        ArrayList <String> array = new ArrayList();//en este caso el array es con una cadena
        
        array.add("A");//se añaden los arrays
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        array.add("F");
        
        array.remove("A");//busca y elimina el array
        
        array.set(0, "Z");//reemplaza
        
        System.out.println(array.indexOf("Z"));//busca y nos dice la poscion del array
        
    }
    
}
