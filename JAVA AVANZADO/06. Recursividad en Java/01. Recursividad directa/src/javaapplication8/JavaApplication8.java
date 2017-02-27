package javaapplication8;
public class JavaApplication8 {
    
    static long factorial(int n){
        if(n<=1){
            return 1;//si se cumple se regresa 1 
        }else{
            long resultado=n*factorial(n-1);//se manda a llamar a si mismo mientras que la condición no se cumpla
           return resultado;
        }
    }
    
    public static void main(String[] args) {
        
        int n=5;
        
        System.out.println(factorial(n));
    }
    
}
