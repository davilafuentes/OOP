package com.ucreativa.vacunacion.entities;

import java.util.Date;

public class BitacoraVacunas {

    //region Declaración de los atributos de la clase.
    private Persona persona;
    private String marca;
    private Date fecha;
    //endregion

    //region Creación de los constructores.
    public BitacoraVacunas(Persona persona, String marca, Date fecha){
        this.persona = persona;
        this.marca = marca;
        this.fecha = fecha;
    }
    //endregion

    //region Creación de los GETS para los atributos de la clase.
    public Persona getPersona() {
        return persona;
    }

    public String getMarca() {
        return marca;
    }

    public Date getFecha() {
        return fecha;
    }
    //endregion
}
