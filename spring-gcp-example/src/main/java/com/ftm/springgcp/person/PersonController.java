package com.ftm.springgcp.person;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    final static Logger logger = Logger.getLogger(PersonController.class);

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPerson(){
        logger.info("Finding persons {}");
        return this.personRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Person> postEntity(@RequestBody  Person person){
        logger.info("Inserting new person {}" + person) ;
        Person personSaved = this.personRepository.save(person);
        return ResponseEntity.ok(personSaved);
    }
}
