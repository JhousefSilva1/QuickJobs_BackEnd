package bo.edu.ucb.quickjobs.quickjobs.repository;

import bo.edu.ucb.quickjobs.quickjobs.entity.RequestPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestPaymentRepository extends JpaRepository<RequestPayment, Long> {
}
