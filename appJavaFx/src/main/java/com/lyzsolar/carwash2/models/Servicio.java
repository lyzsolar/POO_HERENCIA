package com.lyzsolar.carwash2.models;

public class Servicio {
    private String nombre;
    private double precioPaq;
    private String descripcion;

    public Servicio(String nombre, double precioPaq, String descripcion) {
        this.nombre = nombre;
        this.precioPaq = precioPaq;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioPaq() {
        return precioPaq;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
