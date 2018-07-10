package com.spring.proxy;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 *面向接口编程
 *
 *缺点：要实现固定的接口，有通用的方式java.lang.reflect.InvocationHandler
 * 日志记录代理，目的是不让每个程序都写private static Log log = LogFactory.getLog(LogRecordProxy.class);
 * @author aaaaa
 *
 */
public class LogRecordProxy{
	public LogRecordProxy(ILogBusiness ilog) {
		super();
		this.ilog = ilog;
	}


	private static Log log = LogFactory.getLog(LogRecordProxy.class);
	
	private ILogBusiness ilog;//面向接口编程
	
	//代理完成业务逻辑的处理,并记录日志
	public void business(Object ob) {
		
		//业务逻辑的处理
		ilog.business(ob);
		
		//日志的记录
		log.info(ob);;
	}


	public ILogBusiness getIlog() {
		return ilog;
	}


	public void setIlog(ILogBusiness ilog) {
		this.ilog = ilog;
	}
	
	
	
}
