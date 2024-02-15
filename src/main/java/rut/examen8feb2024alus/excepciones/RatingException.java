package rut.examen8feb2024alus.excepciones;

public class RatingException extends Exception{
    public RatingException(String nombre){
        super(nombre + ": Rating must be between 0 and 5");
    }
}
