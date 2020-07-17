
package tp_02;

import java.util.Scanner;

public class EXO_24_TableauDoubleEntree_plusPetitNombe {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i,j,ppn;
        int nl=5,nc=2;
        int tab[][];  // Je declare mon tableau à double entrée
        tab= new int [nl][nc];
        
        for(i=0; i<nl; i++){
            for (j=0; j<nc; j++){
                System.out.print("Saisissez un nombre: ");
                tab[i][j]=reader.nextInt();
            }
        }
        
        ppn=tab[0][0];
        for(i=0; i<nl; i++){
            for(j=0; j<nc; j++){
                if(tab[i][j]<ppn){
                    ppn=tab[i][j];
                }
            }
        }
        System.out.println( ppn + " est la plus petite valeur ");
        
    }
    
}
