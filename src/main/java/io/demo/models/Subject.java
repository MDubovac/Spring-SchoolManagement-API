package io.demo.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne
    private Professor professor;


    // Constructor
    public Subject() {

    }
    public Subject(long id, String name, Professor professor, long professorId) {
        super();
        this.id = id;
        this.name = name;
        this.professor = new Professor(professorId, "", "");
    }

    // Get & Set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
