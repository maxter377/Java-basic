package movieLibrary;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Actor stallone = new Actor("Sylvester", "Stallone");
        Actor diCaprio = new Actor("Leonardo", "Di Caprio");
        Actor deNiro = new Actor("Robert", "De Niro");
        Actor douglas = new Actor("Michael", "Douglas");
        Actor weathers = new Actor("Carl", "Weathers");
        Actor young = new Actor("Burt", "Young");
        Actor crenna = new Actor("Richard", "Crenna");
        Actor dennehy = new Actor("Brian", "Dennehy");
        Actor pacino = new Actor("Al", "Pacino");
        Actor brando = new Actor("Marlon", "Brando");
        Actor scorsese = new Actor("Martin", "Scorsese");
        Actor foster = new Actor("Jodie", "Foster");
        Actor cruise = new Actor("Tom", "Cruise");
        Actor reno = new Actor("Jean", "Reno");
        Actor voight = new Actor("Jon", "Voight");
        Actor pesci = new Actor("Joe", "Pesci");

        List<Actor> rockyActors = Movie.createListOfActors(stallone, weathers, young);
        List<Actor> ramboActors = Movie.createListOfActors(stallone, crenna, dennehy);
        List<Actor> godfatherActors = Movie.createListOfActors(brando, pacino, deNiro);
        List<Actor> taxiDriverActors = Movie.createListOfActors(deNiro, scorsese, foster);
        List<Actor> missionImpossibleActors = Movie.createListOfActors(cruise, reno, voight);
        List<Actor> irishmanActors = Movie.createListOfActors(deNiro, pacino, pesci);

        Movie.createAndAddMovieToLibrary("Action", "Rocky", 1976, "John", "Avildsen", rockyActors);
        Movie.createAndAddMovieToLibrary("Action", "Rambo", 1982, "Adrian", "Grunberg", ramboActors);
        Movie.createAndAddMovieToLibrary("Criminal", "Godfather", 1972, "Francois Ford", "Copolla", godfatherActors);
        Movie.createAndAddMovieToLibrary("Drama", "Taxi Driver", 1976, "Martin", "Scorsese", taxiDriverActors);
        Movie.createAndAddMovieToLibrary("Action", "Mission Impossible", 1996, "Brian", "De Palma", missionImpossibleActors);
        Movie.createAndAddMovieToLibrary("Criminal", "The Irishman", 2019, "Martin", "Scorsese", irishmanActors);


        while (true) {

            welcomeToLibraryMenu();
        }


    }

    public static void welcomeToLibraryMenu() {
        System.out.println("#############");
        System.out.println("Welcome to our library!");
        System.out.println("Please select options: ");
        System.out.println("1: Provide 2 dates and see movies within those dates.");
        System.out.println("2: Random movie information.");
        System.out.println("3: Provide first and last name of actor and see movies he played in.");
        System.out.println("4: Exit program.");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                checkDatesOfRelease();
                break;
            case 2:
                randomMovieInformation();
                break;
            case 3:
                moviesByActor();
                break;
            case 4:
                System.exit(0);

            default:
                System.out.println("We don't have such option");
        }
    }

    public static void checkDatesOfRelease() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me starting date.");
        int date1 = sc.nextInt();

        System.out.println("Give me ending date");
        int date2 = sc.nextInt();

        List<Movie> temp = new ArrayList<>();

        for (Movie movie : MovieLibrary.movies) {
            if (movie.getReleaseYear() >= date1 && movie.getReleaseYear() <= date2) {
                temp.add(movie);
            }
        }
        for (Movie movie : temp) {
            System.out.println(movie.getTitle() + " - " + movie.getReleaseYear());
        }
        if (temp.size() == 0) {
            System.out.println("We don't have such movies.");
        }


    }


    public static void randomMovieInformation() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(MovieLibrary.movies.size());
        System.out.println("Random movie information:");
        System.out.println("Title is: " + MovieLibrary.movies.get(randomIndex).getTitle());
        System.out.println("Genre is: " + MovieLibrary.movies.get(randomIndex).getGenre());
        System.out.println("Actors are: ");
        for (Actor actor : MovieLibrary.movies.get(randomIndex).getActors()) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName());
        }
        System.out.println("Release year is: " + MovieLibrary.movies.get(randomIndex).getReleaseYear());
        System.out.println("Director is: " + MovieLibrary.movies.get(randomIndex).getDirector().getFirstName() + " " + MovieLibrary.movies.get(randomIndex).getDirector().getLastName());
        System.out.println("###############");
    }

    public static void moviesByActor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your actor first name");
        String inputFirstName = sc.nextLine();
        System.out.println("Give me your actor last name");
        String inputLastName = sc.nextLine();

        List<Movie> temp = new ArrayList<>();

        for (Movie movie : MovieLibrary.movies) {
            for (Actor actor : movie.getActors()) {
                if (Objects.equals(inputFirstName, actor.getFirstName()) && Objects.equals(inputLastName, actor.getLastName())) {
                    temp.add(movie);
                }
            }
        }
        for (Movie movie : temp) {
            System.out.println(movie.getTitle());
        }
        if (temp.size() == 0) {
            System.out.println("We don't have any movies with this actor.");
        }
    }
}
