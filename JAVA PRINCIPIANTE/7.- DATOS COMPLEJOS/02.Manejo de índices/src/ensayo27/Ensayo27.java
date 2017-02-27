package ensayo27;

import java.util.Scanner;

public class Ensayo27 {
public static void main(String[] args) {
        int[]numeros= new int[4];//se crea la matriz
        Scanner leer;//se coloca un leer del teclado
        leer= new Scanner(System.in);//se lee
        int i;//se define una variable
        for(i=0;i<numeros.length;i++){//se crea el for para leer el arreglo
            System.out.println("digite dato: ");
            numeros[i]=leer.nextInt();
        }
        for (i=0;i<numeros.length;i++){//se crea el for para mostrarlo
            System.out.println(numeros[i]);
        }
            
        
        
        
        
        
    }
    
}
