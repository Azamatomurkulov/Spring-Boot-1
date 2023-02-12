package academy.hibernate.repository;


import academy.hibernate.entity.Task;
import academy.hibernate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//    Optional<Person> findById(Long id);


}
