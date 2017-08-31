import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner S = new Scanner(System.in);
    	
    	int num;
    	
    	System.out.println("ingresar un numero entre 0  9");
         num=Integer.parseInt(S.nextLine());
       
       while((num<0)||(num>9)){
    	   
    	   System.out.println("valores entre 1 y 9");
    	   num=S.nextInt();
       }
       
		}
		
		
	}   
	


