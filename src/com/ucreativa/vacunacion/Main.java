package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //31-5-2021
        //Creación de Personas.
        Familiar Tio = new Familiar("Frank", "114400648", 65, true, "Tio");
        Familiar Padre = new Familiar("Manuel", "204040394", 55, true, "Padre");
        Amigo Amigazo = new Amigo("Jonathan", "402280905", 32, false, "Amigo", "www.facebook.com/Amigazo");

        //Creación de la lista para almacenar las bitacoras.
        List<BitacoraVacunas> lstBitacoras = new ArrayList<>();
        lstBitacoras.add(new BitacoraVacunas(Tio, "Pfizer", new Date()));
        lstBitacoras.add(new BitacoraVacunas(Padre, "AstraZeneca", new Date()));
        lstBitacoras.add(new BitacoraVacunas(Amigazo, "Johnson & Johnson's", new Date()));
    }
}
