package com.ucreativa;

import com.ucreativa.familia.Yadira;
import com.ucreativa.familia.David;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.BitacoraVacunas;
import com.ucreativa.vacunacion.Familiar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Instanciamiento de la clase David.
        David david = new David("Hola, yo soy David!", 30, "Turistear");

        //Instanciamiento de la clase Yadira.
        Yadira yadira = new Yadira("Hola, te saluda Yadira. La mamá de David.", 53, "Leer");

        //Llamar a la función que le asigna un nuevo cumpleanos a Yadira.
        yadira.setAge();

        //Imprimir la edad de Yadira.
        System.out.println("La edad de Yadira actual es de: " + yadira.getAge() + ", años cumplidos.");

        //Imprimir el Hobby de Yadira.
        System.out.println("El Hobby de Yadira es " + yadira.getHobby() + ".");

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
