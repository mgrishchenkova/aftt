package lesson12.task3.person;

import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private Mother mother;
    private List<String> children;
    private Boolean married;
    private Object dog;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(mother, person.mother) &&
                Objects.equals(children, person.children) &&
                Objects.equals(married, person.married) &&
                Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mother, children, married, dog);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Object getDog() {
        return dog;
    }

    public void setDog(Object dog) {
        this.dog = dog;
    }

    public Person(String name, Integer age, Mother mother, List<String> children, Boolean married, Object dog) {
        this.name = name;
        this.age = age;
        this.mother = mother;
        this.children = children;
        this.married = married;
        this.dog = dog;
    }
}
