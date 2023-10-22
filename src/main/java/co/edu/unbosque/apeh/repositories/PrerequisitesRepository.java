package co.edu.unbosque.apeh.repositories;
import co.edu.unbosque.apeh.repositories.models.PensumModel;
import co.edu.unbosque.apeh.repositories.models.PrerequisitesModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PrerequisitesRepository extends CrudRepository<PrerequisitesModel, Long> {

    @Query(value = "SELECT * FROM prerequisites WHERE prerequisites.id = :id",
            nativeQuery = true)
    PrerequisitesModel preriquisitesByID(@Param("id") String id);
}
