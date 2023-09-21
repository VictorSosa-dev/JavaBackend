package com.java.postwork.s4.persistence;

import com.java.postwork.s4.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@Repository
public class DiaryMemoryDao {

    private static final SortedSet<Person> diary = new TreeSet<>();

    public Person savePerson(Person person) {
        diary.add(person);
        return person;
    }

    public Set<Person> getPersonas() {
        return diary;
    }
}
