package rut.examen8feb2024alus;

import java.util.Comparator;

//Luego hay que usarla
public class DurationCompare implements Comparator<Song>{
    @Override
    public int compare(Song cancion1, Song cancion2) {
        float d1 = cancion1.getDuration();
        float d2 = cancion2.getDuration();
        return Float.compare(d1,d2);
    }

}
