
package tp_01;

import java.util.Scanner;


public class PetitGrandIdentique {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nb1,nb2;
        
        System.out.print("Entrer un premier nombre: ");
        nb1=reader.nextInt();
        System.out.print("Entrer un deuxieme nombre: ");
        nb2=reader.nextInt();
       
        if (nb1 == nb2){
            System.out.println("Les 2 nombres sont egaux");
        }
        else if(nb1<nb2){
            System.out.println("le 1er nombre est plus petit que le 2e");        
        }
        else{
            System.out.println("Le 1er nombre est plus grand que le 2");
        }
    }
    
}
