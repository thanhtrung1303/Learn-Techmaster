import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private String gender;
    private String address;
    private String password;
    private String mobile;
    private LocalDate create_at;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", create_at='" + create_at + '\'' +
                '}';
    }
}