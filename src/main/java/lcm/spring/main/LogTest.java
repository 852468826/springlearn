package lcm.spring.main;

import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import lcm.spring.event.Log;


public class LogTest {
	private static org.apache.commons.logging.Log log1 =
			LogFactory.getLog(LogTest.class);
	public static void main(String[] args) {
		String[] configLocations = { "config.xml", "config2.xml" };
		
		ApplicationContext app = new FileSystemXmlApplicationContext(configLocations);
		log1.info("log function test");
		Log log = (Log)app.getBean("log");
		
		log.publish("youtube is playing");
		
	}
}
