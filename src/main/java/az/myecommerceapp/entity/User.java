package az.myecommerceapp.entity;

import az.myecommerceapp.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String userName;
    String password;
    @Transient
    String resetPassword;
    String email;
    Role role;


    //createdAt - nece yazacagimi bilmirem helelik qalsin :)
}

