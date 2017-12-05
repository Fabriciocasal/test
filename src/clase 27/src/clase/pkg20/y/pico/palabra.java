/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg20.y.pico;

/**
 *
 * @author alumno
 */
public class palabra {
    
    private String _palabra;
    private String _ayuda;
    
    
    
    public palabra(){
        
    }
    
   
    public palabra(String _palabra, String _ayuda) {
        this._palabra = _palabra;
        this._ayuda = _ayuda;
    }

    public String getPalabra() {
        return _palabra;
    }

    public void setPalabra(String _palabra) {
        this._palabra = _palabra;
    }

    public String getAyuda() {
        return _ayuda;
    }

    public void setAyuda(String _ayuda) {
        this._ayuda = _ayuda;
    }
    
    
}
