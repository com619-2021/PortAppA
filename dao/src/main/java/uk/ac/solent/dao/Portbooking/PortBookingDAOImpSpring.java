package uk.ac.solent.dao.Portbooking;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.portbooking.PortBookingDao;
import uk.ac.solent.model.portbooking.PortBookingDto;

import java.util.List;
import java.util.Optional;

@Component
public class PortBookingDAOImpSpring implements PortBookingDao {

    @Override
    public Optional<PortBookingDto> create(PortBookingDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<PortBookingDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<PortBookingDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<PortBookingDto> save(PortBookingDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<PortBookingDto> deleteById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<PortBookingDto> archiveById(Integer id) {
        return Optional.empty();
    }
}
