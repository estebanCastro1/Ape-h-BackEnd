package co.edu.unbosque.apeh.repositories;

import co.edu.unbosque.apeh.repositories.models.ElectiveModel;
import co.edu.unbosque.apeh.repositories.models.PensumModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PensumRepository extends CrudRepository<PensumModel, Long> {

    @Query(value = "SELECT * FROM pensum WHERE pensum.id = :id",
            nativeQuery = true)
    PensumModel pensumByID(@Param("id") String id);
}
