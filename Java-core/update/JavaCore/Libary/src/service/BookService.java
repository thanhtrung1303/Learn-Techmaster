package service;

import model.*;

import java.time.LocalDate;
import java.util.*;

public class BookService {
    public ArrayList<Book> getAllBook() {
        ArrayList<Book> list = new ArrayList<>();
        list.addAll(getAllTextBook());
        list.addAll(getAllMagazine());
        list.addAll(getAllEbook());
        return list;
    }

    public ArrayList<TextBook> getAllTextBook() {
        ArrayList<TextBook> listTextBook = new ArrayList<>();
        listTextBook.add(new TextBook(1, "Toán 12", new String[]{"Khoa học", "Giáo dục"}, "NXB Giáo dục", 2007, 15000, 156, "Vũ Ngọc Ánh"));
        listTextBook.add(new TextBook(2, "Ngữ Văn 11", new String[]{"Văn học", "Giáo dục"}, "NXB Giáo dục", 2008, 16000, 256, "Đặng Thanh Chương"));
        listTextBook.add(new TextBook(3, "Khoa học vã Xã hội 5", new String[]{"Khoa học", "Xã hội", "Giáo dục"}, "NXB Giáo dục", 2005, 11000, 110, "Lê Quang Hoài"));
        return listTextBook;
    }

    public ArrayList<Magazine> getAllMagazine() {
        ArrayList<Magazine> listMagazine = new ArrayList<>();
        listMagazine.add(new Magazine(4, "Báo Nhân Dân", new String[]{"Xã hội", "Đời sống", "Chính trị"}, "Toà soạn báo Nhân Dân", LocalDate.now(), 24000, 25));
        listMagazine.add(new Magazine(5, "Báo An Ninh", new String[]{"An ninh", "Đời sống", "Chính trị"}, "Toà soạn báo An ninh", LocalDate.of(2021, 12, 5), 24050, 30));
        listMagazine.add(new Magazine(6, "Báo Thế Thao", new String[]{"Văn hoá", "Đời sống", "Thế thao"}, "Toà soạn báo Thể Thao", LocalDate.of(2022, 1, 17), 29210, 28));
        return listMagazine;
    }

    public ArrayList<EBook> getAllEbook() {
        ArrayList<EBook> listEbook = new ArrayList<>();
        listEbook.add(new EBook(7, "Giết chết con chim nhại", new String[]{"Văn học", "Đời sống"}, "NXB Nhã Nam", 2014, 36, "ảnh con chim", 1000001));
        listEbook.add(new EBook(8, "OOP trong Java", new String[]{"Công nghệ", "Giáo dục", "Khoa học"}, "Techmaster", 2022, 45, "biểu tượng Java", 56211));
        listEbook.add(new EBook(9, "Tôi thấy hoa vàng trên cỏ xanh", new String[]{"Văn học", "Học trò", "Tình yêu"}, "NXB Kim Đồng", 2018, 40, "ảnh cây đa", 164123));
        return listEbook;
    }


    public void show(ArrayList<?> list) {
        for (Object o : list
        ) {
            System.out.println(o);
        }
    }

    public void searchByName(ArrayList<Book> list, String searchName) {
        for (Book b : list
        ) {
            if (b.getName().toLowerCase(Locale.ROOT).contains(searchName.toLowerCase(Locale.ROOT))) {
                System.out.println(b);
            }
        }
    }


    public void searchByCategory(ArrayList<Book> list, String searchCategory) {
        for (Book b : list
        ) {
            if (Arrays.toString(b.getCategory()).toLowerCase(Locale.ROOT).contains(searchCategory.toLowerCase(Locale.ROOT))) {
                System.out.println(b);
            }
        }
    }

    public void getHighestEbook(ArrayList<EBook> list) {
        Collections.sort(list, new Comparator<EBook>() {
            @Override
            public int compare(EBook o1, EBook o2) {
                return o1.getData() - o2.getData();
            }
        });
        System.out.println(list.get(0));
    }

    public void searchByPubishYear(ArrayList<Magazine> list) {

        int year = LocalDate.now().getYear();
        System.out.println("Các báo phát hành trong năm " + year + " là:");
        for (Magazine m : list
        ) {
            if (m.getPublishDay().getYear() == year) {
                System.out.println(m);
            }
        }

    }
    public void countCate(ArrayList<Book> list){
        Map<String,Integer> listC=new HashMap<>();
        for (Book item:list){
            String []find=item.getCategory();
            for (String str:find){
                if(listC.get(str)==null){
                    listC.put(str,1);
                }else {
                    listC.put(str,listC.get(str)+1);
                }
            }
        }
        System.out.println(listC);

    }
}
