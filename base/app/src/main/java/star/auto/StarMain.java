package star.auto;

import java.io.File;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SpringBootWebSecurityConfiguration;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.context.annotation.Import;

import com.google.common.base.Throwables;

import ch.qos.logback.core.util.FileUtil;
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
		File tmpDirFile = new File(tmpDir);
		tmpDirFile.mkdirs();
		try {
			FileUtils.cleanDirectory(tmpDirFile);
		} catch (Exception e) {
			throw Throwables.propagate(e);
		}
		
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
