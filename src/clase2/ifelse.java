package clase2;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
       
		
		Scanner S=new Scanner (System.in);
		
		

        int num1;
		int num2;  //con if los string van con int
		
		int resultado;
		
		
		System.out.println("ingrese un numero");
		num1=Integer.parseInt(S.nextLine());
		
		System.out.println("ingrese un numero");
		num2=Integer.parseInt(S.nextLine());
		
	  
	     if(num2!=0){          //la cuenta va dentro del if
		  
		  resultado=num1/num2;
		  System.out.println("el resultado es:"+resultado);
		  
	  }
	  
	     else{                //else va sin condicion (num2!=0)
		  System.out.println("el numero no debe ser 0");
	  }
	  
	}

}
