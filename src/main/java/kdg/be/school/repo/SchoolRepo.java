package kdg.be.school.repo;

import kdg.be.school.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School, Integer> {
}
