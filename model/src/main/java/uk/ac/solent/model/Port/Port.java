package uk.ac.solent.model.Port;

import java.util.List;
import java.util.Optional;

public interface Port {
    Optional<PortDto> create(PortDto entity);
    Optional<PortDto> findById(Integer id);
    Optional<List<PortDto>> findAll();
    Optional<PortDto> save(PortDto entity);
    Optional<PortDto> deleteById(Integer id);
    Optional<PortDto> archiveById(Integer id);
}
