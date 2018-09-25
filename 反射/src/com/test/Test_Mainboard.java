package com.test;

public class Test_Mainboard {
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mainboard run ....");
	}
	
	public void usePCI(Test_PCI p) {
		p.open();
		p.close();
	}
}
