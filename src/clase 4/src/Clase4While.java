import java.util.Scanner;

public class Clase4While {

	public static void main(String[] args) {
		
      Scanner G=new Scanner (System.in);
		int i=1;
		int numero;
		int suma=0;
		
		
		while (i<=10)
		{
			System.out.println("ingrese un numero");
			numero=Integer.parseInt(G.nextLine());
			suma=suma+numero;
			i=i+1;
		}
		
		System.out.println("la suma es"+suma);
	}
}
