import java.time.*;
import java.time.temporal.ChronoUnit;

public class Rental {

    Movie movie;
    LocalDate rentedDate;
    LocalDate dueDate;


    Rental(Movie s){
        this.movie = s;
        this.rentedDate = LocalDate.now();
        this.dueDate = rentedDate.plusDays(7);
    }
   public Movie getMovie(){
       return movie;
   }
    public LocalDate rentedDate(){
        return rentedDate;
    }
    public LocalDate dueDate(){
        return dueDate;
    }
    // computeLateFee() — $2 per day past dueDate, 0 if not late
    public double computeLateFee(){
       long days=ChronoUnit.DAYS.between(dueDate,LocalDate.now());

       if(days<=0)
           return 0;

        return days*2;
    }
    @Override
    public String toString(){
        return "Title: "+movie.getTitle()+" | Rented: "+ rentedDate()+" | Due : "+dueDate()+ " |Late Fee"+computeLateFee();
    }

}




// toString — movie title | Rented: x | Due: x | Late Fee: x
