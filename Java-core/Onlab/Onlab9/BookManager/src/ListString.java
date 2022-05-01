import java.util.ArrayList;

public class ListString {
    public void createList(){
        ArrayList<String> name = new ArrayList<>();
        name.add("nova");
        name.add("nava");
        name.add("cova");
        name.add("vova");

        System.out.println("danh sach ten");
        for (String s : name) {
            System.out.print(s + "\t");
        }

        name.remove("cova");
        System.out.println("\ndanh sach ten sau khi xoa");
        for (String s : name) {
            System.out.print(s + "\t");
        }
    }
}
