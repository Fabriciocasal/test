
package poo.herencia.figuras;


public class Rectangulo extends Figuras{

    public void calcularPerimetro() {
         int perimetro = getLado1()* 2 + getLado2 ()* 2;
         System.out.println("El perimetro es: " + perimetro);
    }

   
 
    
}
