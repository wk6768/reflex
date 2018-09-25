package com.bean;

public class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		System.out.println("id="+id+" "+"name="+name);
	}

	public Person() {
		super();
		System.out.println("Person run");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	public void sayHi() {
		System.out.println("Hi!");
	}
	
	public void echo(String str) {
		System.out.println("echo:"+str);
	}
	
	private void sayShit() {
		System.out.println("shit!");
	}
}
