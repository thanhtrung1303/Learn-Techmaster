package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.EBook;

public class EBookService {
    public ArrayList<EBook> getAllEBook(){
        ArrayList<EBook> eBooks = new ArrayList<>();
        eBooks.add(new EBook(5, "Học lập trình", new String[]{"Lý thuyết", "Thực hành"},
                "TechMaster", 2022, 3.5, "Hello World", 783));
        eBooks.add(new EBook(6, "Sống cùng vợ trong mùa dịch", new String[]{"Tâm lý", "Chiến thuật", "Sinh tồn"},
                "Covid-19", 2022, 5.5, "Survival", 789));

        return eBooks;
    }

    public static void topDowload(ArrayList<EBook> eBooks){
        Collections.sort(eBooks, new Comparator<EBook>() {
            @Override
            public int compare(EBook o1, EBook o2) {
                return o2.getDownload() - o1.getDownload();
            }
        });
        System.out.println(eBooks.get(0));
    }
}
