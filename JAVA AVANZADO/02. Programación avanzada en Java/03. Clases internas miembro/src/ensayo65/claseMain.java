package ensayo65;
public class claseMain {
    int numero;
    String otrodato;
    Anidada claseanidada;//se define como los demas valores
    
    public claseMain (int numero, String otrodato, String nombre){//las clases anidadasson clases dentro de otra clase
        claseanidada= new Anidada();//se crea un nuevo objeto
    } 
    class Anidada{//se declara el constructor de la clase
        String datoClaseAnidada;//us datos
        String dato2ClseAnidada;
    }
    public void Andidada(){//y su metodos
        
    }
}
