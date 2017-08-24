package clase3;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int edad;
		Scanner Y=new Scanner (System.in);
		System.out.println("ingrese una edad");
		edad=Integer.parseInt(Y.nextLine());
		
		
		if(edad>=18){
	        System.out.println("la persona es mayor");
		   }
		    else{
		     System.out.println("la persona es adolecente");
		     
		           if(edad<13){
			       System.out.println("la persona es menor de edad");
		           }
		    }
		    
		    } //arreglar
	//entrada y salida, if y tp 1234

}
