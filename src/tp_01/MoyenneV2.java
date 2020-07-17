
package tp_01;

import java.util.Scanner;


public class MoyenneV2 {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n,i,somme;
        double resultat;
        
        somme=0;//initialisation des variables
        for(i=1; i<=4; i++){ //boucle de 4
            System.out.print("Saisissez un nombre:");
            n=reader.nextInt();
            
            somme=somme+n; //on stock n dans la somme
            
        }
        
        resultat=somme/4.0; //on divise par un reel pour obtenir un reel
        
        System.out.println("La moyenne est:"+resultat);
        
    }
    
}
