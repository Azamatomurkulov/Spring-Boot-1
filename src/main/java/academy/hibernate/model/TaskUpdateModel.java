package academy.hibernate.model;

import academy.hibernate.enums.TaskStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.sql.Timestamp;

@Getter
@Setter
public class TaskUpdateModel {
    private Long id;


    private String title;


    private String description;

    private Timestamp issuedDate;

    TaskStatus status;
}
