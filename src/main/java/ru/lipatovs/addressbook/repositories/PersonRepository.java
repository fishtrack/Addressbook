package ru.lipatovs.addressbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lipatovs.addressbook.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findById (int id);
    Person findByLastName(String lastName);
}
