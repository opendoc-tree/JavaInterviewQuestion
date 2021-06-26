import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie>{
    private String movieName;
    private double rating;
    private int year;

    public Movie(String movieName, double rating, int year) {
        this.movieName = movieName;
        this.rating = rating;
        this.year = year;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    // Used to sort movies by year
    @Override
    public int compareTo(Movie movie) {
        // this by default create ascending order
        return this.year - movie.year;

        // this by default create descending order
        //return movie.year - this.year;
    }

    // Used to sort movies by name
    /*@Override
    public int compareTo(Movie movie) {
        // this by default create ascending order
        return this.movieName.compareTo(movie.getMovieName());

        // this by default create descending order
        //return movie.getMovieName().compareTo(this.movieName);
    }*/

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}


public class comparable_example {
    public static void main(String[] args) {
        List<Movie> list=new ArrayList<>();
        list.add(new Movie("Enter The Dragon",7.7,1973));
        list.add(new Movie("Game of Death",6.7,1978));
        list.add(new Movie("Fist of Fury",7.3,1972));

        System.out.println("### Sort by Year ###");
        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        System.out.println("### Sort (reverse order) by Year ###");
        Collections.sort(list, Collections.reverseOrder());
        list.forEach(System.out::println);
    }
}
