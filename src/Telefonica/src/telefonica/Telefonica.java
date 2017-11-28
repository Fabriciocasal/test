/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Telefonica {
    public static void main(String[] args) {
        
        ArrayList <Llamada> telefonica = new ArrayList<>();
        
        Local L1 = new Local (34, "43534534", "4564564", 3);
        Local L2 = new Local(45, "3453453", "435345",2 );
        Local L3 = new Local(67, "345345345", "346457587", 2 );
        
        
        telefonica.add(L1);
        telefonica.add(L2);
        telefonica.add(L3);
    
        for (Llamada Lista : telefonica) {
            System.out.println(Lista.MostrarDatos());
            //JOptionPane.showMessageDialog(null, Lista);
        }
    
    
    }
    
    
    
}
