package com.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 
 * 
 *
 * 有通用的方式java.lang.reflect.InvocationHandler
 * 日志记录代理，目的是不让每个程序都写private static Log log =
 * LogFactory.getLog(LogRecordProxy2.class);
 * 
 * @author aaaaa
 *
 */
public class LogRecordProxy2 implements InvocationHandler {

	//详细使用参考https://blog.csdn.net/backbug/article/details/78655664
	private final static Log log = LogFactory.getLog(LogRecordProxy2.class);

	private Object ob;
	
	//代理绑定
	public Object bind(Object ob1) 
	{
		this.setOb(ob1);
		
		return Proxy.newProxyInstance(ob1.getClass().getClassLoader(), ob1.getClass().getInterfaces(), this);
	}
	//实现方法
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//执行业务方法
		Object result = method.invoke(ob, args);
		
		//记录日志
		log.info(args[0]);
		return result;
	}

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

}
