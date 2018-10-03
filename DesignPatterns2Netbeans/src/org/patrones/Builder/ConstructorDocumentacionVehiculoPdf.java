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
public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPdf() {
        documentacion = new DocumentacionPdf();
    }
    
    @Override
    public void contruyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<PDF>Solicitud de pedido Cliente: " + nombreCliente + "</PDF>";
        documentacion.agregaDocumento(documento);
    }

    @Override
    public void contruyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento = "<PDF>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</PDF>";
        documentacion.agregaDocumento(documento);
    }
}
