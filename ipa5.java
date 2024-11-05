package company;
import java.util.*;
/*Question:
Create class Movie with below attributes:

movieName - String
company - String
genre - String
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie
objects where the searchGenre String matches with the original array of Movie object's genre attribute
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie

 */

class Movie{
    String movieName;
    String company;
    String genre;
    int budget;

    public Movie(String movieName, String company, String genre, int budget){
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName(){
        return movieName;
    }

    public String getCompany(){
        return company;
    }

    public String getGenre(){
        return genre;
    }

    public int getBudget(){
        return budget;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setBudget(int budget){
        this.budget = budget;
    }
}
public class ipa5 {
    public static Movie[] getMovieGenre(Movie[] arr, String searchGenre){
        Movie[] arr2 = new Movie[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGenre().equalsIgnoreCase(searchGenre)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] arr = new Movie[4];

        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Movie(a,b,c,d);
        }

        String searchGenre = sc.nextLine();
        Movie[] arr2 = getMovieGenre(arr, searchGenre);

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].getBudget()>80000000)
                System.out.println("High Budget Movie");
            else
                System.out.println("Low Budget Movie");
        }
    }
}
