
package tp_03;

import java.util.Scanner;


public class EXO_29_Carre_Cube_Procedure_et_fonctions {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) { // Main
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Saisissez un entier: ");
        int n=reader.nextInt(); 
        
        procedureAffichage(n);
    }
    
    
    public static int FontionCarre(int carre) {
         int resultat;      
        resultat=carre*carre;     
        //resultat = Math.pow(carre, 2);
        
        return resultat;
    }
     
    public static int FontionCube(int cube) {
        int resultat;      
         resultat=cube*cube*cube;
        
         return resultat;
    }
    
    public static void procedureAffichage(int n) {   // initialiser la variable n pour la procedure  
        System.out.println("**** Calcul du carré ****" +FontionCarre(n));
        System.out.println("**** Calcul du cube ****" +FontionCube(n));    
    }
   
    
}
