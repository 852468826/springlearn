package lcm.spring.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * ApplicationContextAware为在创建bean时给applicationcontext赋值
 * @author aaaaa
 *
 */
public class Log implements ApplicationContextAware {

	private ApplicationContext app;
	
	/**
	 * 实现上下文赋值
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.app = applicationContext;
		
	}
	public int publish(Object source) 
	{
		
		LogEvent log = new LogEvent(source);
		app.publishEvent(log);
		return 0;
	}

}
