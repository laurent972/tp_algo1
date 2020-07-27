
package tp_03;

/**
 *
 * @author Formation
 */
public class EXO_35_Saturation {

 
    public static void main(String[] args) {
        
    }
    
    
    
    
    public static int[][] mystere(int[][] matrice) {
       int i, j;
        
       for(i=0; i<4; i++){
           for(j=0; j<6; j++){
               matrice[i][j]= 100- matrice[i][j];
           }
       }
           
           return matrice;
    }
    
}
