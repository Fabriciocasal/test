/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonica;

/**
 *
 * @author alumno
 */
public class Llamada {

    
        protected float _duracion;
        protected String _nroDestino;
        protected String _nroOrigen;
        
        

    public float getDuracion() {
        return _duracion;
    }

    public String getNroDestino() {
        return _nroDestino;
    }

    public String getNroOrigen() {
        return _nroOrigen;
    }

    public Llamada(float _duracion, String _nroDestino, String _nroOrigen) {
        this._duracion = _duracion;
        this._nroDestino = _nroDestino;
        this._nroOrigen = _nroOrigen;
    }

   
    public String MostrarDatos()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("duracion: " + this._duracion + "\n");
        sb.append("nroDestino: " + this._nroDestino + "\n");
        sb.append("nroOrigen: " + this._nroOrigen + "\n");
        return sb.toString();    
    }
    
    
    
}
