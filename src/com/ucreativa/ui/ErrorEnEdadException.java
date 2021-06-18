package com.ucreativa.ui;

public class ErrorEnEdadException extends Exception{

    public ErrorEnEdadException(String pEdad) {
        super("La edad es incorrecta: " + pEdad);
    }
}
