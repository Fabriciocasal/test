package clase2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int edad;
		
		Scanner G=new Scanner(System.in);
		System.out.println("ingrese su edad");
		
		edad=Integer.parseInt(G.nextLine());
		
		if(edad>=18){
			System.out.println("la persona es mayor de edad");
		}
		else{
			System.out.println("la persona es menor de edad");
		}
		
		
		
		
		
		
	}

}
