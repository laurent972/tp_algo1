
package tp_01;

import java.util.Scanner;


public class Perimetre {

    public static void main(String[] args) {
        
        //CONSTANTES
        final int NB_COTES = 4;
        
        //VARIABLES
        double longueur, resultat;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("longueur du côté:");
        longueur = reader.nextDouble();
        resultat = longueur * NB_COTES;
        System.out.println("Périmètre :" + resultat);
        
    }
    
}
