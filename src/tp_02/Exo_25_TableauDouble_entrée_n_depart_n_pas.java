package tp_02;

import java.util.Scanner;


public class Exo_25_TableauDouble_entrée_n_depart_n_pas {

      public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        
        int i,j,pas,valDepart, val;
        int nl=10,nc=2;
        int tab[][];  // Je declare mon tableau à double entrée
        tab= new int [nl][nc]; // j'initialise mon tableau
      
        System.out.println("Ecrire la valeur de départ ");
        valDepart=reader.nextInt();
        
        System.out.println("Saisissez le pas ");
        pas=reader.nextInt();
        
        val=valDepart;
        for(i=0; i<nl; i++){
            for (j=0; j<nc; j++){
              /*tab[i][j]=val;
               val=val+pas;*/
              tab[i][j]=valDepart+(nc*i+j)*pas;
            }
        }
        
      for(i=0; i<nl; i++){
            System.out.println();
            for (j=0; j<nc; j++){
                System.out.print((tab[i][j]) + "\t"); 
            }
        }
        
    }
    
}
