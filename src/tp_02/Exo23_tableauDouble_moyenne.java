
package tp_02;

import java.util.Scanner;


public class Exo23_tableauDouble_moyenne {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i,j,somme;
        double moyenne;
        int nl=5,nc=2;
        
        int tab[][]; // Declaration du tableau
        
        tab = new int[nl][nc];
        
        for(i=0; i<nl; i++){
            for(j=0; j<nc; j++){
                System.out.print("Saisissez un nombre: ");
                tab[i][j]=reader.nextInt();
            }
        }
        somme=0;
        for(i=0; i<nl; i++){
            for(j=0; j<nc; j++){
                somme=somme+tab[i][j];
            }
        }
        
        moyenne= (double)somme/(nl*nc);
        System.out.println("La moyenne est: "+moyenne);
    }
    
}
