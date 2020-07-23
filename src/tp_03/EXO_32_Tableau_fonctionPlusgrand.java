
package tp_03;

import java.util.Scanner;


public class EXO_32_Tableau_fonctionPlusgrand {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        final int N=10;
        int [] tableau;
        tableau = new int[N]; 
         
        for(i=0; i<N; i++){
            System.out.print("Saisisssez un nombre: ");
            tableau[i]=reader.nextInt(); // affectation de du nombre dans le tableau
        } 
        
        System.out.println("Index du plus grand " +fonctionIndexTab(tableau));
             
    }
    
     public static int fonctionIndexTab(int[] tab) {
       
        /* int max, i;
       
         max=0;
         for(i=0; i<tab.length; i++){
             if(tab[i]>tab[max]){
                 i=max;
             }             
         }*/
        
        /*** Correction ***/
        
        int iMax=0, i;
        int b = tab.length;
        
        for(i=1; i<b; i++){
            if(tab[i] > tab[iMax]){
                iMax = i;
            }
        }
      
        return iMax;
    }
     
}
