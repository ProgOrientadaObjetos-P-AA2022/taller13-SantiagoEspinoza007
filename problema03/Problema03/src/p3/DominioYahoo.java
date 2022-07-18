/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author EdgarEspinoza
 */
public class DominioYahoo implements DominioCorreo {
    
    private String dominio;
    
    @Override
    public void establecerDominio(String g){
        dominio = String.format("yahoo.es", g);
    }
    
    public String obtenerDominio(){
        return dominio;
    }
    
}
