//package academy.hibernate.entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//@Data
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "Person",uniqueConstraints = {@UniqueConstraint(columnNames = {"taxNumber"})})
//public class Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
//    @SequenceGenerator(name = "users_sequence", sequenceName = "users_seq", allocationSize = 1)
//    private Long id;
//
//    @Column(nullable = false,length = 30)
//    private String name;
//    @Column(length = 50)
//    private String surname;
//    @Column(length = 14,unique = true)
//    private String taxNumber;
//
//
//}
//
//
