import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Film> films = new ArrayList<>();
        films.add(new Film(1, "nghin le 1 dem", 40, "huyen bi", 50,2000));
        films.add(new Film(3, "2 ngay 1 dem", 50, "huyen bi", 60,2003));
        films.add(new Film(2, "7 ngay song dao hoang", 60, "huyen bi", 60,2002));

        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getId() - o2.getId();
            }
        });
        System.out.println("danh sach sap xep theo id");
        show(films);

        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("danh sach sap xep theo title");
        show(films);
    }

    public static void show(ArrayList<Film> list) {
        for (Film film: list) {
            System.out.println(film);
        }
    }
}
