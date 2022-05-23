import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonService service=new PersonService();
        service.getAllPerson();
        ArrayList<Person> persons=service.getAllPerson();
        service.show(persons);
    }

}
