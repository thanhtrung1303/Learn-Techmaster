public class Film {
    private int id;
    private String title;
    private int length;
    private String category;
    private long view;
    private int year;

    public Film(int id, String title, int length, String category, long view, int year) {
        this.id = id;
        this.title = title;
        this.length = length;
        this.category = category;
        this.view = view;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  id +
                " - " + title  +
                " - " + length +
                " - " + category +
                " - " + view +
                " - " + year;
    }
}
