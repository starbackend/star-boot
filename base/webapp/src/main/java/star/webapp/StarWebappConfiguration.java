package star.webapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/star-webapp.properties")
@Import(JolokiaAdminConfiguration.class)
public class StarWebappConfiguration {

//	@Configuration
//	@EnableWebMvcSecurity
//	public static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//		
//	    public WebSecurityConfig() {
//			super(false);
//		}
//
////		@Override
////	    protected void configure(HttpSecurity http) throws Exception {
////	    }
//	}

//	@Configuration
//	public static class StarWebappManagementSecurityConfiguration extends ManagementSecurityAutoConfiguration {
//		
//		@Configuration
//		public static class StarWebappManagementWebSecurityConfigurerAdapter extends ManagementWebSecurityConfigurerAdapter {
//			
//			@Autowired
//			private ManagementServerProperties managementProperties;
//			
//			@Autowired
//			private JolokiaMvcEndpoint jolokiaMvcEndpoint;
//
//			@Autowired(required=false)
//			private EndpointHandlerMapping endpointHandlerMappingLocal;
//			
//			@Override
//			public void setEndpointHandlerMapping(
//					EndpointHandlerMapping endpointHandlerMapping) {
//				super.setEndpointHandlerMapping(endpointHandlerMapping);
//				this.endpointHandlerMappingLocal = endpointHandlerMapping;
//			}
//			
//			@Override
//			protected void configure(HttpSecurity http) throws Exception {
//				if (managementProperties.getSecurity().isEnabled()) {
//					http.authorizeRequests().antMatchers(endpointHandlerMappingLocal.getPath(jolokiaMvcEndpoint.getPath())+"/**").permitAll();
//				}
//				super.configure(http);
//			}
//			
//		}
//		
//	}
	
}
