package co.edu.unbosque.apeh.repositories;
import co.edu.unbosque.apeh.repositories.models.PrerequisitesModel;
import co.edu.unbosque.apeh.repositories.models.ProfessorModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProfessorRepository extends CrudRepository<ProfessorModel, Long> {

    @Query(value = "SELECT * FROM professor WHERE professor.id = :id",
            nativeQuery = true)
    ProfessorModel professorByID(@Param("id") String id);
}
