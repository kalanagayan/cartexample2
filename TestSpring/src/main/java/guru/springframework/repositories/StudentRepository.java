package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}