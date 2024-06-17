package org.example;

public class PersonService {

private IRepository personRepository;

public PersonService (IRepository personRepository) {
    this.personRepository = personRepository;
}
    public void save (Person person) {
        personRepository.save(person);
    }
    public Person findById(Long id) {
        return personRepository.findById(id);
    }

}
