import java.util.ArrayList;

public class ListString {
    public static void createList(){
        ArrayList<String> names = new ArrayList<>();
        names.add("HOA");
        names.add("ris");
        names.add("LOng");
        names.add("GG");
        names.add("HOA");
        for (String s : names
        ) {
            System.out.println(s);
        }
    }
}
