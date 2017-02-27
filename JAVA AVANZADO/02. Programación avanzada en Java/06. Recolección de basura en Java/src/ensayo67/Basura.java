package ensayo67;
public class Basura {
    int numero;
    
    public Basura(){
        System.out.println("Constructor");
    }
    protected void finalized(){
        System.out.println("Final");
    }
}
