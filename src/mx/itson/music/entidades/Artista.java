/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.entidades;

/**
 *
 * @author alumnog
 */
public class Artista {

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the sitioWeb
     */
    public String getSitioWeb() {
        return sitioWeb;
    }

    /**
     * @param sitioWeb the sitioWeb to set
     */
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
    private String artista;
    private String descripcion;
    private String sitioWeb;
}
