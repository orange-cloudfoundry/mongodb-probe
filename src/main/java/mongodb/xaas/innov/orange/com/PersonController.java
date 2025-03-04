package mongodb.xaas.innov.orange.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return service.savePerson(person);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return service.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id) {
        return service.getPersonById(id);
    }

    @GetMapping("/name/{name}")
    public Person getPersonByName(@PathVariable String name) {
        return service.getPersonByName(name);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        service.deletePerson(id);
    }
}
