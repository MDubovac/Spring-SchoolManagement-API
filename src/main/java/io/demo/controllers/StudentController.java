package io.demo.controllers;

import io.demo.models.Student;
import io.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @RequestMapping("/students/{id}")
    public Student getStudentById(@PathVariable long id) {
        return service.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addNewStudent(@RequestBody Student student) {
        service.addNewStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable long id) {
        service.updateStudent(id, student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteStudent(@PathVariable long id) {
        service.deleteStudent(id);
    }
}
