
package ensayo6;


public class Ensayo6 {

    public static void main(String[] args) {
        String cadena1= "Maicol Steven Aguilar Perez";//las cadenas admiten todos los caracteres
        System.out.println(cadena1);
        
        String cadena2= "$%&/()=";//en ellas todo se vale
        System.out.println(cadena2);
        
        String cadena3= "\"\"";//para imprimir comillas se debe usar el slahs invertido par auqe no genere error
        System.out.println(cadena3);
        
        String cadena4= "1234567890";//se verán numero pero ya perdieron la propiedad, son una simple caden.
        System.out.println(cadena4);
    }
    
}
