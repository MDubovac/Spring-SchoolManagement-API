package io.demo.services;

import io.demo.repositories.ProfessorRepository;
import io.demo.models.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<Professor> getAllProfessors() {
        List<Professor> professors = new ArrayList<>();
        repository.findAll().forEach(professors::add);
        return professors;
    }

    public Professor getProfesorById(long id) {
        Professor professor = repository.findById(id).get();
        return professor;
    }

    public void addNewProfessor(Professor professor) {
        repository.save(professor);
    }

    public void updateProfessor(long id, Professor professor) {
        repository.save(professor);
    }

    public void deleteProfessor(long id) {
        repository.deleteById(id);
    }
}