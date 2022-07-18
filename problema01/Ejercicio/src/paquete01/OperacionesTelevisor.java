/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author EdgarEspinoza
 */
public class OperacionesTelevisor {
    private double totalPrecios;
    private double televisorCaro;
    private String marcas;
    private ArrayList<Televisor> televisores;

    public void establecerTelevisor (ArrayList<Televisor> lista){
        televisores = lista;
    }
    
    public ArrayList<Televisor> obtenerTelevisores(){
        return televisores;
    }
    
    public void establecerTotalPrecioTvs(){
        for (int i = 0; i < obtenerTelevisores().size(); i++) {
            totalPrecios = totalPrecios + 
                    obtenerTelevisores().get(i).obtenerPrecio();
        }
    }
    
    public double obtenerTotalPrecios(){
        return totalPrecios;
    }
    
    public void establecerTelevisorMasCaro(){
        televisorCaro = televisores.get(0).obtenerPrecio();
        for (int i = 0; i < televisores.size(); i++) {
            if (televisorCaro < televisores.get(i).obtenerPrecio()){
                televisorCaro = televisores.get(i).obtenerPrecio();
            }
        }
    }
    
    public double obtenerTelevisorMasCaro(){
        return televisorCaro;
    }
    
    public void establecerMarcasVendidas(){
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s%s\n", s, 
                    televisores.get(i).obtenerMarca());
        }
        marcas = s;
    }
    
    public String obtenerListaMarcasVendidas(){        
        return marcas;
    }
    
}
