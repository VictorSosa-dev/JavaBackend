package com.java.postwork.s4.persistence;

import com.java.postwork.s4.model.Person;
import com.java.postwork.s4.utils.NumberFormatter;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@Repository
public class DiaryMemoryDao {

    private static final SortedSet<Person> diary = new TreeSet<>();
    private final NumberFormatter numberFormatter;

    public DiaryMemoryDao(NumberFormatter numberFormatter) {
        this.numberFormatter = numberFormatter;
    }

    public Person savePerson(Person person) {
        person.setPhone(numberFormatter.format(person.getPhone()));
        diary.add(person);
        return person;
    }

    public Set<Person> getPeople() {
        return diary;
    }
}
