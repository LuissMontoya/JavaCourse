
package ensayo3;

public class Ensayo3 {

    public static void main(String[] args) {
       String cadena="hola,como estás, En ,el munFo.";
       int b=cadena.indexOf((int)'F');//busca el valor que yo le introdusca si le pongo cadena.indexOf((int)'F',30); me busca a partir del 32
        System.out.println(b);
    
        String cadenab="hola mundo de mierda, me vale loq eu digas de mi";
        int x=cadenab.lastIndexOf((int)'m');//busca desde atras para adelaante
        System.out.println(x);
        
        x=cadenab.lastIndexOf("digas");
        System.out.println(x);
        
    }
    
}
