package co.edu.unbosque.apeh.repositories;
import co.edu.unbosque.apeh.repositories.models.ProfessorModel;
import co.edu.unbosque.apeh.repositories.models.ScheduleIngSistemModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ScheduleIngSistemRepository extends CrudRepository<ScheduleIngSistemModel, Long> {

    @Query(value = "SELECT * FROM schedule_ing_sistem WHERE schedule_ing_sistem.id = :id",
            nativeQuery = true)
    ScheduleIngSistemModel ScheduleIngSistemByID(@Param("id") String id);
}
