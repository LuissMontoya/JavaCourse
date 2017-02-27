package ensayo5;

import java.util.Vector;

public class Ensayo5 {
public static void main(String[] args) {
        Vector v1=new Vector();//vecto vasio
        Vector v2=new Vector(10);//vector definido
        Vector v3=new Vector(v2);//vector a partir de otro vector
        
        
        Vector <String> vector=new Vector <String>();//se define que el vector va a ser del tipo cadena
        vector.addElement("cadena");
        //vector.addelement(2)
        
        vector.addElement("cadena 2");//insete una cadenas al elemento
        //vector.addelement(9)
        
        vector.insertElementAt("AJ", 1);//inserta una cadena al vector
        
        //acceder
        System.out.println(vector.get(2));//accede en la posición 2
        System.out.println(vector.size());//acceder a la cantidad de elementos que hay
        System.out.println(vector.elementAt(2));//accede en al posición 2
        
        //eliminar
        vector.removeElementAt(0);//se va al indice del vector y lo elimina
        vector.removeElement("AJ");//se va al elemento si lo encuenra lo elimina
        
        vector.removeAll(vector);//remueve todo el vector
        
        //operacciones
        System.out.println(vector.contains("AJ"));//nos va a devolver verdadero o falso
        System.out.println(vector.indexOf("AJ"));//vamos a saber la posición
        
        
    }
    
}
