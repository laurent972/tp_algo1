
package tp_02;

import java.util.Scanner;


public class Exo_21_Double_Tableaux {

  
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int n=5; //constante
        
         int i;
         int[] tab2;
         int[] tab1;
         
         // creation du tableau
        tab1 = new int[n];
        tab2= new int[n];
        
        for(i=0; i<n; i++){
            System.out.println("Saisissez un nombre: ");
            tab1[i]=reader.nextInt();
        }
        
        //Saisie tableau 2
        for(i=0; i<n; i++){
            tab2[i]= tab1[n-1-i];
        }
        
         //affichage du tableau
        for(i=0; i<n; i++){
            System.out.print(tab1[i] + "\t");
            System.out.println(tab2[i] + "\t"); 
        }
         
    }
    
}
