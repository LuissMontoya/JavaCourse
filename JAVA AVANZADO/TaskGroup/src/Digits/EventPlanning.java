package Digits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EventPlanning {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = in.readLine();
            if(str==null || str.isEmpty()) break;
            String[] temp = str.split(" ");
            int no_de_par = Integer.parseInt(temp[0]);
            int bud = Integer.parseInt(temp[1]);
            int hoteles =Integer.parseInt(temp[2]);
            int finesSemana = Integer.parseInt(temp[3]);
            int[] resultado = new int[hoteles];
            int countador = 0;
            for(int i=0;i<hoteles;i++)
                  {
                    int price_for_one = Integer.parseInt(in.readLine());
                    String[] beds = in.readLine().split(" ");
                    boolean valid = false;
                    for(int j=0;j<finesSemana;j++)
                        {
                            if (Integer.parseInt(beds[j]) >= no_de_par )
                                {
                                    if(no_de_par * price_for_one <= bud)
                                    {
                                       resultado[countador] = no_de_par * price_for_one;
                                        countador++;
                                       break;
                                    }
                                }
                        }
                  }
            int res =resultado[0];
            if (countador > 0)  {
               for(int i=0;i<countador;i++)
                  res = Math.min(res,resultado[i]);
               System.out.println(res);
            }
            else
                System.out.println("stay home");
            }
    }
    
}
