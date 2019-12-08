package ru.lipatovs.addressbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lipatovs.addressbook.entity.Group;
import ru.lipatovs.addressbook.entity.Person;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
    Group findById(int id);
}
