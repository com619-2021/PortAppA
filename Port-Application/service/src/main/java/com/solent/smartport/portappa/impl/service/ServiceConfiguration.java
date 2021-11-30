/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solent.smartport.portappa.impl.service;

//import org.solent.com504.project.impl.dao.spring.PersistenceJPAConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author cgallen
 */
@Configuration

//@ComponentScan(basePackages = {"org.solent.com504.project.impl.party.service",
//    "org.solent.com504.project.impl.service",
//    "org.solent.com504.project.impl.user.service",
//    "org.solent.com504.project.impl.resource.service",
//    "org.solent.com504.project.impl.order.service"
//})

@ComponentScan(basePackages = {"my.solent.smartport.model.port.dto",
    "com.solent.smartport.portappa.impl.service",
    "com.solent.smartport.portappa.port.service"})

//@Import({PersistenceJPAConfig.class, SecurityServiceConfiguration.class})
public class ServiceConfiguration {

}
