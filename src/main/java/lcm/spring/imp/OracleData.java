package lcm.spring.imp;

import lcm.spring.action.Idao;

/**
 * oracle获取数据类
 * @author aaaaa
 *
 */
public class OracleData implements Idao {

	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private String username;
	
	private String pwd;
	
	public void getData() {
		System.out.println("oracle");
		
	}

}
