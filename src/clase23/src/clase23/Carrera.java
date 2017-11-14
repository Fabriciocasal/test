/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase23;

import java.time.Instant;

/**
 *
 * @author alumno
 */
public class Carrera {
    
    public Auto[] AutosParticipantes;
    private String fecha;
    private String Pais;
    /**
     * 1- no tiene valor de retorno
     * 2- se llama igual que la clase
     * 3- el por defecto, puede estar o no
     * 4- se ejecuta solamente al crear un objeto
     * 
     */
    public Carrera() //constructor
    {
        this.fecha=Instant.now().toString();
        this.Pais="Argentina";
        this.AutosParticipantes = new Auto[20];
        this.CrearAutosTest();
    }
    private void CrearAutosTest()
    {
        for (int i = 0; i < this.AutosParticipantes.length; i++) {
            
            this.AutosParticipantes[i] = new Auto(i);
            
        }
 }
    
    public void CorrerCarrera(int CantidadDeVueltas)
    {
        for (int Vueltas = 0; Vueltas < CantidadDeVueltas; Vueltas++) {
            
             for (int i = 0; i < this.AutosParticipantes.length; i++) {
            
                 
                 int random = (int) (Math.random()*100);
                 
                 this.AutosParticipantes[i].AgregarTiempoRecorrido(random);
            
        }
    }
    
    }
    
    public Auto DameElGanador()
    {
        Auto retorno=new Auto(0);
        int menorRcorrido=0;
        for (int i = 0; i < this.AutosParticipantes.length; i++) {
            if (i==0)
            {
            menorRcorrido=this.AutosParticipantes[i].DameElTiempoRecorrido();
            
            retorno=this.AutosParticipantes[i];
            }
            else{
                
                if(menorRcorrido>this.AutosParticipantes[i].DameElTiempoRecorrido())
                {
                     menorRcorrido=this.AutosParticipantes[i].DameElTiempoRecorrido();
                     retorno=this.AutosParticipantes[i];
                }
            }
            
        }
        
        
        return retorno;
    }
}
