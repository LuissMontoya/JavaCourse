package ensayo36;
public class MasterMonster {
   public int NUMERO1=10;//nivel de seguridad nula, es decir que será publica para todos las clases o paquetes
   private int numero2=100;//nivel dos de seguridad accesible para los paquetes y clases
   int numero3=1000;//seguridad por defecto proporcionada ppor java
   protected int numero4=10000;//nivel maximo de seguridad la cual restringe la variable solo para la clase especifica sin más accesos
}
