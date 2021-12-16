package uk.ac.solent.service.portbooking;

import org.springframework.stereotype.Service;
import uk.ac.solent.model.portbooking.PortBookingDto;
import uk.ac.solent.model.portbooking.PortBookingModelService;

import java.util.List;
import java.util.Optional;

@Service
public class PortbookingService implements PortBookingModelService {

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
