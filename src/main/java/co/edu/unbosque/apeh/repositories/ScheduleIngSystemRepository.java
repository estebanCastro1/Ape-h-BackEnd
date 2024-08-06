package co.edu.unbosque.apeh.repositories;
import co.edu.unbosque.apeh.repositories.models.ScheduleIngSistemModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ScheduleIngSystemRepository extends CrudRepository<ScheduleIngSistemModel, Long> {

    @Query(value = "SELECT * FROM horarios_ing_sistemas WHERE horarios_ing_sistemas.id = :id",
            nativeQuery = true)
    ScheduleIngSistemModel ScheduleIngSistemByID(@Param("id") String id);
}
