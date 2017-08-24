package clase3;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner P=new Scanner(System.in);
		System.out.println("ingrese una edad");
		edad=Integer.parseInt(P.nextLine());
		
		if(edad<18){
		System.out.println("La persona no es adolecente");
	   }
	}

}
