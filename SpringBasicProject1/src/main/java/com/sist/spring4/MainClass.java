package com.sist.spring4;

public class MainClass {
	public static void main(String[] args) {
		String path="C:\\springDev\\springStudy\\SpringBasicProject1\\src\\main\\java\\com\\sist\\spring4\\app.xml";
		ApplicationCotext app=new ClassPathXMLApplicationContext(path);
		AModel a=(AModel)app.getBean("a");
		a.display();
		
		BModel b=(BModel)app.getBean("b");
		b.display();
	}
}
