package clase3;


	import java.util.Scanner;

	public class mainGuiaIF {
		public static void Ej1(){
		
			int edad;
			Scanner S=new Scanner(System.in);
			
			System.out.println("ingrese una edad");
			edad=Integer.parseInt(S.nextLine());
			
			
			if(edad==15){
				System.out.println("ni�a bonita");
			}
		}
	    
		public static void Ej2(){
	        int edad;
			
			Scanner F=new Scanner(System.in);
			
			System.out.println("ingrese su edad:");
			edad=Integer.parseInt(F.nextLine());
		
			if(edad>=60){
				System.out.println("la persona es mayor de edad");
			}
	    }
	    
		public static void Ej3(){
	    
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
	   
		public static void Ej4(){
	    	
	    	
	  		   int edad;
	  		   Scanner L=new Scanner(System.in);
	  		    
	  		   System.out.println("engrese su edad:");
	  		   
	  		   edad=Integer.parseInt(L.nextLine());
	  		   
	  		  
	  		   if((edad>=13)&&(edad<=17)){
	  		  System.out.println("la persona es adolecente");
	  	      }
	    	}
	
		public static void Ej5(){
			
		
			int edad;
			Scanner P=new Scanner(System.in);
			System.out.println("ingrese una edad");
			edad=Integer.parseInt(P.nextLine());
			
			if(edad<18){
			System.out.println("La persona no es adolecente");
		   }
		}
		
		public static void Ej6(){
			
			
			
		}
	
		
		
		
		
		
		
		
	
		
	}
	



