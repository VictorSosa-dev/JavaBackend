package com.java.postwork.s4.repository;

import com.java.postwork.s4.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Person, Long> {
}
