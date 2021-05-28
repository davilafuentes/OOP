package com.ucreativa.vacunacion;

public class Familiar extends Persona {

    //region Declaración de los atributos de la clase.
    private String parentesco;

    public Familiar(String nombre, String cedula, int edad, Boolean riesgo, String parentesco) {
        super(nombre, cedula, edad, riesgo);
        this.parentesco = parentesco;
    }
    //endregion

    //region Creación de los GETS para los atributos de la clase.
    public String getParentesco() {
        return parentesco;
    }
    //endregion
}
