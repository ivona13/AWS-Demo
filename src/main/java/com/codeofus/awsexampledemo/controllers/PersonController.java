package com.codeofus.awsexampledemo.controllers;

import com.codeofus.awsexampledemo.domain.Person;
import com.codeofus.awsexampledemo.dtos.PersonDto;
import com.codeofus.awsexampledemo.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/persons")
public class PersonController {

    PersonService personService;

    @GetMapping
    public Page<Person> getAllPersons(Pageable pageable) {
        return personService.getAllPersons(pageable);
    }

    @PostMapping
    public Person createNewPerson(@RequestBody PersonDto person) {
        return personService.createNewPerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable int id) {
        personService.deletePerson(id);
    }
}
