package com.ucreativa.familia;

public class Yadira {

    //Declaración de los atributos de la clase.
    private int Age;
    private String Hobby;


    public Yadira(String saludo){

        //Establecer los valores por defecto de los atributos de la clase.
        this.Age = 52;
        this.Hobby = "Leer";

        //Imprimir el parámetro saludo.
        System.out.println(saludo);
    }

    public int getAge(){

        //Retornar la edad de Yadira.
        return this.Age;
    }

    public void setAge(){

        //Incrementar en 1 la edad actual.
        this.Age = this.Age + 1;
    }

    public String getHobby(){

        //Retornar el Hobby de Yadira.
        return this.Hobby;
    }
}
