package ensayo66;
public class Ensayo66 {
public static void main(String[] args) {
       
    int num=0;
    
    while (num<20) {
        System.out.println(num);
        
        if(num==10){
            break;//romper lo que nos hace es que nos saca del ciclo en donde estamos ejecuando
        }
        num++;
    }
    
    int i;
    for(i=0;i<10;i++){
        System.out.println("1");
        System.out.println("2");
        break;
    }
    for(i=0;i<10;i++){
        System.out.println("3");
        System.out.println("4");
        continue;
    }
    
    
    
    
    
    }
    
}
