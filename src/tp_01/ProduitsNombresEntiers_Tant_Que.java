
package tp_01;

import java.util.Scanner;


public class ProduitsNombresEntiers_Tant_Que {

  
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        long i, n, produit;
        
        System.out.print("Saisissez n: ");
        n=reader.nextLong();
        produit=1;
        i=1;
        
        while(i<=n){
            produit=produit*i;
            i++;
        }
        
        System.out.println("Resultat: " +produit);
    }
    
}
