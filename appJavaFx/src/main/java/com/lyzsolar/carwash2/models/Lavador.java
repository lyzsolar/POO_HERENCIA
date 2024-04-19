package com.lyzsolar.carwash2.models;


public class Lavador extends Empleado {
    private Integer totalVehiculosLavados;

    public Lavador(String id, String name, String lastName, String secondName) {
        super(id, name, lastName, secondName);
    }

    public Integer getTotalVehiculosLavados() {
        return totalVehiculosLavados;
    }

    public void setTotalVehiculosLavados(Integer totalVehiculosLavados) {
        this.totalVehiculosLavados = totalVehiculosLavados;
    }

    private Vehiculo vehiculo;

}
