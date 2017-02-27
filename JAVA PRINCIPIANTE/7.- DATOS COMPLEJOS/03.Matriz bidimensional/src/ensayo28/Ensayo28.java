package ensayo28;

import java.util.Scanner;

public class Ensayo28 {
public static void main(String[] args) {
       int[]numeros= new int[2];//se le indica cuantos arreglos van a se rcreados
       int[][] arreglos=new int[4][4];//se crea la matriz
       Scanner leer;//se crea la funcion escaner
       int a,b;
       leer=new Scanner(System.in);
      for(a=0;a<arreglos.length;a++){//se crea elfor para leer
          for(b=0;b<arreglos.length;b++){
              System.out.println("igresa un dato: ");
              arreglos[a][b]=leer.nextInt();
          }
      }
        for(a=0;a<arreglos.length;a++){//se crea el for para mostrar
          for(b=0;b<arreglos.length;b++){
              System.out.println(arreglos[a][b]);
          
          }
      }
       
    }
    
}
