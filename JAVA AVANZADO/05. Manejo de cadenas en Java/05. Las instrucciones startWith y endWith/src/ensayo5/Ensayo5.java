package ensayo5;
public class Ensayo5 {
    public static void main(String[] args) {
        //si empieza o termina con una secuencia de caracteres
        
        String cadena=new String("Hola José ésta es una cadena");
        
        if(cadena.startsWith("Hola")){
            System.out.println("si coinciden");
        }else{
            System.out.println("no coinciden");
        }
        
        if(cadena.endsWith("ena")){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    
}
