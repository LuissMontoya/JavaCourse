package ensayo58;
public class Ensayo58 {

    public static void main(String[] args) {
       try{
        
        int numero= Integer.parseInt("x");
        System.out.println("Bloque1");
       }catch(Exception e){
        System.out.println("Bloque2");   
       }finally{
           System.out.println("Bloque3");//3 intentos para poder manejar el error
       }
    }
    
}
