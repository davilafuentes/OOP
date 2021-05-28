package com.ucreativa.familia;

public class Yadira {

    //Declaración de los atributos de la clase.
    private int Age;
    private String Hobby;


    public Yadira(String saludo, int age, String hobby){

        //Establecer los atributos de la clase desde los parámetros.
        this.Age = age;
        this.Hobby = hobby;

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
