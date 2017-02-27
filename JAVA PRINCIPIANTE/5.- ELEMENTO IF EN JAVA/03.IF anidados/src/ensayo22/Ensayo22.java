package ensayo22;
public class Ensayo22 {
public static void main(String[] args) {
        int numero1= 10;
        int numero2= 5;
        if(numero1>0){
            System.out.println("bloque 1");//se pueden anidar varios if.
            if(numero1<20){
                System.out.println("bloque2");
                if(numero2>5){
                    System.out.println("bloque3");//si se decea se pueden usar el else de lo contrario no se usa y no hay problema
                    
                }else{
                    System.out.println("bloque4");
                }
                
            }
            
        }
         
    }
    
}
