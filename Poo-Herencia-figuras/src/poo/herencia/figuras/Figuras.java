
package poo.herencia.figuras;

import java.util.ArrayList;

public abstract class Figuras {

    int area;
    int lado;
    int lado1;
    int lado2;
    int base;
    int altura;
   
    private int perimetro;
    private  double radio;
    
    ArrayList figuras;
   
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public abstract void calcularPerimetro();//metodo

    @Override
    public String toString() {//dentro del for each
        return "Figuras{" + "area=" + area + ", lado=" + lado + ", lado1=" + lado1 + ", lado2=" + lado2 + ", base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", radio=" + radio ;
    }
    
    
 
  
   
}
