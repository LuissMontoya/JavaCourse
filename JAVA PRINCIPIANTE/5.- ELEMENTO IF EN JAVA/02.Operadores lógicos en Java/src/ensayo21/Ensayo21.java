package ensayo21;
public class Ensayo21 {
public static void main(String[] args) {
       int numero1=3;
       if((numero1>2)||(numero1<4)){//cuando se puede cumplir una condición aunque la otra no sse cumpla
           System.out.println("bloque 1");
       }else{
           System.out.println("bloque 2");
       }
       
       int numero2=5;
       if((numero2==5)&&(numero2<6)){//cuando se tiene  que cumplir las  dos condiciones
           System.out.println("bloque 1");
       }else{
           System.out.println("bloque 2");
       }
       
       int numero3 = 3;
       if(!(numero3 ==3)){//cuando se niega la condición
           System.out.println("bloque 1");
       }else{
           System.out.println("bloque 2");
       }
    }
    
}
