package uk.ac.solent.service.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.ac.solent.dao.Portbooking.PortBookingRepository;
import uk.ac.solent.dao.Port.PortRepository;
import uk.ac.solent.dao.ship.ShipRepository;
import uk.ac.solent.dao.user.UserRepository;

@Component
public class DBInitialise {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PortBookingRepository portBookingRepository;

    @Autowired
    private ShipRepository shipRepository;

    @Autowired
    private PortRepository portRepository;

    @PostConstruct
    public void init() {


    }
}