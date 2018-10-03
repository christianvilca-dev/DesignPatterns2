/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.Builder;

/**
 *
 * @author Christian
 */
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }
    
    public Documentacion construye(String nombreCliente){
        constructor.contruyeSolicitudPedido(nombreCliente);
        constructor.contruyeSolicitudMatriculacion(nombreCliente);
        
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}
