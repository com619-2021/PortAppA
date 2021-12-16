package uk.ac.solent.model.base;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {
    Optional<T> create(T entity);
    Optional<T> save(T entity);

    Optional<T> findById(Integer id);
    Optional<List<T>> findAll();

    Optional<T> deleteById(Integer id);
    Optional<T> archiveById(Integer id);
}
