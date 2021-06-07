package listfunctionaloperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListFunctionalOperations {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Spotlight",2015,"Hollywood"),
                new Movie("Avengers: Infinity War",2018,"Hollywood"),
                new Movie("Inception",2010,"Hollywood"),
                new Movie("Forest Gump",1994,"Hollywood"),
                new Movie("3 Idiots",2009,"Bollywood"),
                new Movie("Beauty and the beast",2017,"Hollywood"),
                new Movie("Slumdog Millionaire",2008,"Bollywood")
        );

        // Traversal
        movies.forEach(System.out::println);

        System.out.println("==============================================================");

        // Sorting the movie objects in the descending order of the release year (get the newest movie on the top)
        movies.sort((movie1, movie2) -> movie2.getReleaseYear() - movie1.getReleaseYear());
        movies.forEach(System.out::println);

        System.out.println("==============================================================");

        // Filtering the data
        movies.stream()
                .filter(movie -> movie.getIndustry().equalsIgnoreCase("Bollywood"))
                .forEach(System.out::println);

        // Mapping




    }

}
