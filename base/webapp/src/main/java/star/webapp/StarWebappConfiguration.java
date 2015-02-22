package star.webapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@PropertySource("classpath:/star-webapp.properties")
public class StarWebappConfiguration {

	@Configuration
	@EnableWebMvcSecurity
	public static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
		
	    public WebSecurityConfig() {
			super(true);
		}

		@Override
	    protected void configure(HttpSecurity http) throws Exception {
	    }
	}

}
