package co.edu.unbosque.apeh.repositories;
import co.edu.unbosque.apeh.repositories.models.SubjectsModel;
import co.edu.unbosque.apeh.repositories.models.SubjectsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SubjectsRepository extends CrudRepository<SubjectsModel, Long> {
    @Query(value = "SELECT * FROM subjects WHERE subjects.id = :id",
            nativeQuery = true)
    SubjectsModel subjectsByID(@Param("id") String id);
}
