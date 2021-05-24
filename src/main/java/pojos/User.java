package pojos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private int phone;
}
