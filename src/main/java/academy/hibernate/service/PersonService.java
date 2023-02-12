//package academy.hibernate.service;
//
//import academy.hibernate.entity.Person;
//import academy.hibernate.repository.PersonRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@AllArgsConstructor
//public class PersonService {
//
//    PersonRepository personRepository;
//
//    public Person getById(Long id){
//        return personRepository.findById(id).get();
//    }
//
//    public List<Person> getAllPersons() {
//        return personRepository.findAll();
//    }
//
//    public Long saveNewPerson(String name, String surname, String taxNumber) {
//        Person person = new Person();
//        person.setName(name);
//        person.setSurname(surname);
//        person.setTaxNumber(taxNumber);
//        return personRepository.save(person).getId();
//    }
//
//    public String deletePersonById(Long id) {
//        personRepository.deleteById(id);
//        return "Deleted";
//    }
//
//    public Person updateSurnameById(Long id, String newSurname) {
//        Person person = getById(id);
//
//        person.setSurname(newSurname);
//
//        return personRepository.save(person);
//    }
//}
