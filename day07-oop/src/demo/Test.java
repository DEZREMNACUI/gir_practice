package demo;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movies[1] = new Movie(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movies[2] = new Movie(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movies[3] = new Movie(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        MovieOperator operator = new MovieOperator(movies);
        operator.printAllMovies();
        operator.searchMovieById(1);

    }
}
