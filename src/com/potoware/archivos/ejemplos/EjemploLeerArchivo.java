package com.potoware.archivos.ejemplos;

import com.potoware.archivos.ejemplos.service.ArchivoService;

public class EjemploLeerArchivo {

    public static void main(String[] args) {
        ArchivoService service = new ArchivoService();
        System.out.println(service.leerArchivo2("C:\\Cursos\\Java\\archivo\\java.txt"));
    }
}
