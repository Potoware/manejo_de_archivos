package com.potoware.archivos.ejemplos.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoService {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo,true);
            escritor.append("Hola Bro")
                    .append("\nComo esta bro")
                    .append("\nEstoy escribiendo un archivo")
                    .append("\nChao bro");
            escritor.close();
            System.out.println("El archivo "+nombre+" se creo con exito" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
