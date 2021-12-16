package uk.ac.solent.dao.Port;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.solent.model.Port.PortDto;

@Repository
public interface PortRepository extends JpaRepository<PortDto, Integer> {
}
