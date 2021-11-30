/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1985j
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solent.smartport.portappa.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import my.solent.smartport.model.port.dao.PortDAO;
import my.solent.smartport.model.port.dto.Port;
import my.solent.smartport.model.service.ServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("serviceFacade")
public class ServiceFacadeImpl implements ServiceFacade {

    @Autowired
    private PortDAO portDao = null;

    // used to concurently count heartbeat requests
    private static AtomicInteger heartbeatRequests = new AtomicInteger();

    // setters for DAOs
    public void setPortDao(PortDAO portDao) {
        this.portDao = portDao;
    }

//    // Service facade methods
//    @Override
//    public String getHeartbeat() {
//        return "heartbeat number " + heartbeatRequests.getAndIncrement() + " " + new Date().toString();
//
//    }


    @Override
    public List<Port> findById(Long portId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}