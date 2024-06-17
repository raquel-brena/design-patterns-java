package org.example;

import java.util.logging.Logger;

public class ProxyPersonRepository extends PersonRepository {

    private static Logger log = Logger.getLogger(ProxyPersonRepository.class.getName());

    @Override
    public void save(Person person) {
        log.info("Iniciando chamada do metodo save...");
        super.save(person);
        log.info("Finalizando chamada do metodo save...");
    }

    @Override
    public Person findById(Long id) {
        log.info("Iniciando chamada do metodo findById...");
        Person person = super.findById(id);
        log.info("Finalizando chamada do metodo findById");
        return person;
    }
}
