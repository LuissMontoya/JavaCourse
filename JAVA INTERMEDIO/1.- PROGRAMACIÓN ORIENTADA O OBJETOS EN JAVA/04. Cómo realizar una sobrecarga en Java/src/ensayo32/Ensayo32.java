package ensayo32;
public class Ensayo32 {

    public static void main(String[] args) {
        Robot robot=new Robot();
        
        robot.caminar();//lo que se hace es sobrecargar un metodo
        System.out.println(robot.numero);
        robot.caminar(10);
        System.out.println(robot.numero);
        robot.caminar("hola");//para así poderlo usar varias veces sobreescribiendo sus valores
       
    }
    
}
