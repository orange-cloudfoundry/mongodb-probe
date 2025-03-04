package mongodb.xaas.innov.orange.com;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByName(String name);
}
