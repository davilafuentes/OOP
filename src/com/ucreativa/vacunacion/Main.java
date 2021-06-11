package com.ucreativa.vacunacion;


import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //06-03-2021
        //Declaración de mi Scanner para leer el Input del usuario.
        Scanner myScanner = new Scanner(System.in);
        //Declaración de la clase del repositorio.
        BitacoraService oService = new BitacoraService(new FileRepository());
        //Declaración de las variables que van a contener la información que proviene del usuario.
        String sNombre, sCedula, sEdad, sRiesgo, sEsAmigo, sRelacion = null, sFacebook = null, sParentesco = null, sMarca;
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

            }
            else
            {
                System.out.println("Digite el Parentesco: ");
                sParentesco = myScanner.nextLine();
            }

            System.out.println("Vacuna -- Marca: ");
            sMarca = myScanner.nextLine();

            //Agregar el registro a la BD.
            //7-6-2021: Guardar el registro en el repositorio mediante la nueva clase.
            oService.save(sNombre, sCedula, sEdad, sRiesgo, sEsAmigo, sRelacion, sFacebook, sParentesco, sMarca);

            System.out.println("Quiere imprimir la lista? (S/N): ");
            String sImpresion = myScanner.nextLine();

            if (sImpresion.equals("S"))
            {
                for (String oObjeto : oService.get())
                {
                    //Imprimir el objeto actual de la lista de bitácoras según la posición del ciclo.
                    //7-6-2021: Imprimir los registros almacenados actualmente en la clase del repositorio.
                    System.out.println(oObjeto);
                }
            }
        }
    }
}
