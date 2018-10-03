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
public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo{

    public ConstructorDocumentacionVehiculoHtml() {
        documentacion = new DocumentacionHtml();
    }
    
    @Override
    public void contruyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML>Solicitud de pedido Cliente: " + nombreCliente + "</HTML>";
        documentacion.agregaDocumento(documento);
    }

    @Override
    public void contruyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento = "<HTML>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</HTML>";
        documentacion.agregaDocumento(documento);
    }
}
