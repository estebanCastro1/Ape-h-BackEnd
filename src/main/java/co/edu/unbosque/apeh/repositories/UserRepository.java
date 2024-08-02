package co.edu.unbosque.apeh.repositories;
import co.edu.unbosque.apeh.repositories.models.StudentScheduleModel;
import co.edu.unbosque.apeh.repositories.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel,Integer> {

    @Query(value = "SELECT * FROM user WHERE user.id = :id",
            nativeQuery = true)
    UserModel userByID(@Param("id") String id);
    Optional<UserModel> findByUsername(String username);
}
