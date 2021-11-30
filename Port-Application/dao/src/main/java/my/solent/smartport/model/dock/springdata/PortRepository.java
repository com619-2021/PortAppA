/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package my.solent.smartport.model.dock.springdata;


import java.util.List;
import my.solent.smartport.model.port.dto.Port;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/**
 *
 * @author 1985j
 */
@Repository
public interface PortRepository extends JpaRepository<Port, Long>{
    @Query("select p from Port p LEFT JOIN FETCH * where p.uuid = :uuid")
    public List<Port> findByUuid(@Param("uuid") String uuid);
    
    @Query("select p from Port p LEFT JOIN FETCH *")
    public List<Port> findAll();
}
