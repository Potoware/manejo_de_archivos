package com.potoware.archivos.ejemplos.service;

import java.io.*;

public class ArchivoService {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter( new FileWriter(archivo,true))){
            buffer.append("Hola Bro");
                    buffer.append("\nComo esta bro")
                        .append("\nEstoy escribiendo un archivo")
                        .append("\nChao bro");
            //buffer.close();
            System.out.println("El archivo "+nombre+" se creo con exito" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter( new FileWriter(archivo,true))){
            buffer.println("Holiwi");
            buffer.println("Como va");
            buffer.println("Que se dice");
            buffer.println("Bien o que");
            buffer.printf("Bueno, soy %s tengo %d años, chao","Alejandro",23);
            System.out.println("El archivo "+nombre+" se creo con exito" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
