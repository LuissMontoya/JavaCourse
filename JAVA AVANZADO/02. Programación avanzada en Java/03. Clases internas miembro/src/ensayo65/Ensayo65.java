package ensayo65;
public class Ensayo65 {
    public static void main(String[] args) {
       Lampara lampara=new Lampara();
       
      // lampara.encendido;//me da acceso a el objeto
       
       Lampara.Foco foco=lampara.new Foco(10);  //me da acceso a las clase anidada, y al objeto que en este caso es el constructor
    }
    
}
