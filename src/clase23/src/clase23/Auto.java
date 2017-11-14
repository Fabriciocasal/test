/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase23;

/**
 *
 * @author alumno
 */
public class Auto {
    
    private int numero;
    private Escuderia MiEscuderia;
    private String modelo;
    private Piloto elPiloto;
    private int TiempoRecorrido;//int para que el tiempo de recorrido sea 0
    
    public void Mostrar()
    {
        System.out.println("Numero: "+this.numero);
        System.out.println("Escuderia: "+this.MiEscuderia.Nombre);
        System.out.println("modelo: "+this.modelo);
        System.out.println("Tiempo recorrido: "+this.TiempoRecorrido);
        System.out.println("Piloto: "+this.elPiloto.DameNombreCompletoMay());
    }
    
    public int DameElTiempoRecorrido()
    {
        return this.TiempoRecorrido;
    }
    public void AgregarTiempoRecorrido(int Tiempo)
    {
        this.TiempoRecorrido = this.TiempoRecorrido+Tiempo;
    }
    
    
    public Auto(int numero)
    {
        this.elPiloto=new Piloto();
        this.modelo="Ford";
        this.numero=numero;//para que el for le asigne un numero diferente a cada uno
        this.MiEscuderia=new Escuderia(1930, "Italia", "Ferrari");  
        this.CargarPilotoRandom();
    }
    
    private void CargarPilotoRandom()
    {
       this.NombreRandom();
       this.ApellidoRandom();
    }
    
    private void NombreRandom()
    {
        int miRandom = (int)(Math.random()*10);
       
           switch(miRandom){
           
           case 0:
               this.elPiloto.setterNombre("juan");
               break;
           case 1:    
               this.elPiloto.setterNombre("pedro");
               break;
           case 2:    
               this.elPiloto.setterNombre("miguel");
               break;
            case 3:   
               this.elPiloto.setterNombre("perro");
               break;
            case 4:   
               this.elPiloto.setterNombre("perra");
               break;
            case 5:   
               this.elPiloto.setterNombre("langa");
               break;
            case 6:   
               this.elPiloto.setterNombre("chupala");
               break;
           } 
    }
    private void ApellidoRandom()
    {
        int miRandom = (int)(Math.random()*10);
        
        switch(miRandom){
            
           case 0:
               this.elPiloto.setterApellido("juan");
               break;
           case 1:    
               this.elPiloto.setterApellido("martinez");
               break;
           case 2:    
               this.elPiloto.setterApellido("hernandez");
               break;
            case 3:   
               this.elPiloto.setterApellido("cruz");
               break;
            case 4:   
               this.elPiloto.setterApellido("agua");
               break;
            case 5:   
               this.elPiloto.setterApellido("pedorro");
               break;
            case 6:   
               this.elPiloto.setterApellido("cagado");
               break;
    }
}
}