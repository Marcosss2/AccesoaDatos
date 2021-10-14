/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;


public class ImplementacionMysql  implements IAccesoDatos{

    @Override
    public void insertar() {
         System.out.println("insertar desde");
    }

    @Override
    public void listar() {
         System.out.println("leer desde");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde");
    }

    @Override
    public void eliminar() {
         System.out.println("eliminar desde");
    }
 
    
    
    
    
    
    
}
