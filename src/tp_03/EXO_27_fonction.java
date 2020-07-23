/*
EXO 27 
Ecrire une fonction qui calcule la partie entière d'un réel positif.
Ecrivez ensuite le programme principal qui appelle cette fonction.
Ecrire enfin le tout en Java

*/



package tp_03;

import java.util.Scanner;


public class EXO_27_fonction {

    
    public static void main(String[] args) { //Void --> ne retourne rien 
       Scanner reader = new Scanner(System.in);
       
       double n;
       
       System.out.print("Saisissez un nopmbre: ");
       n=reader.nextDouble();
       
       System.out.println("Partie entiere: " + PartieEntiere (n));
       
    }
    
     public static int PartieEntiere(double x) { // il faut mettre un int/double pour pouvoir retorner une valeur 
       int resultat;
       
       resultat=0;
       
       while(resultat < x){
           resultat++;
       }
       
       return resultat - 1;
       
    }
    
}
