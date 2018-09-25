package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class demo3 {
	public static void main(String[] args) throws Exception {
		//getMethodDemo();
//		getMethod01();
		getMethod02();
	}
	public static void getMethod01() throws Exception {
		// TODO Auto-generated method stub
		String name = "com.bean.Person";
		Class clazz = Class.forName(name);
		Method method = clazz.getMethod("sayHi", null);//获取空参数一般方法
//		Object obj = clazz.newInstance();//使用不带参数构造方法
//		method.invoke(obj, null);//
		
		
		
		Constructor constructor = clazz.getConstructor(int.class,String.class);//使用带参数构造方法
		Object obj = constructor.newInstance(12,"xiaoming");
		method.invoke(obj, null);
	}
	
	
	public static void getMethod02() throws Exception {
		// TODO Auto-generated method stub
		String name = "com.bean.Person";
		Class clazz = Class.forName(name);
		Method method = clazz.getMethod("echo", String.class);
		Object obj = clazz.newInstance();
		method.invoke(obj, "小强");
		
	}
	/*
	 * 获取字节码文件中的函数
	 * */
	public static void getMethodDemo() throws Exception {
		String name = "com.bean.Person";
		Class clazz = Class.forName(name);
//		Method[] methods = clazz.getMethods();//获取公有方法
		Method[] methods = clazz.getDeclaredMethods();//获取本类所有方法
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}
