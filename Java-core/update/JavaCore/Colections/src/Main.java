import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     FilmService service=new FilmService();
     ArrayList listFilm=service.getAllFilm();
     service.show(listFilm);
     service.sortByTitle(listFilm);
     service.sortByLength(listFilm);
     service.sortByView(listFilm);
     service.sortByYear(listFilm);
    }

}
