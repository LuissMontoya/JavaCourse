package ensayo66.ejemplo;
public class Ejemplo {
    public static void  main(String[] argumentos){
        int [][]arrayInst={
            {10,90,92,95},
            {30,34,45,30},
            {60,39,42,12}
        };
        
        int i,j=0;
        int buscando=42;
        boolean encontrado=false;
        
        buscar:
        for(i=0;i<arrayInst[i].length;i++){
            for (j=0;j<arrayInst[i].length;j++){
                if(arrayInst[i][j]==buscando){
                    encontrado=true;
                    break buscar;
                }
            }
        }
        if(encontrado){
            System.out.println("Encontrado "+buscando+" en "+i+" , "+ j);
        }else{
            System.out.println("no encontramos "+buscando);
        }
    }
}
