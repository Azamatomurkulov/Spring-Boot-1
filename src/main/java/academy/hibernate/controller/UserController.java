package academy.hibernate.controller;

import academy.hibernate.entity.User;
import academy.hibernate.model.UserSaveModel;
import academy.hibernate.model.UserUpdateModel;
import academy.hibernate.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor

public class UserController {

    UserService service;

    @GetMapping("/user/{id}")
    User getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/user/all")
    List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/user/save")
    Long saveNewUser(@RequestBody UserSaveModel model){
        return service.saveNewUser(model);
    }

    @DeleteMapping("/user/delete/{id}")
    void deleteUserById(@PathVariable Long id){
        service.deleteUserById(id);
    }

    @PutMapping("/user/update")
    User updateById(@RequestBody UserUpdateModel model){
        return  service.updateById(model);
    }
}
