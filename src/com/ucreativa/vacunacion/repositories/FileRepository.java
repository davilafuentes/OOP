package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository{
    @Override
    public void save(Persona pPersona, String pMarca, Date pFecha) {

        try {

            //Declarar el contenido a guardar.
            String txtContent = "Nombre: " + pPersona.getNombre() + ", " +
                                "Cédula de Indentidad: " + pPersona.getCedula() + ", " +
                                "Edad: " + pPersona.getEdad() + " años, " +
                                ((pPersona.getRiesgo().equals("S")) ? "Persona CON Riesgo" : "Persona SIN Riesgo");

            //Declarar el lugar donde se guardará. Se accede al root de la solución
            //ya que de otra forma podría indicar error de acceso.
            Path root = Paths.get(".").normalize().toAbsolutePath();
            String txtPath = root + "\\bitacoraVacunas.txt";

            //Instanciar el objeto para el archivo.
            File myFile = new File(txtPath);

            //Si el archivo no existe, crearlo automáticamente.
            if (!myFile.exists()) {
                myFile.createNewFile();
            }

            //Crear el Writter.
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            //Imprimir, pero además agregar el carácter para crear una nueva línea.
            bw.write(txtContent + "\n");

            //Cerrar la conexión.
            bw.close();

        } catch (IOException e) {
            //Imprimir excepción.
            System.out.println(e);
        }
    }

    @Override
    public List<String> get() {
        return null;
    }
}
