package UserControllerIntegrationo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UserControllerIntegrationo.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
