package ru.lipatovs.addressbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lipatovs.addressbook.entity.Person;
import ru.lipatovs.addressbook.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
    Phone findByNumber(String number);
    Person findbyPersonId(int id);
}
