package uk.ac.solent.service.Port;

import org.springframework.stereotype.Service;
import uk.ac.solent.model.Port.PortDto;
import uk.ac.solent.model.Port.PortModelService;

import java.util.List;
import java.util.Optional;

@Service
public class PortService implements PortModelService {

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
