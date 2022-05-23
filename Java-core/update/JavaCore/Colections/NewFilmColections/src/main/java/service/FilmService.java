package service;

import model.Film;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;


public class FilmService {

//    Tạo mảng danh sách phim
    public ArrayList<Film> getAllFilm() {

        ArrayList<Film> list = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader filereader = new FileReader("movieTeacher.json");
            Type type = new TypeToken<ArrayList<Film>>() {
            }.getType();

            list = gson.fromJson(filereader, type);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy File");
        }
        return list;
    }

    public void showTitle() {

        System.out.printf("%-5s %10s %35s %20s %30s %25s \n", "ID", "Tên phim", "Độ dài phim (phút)", "Thể loại", "Lượt xem", "Năm xuất bản");
    }

    public void showInformation(Film film) {

        System.out.printf("%-5d %-30s %-20d %-40s %-20d %-20d \n", film.getId(), film.getTitle(), film.getLength(), Arrays.toString(film.getCategory()), film.getView(), film.getYear());
    }

//    Hiển thị danh sách phim
    public void show(ArrayList<Film> list) {

        showTitle();
        for (Film film : list
        ) {
            showInformation(film);
        }
    }

//    Tìm phim theo tên
    public void searchFilmByTitle(ArrayList<Film> list, String searchTitle) {

        showTitle();
        for (Film film : list
        ) {
            if (film.getTitle().toLowerCase(Locale.ROOT).contains(searchTitle.toLowerCase(Locale.ROOT))) {
                showInformation(film);
            }
        }
    }

//    Tìm phim theo thể loại
    public void searchByCategory(ArrayList<Film> list, String searchCategory) {

        showTitle();
        for (Film film : list
        ) {
            for (String cate : film.getCategory()
            ) {
                if (cate.toLowerCase(Locale.ROOT).equals(searchCategory))
                    showInformation(film);

            }
        }
    }

//    Đưa ra top 3 phim có lượt xem nhiều nhất
    public void get3HighestViewFilms(ArrayList<Film> list) {

        showTitle();
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o2.getView() - o1.getView();
            }
        });
        for (int i = 0; i < 3; i++) {
            showInformation(list.get(i));
        }
    }

//    Sắp xếp theo năm xuất bản
    public void softByYear(ArrayList<Film> list) {

        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        show(list);
    }

//    Sắp xếp theo tên
    public void softByTitle(ArrayList<Film> list) {

        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        show(list);
    }

//    Sắp xếp theo độ dài phim
    public void softByLength(ArrayList<Film> list) {

        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getLength() - o2.getLength();

            }
        });
        show(list);
    }

//    Sắp xếp theo lượt xem
    public void softByView(ArrayList<Film> list) {

        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getView() - o2.getView();
            }
        });
        show(list);
    }

}
