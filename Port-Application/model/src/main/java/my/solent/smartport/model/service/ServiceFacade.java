/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package my.solent.smartport.model.service;

import java.util.List;
import my.solent.smartport.model.port.dto.Port;

/**
 *
 * @author 1985j
 */
public interface ServiceFacade {
    //TODO: Setup heartbeat
    //public String getHeartbeat();

    /**
     * find all ports in database by partyRole if partyRole is null return all ports
     *
     * @param portId
     * @return list of port objects
     */
    //TODO: change to UUID or other searchable param
    public List<Port> findById(Long portId);
}
