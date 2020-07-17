
package tp_01;

import java.util.Scanner;


public class AnneeBissextileWhile {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);         
         int n;

         do{
            System.out.print("Saisissez une année dans l'intervalle [1900, 2100]: ");
             n=reader.nextInt();
         }
         while(n<1900 || n>2100);
         
       if((n%400==0) || (n%100!=0) && (n%4==0) ){
            System.out.println(+n+" est bissextile");
        }
        else{
            System.out.println(+n+" N'EST PAS bissextile");
        }  
         
    }
    
}
