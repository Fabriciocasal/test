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
public class Local extends Llamada {
    
    protected float _Costo;
    
    public Local(float _duracion, String _nroDestino, String _nroOrigen, float _Costo) {
        super(_duracion, _nroDestino, _nroOrigen);
        this._Costo = _Costo;   
    }

    public float getCosto() {
        return _Costo;
    }
    
    
    private float CostoLlamada(){
        float total;
        
      total=getDuracion()*getCosto();
              
          return total;    
    }
    
    @Override
    public String MostrarDatos()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.MostrarDatos());
        sb.append("Costo: " + this.CostoLlamada() + "\n");
        return sb.toString();
    }
}
