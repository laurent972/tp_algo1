
package tp_01;

import java.util.Scanner;

public class AnneeBissextiles {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n,an;
        
        System.out.print("Saisissez année:");
        n=reader.nextInt();
        an=n;

        if(n % 400 == 0){
            System.out.println(+n+ "est bissextile"); 
        }
        else if(n % 100 == 0){
            System.out.println(+n+ "N'EST PAS bissextile");
        }
        else if(n % 4 == 0){
            System.out.println(+n+ "est bissextile");
        }
        else{
            System.out.println(+n+ "N'EST PAS bissextile");
        }
       
    }
    
}
