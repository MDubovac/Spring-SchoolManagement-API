package io.demo.repositories;

import io.demo.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
