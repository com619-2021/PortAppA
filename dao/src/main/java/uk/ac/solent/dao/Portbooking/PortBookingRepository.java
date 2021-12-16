package uk.ac.solent.dao.Portbooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.solent.model.portbooking.PortBookingDto;

@Repository
public interface PortBookingRepository extends JpaRepository<PortBookingDto, Integer> {
}
