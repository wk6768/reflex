package com.test;

import java.io.FileInputStream;
import java.util.Properties;


public class Test_Reflect_Main {
	public static void main(String[] args) throws Exception {
		Test_Mainboard mb = new Test_Mainboard();
		mb.run();
		//每次添加一个设备都要修改代码
//		mb.useSoundCard(new Test_SoundCard());
		
		
		//创建一个properties对象
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("pci.properties");
		//加载properties文件
		prop.load(fis);
		//遍历
		for(int i = 0;i<prop.size();i++) {
			String pci_name = prop.getProperty("pci"+i);
			Class clazz = Class.forName(pci_name);
			Test_PCI obj = (Test_PCI) clazz.newInstance();
			mb.usePCI(obj);
		}
	}
}
