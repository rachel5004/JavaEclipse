package com.sist.main;
class Student
{
	String name;
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
			return name==((Student)obj).name;
		else
			return false;
	}
	public Student(String name)
	{
		this.name=name;
	}
}
public class MainClass3 {

	public static void main(String[] args) {
        Student s1=new Student("ȫ�浿");
        Student s2=new Student("ȫ�浿");
        
        if(s1==s2)
        	System.out.println("���� �л��Դϴ�");
        else
        	System.out.println("�ٸ� �л��Դϴ�");
        System.out.println("====================");
        if(s1.equals(s2))
        	System.out.println("���� �л��Դϴ�");
        else
        	System.out.println("�ٸ� �л��Դϴ�");
	}

}
