package star.auto;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import star.webapp.StarWebappConfiguration;

@Configuration
@Import(StarWebappConfiguration.class)
public class StarWebappAutoConfiguration {

}
