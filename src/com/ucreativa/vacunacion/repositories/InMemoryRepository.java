package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository {

    //region Declaración de los atributos de la clase.
    private List<BitacoraVacunas> db;
    //endregion

    //region Creación de los constructores.
    public InMemoryRepository()
    {
        this.db = new ArrayList<>();
    }
    //endregion

    //region Creación de los metodos de la clase.
    public void save(Persona pPersona, String pMarca, Date pFecha)
    {
        this.db.add(new BitacoraVacunas(pPersona, pMarca, new Date()));
    }

    public List<String> get() {

        List<String> lines = new ArrayList<>();

        //Asignar un formato a la fecha.
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        //Recorrer la lista para mandar a imprimir los registros.
        for (BitacoraVacunas oObjeto : db)
        {
            lines.add(oObjeto.getPersona().getNombre() + " - " + oObjeto.getMarca() + " - " + format.format(oObjeto.getFecha()));
        }

        //Retornar los registros almacenados.
        return lines;
    }
    //endregion
}
