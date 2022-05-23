import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {

    @SerializedName("id")
    private int id;

    @SerializedName("first_name")
    private String fisrtName;

    @SerializedName("last_name")
    private String lastName;

    @SerializedName("email")
    private String email;

    @SerializedName("gender")
    private String gender;

    @SerializedName("mobile")
    private String mobile;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
