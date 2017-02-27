package ensayo67;
public class Ensayo67 {
    public static void main(String[] args) {
        Object objeto=new Object();
        objeto= null;
        
        Basura objeto2  = new Basura();
        
        objeto2=null;
        System.gc();
    }
    
}
