package ensayo75;
public class Ensayo75 {
    public static void main(String[] args) {
        Number numero= 9.9f;
        
        if(numero instanceof Float){//nos sirve para reconocer el tipo de valor que es
            System.out.println("flotante");
        }
        if(numero instanceof Integer){
            System.out.println("Entero");
        }
        if(numero instanceof Double){
            System.out.println("Doble");
        }
    }
    
}
