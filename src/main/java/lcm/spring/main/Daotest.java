package lcm.spring.main;

import lcm.spring.action.Dao;
import lcm.spring.imp.MysqlData;
import lcm.spring.imp.OracleData;

/**
 * 动态代理测试类
 * @author aaaaa
 *
 */
public class Daotest {
	
	public static void main(String[] args) {
		Dao dao = new Dao(new MysqlData());
		dao.getData();
		Dao dao1 = new Dao(new OracleData());
		
		dao1.getData();
	}

}
