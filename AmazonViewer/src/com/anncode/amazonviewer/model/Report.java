package com.anncode.amazonviewer.model;
/**
 * Libreria que permite generar reportes a traves de archivos en cualquier formato 
 * utilizando el Método {@code makeReport}
 * @author Ulises
 * @since 2021
 * @version 1.1
 */
public class Report {
    private String nameFile;
    private String title;
    private String content;
    private String extension;

    public String getNameFile() {
        return nameFile;
    }

    public String getExtension() {
        return extension;
    }
}