
package poo.herencia.figuras;

import java.util.ArrayList;


public class PooHerenciaFiguras {

  
    public static void main(String[] args) {
        //Figura no se instancia pq es un metodo abstracto
        
        Triangulo t1 = new Triangulo(1, 2, 3);
        Rectangulo r1 = new Rectangulo();
        Cuadrado c1 = new Cuadrado(2);
        Circulo cir1 = new Circulo();
        
        t1.calcularPerimetro();
        r1.calcularPerimetro();
        
        ArrayList distintasFiguras = new ArrayList();
        
        distintasFiguras.add(t1);
        distintasFiguras.add(r1);
        distintasFiguras.add(c1);
        distintasFiguras.add(cir1);
               
        for (Object f1 : distintasFiguras) {
            
            System.out.println(f1.toString());
        }
     
    }
    
}
