package me.afua.addressbookdemo.repositories;

import me.afua.addressbookdemo.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {

    Iterable<Person> findAllByFirstNameContainingIgnoreCase(String partial);
}
