package ensayo24;
public class Ensayo24 {
public static void main(String[] args) {
     int numero1=3;
     String cadena="asdf";
     
     switch (numero1){//es un segun mejorado
         case 1://se indica una condición de comparación
             System.out.println("error");
             break;//siempre se cierra
         case 2:
             System.out.println("error");
             break;
             
         case 3:
             System.out.println("acertaste");
             break;
         default://en caso de que no se cumplan las condiciones
             System.out.println("en caso de error");
             break;
     }
     switch (cadena){//despues de java 7  se permite el switcg con cadenas
         case "ñlkj"://se compara de la misma manera,
             System.out.println("error");
             break;
         case "mnbvc":
             System.out.println("error");
             break;
         case "asdf":
             System.out.println("acertaste");
             break;
         default:
             System.out.println("en caso de error");
             break;
     }
     
    }
    
}
