package com.java.postwork.s4.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class Person implements Comparable<Person> {

    @NotBlank(message = "El nombre de la persona es un campo obligatorio.")
    private String name;
    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
    private String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person persona = (Person) o;
        return name.equals(persona.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
