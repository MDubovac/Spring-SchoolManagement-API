package io.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int gradValue;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    // Constructor
    public Grade() {
    }
    public Grade(long id, int gradValue, Subject subject, Student student) {
        this.id = id;
        this.gradValue = gradValue;
        this.subject = subject;
        this.student = student;
    }

    // Get & Set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGradValue() {
        return gradValue;
    }

    public void setGradValue(int gradValue) {
        this.gradValue = gradValue;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
