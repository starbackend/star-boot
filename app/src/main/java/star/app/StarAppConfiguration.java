package star.app;

import org.cwatch.env.CwatchEnvConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value={"classpath:/star-app-rules.properties", "file:conf/star-app.properties"}, ignoreResourceNotFound=true)
@Import(CwatchEnvConfiguration.class)
public class StarAppConfiguration {

}
