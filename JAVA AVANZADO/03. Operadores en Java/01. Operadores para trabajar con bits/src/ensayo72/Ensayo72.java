package ensayo72;
public class Ensayo72 {
    public static void main(String[] args) {
       int numero=20;
        System.out.println("el valor de numero en    binario es de: "+Integer.toBinaryString(numero));//nos muestra el numero en binario
        
       int numeroI=numero <<3;//al recorrer tres posiciones
        System.out.println("Este resultao es de: "+Integer.toBinaryString(numeroI));//nos muestra el numero recorrido en binario
       
        System.out.println(numero);//se imprimen los valor
        System.out.println(numeroI);
        
        int numeroD=numero>>3;//un recorrido pero en sentido contrario inyectandole bits
        
        System.out.println("Este es el numero d en BIN");
        System.out.println("normal: "+numero);
        System.out.println(">> D: "+numeroD);
        
        int numeroDS=-1>>>3;
        System.out.println("Desplazamientos sin signo: "+numeroDS);//se despalza pero sin tener en cuenta el simbolo
            
        int numA=88;
        int numB=150;
        
        int numAND=numA & numB;
        System.out.println("AND: "+numAND);//se unen los bits
        
        int numOR=numA | numB;
        System.out.println("OR: "+numOR);
        
        int numXOR=numA ^ numB;
        System.out.println("XOR: "+numXOR);
        
        int numC= 90;
        int numNOT= ~numC;
        System.out.println("NOT: "+numNOT);//nos regresa lo contrario pero en bits
        
        
    }
}
