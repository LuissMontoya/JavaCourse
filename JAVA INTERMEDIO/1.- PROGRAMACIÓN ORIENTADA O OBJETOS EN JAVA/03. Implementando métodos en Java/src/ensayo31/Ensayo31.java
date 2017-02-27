package ensayo31;
public class Ensayo31 {

    public static void main(String[] args) {
       Robot robot = new Robot();
       
       System.out.println(robot.numero);
       robot.caminar();//el metodo se puede reutilizar cuantas veces queramos
       System.out.println(robot.numero);
    }
    
}
