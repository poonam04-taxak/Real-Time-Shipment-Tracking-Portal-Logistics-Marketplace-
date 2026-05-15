package trackingPortal.example.Intern_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trackingPortal.example.Intern_project.Entity.BidEntity;

public interface BidRepo extends JpaRepository<BidEntity, Long> {
}
