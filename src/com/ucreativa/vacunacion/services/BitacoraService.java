package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository)
    {
        this.repository = repository;
    }

    public void save(String pNombre, String pCedula, String pEdad,
                     boolean pRiesgo, boolean pEsAmigo, String pRelacion,
                     String pFacebook, String pParentesco, String pMarca)
    {
        int iEdad = Integer.parseInt(pEdad);

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
        return this.repository.get();
    }

}
