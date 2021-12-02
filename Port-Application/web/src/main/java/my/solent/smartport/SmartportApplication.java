package my.solent.smartport;

import my.solent.smartport.portappa.impl.rest.RestApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication(scanBasePackages = {"my.solent.smartport",
    "com.solent.smartport.portappa.impl.rest"
    })
public class SmartportApplication extends SpringBootServletInitializer {

    final static Logger LOG = LogManager.getLogger(SmartportApplication.class);

    {
        LOG.debug("*************************** starting mvc application");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(SmartportApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SmartportApplication.class, args);
    }

}
