/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rut.examen8feb2024alus;
import rut.examen8feb2024alus.excepciones.RatingException;
/**
 *
 * @author Rut
 */

//ESTUDIAR COMPARABLE
public class Song implements Comparable<Song>{
    private String name;
    private float duration;
    private float rating; // Entre 0 y 5

    // 3._ Rating Exception
    //ESTUDIAR
    public Song(String name, float duration, float rating)  {
        this.name = name;
        this.duration = duration;
        try {
            this.rating = ratingComp(rating,name);
        } catch (RatingException e) {
            System.out.println(e.getMessage());
            this.rating = 0;
        }


    }
    //ESTUDIAR (Devuelve rating si se cumple la condicion)
    private float ratingComp(float rating,String name) throws RatingException{

        if (rating >= 0 && rating <= 5){
            return rating;
        }else {
            throw new RatingException(name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public float getRating() {
        return rating;
    }

    
 
   
    
    @Override
    public String toString() {
        return "Song{" + "name=" + name + ", duration=" + duration + ", rating=" + rating + '}';
    }


//ESTUDIAR COMPARABLE
    @Override
    public int compareTo(Song comparar) {
        return this.getName().compareTo(comparar.getName());
    }
}
// int dev = cancion1.compareTo(cancion2) **Devuelve 1 si cancion1 es mayor, devuelve 0 si es igual, y -1 si es menor**