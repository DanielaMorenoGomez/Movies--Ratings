/**
 * This program uses a 2D array to store ratings by different reviewers for different movies.
 * 
 * @author Daniela Moreno
 * @version Feb 26,2017
 */
public class MovieRatings
{
    private int[][] ratings;
    private String[] reviewers;
    private String[] movies;

    /**
     * Constructor initializing the 2D ratings array.
     * @param reviewers those who watched and reviewed the movies
     * @param movies that are being reviewed
     */
    public MovieRatings(String[]reviewers, String[]movies) {
        this.ratings = new int[reviewers.length][movies.length];
        this.reviewers = reviewers;
        this.movies = movies;
    }

    /**
     * Method that finds the average rating for all movies and all reviewers
     * @return average double value representing the average rating
     */
    public double getAvgRating(){
        double total = 0; 
        double average = 0;
        for( int i = 0; i < reviewers.length; i++) {
            for( int j = 0; j < movies.length; j++){
                total += ratings[i][j];
            }
        }
        average = total/(reviewers.length * movies.length);
        return average;    
    }

    /**
     * Method that find the average rating for each individual movie
     * @param movieIndex refers to one single movie
     * @return movieAvgRating double value representing the average rating
     */

    public double getAvgRatingsByMovie(int movieIndex){
        double movieTotalRating = 0;
        double movieAvgRating;
        for(int i = 0; i < reviewers.length; i++) {
            movieTotalRating = ratings[i][movieIndex];
        }
        movieAvgRating = movieTotalRating / reviewers.length;
        return movieAvgRating;
    }

    /**
     * Method that finds the average rating for a single reviewer
     * @param reviewerIndex a single reviewer to find all reviews for
     * @return reviewersAvgRatings a double value representing the average rating
     */

    public double getAvgRatingsByReviewer(int reviewerIndex){
        double reviewersRatingsTotal = 0;
        double reviewersAvgRatings;

        for(int i = 0; i < movies.length; i++) {
            reviewersRatingsTotal = ratings[reviewerIndex][i];
        }
        reviewersAvgRatings = reviewersRatingsTotal / movies.length;
        return reviewersAvgRatings;
    }

    /**
     * Method that searches the movie array to find the index location for that movie 
     * @param movieName the movie's name
     * @return an integer represent the index number of that movie
     */

    public int getMovieIndex(String movieName){
        int movieIndex = 0;
        for(int i = 0; i < movies.length; i++){
            if(movies[i].equals(movieName)){
                movieIndex = i;
            }
        }
        return movieIndex;
    }

    /**
     * Method that searches the reviewers array to find the index location for that reviewer
     * @param reviewerName the name of the movie's reviewer
     * @return an integer representing the index number of that reviewer
     */

    public int getReviewerIndex(String reviewerName){
        int reviewerIndex = 0;
        for(int i = 0; i < reviewers.length; i++){
            if(reviewers[i].equals(reviewerName)){
                reviewerIndex = i;
            }
        }
        return reviewerIndex;
    }

    /**
     * Method in which the reviewer index specifies the row, the movie index specifies the column and the rating is the the value to store in that cell
     * @param movieIndex
     * @param reviewerIndex
     * @param rating
     */

    public void setRating(int movieIndex, int reviewerIndex, int rating){
        ratings[reviewerIndex][movieIndex] = rating;
    }

    /**
     * Method that print the movie name and the ratings to System.out
     * @param movieIndex
     */
    public void printMovieRatings(int movieIndex) {
        System.out.println(movies[movieIndex]);
        for(int i = 0; i < reviewers.length; i++){
            System.out.println(ratings[i][movieIndex]);
        }
    }

    /**
     * Method that print the reviewer name and the ratings to System.out
     * @param reviewerIndex 
     */
    public void printReviewerRatings(int reviewerIndex) {
        System.out.println(reviewers[reviewerIndex]);
        for(int i = 0; i < movies.length; i++){
            System.out.println(ratings[reviewerIndex][i]);
        }
    }

}
