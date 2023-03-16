package co.develhope.hybernate.repo;

import co.develhope.hybernate.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}

