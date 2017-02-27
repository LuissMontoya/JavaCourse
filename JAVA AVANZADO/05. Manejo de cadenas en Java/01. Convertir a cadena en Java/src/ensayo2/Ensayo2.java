package ensayo2;
public class Ensayo2 {
    public static void main(String[] args) {
        int numero=10;
        String cadena= String.valueOf(numero);//se obtiene el valor de un numero en una cadena 
        
        float flotante=10.50f;
        String cadenaf=String.valueOf(flotante);
        
        double doble=10.8d;
        String cadenad=String.valueOf(doble);
        
        long largo =10000000;
        String cadenal=String.valueOf(largo);
        
        boolean booleano=true;
        String cadenab=String.valueOf(booleano);
        
        System.out.println(cadena);
        System.out.println(cadenaf);
        System.out.println(cadenad);
        System.out.println(cadenal);
        System.out.println(cadenab);
    }
    
}
