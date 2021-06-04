package com.ucreativa.vacunacion;


import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //06-03-2021
        //Declaración de mi Scanner para leer el Input del usuario.
        Scanner myScanner = new Scanner(System.in);
        //Declaración de la lista de bitácora de vacunas.
        List<BitacoraVacunas> lstVacunas = new ArrayList<>();
        //Declaración de las variables que van a contener la información quu proviene del usuario.
        String sNombre, sCedula, sEdad, sRiesgo, sEsAmigo, sRelacion, sFacebook, sParentesco, sMarca;
        //Declaración del objeto Persona.
        Persona oPersona;


        while(true)
        {
            System.out.println("Digite el Nombre: ");
            sNombre = myScanner.nextLine();

            System.out.println("Digite la Cédula: ");
            sCedula = myScanner.nextLine();

            System.out.println("Digite la Edad: ");
            sEdad = myScanner.nextLine();

            System.out.println("Riesgo(S/N): ");
            sRiesgo = myScanner.nextLine();

            System.out.println("Amigo(A)/Familiar(F): ");
            sEsAmigo = myScanner.nextLine();

            if (sEsAmigo.equals("A"))
            {
                System.out.println("Digite la Relación: ");
                sRelacion = myScanner.nextLine();

                System.out.println("Digite la dirección de Facebook: ");
                sFacebook = myScanner.nextLine();

                //Creación del objeto Amigo.
                oPersona = new Amigo(sNombre, sCedula, Integer.parseInt(sEdad), sRiesgo.equals("S"), sRelacion, sFacebook);
            }
            else
            {
                System.out.println("Digite el Parentesco: ");
                sParentesco = myScanner.nextLine();

                //Creación del objeto Familiar.
                oPersona = new Familiar(sNombre, sCedula, Integer.parseInt(sEdad), sRiesgo.equals("S"), sParentesco);
            }

            System.out.println("Vacuna -- Marca: ");
            sMarca = myScanner.nextLine();

            //Agregar un nuevo registro a la lista de la bitácora de vacunas.
            lstVacunas.add(new BitacoraVacunas(oPersona, sMarca, new Date()));

            System.out.println("Quiere imprimir la lista? (S/N): ");
            String sImpresion = myScanner.nextLine();

            if (sImpresion.equals("S"))
            {
                for (BitacoraVacunas oObjeto : lstVacunas)
                {
                    //Imprimir el objeto actual de la lista de bitácoras según la posición del ciclo.
                    System.out.println(oObjeto.getPersona().getNombre() + ", vacunad@ en la fecha: " + oObjeto.getFecha());
                }
            }
        }
    }
}
