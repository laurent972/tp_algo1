
package tp_03;

import java.util.Scanner;


public class EXO_33_fonctionNbrePremier_Booleen {

   
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int n=0, i;
        
        while(n<3){
            System.out.print("Saisissez un nombre superieur ou egal à 3 : ");
            n=reader.nextInt();
        }        
         
        if(fonctionPremier(n)){
            System.out.println("Premier");
        }else{
            System.out.println("pas premier");
        }
        
        System.out.println((fonctionPremier(n)) ? "premier" : "Pas premier");
        
    }
    
   public static boolean fonctionPremier(int a) {
              
       if( a%2 == 0){
           return false;
       }
       int div=3;
       
       while(div*div<=a && a % div>0){
           div=div+2;
       }
       
       return div*div>a;
    }
    
}
