
package tp_01;

import java.util.Scanner;


public class CalculeMoyenneDO_while {

  
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int note,somme,i;
        double moyenne;
        somme=0;
        i=0;
        
        do{
            System.out.print("Saisissez une note (pour valider saisissez 0):");
            note=reader.nextInt();
            somme=somme+note;
            i=i+1; //Incrementation de passe dans la boucle
        } while(note!=0);
        
        if(i>1){
            moyenne=(double)somme/(i-1); //cast 
            System.out.println("La moyenne est :" +moyenne);
        }
        else{
            System.out.println(" Pas de valeur valide saisie");
        }         
    }
    
}
