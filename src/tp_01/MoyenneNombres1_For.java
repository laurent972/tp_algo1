
package tp_01;

import java.util.Scanner;


public class MoyenneNombres1_For {

  
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n,note,somme,i;
        double moyenne,diviseur;
        somme=0;
        
        System.out.print("Saisissez le nombre de note: ");
        n=reader.nextInt();
        
        for(i=1; i<=n;i++){
            System.out.println("Saisissez une note: ");
            note=reader.nextInt();
            
            somme=somme+note;
            
        }
      
        moyenne=(double)somme/n; //cast --> conversion de type ici double pour rendre la division en reel
        
        System.out.println("La moyenne est : " +moyenne);
    }
    
}
