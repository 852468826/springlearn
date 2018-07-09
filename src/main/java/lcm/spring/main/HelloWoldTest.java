package lcm.spring.main;

import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import lcm.spring.bean.HelloWorld;

public class HelloWoldTest {

	// �˴����뱻static���η����޷�����̬��������
	private static Log logger = LogFactory.getLog(HelloWoldTest.class);

	// mainʵ�ֶ������Է���
	/*
	 * public static void main(String[] args) { HelloWorld hello = new HelloWorld();
	 * hello.setMessage("ddd"); logger.info("3333333333333333ddd");
	 * System.out.println(hello.getMessage());
	 * 
	 * }
	 */

	/**
	 * ͨ��spring����bean���ʶ�������
	 * org.springframework.context.ApplicationContext.class�ýӿڿ����ÿ�����spring������
	 * org.springframework.context.support.FileSystemXmlApplicationContext.class��������ȡspring�����ļ�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// ��ȡbaan�ļ��ַ�ʽ�ɲο�https://www.cnblogs.com/xm1-ybtk/p/5112072.html

		// bean�϶���Է�Ϊ����ļ�
		String[] configLocations = { "config.xml", "config2.xml" };

		ApplicationContext app = new FileSystemXmlApplicationContext(configLocations);
		Object[] arg = new Object[] { "1", "2" };

		System.out.println(app.getMessage("lcm.spring.message1", arg, Locale.US));
		System.out.println(app.getMessage("lcm.spring.message1", arg, Locale.CHINA));
		HelloWorld hello = (HelloWorld) app.getBean("hello");
		System.out.println(hello.getMessage());

		System.out.println(hello.getDate());
		logger.info(hello.getMessage());

		for (String string : hello.getList()) {
			System.out.println(string);
		}
		Set<Entry<String, String>> set = hello.getMap().entrySet();

		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + entry.getValue());
		}

		Set<String> set1 = hello.getSet();
		for (String string : set1) {
			System.out.println(string);
		}
		try {
			hello.destroy1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// bean��ʹ��ͨ��BeanWrapper
		/*
		 * BeanWrapper ben = new BeanWrapperImpl(hello);
		 * System.out.println(ben.getPropertyValue("date"));;
		 */
	}
}
