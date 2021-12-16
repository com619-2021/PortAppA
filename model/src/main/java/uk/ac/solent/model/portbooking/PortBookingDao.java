package uk.ac.solent.model.portbooking;

import java.util.List;
import java.util.Optional;

public interface PortBookingDao {
    Optional<PortBookingDto> create(PortBookingDto entity);
    Optional<PortBookingDto> findById(Integer id);
    Optional<List<PortBookingDto>> findAll();
    Optional<PortBookingDto> save(PortBookingDto entity);
    Optional<PortBookingDto> deleteById(Integer id);
    Optional<PortBookingDto> archiveById(Integer id);
}
