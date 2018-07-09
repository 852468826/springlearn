package lcm.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class LogListener implements ApplicationListener {
	
	/**
	 *实现了事件监听
	 */
	public void onApplicationEvent(ApplicationEvent event) {
		
		if (event instanceof LogEvent) 
		{
			System.out.println("this is listener"+event.getSource());
		}
		else 
		{
			System.out.println("this is not");
		}
		

	}

}
