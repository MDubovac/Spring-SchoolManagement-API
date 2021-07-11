package io.demo.services;

import io.demo.Repositories.SubjectRepository;
import io.demo.models.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository repository;

    public List<Subject> getAllSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjects = repository.findAll();
        return subjects;
    }

    public List<Subject> getAllByProfessorId(long professorId) {
        List<Subject> subjects = new ArrayList<>();
        repository.findByProfessorId(professorId).forEach(subjects::add);
        return subjects;
    }

    public Subject getByProfessorId(long id) {
        Subject subject = repository.findById(id).get();
        return subject;
    }

    public void addSubject(Subject subject) {
        repository.save(subject);
    }

    public void updateSubject(Subject subject) {
        repository.save(subject);
    }

    public void deleteSubject(long id) {
        repository.deleteById(id);
    }
}
