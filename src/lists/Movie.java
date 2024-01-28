package lists;

public class Movie { // this class will keep the properties of movie object.
    private String movieName;
    private String movieDirector;
    private String moviePlatform;
    private String movieLeadRole;
    private double imdbRating;
    private int movieDuration;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMoviePlatform() {
        return moviePlatform;
    }

    public void setMoviePlatform(String moviePlatform) {
        this.moviePlatform = moviePlatform;
    }

    public String getMovieLeadRole() {
        return movieLeadRole;
    }

    public void setMovieLeadRole(String movieLeadRole) {
        this.movieLeadRole = movieLeadRole;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }
}
