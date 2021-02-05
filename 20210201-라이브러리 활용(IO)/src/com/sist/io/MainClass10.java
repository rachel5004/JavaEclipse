package com.sist.io;
import java.io.*;
import java.util.*;

// 직렬화  => ObjectOutputStream
// 역직렬화   => ObjectInputStream
class Sawon implements Serializable{
	private int sabun;
	transient private int pay; // 저장 제외
	private String name, dept, loc;
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Sawon(int sabun, int pay, String name, String dept, String loc) {
		this.sabun = sabun;
		this.pay = pay;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
	}
	
}
public class MainClass10 {
	public static void main(String[] args) {
		
		try {
			ArrayList<Sawon> list = new ArrayList<Sawon>();
			list.add(new Sawon(1,3000,"홍길동","개발부","서울"));
			list.add(new Sawon(2,3600,"심청","자재부","부산"));
			list.add(new Sawon(3,3100,"김두한","총무부","경기"));
			list.add(new Sawon(4,3200,"강감찬","기획부","강원"));
			list.add(new Sawon(5,3800,"춘향","영업부","제주"));
			
			for(Sawon s:list) {
				System.out.println("이름: "+s.getName());
				System.out.println("부서: "+s.getDept());
				System.out.println("근무지: "+s.getLoc());
				System.out.println("연봉: "+s.getPay());
				System.out.println("====================");
				
			}
			File file = new File("c:\\download\\sawon.txt");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			
		}catch(Exception e) {}
		
	}
}
