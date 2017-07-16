package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{
}
