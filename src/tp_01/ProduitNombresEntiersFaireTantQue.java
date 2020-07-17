
package tp_01;

import java.util.Scanner;


public class ProduitNombresEntiersFaireTantQue {

 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        long n,i,produit;
        
        System.out.print("Saisissez la valeur de n: ");
        n=reader.nextLong();
        i=1;
        produit=1;
        
        do{
            produit=produit*i;
            i++;
        }
        while(i<=n);
        
        System.out.println("Le resultat est: " +produit); 
        
    }
    
}
