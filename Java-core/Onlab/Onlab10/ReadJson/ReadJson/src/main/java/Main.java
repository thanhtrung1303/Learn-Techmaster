import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        PersonService service = new PersonService();
//        ArrayList<Person> list = service.getAllPerson();
//        service.show(list);

        MovieService service1 = new MovieService();
        ArrayList<Movie> list1 = service1.getAllMovie();
        service1.show(list1);
    }
}
