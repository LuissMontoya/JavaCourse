package ensayo7;
public class Ensayo7 {
    public static void main(String[] args) {
        String cadena="Esta es una cadena para este ejemplo";
        
        System.out.println(cadena.charAt(2));
        
        char arreglo[]=new char[20];
        cadena.getChars(0, 3, arreglo, 0);//el priemr parametro es el indice de la priemra letra que vamos a copiar; el segundo es el numero a de la ñletra a copiar
        //el tercero es el arreglo; y el cuarto es el indice del arreglo a partir del cual se va a copiar
        
        System.out.println(arreglo);
        
        System.out.println(cadena.subSequence(6, 14));//ejecutar para ver mejor
        System.out.println(cadena.substring(9));//todo lo que sobre a partir de la posición 9 lo va a traer
    }
    
}
