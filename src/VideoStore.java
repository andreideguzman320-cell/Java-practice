import java.util.ArrayList;

public class VideoStore {
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Rental> rental = new ArrayList<>();

    public void addMovie(String name,int ID,double price){
        if(ID<0||price<0)
            throw new IllegalArgumentException ("Input cannot be negative");

        for (Movie s:movies){
            if (ID ==s.getID())
                throw new IllegalArgumentException("ID already exist");
        }
        Movie add=(new Movie(name,ID,price));
        movies.add(add);


    }
    public void viewMovies(){
        if(movies.isEmpty())
            throw new IllegalArgumentException ("No movies to show");

        for(Movie s: movies)
            System.out.println(s);

    }
    public void rentMovies(int ID){
        if(ID<0)
            throw new IllegalArgumentException ("Input cannot be negative");

        Movie found =null;

        for(Movie s:movies){
            if (s.getID()==ID){
                found=s;
            }
        }
        if (found==null)
            throw new IllegalStateException("No ID matched");

        found.setAvailable(false);

        Rental rent=new Rental(found);

        rental.add(rent);
    }
    public void returnMovies(int ID){
        Rental found=null;

        for (Rental s:rental){
            if(s.getMovie().getID()==ID){
                found=s;
                break;
            }
        }
        if (found==null)
            throw new IllegalStateException("No ID matched");


        found.getMovie().setAvailable(true);

        System.out.println(found);

        rental.remove(found);

    }
    public void viewRentals(){
        if(rental.isEmpty())
            throw new IllegalArgumentException ("No movies to show");

        for(Rental s:rental){
            System.out.println(s);
        }
    }
}
