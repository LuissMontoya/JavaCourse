package ensayo6;
public class Ensayo6 {
    public static void main(String[] args) {
        //comparar regiones 
        
        String cadena="Esta e sla cadena que vamos a comparar";
        
        System.out.println(cadena.regionMatches(true, 11, "cad", 0, 3));//si toma las mayusculas/desde donde queremos que revise
                                                                        //"lo que queremos que busque"/desde que posicion// cuantas palabras queremos que revise
    }
    
}
