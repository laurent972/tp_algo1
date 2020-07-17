
package tp_01;

import java.util.Scanner;


public class ConsecutifOrdonnés {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Defini la fonction de lecture du clavier
        int nb1,nb2;
        
       System.out.print("Saisissez le premier nombre:"); //message affiché à l'ecran
       nb1=reader.nextInt(); //attribue la valeur saisie au clavier au nb1
       System.out.print("Saisissez le deuxieme nombre: ");
       nb2=reader.nextInt();//attribue la valeur saisie au clavier au nb1
        
       if(nb2==nb1+1){
           System.out.println("Les nombres se suivent et sont consecutifs");
       }
       else{
           System.out.println("Les nombres NE SE SUIVENT PAS et ne SONT PAS CONSECUTIFS");
       }      
    }
  
}
