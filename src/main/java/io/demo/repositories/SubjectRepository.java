package io.demo.repositories;

import io.demo.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    public List<Subject> findByProfessorId(long professorId);
}
