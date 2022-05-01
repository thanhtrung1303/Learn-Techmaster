package model;

import java.time.LocalDate;

public class Bill extends Order{
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Ngày đặt hàng: " + date + ", " + super.toString();
    }
}
