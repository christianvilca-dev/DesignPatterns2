/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public abstract class Documentacion {
    protected List<String> contenido = new ArrayList<String>();
    
    public abstract void agregaDocumento(String documento);
    public abstract void imprime();
}
