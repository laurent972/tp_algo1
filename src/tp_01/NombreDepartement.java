
package tp_01;

import java.util.Scanner;


public class NombreDepartement {

   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int var;
        
        System.out.print("Saisissez votre département (13,83,84,972): ");
        var=reader.nextInt();
        
        switch(var){
            case 13:
            System.out.println("Bouches-du-Rhone");
            break;
            
            case 83:
            System.out.println("Var");
            break;
            
            case 84:
            System.out.println("Vaucluse");
            break;
            
            case 972:
            System.out.println("Martinique");
            break;
            
            default:
            System.out.println("Choisissez un nombre soit 13,83,84 ou 972");
            
        }
        
    }
    
}
