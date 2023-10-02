package com.java.postwork.s4.service;

import com.java.postwork.s4.model.Person;
import com.java.postwork.s4.persistence.DiaryMemoryDao;
import com.java.postwork.s4.utils.CheckNumber;
import com.java.postwork.s4.utils.NumberFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DiaryService {

    private CheckNumber checkNumber;

    private final DiaryMemoryDao diaryMemoryDao;
    private NumberFormatter numberFormatter;

    @Autowired
    public DiaryService(CheckNumber checkNumber, DiaryMemoryDao diaryMemoryDao) {
        this.checkNumber = checkNumber;
        this.diaryMemoryDao = diaryMemoryDao;
    }

    public Person savePerson(Person person) {

        String phone = checkNumber.cleanNumber(person.getPhone());

        person.setPhone(phone);

        return diaryMemoryDao.savePerson(person);
    }


    public Set<Person> getPeople() {
        return diaryMemoryDao.getPeople();
    }




}
