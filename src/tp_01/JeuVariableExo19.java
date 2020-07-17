/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_01;

import java.util.Scanner;


public class JeuVariableExo19 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  
        int n,valeur,i;
        
        //initialisation des valeurs
        n=(int)(Math.random()*100); //Random chiffre aleatoire
        i=0;
        //System.out.print(n);
        System.out.println("Trouver le chiffre secret compris entre 0 et 99: ");
        
        do{
            valeur=reader.nextInt();
             i++; //i=i+1
                    
            if(n>valeur){
                System.out.println("Le nombre est trop petit ! Réessaie !");
            }else if(n<valeur){
                System.out.println("Le nombre est trop grand ! Réessaie !");
            }
            
        }while(valeur!=n);
        
        System.out.println("Vous avez trouvé, en " +i+ " coups");
        System.out.print(+n+ " est le chiffre secret");
        
    }
    
}
