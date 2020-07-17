package tp_01;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Circonference {
     public static void main(String[] args) {
         
         //CONSTANTE
         final double PI = 3.1415926;
         //final float PI = 3.1415926f;
         
         //VARIABLE
         double diametre,resultat;
         Scanner reader = new Scanner(System.in);
         
         System.out.print("Entrez la valeur du diamètre: ");
         diametre=reader.nextDouble();
         //resultat = diametre * PI;
         resultat=diametre*Math.PI;
         System.out.println("la valeur de la circonference est:" +resultat); 
         
     }
}
