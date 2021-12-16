package uk.ac.solent.dao.Port;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.Port.Port;
import uk.ac.solent.model.Port.PortDto;

import java.util.List;
import java.util.Optional;

@Component
public class PortImpSpring implements Port {

    @Override
    public Optional<PortDto> create(PortDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<PortDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<PortDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<PortDto> save(PortDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<PortDto> deleteById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<PortDto> archiveById(Integer id) {
        return Optional.empty();
    }
}
