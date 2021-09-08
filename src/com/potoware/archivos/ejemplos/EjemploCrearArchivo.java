package com.potoware.archivos.ejemplos;

import com.potoware.archivos.ejemplos.service.ArchivoService;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Cursos\\Java\\archivo\\java.txt";
        ArchivoService service= new ArchivoService();
        service.crearArchivo(nombreArchivo);

    }
}
