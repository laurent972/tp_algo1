
package tp_01;

import java.util.Scanner;


public class anneBissextileV {

   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n,an;
        
        System.out.print("Saisissez une année:");
        n=reader.nextInt();
        an=n;
        
        if((n%400==0) || (n%100!=0) && (n%4==0) ){
            System.out.println(+n+" est bissextile");
        }
        else{
            System.out.println(+n+" N'EST PAS bissextile");
        }
    }
    
}
