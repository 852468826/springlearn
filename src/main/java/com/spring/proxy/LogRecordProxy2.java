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
 * ��ͨ�õķ�ʽjava.lang.reflect.InvocationHandler
 * ��־��¼����Ŀ���ǲ���ÿ������дprivate static Log log =
 * LogFactory.getLog(LogRecordProxy2.class);
 * 
 * @author aaaaa
 *
 */
public class LogRecordProxy2 implements InvocationHandler {

	//��ϸʹ�òο�https://blog.csdn.net/backbug/article/details/78655664
	private final static Log log = LogFactory.getLog(LogRecordProxy2.class);

	private Object ob;
	
	//�����
	public Object bind(Object ob1) 
	{
		this.setOb(ob1);
		
		return Proxy.newProxyInstance(ob1.getClass().getClassLoader(), ob1.getClass().getInterfaces(), this);
	}
	//ʵ�ַ���
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//ִ��ҵ�񷽷�
		Object result = method.invoke(ob, args);
		
		//��¼��־
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
