/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.Builder;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class ClienteVehiculo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor;
        System.out.print("Desea generar documentacion HTML(1) o de PDF(2): ");
        String seleccion = reader.next();
        if (seleccion.equals("1")) {
            constructor = new ConstructorDocumentacionVehiculoHtml();
        } else {
            constructor = new ConstructorDocumentacionVehiculoPdf();
        }
        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion = vendedor.construye("Martin");
        documentacion.imprime();
    }
}
