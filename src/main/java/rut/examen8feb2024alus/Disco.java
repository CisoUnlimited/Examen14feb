/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rut.examen8feb2024alus;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Rut
 */
enum TypeMusic {ROCK, POP, SOUL, RB, BLUES, RAP, REGGAETON, VARIOUS}

public class Disco {
    private String name;
    private String author;
    private float duration; // In minutes
    private TypeMusic type;
    private Song[] songs;

    // Factoría en Disco --> 2,5
    // 
    private Disco(String name, String author, float duration, TypeMusic type, int numSongs) {

        this.name = name;
        this.author = author;
        this.duration = duration;
        this.type = type;
        this.songs = new Song[numSongs];

    }
    
    // FACTORÍA 
    public static Disco makeDisco(String name, String author, float duration, String type, int numSongs){
        // Crearemos un disco sólo si el nombre,el autor y el tipo están rellenos y distintos de vacío.
        // Duration > 0.5
        // Además el type se pasará a enum y si no puede ser lo rellena a VARIOUS.
        // El número de canciones debe ser mayor que 1
        // --> 0,2

        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = false;
        boolean condition4 = false;


        if (name != null && !name.isBlank()){
            condition1 = true;
        }
        if (author != null && !author.isBlank()){
            condition2 = true;
        }
        if (duration>0.5){
            condition3 = true;
        }

        if (numSongs > 1){
            condition4 = true;
        }
        if (condition1 && condition2 && condition3 && condition4){
            TypeMusic tipo = typeParser(type);
            return new Disco(name,author,duration,tipo,numSongs);
        } else {
            return null;
        }
        
    }
    
    // 0,3

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public TypeMusic getType() {
        return type;
    }

    public void setType(TypeMusic type) {
        this.type = type;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }
    
    // 4._Ordenar canciones por el nombre de forma desc
    public void sortSongsDesc(){
        Arrays.sort(songs,Collections.reverseOrder());
    }
    
    // 5._Ordenar canciones por la duración
    public void sortSongsDuration(){
        Arrays.sort(songs,new DurationCompare());
    }
    
    // 6._Ordenar por rating+nombre
    public void sortSongsRatingName(){
        Arrays.sort(songs,Collections.reverseOrder(new RatingCompare()));
    }
   
    private static TypeMusic typeParser(String s){
        TypeMusic t = TypeMusic.VARIOUS;
        try {
            if (s != null) {
                t = TypeMusic.valueOf(s.toUpperCase());
            }
        } catch (IllegalArgumentException ex){

        }
        return t;
    }

    @Override
    public String toString() {
        String frase = "";
        frase = "Disco{" +"name='" + name + '\n' +
              ", author='" + author + '\n' +
                ", duration=" + duration +
                ", type=" + type +
                ", songs=" + Arrays.toString(songs) +
                '}';
        for (int i = 0; i < songs.length; i++) {
            Song prueba = songs[i];
            if (prueba != null){
                frase += prueba.toString() + "\n";
            }

        }
        return frase;
    }


}
