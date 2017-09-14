/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;


public class ejercicios {
    
    public static void ejercicio1() {
    
        
    Scanner lector=new Scanner (System.in);
    
    int num1;
    int num2;
   
    int total; 
    
    System.out.println("escribe un numero");
         num1=Integer.parseInt(lector.nextLine());
        System.out.println("escribe un numero");
         num2=Integer.parseInt(lector.nextLine());
         
         total=num1+num2;
         System.out.println("el total es "+total);      
    }
      
    
    public static void ejercicio2() {
        
        
        Scanner lector=new Scanner (System.in);
        
        String usuario;
        String contraseña;
        
        System.out.println("ingrese usuario");
        usuario=lector.nextLine();
        
        
        while(!usuario.equals("velocidad")){
            
            System.out.println("usuario incorrecto, vuelva a escribir el usuario");
            usuario=lector.nextLine();
        }
        
        System.out.println("ingrese contraseña");
        contraseña=lector.nextLine();
       
        while(!contraseña.equals("garantizada")){
           
           System.out.println("contraseña incorrecta, vuelva a escribir la contraseña");
           contraseña=lector.nextLine();
       }    
    }
    
    
    public static void ejercicio3() {
        
        Scanner lector=new Scanner (System.in);
        
        int bancos;
        int alumnos;
        int faltante=0;
        int sobrante=0;
        
        System.out.println("cuantos alumnos hay en clase? ");
        alumnos=Integer.parseInt(lector.nextLine());
        
        System.out.println("cuantos bancos hay en el aula? ");
        bancos=Integer.parseInt(lector.nextLine());
        
        faltante=alumnos-bancos;
        sobrante=bancos-alumnos;
        
        if(alumnos>bancos){
            
        System.out.println("no alcanzan los bancos para los alumnos, faltan "+faltante+ "sillas");
            
        }else if(alumnos<bancos){
                System.out.println("en el aula sobran " + sobrante + " sillas");
                
        }else{
            System.out.println("el aula esta completa");
        }
     }   
        
    public static void ejercicio4() {
        
        Scanner lector=new Scanner (System.in);
        
        int monto;
        String contado;
        String tarjeta;
        int subtotal=0;
        int total=0;
        System.out.println("ingresa el monto de la compra ");
        monto=Integer.parseInt(lector.nextLine());
        
        System.out.println("cual es el metodo de pago? ");
        contado=lector.nextLine();
        
        if(!contado.equals("contado")){
            System.out.println("si se pagara al contado se le aplicaria un descuento del 10%");
       
            System.out.println("el monto total es: "+monto);
    
        }else{
          subtotal=monto*10/100;
          total=monto-subtotal;
        
        System.out.println("el monto total es: "+total);
         }
        }
    
    public static void ejercicio5() {
        Scanner lector=new Scanner (System.in);
        
        int mes;
        
        System.out.println("ingrese un numero del mes");
        mes=Integer.parseInt(lector.nextLine());
        
        switch (mes){
            
            case 1: System.out.println("enero");
            break;
            case 2: System.out.println("febrero");
            break;
            case 3: System.out.println("marzo");
            break;
            case 4: System.out.println("abril");
            break;
            case 5: System.out.println("mayo");
            break;
            case 6: System.out.println("junio");
            break;
            case 7: System.out.println("julio");
            break;
            case 8: System.out.println("agosto");
            break;
            case 9: System.out.println("septiembre");
            break;
            case 10: System.out.println("octubre");
            break;
            case 11: System.out.println("noviembre");
            break;
            case 12: System.out.println("diciembre");
            break;
            
            default: System.out.println("el numero ingresado no es el correcto");
           }
    }

    public static void ejercicio6() {
       
        
	int numeroAmultiplicar;
	int multiplicador=0;
        int total;
	
	Scanner lector=new Scanner (System.in);
		
	System.out.println("ingrese un numero a multiplicar");
	numeroAmultiplicar=Integer.parseInt(lector.nextLine());
        System.out.println("ingrese el valor a multiplicar");
        multiplicador=Integer.parseInt(lector.nextLine());
        
	for(int i=0;i<=multiplicador;i++){
			
	total = i*numeroAmultiplicar;
	System.out.println(numeroAmultiplicar + " x "+ i +" = " + total);
        
    }
  }
}

