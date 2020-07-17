
package tp_01;

import java.util.Scanner;


public class Fibo_exercice19_2variables {

   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); 
        int  somme, d, ad, i, n;
        
        System.out.print("Donner une valeur n : ");
        n=reader.nextInt();
       
        switch(n){
            case 1 :
            case 2 : System.out.println("Le resultat vaut 1");
                     break;
            default: ad= 1; 
                      d=1;
                      for(i=3; i<= n; i++){
                          somme= d+ad;
                          ad = d;
                          d = somme;
                      }                
                      System.out.println("Terme de la suite " +d);
        }
        
    }
    
}
