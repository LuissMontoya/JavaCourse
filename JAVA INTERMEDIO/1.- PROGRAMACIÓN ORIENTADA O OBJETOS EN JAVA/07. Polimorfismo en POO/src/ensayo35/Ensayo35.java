package ensayo35;
public class Ensayo35 {
    public static void main(String[] args) {
        RobotMini mini = new RobotMini();
        RobotMega mega = new RobotMega();
        
        mini.ejecutar();
        mega.ejecutar(); //no soporta éste tipo de polimorfismo....
    }
    
}
