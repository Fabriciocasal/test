import java.util.Scanner;

public class EjercicioLimpieza {

	public static void main(String[] args) {
		
		Scanner lector=new Scanner (System.in);
		int id;
		String nombre;
		int stock;
		float precio;
		float acum = 0;
		float total = 0;
		for(id=0;id<=2;id++){
			
			/*System.out.println("ingrese ID del producto");
			id=Integer.parseInt(lector.nextLine());
			System.out.println("ingrese nombre del producto");
			nombre=lector.nextLine();*/
			System.out.println("ingrese el precio del producto");
			precio=Integer.parseInt(lector.nextLine());
			System.out.println("ingrese el stock del producto");
			stock=Integer.parseInt(lector.nextLine());
			total=(float) ((float)precio*1.3);
			acum=acum+precio*stock;
		}
		System.out.println("el precio total es: "+acum);
		  
		System.out.println(total);
		
		

	}

}
