package clase2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner S=new Scanner (System.in);
		
		String num1;
		String num2;
		
		int resultado;
		//string pasa a int pasa sumar
		
		System.out.println("ingrese un numero");
		num1=S.nextLine();
	    
		System.out.println("ingrese un numero");
		num2=S.nextLine();
		
		
		resultado=Integer.parseInt(num1)+Integer.parseInt(num2);
		//da error si no se cambia string a int
		
	  System.out.println("el resultado es:"+resultado);
		
	 //GuiaIf.Ej1();    //llamo a al ejercicio indicado
	 //GuiaIf.Ej2();
     //GuiaIf.Ej3();
     
	  
	 
	    
		  
	}

}
