package com.spring.proxy;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 *����ӿڱ��
 *
 *ȱ�㣺Ҫʵ�̶ֹ��Ľӿڣ���ͨ�õķ�ʽjava.lang.reflect.InvocationHandler
 * ��־��¼����Ŀ���ǲ���ÿ������дprivate static Log log = LogFactory.getLog(LogRecordProxy.class);
 * @author aaaaa
 *
 */
public class LogRecordProxy{
	public LogRecordProxy(ILogBusiness ilog) {
		super();
		this.ilog = ilog;
	}


	private static Log log = LogFactory.getLog(LogRecordProxy.class);
	
	private ILogBusiness ilog;//����ӿڱ��
	
	//�������ҵ���߼��Ĵ���,����¼��־
	public void business(Object ob) {
		
		//ҵ���߼��Ĵ���
		ilog.business(ob);
		
		//��־�ļ�¼
		log.info(ob);;
	}


	public ILogBusiness getIlog() {
		return ilog;
	}


	public void setIlog(ILogBusiness ilog) {
		this.ilog = ilog;
	}
	
	
	
}
