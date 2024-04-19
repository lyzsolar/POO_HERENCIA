package com.lyzsolar.carwash2.models;

public class Vehiculo {
    private String id;
    private String tamaño;
    private String paquete;
    private String precioPaquete;
    private double total;

    public Vehiculo(String id, String tamaño, String paquete, String precioPaquete, double total) {
        this.id = id;
        this.tamaño = tamaño;
        this.paquete = paquete;
        this.precioPaquete = precioPaquete;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getPaquete() {
        return paquete;
    }

    public String getPrecioPaquete() {
        return precioPaquete;
    }

    public double getTotal() {
        return total;
    }

    private Servicio servicio;
}
