package ensayo7;

import java.util.Scanner;

public class Ensayo7 {
    public static void main(String[] args) {
        System.out.println("DIGÍTE SU NOMBRE");
        
        Scanner leer=new Scanner (System.in);//comando para pedir un dato al usuario
        int escaner= leer.nextInt();//especificar el tipo de dato 
       
        System.out.println(escaner);//imprimir el dato
        
        System.out.println("DIGÍTE UN NUMERO");
        Scanner leer2=new Scanner(System.in);//en la anterior se pidio al usuario un nombre  pero se defini un entero así que causa error si ingresamos un nombre
        int escaner2= leer2.nextInt();
        System.out.println(escaner2);
        
       
        
    }
    
}
