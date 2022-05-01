public class Library {
    private int masach;
    private String tensach;
    private String nhaxuatban;
    private int namxuatban;
    private int soluong;

    public Library(int masach, String tensach, String nhaxuatban, int namxuatban, int soluong) {
        this.masach = masach;
        this.tensach = tensach;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "masach = " + masach +
                ", tensach = '" + tensach + '\'' +
                ", nhaxuatban = '" + nhaxuatban + '\'' +
                ", namxuatban = " + namxuatban +
                ", soluong = " + soluong;
    }
}
