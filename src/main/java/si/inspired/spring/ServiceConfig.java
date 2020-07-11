package si.inspired.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "si.inspired.service" })
public class ServiceConfig {
}