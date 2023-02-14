package com.sist.myapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.DeptDAO;
import com.sist.dao.DeptVO;
import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		EmpDAO edao=(EmpDAO)app.getBean("eDao");
		List<EmpVO> eList=edao.empListData();
		for(EmpVO vo:eList) {
			System.out.println(vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob());
		}
		System.out.println("=================================");
		DeptDAO ddao=(DeptDAO)app.getBean("dDao");
		List<DeptVO> dList=ddao.deptListData();
		for(DeptVO vo:dList) {
			System.out.println(vo.getDeptno()+" "
					+vo.getDname()+" "
					+vo.getLoc());
		}
	}

}
