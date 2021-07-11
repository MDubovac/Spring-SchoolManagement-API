package io.demo.controllers;

import io.demo.models.Professor;
import io.demo.models.Subject;
import io.demo.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService service;

    @RequestMapping("/subjects")
    public List<Subject> getAll() {
        return service.getAllSubjects();
    }

    @RequestMapping("/professors/{professorId}/subjects")
    public List<Subject> getAllByProfessorId(@PathVariable long professorId) {
        return service.getAllByProfessorId(professorId);
    }

    @RequestMapping("/professors/{professorId}/subjects/{id}")
    public Subject getByProfessorId(@PathVariable long professorId, @PathVariable long id) {
        return service.getByProfessorId(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/professors/{professorId}/subjects")
    public void addSubject(@RequestBody Subject subject, @PathVariable long professorId) {
        subject.setProfessor(new Professor(professorId, "", ""));
        service.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/professors/{professorId}/subjects/{id}")
    public void updateSubject(@RequestBody Subject subject, @PathVariable long professorId, @PathVariable long id) {
        subject.setProfessor(new Professor(professorId, "", ""));
        service.updateSubject(subject);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/subjects/{id}")
    public void deleteSubject(@PathVariable long id) {
        service.deleteSubject(id);
    }
}
