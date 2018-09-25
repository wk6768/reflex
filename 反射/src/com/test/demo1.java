package com.test;

import java.lang.reflect.Constructor;

public class demo1 {
	public static void main(String[] args) throws Exception {
		createNewObj();
		createNewObj_2();
	}
	/*
	 * 获取字节码文件中的构造函数
	 * */

	public static void createNewObj_2() throws Exception {
		// TODO Auto-generated method stub
//		com.bean.Person p = new com.bean.Person(39,"小强");

		/*
		 * 当获取指定名称的类所体现的对象时,而该对象初始化不使用空参构造函数该怎么办? 
		 * 既然是用过指定的构造函数进行对象的初始化,所以应该先获取该构造函数.
		 * 通过字节码文件对象即可完成
		 * 该方法是getConstructors()可以拿到所有公有的构造函数,getDeclaredConstructors()获取所有构造方法
		 */
		String name = "com.bean.Person";
		Class clazz = Class.forName(name);
		//获得指定构造函数对象
		Constructor constructor = clazz.getConstructor(int.class,String.class);//获得构造器的对象
		//通过构造器对象的newInstance方法进行对象的初始化
		Object obj = constructor.newInstance(39,"小强");
		
	}

	public static void createNewObj() throws Exception {
		/*
		 * 早期:new的时候,先根据被new的类的名称寻找该类的字节码文件,并加载进内存 并创建该字节码文件对象,并接着创建该字节码文件的对应的person对象
		 */
//		com.bean.Person p = new com.bean.Person();

//		现在:
		String name = "com.bean.Person";
		// 找寻该名称类文件,并加载进内存,并产生Class对象
		Class clazz = Class.forName(name);
		// 如何产生该类的对象?
		Object obj = clazz.newInstance();// 这个方法就是调用class里面的空参构造函数

	}
}
