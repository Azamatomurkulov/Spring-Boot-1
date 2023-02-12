package academy.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Getter
@Setter
public class UserSaveModel {


    private String name;


    private String email;


    private String password;
}
