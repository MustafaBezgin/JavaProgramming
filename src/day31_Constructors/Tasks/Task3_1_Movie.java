package day31_Constructors.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_1_Movie {

    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();


    public Task3_1_Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }


    public void addCast(String castName) {
        casts.add(castName);
    }

    public void addCasts(String[] casts) {
        this.casts.addAll(Arrays.asList(casts));
    }

    public String toString() {
        return "Movie" + "\n{" +
                "country = '" + country + '\'' + "\n" +
                "title = '" + title + '\'' + "\n" +
                "genre = '" + genre + '\'' + "\n" +
                "releaseDate = '" + releaseDate + '\'' + "\n" +
                "director = '" + director + '\'' + "\n" +
                "casts = " + casts + "\n" +
                "total number of casts = " + casts.size() +
                '}';
    }
}
