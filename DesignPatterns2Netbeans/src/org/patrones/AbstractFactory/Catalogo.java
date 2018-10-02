/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.AbstractFactory;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Catalogo {
    public static int nAutos = 3;
    public static int nScooters = 2;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];
        System.out.print("Desea utilizar vehiculos electros (1) o a gasolina (2): ");
        String eleccion = reader.next();
        if (eleccion.equals("1")) {
            fabrica = new FabricaVehiculoElectricidad();
        } else {
            fabrica = new FabricaVehiculoGasolina();
        }
        for (int i = 0; i < nAutos; i++) {
            autos[i] = fabrica.creaAutomovil("estandar", "amarillo", 6+i, 3.2);
        }
        for (int i = 0; i < nScooters; i++) {
            scooters[i] = fabrica.creaScooter("Clasico", "rojo", 2+i);
        }
        for (Automovil auto : autos) {
            auto.mostrarCaracteristicas();
        }
        for (Scooter scooter : scooters) {
            scooter.mostrarCaracteristicas();
        }
    }
}
