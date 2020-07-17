
package tp_01;

import java.util.Scanner;

public class _boucle_Produit {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         
         long n,i,produit;
         produit=1;
         
         System.out.print("Saisissez un entier:");
         n=reader.nextLong();
         
         for(i=2; i<=n; i++){
             produit=produit*i;
         }
         
         System.out.println("Le resultat est: "+produit);
    }
    
}
