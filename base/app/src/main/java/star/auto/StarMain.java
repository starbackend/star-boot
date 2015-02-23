package star.auto;

import java.io.File;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SpringBootWebSecurityConfiguration;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.context.annotation.Import;

import star.app.StarAppConfiguration;

@SpringBootApplication
@Import(StarAppConfiguration.class)
public class StarMain implements CommandLineRunner {

	static {
		String tmpDir = "tmp";
		System.setProperty(
				"java.io.tmpdir",
				tmpDir
		);
		new File(tmpDir).mkdirs();
		System.setProperty(
				"org.apache.activemq.default.directory.prefix",
				System.getProperty("org.apache.activemq.default.directory.prefix", "") + "data/"
		);
	}
	
	public static void main(String[] args) {
		System.setProperty(ConfigFileApplicationListener.CONFIG_LOCATION_PROPERTY, "file:./conf/");
		SpringApplication.run(StarMain.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	}

}
