/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.iu;

import java.util.ArrayList;
import java.util.List;
import mx.itson.music.entidades.Album;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Cancion;
import mx.itson.music.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setArtista("Bad Bunny");
        artista.setSitioWeb("Badbunny.com");
    
        Album a = new Album();
        a.setNombre("Debi tirar mas fotos");
        a.setLanzamiento(2025);
        a.setArtisata(artista);
        a.setGenero(Genero.OTRO);
        
        List<Cancion> canciones = new ArrayList<>();
        
        
    }
    
}
