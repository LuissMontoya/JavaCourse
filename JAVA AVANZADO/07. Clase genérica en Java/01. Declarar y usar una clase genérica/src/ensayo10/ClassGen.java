package ensayo10;
public class ClassGen<T>  {
    T objeto;
    
    public ClassGen(T algo){
        objeto=algo;
    }
    
    
    public void tipoClase(){
        System.out.println("El tipo es:"+objeto.getClass().getName());
    }
}
