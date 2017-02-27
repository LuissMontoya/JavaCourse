package ensayo74;
public class Ensayo74 {
    public static void main(String[] args) {
        int numero =21;
        String cadena="menos";
        
        if(numero<20){
            cadena="menos";
        }else{
            cadena= "más";
        }
        System.out.println(cadena);
        
        String cadena2 =numero <20 ? "menos": "más"; //operador terniario
        //operador ?: es decir se puede hacer la comprobacion ahorrandonos 5 lineas
        System.out.println(cadena2);
    }
    
}
