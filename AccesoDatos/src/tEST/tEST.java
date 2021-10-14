/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tEST;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMysql;

/**
 *
 * @author Alumno mañana
 */
public class tEST {
   
    
    
    public static void main(String[] args) {
        
        IAccesoDatos datos = new ImplementacionMysql();
       
         datos.actualizar();
        
        
    }
}
