package lcm.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import lcm.spring.event.Log;


public class LogTest {
	
	public static void main(String[] args) {
		String[] configLocations = { "config.xml", "config2.xml" };

		ApplicationContext app = new FileSystemXmlApplicationContext(configLocations);
		
		Log log = (Log)app.getBean("log");
		
		log.publish("youtube is playing");
		
	}
}
