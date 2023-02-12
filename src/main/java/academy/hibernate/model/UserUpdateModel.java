package academy.hibernate.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateModel {

    private Long id;

    private String name;


    private String email;


    private String password;
}
