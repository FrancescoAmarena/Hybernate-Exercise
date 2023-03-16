package co.develhope.hybernate.repo;

import co.develhope.hybernate.entities.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepo extends JpaRepository<SchoolClass, Long> {
}
