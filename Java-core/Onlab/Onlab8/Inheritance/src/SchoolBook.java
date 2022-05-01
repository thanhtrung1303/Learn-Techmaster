public class SchoolBook extends Library{
    private int sotrang;
    private String tinhtrang;
    private int soluongmuon;

    public SchoolBook(int masach, String tensach, String nhaxuatban, int namxuatban, int soluong, int sotrang, String tinhtrang, int soluongmuon) {
        super(masach, tensach, nhaxuatban, namxuatban, soluong);
        this.sotrang = sotrang;
        this.tinhtrang = tinhtrang;
        this.soluongmuon = soluongmuon;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }

    public int tonkho(int soluong, int soluongmuon) {
        return soluong-soluongmuon;
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
