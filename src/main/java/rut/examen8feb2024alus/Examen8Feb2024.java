/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package rut.examen8feb2024alus;

import java.util.Arrays;

/**
 *
 * @author Rut
 */
public class Examen8Feb2024 {

    public static void main(String[] args) {
        
        // Disco de Lost Frequencies: alive
        Disco alive = Disco.makeDisco("Alive and Feeling Fine",
                "Lost Frequencies", 52, "pop", 5);  // Excepción si el array está fuera de limites en el setter

        Song[] songsLF = {new Song("Sun is Shining", 1.53f, 2.5f),
            new Song("Truth Never Lies", 2.03f, 5f),
            new Song("Recognise", 3.2f, 5f),
            new Song("Crazy", 5f, 1f),
            new Song("Sunrise", 5.03f, 5f)};
        alive.setSongs(songsLF);
        

        // Disco de Ran'n'Bone Man: Human
        Disco human = Disco.makeDisco("Human", "Rag'n'Bone Man",
                51, "Blues", 8);
        Song[] songsRB = {new Song("Human", 3.19f, 4.9f),
            new Song("Skin", 3.59f, 4.5f),
            new Song("Grace", 3.32f, 6),
            null,
            new Song("Ego", 3.14f, 3.2f),
            new Song("Bitter End", 3.39f, 3f)};
        human.setSongs(songsRB);
        
        // 2._ Mostrar los dos discos

        System.out.println(alive.toString());
        
        //4._Ordenamos las canciones por nombre DESC --> 1
        System.out.println("SONGS SORTED BY NAME DESC");

        alive.sortSongsDesc();
        System.out.println(alive.toString());
        
        System.out.println(alive);  


        // 5._Ordenamos las canciones por duration de forma ascendente
        
        
            System.out.println("SONGS SORTED BY DURATION ASC");

            alive.sortSongsDuration();
            System.out.println(alive.toString());
        
            // Como human.sortSongsDuration no me va a funcionar porque
            // tiene un null, ordeno el disco alive
            System.out.println("HAY CANCIONES NULAS!!");
            
            System.out.println(alive);
        
        
         //6._Ordenamos las canciones por rating + name --> 2
        System.out.println("SONGS SORTED BY RATING + NAME DESC/ASC");
       
        
        System.out.println(alive);  


    }
}
