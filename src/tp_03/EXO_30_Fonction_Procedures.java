/*
Ecrire en Java les fonctions qui, à partir des deux nombres entiers positifs reçus en paramètre, retournent :
> le minimum
> le maximum
> le quotient
> le reste de la division euclidienne.
Tester le tout dans le programme principal 

 

Saisir un premier nombre entier: 9
Saisir un second nombre entier: 7

 

**************** RESULTAT ****************
Minimum : 7
Maximum : 9
Quotient : 1
Reste : 7
******************************************

 */
package tp_03;

import java.util.Scanner;
import static tp_03.EXO_29_Correction.FontionCarre;
import static tp_03.EXO_29_Correction.procedureAffichage;

/**
 *
 * @author Formation
 */
public class EXO_30_Fonction_Procedures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         
         System.out.print("Saisissez un premier nombre entier: ");
         int n=reader.nextInt();
         
         System.out.print("Saisissez un premier nombre entier: ");
         int m=reader.nextInt();
         
         procedureAffichage("Resultat");
          System.out.println(fontionMinimum(n,m));
          System.out.println(fontionMax(n,m));
          System.out.println(fonctionQuotient(n,m));
          System.out.println(fonctionEuclidienne(n,m));
         procedureAffichageBottom();
    }
    
     public static int fontionMinimum(int x,int y) {
        /* if(x<y){
             return x;
         }else{
             return y;
         }*/
         
         return (x < y) ? x : y; //equivalent   
    }
     
     public static int fontionMax(int x,int y) {
        /* if(x<y){
             return y;
         }
             return x;
         */
         
         return (x>y)?x:y;
    }
     
      public static int fonctionQuotient(int x,int y) {
              return x/y; 
        }
      
       public static int fonctionEuclidienne(int x, int y ) {
               /*  fonctionQuotient(x,y);
                 int r;
               
                      x=y/fonctionQuotient(x,y);
                      return  r=x-y;*/
                 
                 return x % y;     
        }
       
      public static void procedureAffichage(String msg) { 
          System.out.println("***********" +msg+ "************");  
      }
      
       public static void procedureAffichageBottom(/* emplacement variable*/) { 
          System.out.println("***********************");  
      }
    
}
