package ensayo3;
public class Ensayo3 {
    public static void main(String[] args) {
        String cadenaA="hola";
        String cadenab="hola";
        
        System.out.println(cadenaA.compareTo(cadenab));//si debuelve 0 es ecir que la cadena es identica a la otra
        
        String cadenaC="holo";
        System.out.println(cadenaA.compareTo(cadenaC));//significa que la cadena del lado izquierdo es menor
        
        String cadenaD="HOLA";
        System.out.println(cadenaA.compareTo(cadenaD));//mayor
        
        //codigo ascci CLAVE DE TODO
    }
    
}
