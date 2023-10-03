package com.java.postwork.s4.service;

import com.java.postwork.s4.model.Person;
import com.java.postwork.s4.repository.DiaryRepository;
import com.java.postwork.s4.utils.CheckNumber;
import com.java.postwork.s4.utils.NumberFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DiaryService {

    private final DiaryRepository diaryRepository;
    private CheckNumber checkNumber;

    //private final DiaryMemoryDao diaryMemoryDao;
    private NumberFormatter numberFormatter;

    /*
    @Autowired
    public DiaryService(CheckNumber checkNumber, DiaryMemoryDao diaryMemoryDao) {
        this.checkNumber = checkNumber;
        this.diaryMemoryDao = diaryMemoryDao;
    }*/

    @Autowired
    public DiaryService(CheckNumber checkNumber, DiaryRepository diaryRepository) {
        this.checkNumber = checkNumber;
        this.diaryRepository = diaryRepository;
    }

    public Person savePerson(Person person) {

        String phone = checkNumber.cleanNumber(person.getPhone());

        person.setPhone(phone);

        return  diaryRepository.save(person);
    }


    public List<Person> getPeople() {
        return diaryRepository.findAll(Sort.by("name"));
    }

}
