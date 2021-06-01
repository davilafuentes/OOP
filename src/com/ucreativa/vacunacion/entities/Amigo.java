package com.ucreativa.vacunacion.entities;

public class Amigo extends Persona{

    //region Declaración de los atributos de la clase.
    private String relacion;
    private String facebook;
    //endregion

    //region Creación de los constructores.
    public Amigo(String nombre, String cedula, int edad, Boolean riesgo, String relacion, String facebook) {
        super(nombre, cedula, edad, riesgo);
        this.relacion = relacion;
        this.facebook = facebook;
    }
    //endregion

    //region Creación de los GETS para los atributos de la clase.
    public String getRelacion() {
        return relacion;
    }

    public String getFacebook() {
        return facebook;
    }
    //endregion
}
