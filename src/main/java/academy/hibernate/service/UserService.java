package academy.hibernate.service;

import academy.hibernate.entity.User;
import academy.hibernate.model.UserSaveModel;
import academy.hibernate.model.UserUpdateModel;
import academy.hibernate.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserService {

        UserRepository userRepository;

    public User getById(Long id){
        return userRepository.findById(id).get();
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Long saveNewUser(UserSaveModel model) {

        User user = new User();
        user.setName(model.getName());
        user.setEmail(model.getEmail());
        user.setPassword(model.getPassword());
        return userRepository.save(user).getId();
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public User updateById(UserUpdateModel model) {


        User user = userRepository.getById(model.getId());
        user.setName(model.getName());
        user.setEmail(model.getEmail());
        user.setPassword(model.getPassword());

        return userRepository.save(user);
    }
}


