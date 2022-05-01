package service;

import java.util.ArrayList;
import model.TextBook;

public class TextBookService {
    public ArrayList<TextBook> getAllTextBook(){
        ArrayList<TextBook> textBooks = new ArrayList<>();
        textBooks.add(new TextBook(1, "Xắc suất thống kê", new String[]{"Khoa học", "Ứng dụng"},
                "Nhà xuất bản bách khoa - Hà nội",
                2000, 30, 120, "Tống Đình Quỳ" ));
        textBooks.add(new TextBook(2, "Triết học Mác - Lênin", new String[]{"văn học", "Lịch sử"},
                "Nhà xuất bản chính trị quốc gia",
                2002, 35, 670, "Bộ giáo dục vào đào tạo" ));

        return textBooks;
    }
}
