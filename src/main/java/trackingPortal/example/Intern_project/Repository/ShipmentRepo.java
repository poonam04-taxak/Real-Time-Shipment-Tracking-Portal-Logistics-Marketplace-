package trackingPortal.example.Intern_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trackingPortal.example.Intern_project.Entity.ShipmentEntity;
import trackingPortal.example.Intern_project.Entity.UserEntity;

public interface ShipmentRepo extends JpaRepository<ShipmentEntity, Long> {
}
