package ensayo.pkg20;
public class Ensayo20 {
public static void main(String[] args) {
       int edad=20;
       if(edad>=30){//en realidad es un si condición
           System.out.println("bloque 1");
        }else{//sino se cumple la condición
        System.out.println("bloque 2");
       }
       
       String cadena="master madi";
       if(cadena.equals ("master madi")){//se usa equals para comparar cadenas
           System.out.println("bloque 1");
       }else{
           System.out.println("bloque 2");
       }
    }
}
