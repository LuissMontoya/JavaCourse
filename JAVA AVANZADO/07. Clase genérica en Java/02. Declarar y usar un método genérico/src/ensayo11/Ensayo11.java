package ensayo11;
public class Ensayo11 {
    public static void main(String[] args) {
        ClassGen<Integer> objetoA=new ClassGen<Integer>(1);
        objetoA.tipoClase();
        
        ClassGen<String> objetoB=new ClassGen<String>("cadenas");
        objetoB.tipoClase();
        
        System.out.println(objetoA.metodoGen("HOLA a 1"));//sabemos qeu es un entero pero está trabajando con una cadena
        System.out.println(objetoB.metodoGen(10));//alrevez
        
    }
    
}
