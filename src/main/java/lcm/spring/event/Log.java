package lcm.spring.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * ApplicationContextAwareΪ�ڴ���beanʱ��applicationcontext��ֵ
 * @author aaaaa
 *
 */
public class Log implements ApplicationContextAware {

	private ApplicationContext app;
	
	/**
	 * ʵ�������ĸ�ֵ
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
