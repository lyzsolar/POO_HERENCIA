package com.lyzsolar.carwash2.models;

import java.util.ArrayList;

public class CarWash {

    protected static ArrayList<Empleado> lavadores = new ArrayList<>();

    public static boolean addEmpleado(Empleado empleado){
        return lavadores.add(empleado);
    }

    public static ArrayList<Empleado> getLavadores() {
        return lavadores;
    }
    protected static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static boolean addVehiculo(Vehiculo vehiculo){
        return vehiculos.add(vehiculo);
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public static ArrayList<Servicio> servicios = new ArrayList<>();

    public static boolean addServicio(Servicio servicio){
        return servicios.add(servicio);
    }

    public static ArrayList<Servicio> getServicios() {
        return servicios;
    }
}

