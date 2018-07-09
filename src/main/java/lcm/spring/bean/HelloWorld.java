/**
 * 
 */
package lcm.spring.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author aaaaa
 *
 */
public class HelloWorld {
	
	
	private Date date;
	
	private List<String> list;
	
	private Set<String> set;
	private Map<String, String> map;
	/*public HelloWorld(Date date) {
		super();
		this.date = date;
	}

	public HelloWorld() {
		super();
	}

	public HelloWorld(String message,Date date) {
		super();
		this.date = date;
		this.message = message;
	}

	public HelloWorld(String message) {
		super();
		this.message = message;
	}*/

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	private String message;
	
	public void init() 
	{
		this.date=new Date();
		this.message= "springtest";
		System.out.println("dddd");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * 通过实现initializingbean接口完成属性初始化
	 */
	public void afterPropertiesSet() throws Exception {
		
		this.message = "hellowrld";
		this.date = new Date();
		System.out.println("初始化完成！~"+this.getMessage()+this.getDate());
	}

	public void destroy1() throws Exception {
		this.message = "";
		this.date = null;
		System.out.println("销毁完成！~"+this.getMessage()+this.getDate());
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}
}
