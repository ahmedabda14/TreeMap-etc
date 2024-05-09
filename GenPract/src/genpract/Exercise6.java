/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genpract;
import java.util.*;
/**
 *
 * @author ahmed
 */
class Cinema{
    String genre,director,year;
    double rating,revenue;

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public double getRevenue() {
        return revenue;
    }

    public Cinema(String genre, String director, String year, double rating, double revenue) {
        this.genre = genre;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Cinema{" + "genre=" + genre + ", director=" + director + ", year=" + year + ", rating=" + rating + ", revenue=" + revenue + '}';
    }
    
}

public class Exercise6 {
      public static void main(String[] args) {
          LinkedHashSet<Cinema> L1= new LinkedHashSet<>();
          L1.add(new Cinema("Action","Yo","2002",10,2000));
                    L1.add(new Cinema("History","se","2012",10,2000));
          L1.add(new Cinema("Drama","pe","2006",10,2000));
          L1.add(new Cinema("Funny","me","200",10,2000));
          LinkedHashSet<Cinema> sortedGenre= new LinkedHashSet<>();

          
          
          
          class genreCompare implements Comparator<Cinema>{

    @Override
    public int compare(Cinema o1, Cinema o2) {
return o1.getGenre().compareTo(o2.getGenre());
    }
    
}
class revenueCompare implements Comparator<Cinema>{

    @Override
    public int compare(Cinema o1, Cinema o2) {
return Double.compare(o1.getRevenue(), o2.getRevenue())  ;
    }

}
class yearCompare implements Comparator<Cinema> {

    @Override
    public int compare(Cinema o1, Cinema o2) {
return o1.getYear().compareTo(o2.getYear());
    }
    
}
      }   
}
