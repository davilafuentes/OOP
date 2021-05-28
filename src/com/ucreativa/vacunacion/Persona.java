package com.ucreativa.vacunacion;

public class Persona {

    //region Declaración de los atributos de la clase.
    private String nombre;
    private String cedula;
    private int edad;
    private boolean riesgo;
    //endregion

    //region Creación de los constructores.
    public Persona(String nombre, String cedula, int edad, Boolean riesgo) {

        //Establecer los atributos de la clase desde los parámetros.
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
    }
    //endregion

    //region Creación de los SETS para los atributos de la clase.
    public String getNombre() {

        //Retornar el nombre de la persona.
        return nombre;
    }

    public String getCedula() {

        //Retornar la cedula de la persona.
        return cedula;
    }

    public int getEdad() {

        //Retornar la edad de la persona.
        return edad;
    }

    public Boolean getRiesgo() {

        //Retornar el riesgo de la persona.
        return riesgo;
    }
    //endregion

    //region Creación de los GETS para los atributos de la clase.
    public void setEdad(int edad) {

        //Setear la edad de la persona.
        this.edad = edad;
    }

    public void setRiesgo(boolean riesgo) {

        this.riesgo = riesgo;
    }
    //endregion
}
