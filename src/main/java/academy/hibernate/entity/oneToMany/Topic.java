//package academy.hibernate.entity.oneToMany;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Data
//@AllArgsConstructor
//public class Topic {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.SEQUENCE)
//        private long id;
//        private String title;
//        @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//        @JoinColumn(name = "topic_id")
//        private List<Comment> comments=new ArrayList<>();
//
//        public Topic() {
//        }
//    }
//
