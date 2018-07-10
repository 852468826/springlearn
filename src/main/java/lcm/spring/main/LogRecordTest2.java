package lcm.spring.main;

import com.spring.proxy.ILogBusiness;
import com.spring.proxy.LogBusiness1;
import com.spring.proxy.LogBussine;
import com.spring.proxy.LogRecordProxy2;

public class LogRecordTest2 {

	public static void main(String[] args) {
		LogRecordProxy2 log2 = new LogRecordProxy2();
		ILogBusiness ilog = (ILogBusiness) log2.bind(new LogBussine());
		ilog.business("jjjjj");
		
		ILogBusiness ilog1 = (ILogBusiness) log2.bind(new LogBusiness1());
		ilog1.business("ggggggggg");
	}
}
