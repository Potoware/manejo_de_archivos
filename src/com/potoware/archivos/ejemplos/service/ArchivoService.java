package com.potoware.archivos.ejemplos.service;

import java.io.*;
import java.util.Scanner;

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

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));

            String linea;
            while ((linea = leer.readLine())!= null){
                sb.append(linea).append("\n");
                leer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            Scanner s = new Scanner(archivo);
            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next());
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();


        }
        return sb.toString();
    }
}
