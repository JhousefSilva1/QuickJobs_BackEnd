package bo.edu.ucb.quickjobs.quickjobs.dao;

import bo.edu.ucb.quickjobs.quickjobs.entity.RequestPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestPaymentRepository extends JpaRepository<RequestPayment, Long> {
}
