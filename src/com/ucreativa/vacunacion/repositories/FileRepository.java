package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepository implements Repository{

    //Declarar las variables para almacenar la ruta del archivo.
    private final Path root = Paths.get(".").normalize().toAbsolutePath();
    private final String FILE_PATH = root + "\\bitacoraVacunas.txt";


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

            //Instanciar el objeto para el archivo.
            File myFile = new File(FILE_PATH);

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

        try {
            //Crear el reader para obtener los registros del archivo.
            BufferedReader bReader = new BufferedReader(new FileReader(FILE_PATH));
            return bReader.lines().collect(Collectors.toList());

        } catch (IOException e) {
            //Imprimir excepción.
            System.out.println(e);
        }

        return null;
    }
}
