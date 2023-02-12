//package academy.hibernate.entity.manyToMany;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.awt.print.Book;
//import java.util.ArrayList;
//import java.util.List;
//    @NoArgsConstructor
//    @Data
//    @Entity
//    class Author {
//        @Id
//        @GeneratedValue(strategy = GenerationType.SEQUENCE)
//        private Long id;
//        private String name;
//        @ManyToMany(cascade = {
//                CascadeType.PERSIST,
//                CascadeType.MERGE    })
//        @JoinTable(name = "author_book",
//                joinColumns = @JoinColumn(name = "author_id"),
//                inverseJoinColumns = @JoinColumn(name = "book_id")    )
//        private List<Book> books=new ArrayList<>();
//}
//
//
