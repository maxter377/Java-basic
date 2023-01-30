package movieLibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {

    private String genre;
    private String title;
    private int releaseYear;
    private Director director;

    private List<Actor> actors = new ArrayList<>();

    public Movie(String name, String title, int releaseYear, Director director, List<Actor> actors) {
        this.genre = name;
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.actors = actors;
    }

    public static List<Actor> createListOfActors(Actor... actorArray) {
        return new ArrayList<>(Arrays.stream(actorArray).toList());
    }

    public static void createAndAddMovieToLibrary(String genre, String title, int releaseYear, String directorFirstName, String directorLastName, List<Actor> actors) {
        Movie movie = new Movie(genre, title, releaseYear, new Director(directorFirstName, directorLastName), actors);
        MovieLibrary.movies.add(movie);
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public int getReleaseYear() {
        return releaseYear;
    }


}
