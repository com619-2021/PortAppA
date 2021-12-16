package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.Portbooking.PortBookingRepository;
import uk.ac.solent.model.portbooking.PortBookingDto;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="booking", produces = "application/json")
@Transactional
public class BookingController implements BaseController<PortBookingDto>{

    private final PortBookingRepository portBookingRepository;

    public BookingController(PortBookingRepository portBookingRepository) {
        this.portBookingRepository = portBookingRepository;
    }

    @Override
    @PostMapping("")
    public Optional<PortBookingDto> create(PortBookingDto entity) {
        return Optional.empty();
    }

    @Override
    @PatchMapping( "/{id}")
    public Optional<PortBookingDto> save(@PathVariable( "id" ) Integer id, PortBookingDto entity) {
        return Optional.empty();
    }

    @Override
    @GetMapping("/{id}")
    public Optional<PortBookingDto> findById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @GetMapping("")
    public Optional<List<PortBookingDto>> findAll() {
        return Optional.empty();
    }

    @Override
    @DeleteMapping("/{id}")
    public Optional<PortBookingDto> deleteById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @PutMapping("/{id}")
    public Optional<PortBookingDto> archiveById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }
}
