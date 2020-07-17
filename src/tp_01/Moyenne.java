
package tp_01;

import java.util.Scanner;


public class Moyenne {

    public static void main(String[] args) {
        //VARIABLE
        int n1,n2,n3,n4;
        double moyenne = 0;
        double resultat;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Entrer la valeur du 1er nombre:");
            n1=reader.nextInt();
        System.out.print("Entrer la valeur du 2e nombre:");
            n2=reader.nextInt();
        System.out.print("Entrer la valeur du 3e nombre:");
            n3=reader.nextInt();
        System.out.print("Entrer la valeur du 4e nombre:");
            n4=reader.nextInt();
        //resultat=(n1+n2+n3+n4);
        //moyenne=resultat/4;
        
        //Solution:
        resultat=(n1+n2+n3+n4)/4.0;
        
        System.out.println("La moyenne est egale à:" +resultat);
            
        
    }
    
}
