package lcm.spring.main;


import com.spring.proxy.LogBusiness1;
import com.spring.proxy.LogRecordProxy;

public class LogRecordTest {

	//��־�������
	public static void main(String[] args) {
		LogRecordProxy log = new LogRecordProxy(new LogBusiness1());
		log.business("111");
	}
}
