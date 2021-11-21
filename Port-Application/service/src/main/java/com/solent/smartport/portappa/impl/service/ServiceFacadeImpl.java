/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solent.smartport.portappa.impl.service;

import java.util.List;
import my.solent.smartport.model.port.dto.Port;
import my.solent.smartport.model.port.dao.PortDAO;
import my.solent.smartport.model.service.ServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author 1985j
 */
@Component("serviceFacade")
public class ServiceFacadeImpl implements ServiceFacade {
    @Autowired
    private PortDAO portDao = null;
    
    // setters for DAOs
    public void setPortDao(PortDAO portDao) {
        this.portDao = portDao;
    }
    
    @Override
    public List<Port> findById(Long portId) {
         if (portId == null) {
            return portDao.findAll();
        } else {
            return (List<Port>) portDao.findById(portId);
        }
    }
    
}
