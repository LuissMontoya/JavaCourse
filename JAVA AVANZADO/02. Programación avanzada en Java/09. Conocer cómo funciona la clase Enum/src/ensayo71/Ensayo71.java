
package ensayo71;
public class Ensayo71 {
    public enum dias{//el unum nos sirve cuando los datos de una cdena son mas complejos y necesitamos de dar más detalles
        Lunes,martes,miercoles,jueves,sabado,domingo;
        String clima,climap;
        
        private dias(){//su constructos es privado
            this.clima="soleado";
        }
        
        public void pronostico(String clima){//se le pueden crear sus metodos
            this.clima=clima;
        }
        
        public String getClima(){//metodos 
            return clima;
        }
        
        public void setClima(String clima){//metodos
            this.clima=clima;
        }
        
        public static void main (String[] argumentos){
            
            dias dia= dias.Lunes;//no se define como un objeto porque cambiamos el public por private
            dias dia2=dias.martes;//se pueden crear
            
            System.out.println(dia.name());//tiene distintas acciones, name nos die en una cadena el nombre d la clase
            System.out.println(dia.toString());//debuelve un string  con el nombre de la constante
            System.out.println(dia.ordinal());//debolver un entero con la poscicion del enum segun esté declarado
            System.out.println(dia.compareTo(dia2));//comparar el enum que tenemos con un parametro
            System.out.println(dia.values());//el aray con todos los enum que hemos declarado
            
        }
    }
    
}
