package ensayo65;
public class Ensayo65 {
    public static void main(String[] args) {
        int numero=10;
        float numerof=10.1f;
        numerof=numerof+ numero;//conversion implicita 
        
        float numeroF = 100.100000f;//conversion explicita
        int numeroA= (int) numeroF;
        System.out.println(numeroA);
    }
    
}
