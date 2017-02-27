package ensayo4;
public class Ensayo4 {
    public static void main(String[] args) {
        //con equals vamos a compara si las cadenas son alfabeticamente iguales o no
        
        String nombre="jose";
        String nombreb="jose";
        
        if(nombre.equals("jose")){
            System.out.println("iguales");
        }
        if(nombre.equals("jose")){
            System.out.println("iguales");
        }
        
        if(nombre.equalsIgnoreCase("JOSE")){//solo si las letras son iguales no importa mayusculas o minusculas pero el asento si lo toma
            System.out.println("iguales");
        }
        
    }
    
}
