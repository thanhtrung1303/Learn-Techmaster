import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FilmService implements Comparable {
    public ArrayList<Film> getAllFilm() {
        ArrayList<Film> listFilms = new ArrayList<>();
        listFilms.add(new Film(1, "Mùi cỏ cháy", 180, "Điện ảnh", 2000000, 2009));
        listFilms.add(new Film(2, "Tom and Jerry", 30, "Hoạt hình", 1542013, 1996));
        listFilms.add(new Film(3, "Người nhện xa nhà", 196, "Điện ảnh", 76000000, 2021));
        listFilms.add(new Film(4, "Shazam", 200, "Điện ảnh", 6000000, 2018));
        listFilms.add(new Film(5, "Cô dâu 8 tuổi", 15000, "Dài tập", 6000056, 2015));

        return listFilms;
    }

    public void show(ArrayList<Film> listFilms) {
        for (Film film : listFilms
        ) {
            System.out.println(film);
        }
    }

    public void sortByTitle(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("Sắp xếp theo tên");
        show(list);
    }

    public void sortByLength(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getLength() - o2.getLength();
            }
        });
        System.out.println("Sắp xếp theo độ dài");
        show(list);
    }

    public void sortByView(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return (int) ((int) o1.getView() - o2.getView());
            }
        });
        System.out.println("Sắp xếp theo lượt xem");
        show(list);
    }

    public void sortByYear(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        System.out.println("Sắp xếp theo năm");
        show(list);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
