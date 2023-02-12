//package academy.hibernate.controller;
//
//import academy.hibernate.entity.Person;
//import academy.hibernate.service.PersonService;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@AllArgsConstructor
//public class PersonController {
//
//    PersonService service;
//
//    @GetMapping("/person/{id}")
//    Person getById(@PathVariable Long id){
//        return service.getById(id);
//    }
//
//    @GetMapping("/person/all")
//    List<Person> getAllPersons(){
//        return service.getAllPersons();
//    }
//
//    @PostMapping("/person/save")
//    Long saveNewPerson(@RequestParam String name,
//                       @RequestParam String surname,
//                       @RequestParam String taxNumber){
//        return service.saveNewPerson(name,surname,taxNumber);
//    }
//
//    @DeleteMapping("/person/delete/{id}")
//    String deletePersonById(@PathVariable Long id){
//        return service.deletePersonById(id);
//    }
//
//    @PutMapping("/person/update")
//    Person updateSurnameById(@RequestParam Long id,
//                             @RequestParam String newSurname){
//        return  service.updateSurnameById(id,newSurname);
//    }
//}
