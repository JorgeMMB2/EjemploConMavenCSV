package com.pruebaCSV;
/*
Ejemplo muy sencillo de acceso a un archivo .csv desde java
NO UTILIZA ningún gestor de dependencia
 */


public class PruebasCSV {
    /**
     * @author Jorge Martín
     */
    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.LeeCSV("./src/main/resources/datos/pokemon.csv");
    }
}
