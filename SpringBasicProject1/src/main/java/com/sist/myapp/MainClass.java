package com.sist.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//XML,Container 호출
//DL => 객체생성/객체소멸/객체 찾기 ==> getBean()
//DI => 객체를 생성할때 필요한 데이터가 있다면
// XML은 메뉴얼, Annotation은 검색
/*
 * 	MVC(라이브러리), 클래스 관리자(결합성을 낮추는)
 */
public class MainClass {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		//ClassPath => src/main/java
		AModel a=(AModel)app.getBean("a");
		a.display();
		System.out.println("a="+a);
		AModel b=(AModel)app.getBean("a");
		b.display();
		System.out.println("b="+b);
	}
}
