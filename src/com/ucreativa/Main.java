package com.ucreativa;

import com.ucreativa.familia.Yadira;
import com.ucreativa.familia.davilafuentes;

public class Main {

    public static void main(String[] args) {

        //Instanciamiento de la clase David.
        davilafuentes david = new davilafuentes();

        //Instanciamiento de la clase Yadira.
        Yadira yadira = new Yadira("Hola, te saluda Yadira. La mamá de David.");

        //Llamar a la función que le asigna un nuevo cumpleanos a Yadira.
        yadira.setAge();

        //Imprimir la edad de Yadira.
        System.out.println("La edad de Yadira actual es de: " + yadira.getAge() + ", años cumplidos.");

        //Imprimir el Hobby de Yadira.
        System.out.println("El Hobby de Yadira es " + yadira.getHobby() + ".");
    }
}
