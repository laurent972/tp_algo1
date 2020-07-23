
package tp_03;

import java.util.Scanner;


public class EXO_29_Correction {
   
       public static void main(String[] args) { // Main
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Saisissez un entier: ");
        int n=reader.nextInt();
        
        System.out.print("Saisissez le nombre à la puissance: ");
        int p=reader.nextInt();
        
        procedureAffichage("Calcul du carré");
        System.out.println(FontionCarre(n));
        
        procedureAffichage("Calcul du cube");
        System.out.println(FontionCube(n));
        
         procedureAffichage("Calcul de la puissance");
        System.out.println(FontionPuissance(n,p));
    }
    
    
    public static int FontionCarre(int carre) {      
        return carre*carre;
    }
     
    public static int FontionCube(int cube) {
        return cube*cube*cube;
    }
    
    public static int FontionPuissance(int nb, int ps ) {
        
        int i, produit=1; // fait par moi
        for(i=1; i<=ps; i++){
            produit=produit*nb;
        }
        return produit;
    }
    
    
    public static void procedureAffichage(String msg) {   // initialiser la variable n pour la procedure  
        System.out.println("****" +msg+ "****");   
    }
    
}
