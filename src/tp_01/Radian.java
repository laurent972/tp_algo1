
package tp_01;

import java.util.Scanner;


public class Radian {

    public static void main(String[] args) {
        
        //CONSTANTE
        final float PI=3.1415926f;
        //VARIABLE
        double angle,resultat;
        Scanner reader = new Scanner(System.in);
        
        System.out.print(" Entrez la valeur de l'angle en degré: ");
        angle=reader.nextDouble();
        resultat=angle*PI/180;
        System.out.println("La valeur de l'angle en radian est :" + resultat + "rad");
    }
    
}