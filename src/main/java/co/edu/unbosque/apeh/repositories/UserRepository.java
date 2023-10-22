package co.edu.unbosque.apeh.repositories;
import co.edu.unbosque.apeh.repositories.models.StudentScheduleModel;
import co.edu.unbosque.apeh.repositories.models.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<UserModel, Long>{

    @Query(value = "SELECT * FROM user WHERE user.id = :id",
            nativeQuery = true)
    UserModel userByID(@Param("id") String id);
}
