package co.edu.unbosque.apeh.repositories;
import co.edu.unbosque.apeh.repositories.models.ProfessorModel;
import co.edu.unbosque.apeh.repositories.models.StudentScheduleModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentScheduleRepository extends CrudRepository<StudentScheduleModel, Long> {
    @Query(value = "SELECT * FROM student_schedule WHERE student_schedule.id = :id",
            nativeQuery = true)
    StudentScheduleModel studentScheduleByID(@Param("id") String id);
}
