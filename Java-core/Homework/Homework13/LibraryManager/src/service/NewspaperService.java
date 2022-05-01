package service;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Newspaper;

public class NewspaperService {
    public ArrayList<Newspaper> getAllNewspaper(){
        ArrayList<Newspaper> newspapers = new ArrayList<>();
        newspapers.add(new Newspaper(3, "Báo an ninh", new String[]{"Đời sống","an ninh"},
                "nhà xuất bản an ninh", LocalDate.of(2020,8,19),50, 5));
        newspapers.add(new Newspaper(3, "Báo xã hội", new String[]{"Đời sống","xã hội"},
                "nhà xuất bản an ninh", LocalDate.of(2022,4,5),90, 6));

        return newspapers;
    }

    public static void currentYear(ArrayList<Newspaper> newspapers){
        for (Newspaper newspaper: newspapers){
            if (newspaper.getDate().getYear() == LocalDate.now().getYear()){
                System.out.println(newspaper);
            }
        }
    }

}
