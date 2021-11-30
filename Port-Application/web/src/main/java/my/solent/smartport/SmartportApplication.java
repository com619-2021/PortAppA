package my.solent.smartport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication(scanBasePackages = {"com.solent.smartport.portappa.impl.rest",
                                            "my.solent.smartport"})

public class SmartportApplication extends SpringBootServletInitializer  {



    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SmartportApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SmartportApplication.class, args);
    }

}
