
package clase18;

import java.util.ArrayList;


public class Clase18 {

    
    public static void main(String[] args) {
      
        ArrayList <Alumno>lala=new ArrayList <>();
      
//        Alumno lector = new Alumno();
        
       // lector.nombre = "juan";
       // lector.apellido = "gonzalez";
       // lector.edad = 30;
          
        //lala.add(lector);  //metodo german
        
        lala.add(new Alumno("juan" , "asdasd" , 23));  
        lala.add(new Alumno("choto" , "salame" , 45));
        lala.add(new Alumno("borracho", "pijo", 34));
        
        for (Alumno minga : lala) {
            
           minga.mostrarInfo();
           minga.estaCursando("asdasd");//la materia se aplica a todos por igual
        }
        
        /*for (int i = 0; i < lala.size(); i++) {
            
            Alumno a;
           a=lala.get(i);
           a.mostrarInfo();
        }*/
    }
    
}
