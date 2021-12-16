package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.Port.PortRepository;
import uk.ac.solent.model.Port.PortDto;

import java.util.List;
import java.util.Optional;

@RestController
@Transactional
public class RouteController implements BaseController<PortDto>{

    private final PortRepository portRepository;

    public RouteController(PortRepository portRepository) {
        this.portRepository = portRepository;
    }

    @Override
    @PostMapping("")
    public Optional<PortDto> create(PortDto entity) {
        return Optional.empty();
    }

    @Override
    @PatchMapping( "/{id}")
    public Optional<PortDto> save(@PathVariable( "id" ) Integer id, PortDto entity) {
        return Optional.empty();
    }

    @Override
    @GetMapping("/{id}")
    public Optional<PortDto> findById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @GetMapping("")
    public Optional<List<PortDto>> findAll() {
        return Optional.empty();
    }

    @Override
    @DeleteMapping("/{id}")
    public Optional<PortDto> deleteById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @PutMapping("/{id}")
    public Optional<PortDto> archiveById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }
}
