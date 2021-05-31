package com.ucreativa;

import com.ucreativa.familia.Yadira;
import com.ucreativa.familia.David;

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
    }
}
