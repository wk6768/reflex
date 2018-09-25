package com.test;

import java.lang.reflect.Field;

public class demo2 {
	public static void main(String[] args) throws Exception {
		getFieldDemo();
	}
	/*
	 * 获取字节码文件中的字段(属性)
	 * */
	public static void getFieldDemo() throws Exception {
		String name = "com.bean.Person";
		Class clazz = Class.forName(name);
//		Field field = clazz.getField("id");//只能拿公有的
		Field field = clazz.getDeclaredField("id");//获取本类所有属性
		
		System.out.println(field);
		//获得属性之前要现获得对象
		Object obj = clazz.newInstance();
		
		//对私有字段的访问取消权限检查
		field.setAccessible(true);
		
		field.set(obj, 67);
		
		Object o = field.get(obj);
		System.out.println(o);
	}
}
