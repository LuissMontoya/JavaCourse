package ensayo12;
public class Lavadero extends Thread{
    
    private String nombre;
    private int tiempo;
    
    public Lavadero(String n, int t){
        nombre=n;
        tiempo=t;
    }
    
    public void run(){
        
        try {
            sleep(tiempo);    
        } catch (InterruptedException e) {
        }
        System.out.println("terminado");
    }
}
