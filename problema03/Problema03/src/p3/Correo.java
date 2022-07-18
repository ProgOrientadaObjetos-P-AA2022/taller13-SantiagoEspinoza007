/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class Correo {
    private DominioCorreo dominio;
    private String correo;
    private String username;
    private String tipoCorreo;
            
    public void establecerUserName(String u){
        username = u;
    }
    
    public void establecerDominio(DominioCorreo d){
        dominio = d;
    }
    
    public void establecerCorreo(){
        correo = String.format("%s@%s", obtenerUserName(), 
                obtenerDominio().obtenerDominio());
    }
    
    public void establecerTipoCorreo(String c){
        tipoCorreo = c;
    }
    
    public DominioCorreo obtenerDominio(){
        return dominio;
    }
    
    public String obtenerUserName(){
        return username;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public String obtenerTipoCorreo(){
        return tipoCorreo;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Url: %s\n", obtenerCorreo());
        return reporte;
    }
    
}
