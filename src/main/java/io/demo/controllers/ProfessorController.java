package io.demo.controllers;

import io.demo.models.Professor;
import io.demo.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @RequestMapping("/professors")
    public List<Professor> getAll() {
        return service.getAllProfessors();
    }

    @RequestMapping("/professors/{id}")
    public Professor getById(@PathVariable long id) {
        return service.getProfesorById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/professors")
    public void addNew(@RequestBody Professor professor) {
        service.addNewProfessor(professor);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "professors/{id}")
    private void update(@RequestBody Professor professor, @PathVariable long id) {
        service.updateProfessor(professor);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "professors/{id}")
    private void delete(@PathVariable long id) {
        service.deleteProfessor(id);
    }
}
