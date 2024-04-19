package com.lyzsolar.carwash2.models;

public class Administrador extends Empleado {
    private Integer totalEmpleadosContratados;

    public Administrador(String id, String name, String lastName, String secondName, Integer totalEmpleadosContratados) {
        super(id, name, lastName, secondName);
    }

    public Integer getTotalEmpleadosContratados() {
        return totalEmpleadosContratados;
    }

    public void setTotalEmpleadosContratados(Integer totalEmpleados) {
        this.totalEmpleadosContratados = totalEmpleados;
    }

    private Empleado empleado;
    private Servicio servicio;
}
