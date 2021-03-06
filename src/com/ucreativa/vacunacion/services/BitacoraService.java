package com.ucreativa.vacunacion.services;

import com.ucreativa.ui.ErrorEnEdadException;
import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;
    private ContadorRiesgo oContador;

    public BitacoraService(Repository repository)
    {
        this.repository = repository;
        this.oContador = ContadorRiesgo.getInstance();
    }

    public void save(String pNombre, String pCedula, String pEdad,
                     boolean pRiesgo, boolean pEsAmigo, String pRelacion,
                     String pFacebook, String pParentesco, String pMarca) throws ErrorEnEdadException {
        int iEdad;

        try
        {
            iEdad = Integer.parseInt(pEdad);
        } catch (NumberFormatException e) {
            throw new ErrorEnEdadException(pEdad);
        }

        if (pRiesgo)
        {
            this.oContador.SumarRiesgo();
        }

        Persona oPersona = null;

        if (pEsAmigo)
        {
            oPersona = new Amigo(pNombre, pCedula, iEdad, pRiesgo, pRelacion, pFacebook);
        }
        else
        {
            oPersona = new Familiar(pNombre, pCedula, iEdad, pRiesgo, pParentesco);
        }

        this.repository.save(oPersona, pMarca, new Date());
    }

    public List<String> get()
    {
        System.out.println("La cantidad de personas con riesgo es: " + this.oContador.getCantidadRiesgo());
        return this.repository.get();
    }

}
