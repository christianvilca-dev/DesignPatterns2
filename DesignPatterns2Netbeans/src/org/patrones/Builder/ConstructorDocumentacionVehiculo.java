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
public abstract class ConstructorDocumentacionVehiculo {
    protected Documentacion documentacion;
    
    public abstract void contruyeSolicitudPedido(String nombreCliente);
    public abstract void contruyeSolicitudMatriculacion(String nombreSolicitante);
    
    public Documentacion resultado(){
        return documentacion;
    }
}
