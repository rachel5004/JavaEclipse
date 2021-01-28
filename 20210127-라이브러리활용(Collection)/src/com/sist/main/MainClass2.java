package com.sist.main;
import java.util.*;
class SawonVO{
	private int sabun, pay;
	private String name, dept, job;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public SawonVO(int sabun, int pay, String name, String dept, String job) {
		super();
		this.sabun = sabun;
		this.pay = pay;
		this.name = name;
		this.dept = dept;
		this.job = job;
	}
	
	
}
public class MainClass2 {
	public static void main(String[] args) {
		ArrayList sawonList = new ArrayList();
		sawonList.add(new SawonVO(1, 3600, "홍길동", "개발부", "대리"));
		sawonList.add(new SawonVO(2, 4000, "심청", "총무부", "과장"));
		sawonList.add(new SawonVO(3, 3600, "김두한", "영업부", "실장"));
		sawonList.add(new SawonVO(4, 3000, "이순신", "기획부", "사원"));
		sawonList.add(new SawonVO(5, 7600, "강감찬", "자재부", "이사"));
		
		System.out.println("===========사원관리===========");
		System.out.println("총인원: "+sawonList.size());
//		for(Object o: sawonList) {   // 상위클래스의 메소드만 가져올수 잇는데 Object는 최상위
//			System.out.println("사번: "+o.getSabun);//get, set 사용불가
//		}
		for(int i=0;i<sawonList.size();i++) {
			SawonVO vo = (SawonVO)sawonList.get(i);
			System.out.println("사번: "+vo.getSabun());
			System.out.println("이름: "+vo.getName());
			System.out.println("부서: "+vo.getDept());
			System.out.println("직급: "+vo.getJob());
			System.out.println("연봉: "+vo.getPay());
			System.out.println("========================");
		}
		
		System.out.println("=========수정==========");
		SawonVO vo1 = new SawonVO(6, 3000, "강감찬","개발부", "사원");
		sawonList.set(3, vo1);
		for(int i=0;i<sawonList.size();i++) {
			SawonVO vo = (SawonVO)sawonList.get(i);
			System.out.println("사번: "+vo.getSabun());
			System.out.println("이름: "+vo.getName());
			System.out.println("부서: "+vo.getDept());
			System.out.println("직급: "+vo.getJob());
			System.out.println("연봉: "+vo.getPay());
			System.out.println("========================");
		}
		
		System.out.println("=========삭제==========");
		sawonList.remove(2);
		for(int i=0;i<sawonList.size();i++) {
			SawonVO vo = (SawonVO)sawonList.get(i);
			System.out.println("사번: "+vo.getSabun());
			System.out.println("이름: "+vo.getName());
			System.out.println("부서: "+vo.getDept());
			System.out.println("직급: "+vo.getJob());
			System.out.println("연봉: "+vo.getPay());
			System.out.println("========================");
		}
		System.out.println("=========전체==========");
		sawonList.clear();
		
		System.out.println("인원: "+sawonList.size());
	}

}
