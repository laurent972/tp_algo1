
package tp_01;

import java.util.Scanner;

public class PairImpair {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        long nb;
        
        System.out.print("Saisissez un nombre:");
        nb=reader.nextLong();
        
        if(nb % 2 == 0){
             System.out.println("Le nombre est pair");
        }
        else{
             System.out.println("Le nombre est IMPAIR");
            }
    }
    
}
