package com.pruebaCSV;

import com.opencsv.CSVReader;

import java.io.FileReader;

/*
Esta clase se encarga del leer el archivo .csv que se le pase por parámetro

No devuelve nada, si no que muestra el contenido del csv por el terminal
 */
public class LectorCSV {
    /**
     * @author Jorge Martín
     */

    public void LeeCSV (String nombreArchivo) {

        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila = null;
            while ((fila = csvReader.readNext()) != null) {
                System.out.println("<" + fila[0] + "|" + fila[1] + ">");
            }
            csvReader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}