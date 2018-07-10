package lcm.spring.main;

import lcm.spring.action.DaoProxy;
import lcm.spring.imp.MysqlData;
import lcm.spring.imp.OracleData;

/**
 * ��̬���������
 * @author aaaaa
 *
 */
public class Daotest {
	
	public static void main(String[] args) {
		DaoProxy dao = new DaoProxy(new MysqlData());
		dao.getData();
		DaoProxy dao1 = new DaoProxy(new OracleData());
		
		dao1.getData();
	}

}
