import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		
		/*int i;
		int num;
		int acum=0;   //seria lo mismo pasar el int a float pero no seria "correcto"
		float promedio;
		
		Scanner lector=new Scanner(System.in);
		
	   for(i=0;i<10;i++){
		   System.out.println("ingrese un numero");
		   num=Integer.parseInt(lector.nextLine());
		   acum=acum+num;
		   }
	    promedio=(float)acum/i;
		System.out.println("el promedio es; "+ promedio);*/
		
		
		
		
		
		int i;
		int numero;
		int producto;
		
		Scanner lector=new Scanner (System.in);
		
		System.out.println("ingrese un numero");
		numero=lector.nextInt();
		
		for(i=0;i<=10;i++){
			
			producto = i*numero;
			System.out.println(numero + " x "+ i +" = " + producto);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
