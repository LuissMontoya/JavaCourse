package Digits;

import java.io.PrintWriter;
import java.util.Scanner;

public class Digits {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
    while (sc.hasNext()) {
      String input = sc.next();
      if (input.equals("END"))
        break;
      out.println(solve(input));
    }
 
    out.close();
    sc.close();
  }
 
  private static int solve(String input) {
    int contador = 1;
    int len = input.length();
    if ((len + "").equals(input))
      return contador;
    else
      return contador + solve(len + "");
  }
}


