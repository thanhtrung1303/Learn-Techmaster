package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetail {
    private int userID;
    private String phoneNum;
    private String email;
    private String address;
    private String name;

    @Override
    public String toString() {
        return
                "Sdt : " + phoneNum +
                        ", email : " + email +
                        ", Địa chỉ : " + address +
                        ", Tên : " + name;
    }
}