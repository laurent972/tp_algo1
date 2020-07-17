
package tp_01;

import java.util.Scanner;

public class NombresOrdonnes {
  
    public static void main(String[] args) {
        double nb1,nb2;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Entrer la valeur du 1er nombre:");
            nb1=reader.nextDouble();
        System.out.print("Entrer la valeur du 2e nombre:");
            nb2=reader.nextDouble();
            
        if ( nb1<nb2){
            System.out.println("Les nombres sont ordonnés");
        } 
        else{
            System.out.println("Les nombres ne sont pas ordonnés");
        }
    }
}
