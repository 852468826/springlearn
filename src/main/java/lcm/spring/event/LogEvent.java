package lcm.spring.event;

import org.springframework.context.ApplicationEvent;


public class LogEvent extends ApplicationEvent {

	public LogEvent(Object source) {
		super(source);
		
	}

	private static final long serialVersionUID = 1L;
	
	

}
