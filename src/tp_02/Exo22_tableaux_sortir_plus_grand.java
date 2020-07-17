
package tp_02;

import java.util.Scanner;


public class Exo22_tableaux_sortir_plus_grand {

  
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       
       int n=10,max,i;
       int[] tab;
       
       tab = new int[n];
        // lecture du tableau 
        
        for(i=0; i<n; i++){
            System.out.print("Enter un nombre: ");
            tab[i]=reader.nextInt();
        }
        
        max=tab[0];
        for(i=0; i<n; i++){
            if(tab[i]>max){
                max=tab[i];
            }
        }
        
        System.out.println( max + " Est la valeur la plus haute");
        
    }
    
}
