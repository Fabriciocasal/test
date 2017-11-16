
package poo.herencia.figuras;

public class  Triangulo extends Figuras{
    
    public Triangulo(int lado, int lado1, int lado2){
        
        this.lado=lado;
        this.lado1=lado1;
        this.lado2=lado2;
        
    }
    public void calcularPerimetro() {
        int resul;
        resul= getLado() + getLado1() + getLado2();
        System.out.println("El perimetro es: " +resul );
    }

   
    
   
}