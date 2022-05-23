package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Film {
    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("length")
    private int length;

    @SerializedName("category")
    private String[] category;

    @SerializedName("view")
    private int view;

    @SerializedName("year")
    private int year;

    @Override
    public String toString() {
        return id +
                " - " + title  +
                " - " + length +
                " - " + Arrays.toString(category) +
                " - " + view +
                " - " + year ;
    }

}
