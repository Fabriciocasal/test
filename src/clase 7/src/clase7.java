import java.util.Scanner;

public class clase7 {

	public static void main(String[] args) {
		
		
		/*int[] v1 = {1, 2, 3, 4};
		int[] v2 = new int [4];
		
		v2=v1;
		
		System.out.println(v1[1]);
	    System.out.println(v2[1]);*/
		
		Scanner lector=new Scanner(System.in);
	    String respuesta="";
		int cant=5;
		String[] nombre=new String [5];
		int [] edad = new int [5];
		
		for(int i=0; i<0;i++){
			
			System.out.println("ingrese nombre");
			nombre[i]=lector.nextLine();
			System.out.println("ingrese una edad");
			edad[i]=Integer.parseInt(lector.nextLine());
			
          }
		while (!respuesta.equals ("s")){
			
			System.out.println("ingrese una letra");
			respuesta=lector.nextLine();
			
		 switch (respuesta){
		
		 
		 case"n": 
			 System.out.println("ingrese a n");
		 break;
		 
		 case "e":
			 System.out.println("ingrese a e");
		 break;
		 
		 default:
			 System.out.println("no es valido");
		 break;
		 
		 }
			
			
		}
		System.out.println("termino");
		
		
		
	
	
	}

}
