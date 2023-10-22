package co.edu.unbosque.apeh.repositories;

import co.edu.unbosque.apeh.repositories.models.ElectiveModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ElectiveRepository extends CrudRepository<ElectiveModel, Long> {
    @Query(value = "SELECT * FROM electives WHERE electives.id = :id",
            nativeQuery = true)
    ElectiveModel electiveByID (@Param("id") String id);
}
