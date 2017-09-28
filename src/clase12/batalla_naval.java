
package clase12;


public class batalla_naval {
    
    public static int [][]tablero;
    
    public static int tamano;
    
    public static void crearT(int T){
          
        
        tamano=T;
        tablero=new int [T][T];
           
    }
     public static void mostrarT(){
        
         for (int i = 0; i < tamano; i++) {
             System.out.println("");
             
             for (int J = 0; J < tamano; J++) {
                 System.out.print("     " + tablero[i][J]);
             }
         }
     }
    
    
    
    
}


