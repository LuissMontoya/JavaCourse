package ensayo9;
public class Ensayo9 {
    static void metodoA(char x){
        if(x>='A'){
            metodoB(x);
            System.out.println(x);
        }
    }
    static void metodoB(char x){
        metodoA(--x);
    }
    public static void main(String[] args) {
        //la recursividad indirecta es que un metodo llama al otro y el otro llama al primero 
        
        metodoA('Z');
        
    }
    
}
