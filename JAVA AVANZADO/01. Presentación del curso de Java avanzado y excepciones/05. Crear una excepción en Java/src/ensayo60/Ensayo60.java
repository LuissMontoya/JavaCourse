package ensayo60;
public class Ensayo60 {

    public static void main(String[] args) {
        try {
            System.out.println("provocando error");
            throw new MyException();
        } catch (MyException e) {
            System.err.println(e.exceptionError());
        }
    }
    
}
