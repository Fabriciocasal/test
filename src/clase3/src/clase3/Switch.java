package clase3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
         int mes;
         Scanner m=new Scanner (System.in);
		 System.out.println("un mes del año");
         mes=Integer.parseInt(m.nextLine());
		 
		switch (mes)
		{
		
		
		case 1:
			System.out.println("que comiences bien el año");
			break;
		case 3:
			System.out.println("a clases");
			break;
		case 7:	
			System.out.println("se vienen las vaciones");
			break;
		case 12:
			System.out.println("felices fiestas");
			break;
		default:	
		
		
		}
		
		
		
		
		
		
	}

}
