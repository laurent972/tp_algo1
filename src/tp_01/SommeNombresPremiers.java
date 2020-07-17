
package tp_01;

import java.util.Scanner;


public class SommeNombresPremiers {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n, somme,i;
        somme=0;
        i=1;
        
        System.out.print("Saisissez un entier:");
        n=reader.nextInt();
        
       // for(i=1; i<=n; i=i+1){
         //  somme=somme+i;
       // }
        
        // Alternative
       for(i=1; i<=n; i++){
          somme=somme+i;
        System.out.println("Resultat:" +somme);
        }
      
        System.out.println("Resultat:" +somme);
        
    }
    
}
