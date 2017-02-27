package ensayo11;
public class ClassGen<T> {
    T objeto;
    
    public ClassGen(T algo){
        objeto=algo;
    }
    
    public void tipoClase(){
        System.out.println("El tipo es:"+objeto.getClass().getName());
    }
    
    
    public static <T>String metodoGen (T x){
        String dato;
        dato=x.toString();
        
        return dato;
    }
}
