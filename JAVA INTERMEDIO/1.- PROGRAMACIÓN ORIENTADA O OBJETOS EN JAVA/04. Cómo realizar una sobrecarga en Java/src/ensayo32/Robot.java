
package ensayo32;

public class Robot {
    int numero=10;
    boolean tuerca=true;
    
    public void caminar(){
        numero=numero+10;
    }
    
    public void caminar(int numero2){//cada metodo debe llevar algo de distinto para que funcione
        numero=numero+numero2;
    }
    
    public void caminar(String cadena){
        System.out.println("hola");
    }
    
    
}
