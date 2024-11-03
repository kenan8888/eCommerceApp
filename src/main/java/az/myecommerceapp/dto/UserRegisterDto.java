package az.myecommerceapp.dto;

import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRegisterDto {
    String mail;
    String userName;
    String password;

}
