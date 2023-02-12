//package academy.hibernate.entity.oneToMany;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class GoodComment {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private long id;
//    private String text;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private GoodTopic topic;
//
//    public void setTopic(GoodTopic goodTopic) {
//    }
//
//}
//
