package trackingPortal.example.Intern_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trackingPortal.example.Intern_project.Entity.UserEntity;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
