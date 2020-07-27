
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
       int nl=matrice.length; 
       int nc=matrice[0].length;
       for(i=0; i<nl; i++){
           for(j=0; j<nc; j++){
               matrice[i][j]= 100- matrice[i][j];
           }
       }
           
           return matrice;
    }
    
    public static int[][] contraste(int[][] matrice) {
       int i, j;
       int n=matrice.length;
       int m=matrice[0].length; 
       
       for(i=0; i<n; i++){
           for(j=0; j<m; j++){
              if(matrice[i][j]>75){
                  matrice[i][j]=100;
                  
              }else if(matrice[i][j]>50){
                  matrice[i][j]=75;
                  
              }else{
                matrice[i][j]=matrice[i][j]/2;
               }
           }
       }
           
           return matrice;
    }
    
}
