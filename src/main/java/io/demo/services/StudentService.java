package io.demo.services;

import io.demo.models.Student;
import io.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students = repository.findAll();
        return students;
    }

    public Student getStudentById(long id) {
        return repository.findById(id).get();
    }

    public void addNewStudent(Student student) {
        repository.save(student);
    }

    public void updateStudent(long id, Student student) {
        repository.save(student);
    }

    public void deleteStudent(long id) {
        repository.deleteById(id);
    }
}
