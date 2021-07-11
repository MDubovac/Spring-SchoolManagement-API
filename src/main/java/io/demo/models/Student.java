package io.demo.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "student")
    private Set<Grade> grades;

    // Constructor
    public Student() {

    }
    public Student(long id, String firstName, String lastName, Set<Grade> grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    // Get & Set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }
}
