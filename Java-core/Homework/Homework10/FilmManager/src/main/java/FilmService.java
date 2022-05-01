import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;

public class FilmService {
    public ArrayList<Film> getAllFilm(){
        ArrayList<Film> films = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Film>>(){}.getType();

            films = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return films;
    }

    public void sortByYear(ArrayList<Film> films) {
        films.sort(new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        System.out.println("Danh sách xếp sếp phim theo năm xuất bản: ");
        show(films);
    }

    public void sortByTitle(ArrayList<Film> films) {
        films.sort(new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("Danh sách xếp sếp phim theo tên: ");
        show(films);
    }

    public void searchByTitle(ArrayList<Film> films, String title){
        for (Film f : films){
            if(f.getTitle().toLowerCase().contains(title.toLowerCase())){
                System.out.println(f);
            }
        }
    }

    public void searchByCategory(ArrayList<Film> films, String category) {
        for (Film f : films) {
            for (String s : f.getCategory()){
                if (s.toLowerCase().equals(category)) {
                    System.out.println(f);
                }
            }
        }
    }

//    public void searchByCategory1(ArrayList<Film> films, String category){
//        for (Film film: films){
//            if (Arrays.toString(film.getCategory()).toLowerCase().contains(category)){
//                System.out.println(film);
//            }
//        }
//    }

    public void printTopView(ArrayList<Film> films){
        films.sort(new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o2.getView() - o1.getView();
            }
        });
        for (int i = 0; i < 3; i++){
            System.out.println(films.get(i));
        }
    }

    public void show(ArrayList<Film> films){
        for (Film f : films){
            System.out.println(f);
        }
    }
}
