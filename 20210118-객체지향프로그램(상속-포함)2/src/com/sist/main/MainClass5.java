package com.sist.main;
/*
 *    ������ (page 344)
 *    ================
 *    ���� ������ : public , protected , default , private 
 *    Ŭ���� 
 *    =====
 *      Ŭ���� : public , default 
 *      ������� : public , protected , default , private 
 *      ===============================================
 *      �޼ҵ� : public , protected , default , private 
 *      ������ : public , protected , default , private 
 *      ============================================== �ٸ� Ŭ������ ���� => public 
 *      
 *    final , static , abstract , synchronized
 *    =====
 *    ������ => ����� �� �� ���� Ŭ���� , ���
 *    static : �������� 
 *    abstract : �߻����� => ���� ���� �ʰ� ��� 
 *    synchronized : ����ȭ,�񵿱�ȭ 
 *                   =====
 *                   �޼ҵ�� �⺻������ ����ȭ 
 *                   
 *    class A
 *    {
 *        public void aaa(){}
 *        public void bbb(){}
 *        public void ccc(){}
 *        public void ddd(){���ѷ���}
 *        public void eee(){}
 *    }
 *    class B
 *    {
 *        public static void main(String[] args)
 *        {
 *            A a=new A();
 *            a.aaa();
 *            a.bbb();
 *            a.ccc();
 *            a.ddd();
 *            a.eee();
 *        }
 *    }
 *    
 *    =====================
 *    
 *    =====================
 *        eee()
 *    =====================
 *        ddd()
 *    =====================
 *        ccc()
 *    =====================
 *        bbb()
 *    =====================
 *        aaa()   => ����    
 *    =====================
 *       Call Stack
 *       
 *       =========  ========  =========  =-=======   =======
 *          aaa()    bbb()      ccc()      ddd()      eee()   ==> ������ 
 *       =========  ========  =========  =========   =======
 *       
 *       
 *       ����� (page 353)
 *       Ŭ���� 
 *       ���������� �ɼ�   class  className
 *                [final,abstract]
 *       [public,default]
 *       
 *       public final class String
 *       public abstract class String
 *       final class String
 *       abstract class String
 *       =============================
 *       
 *       �޼ҵ� 
 *       ���������� �ɼ� ������ �޼ҵ��()
 *       ======= === [final|abstract|static]
 *       [public|private|default|protected]
 *       
 *       ������� 
 *       ���������� �ɼ� �������� ������ 
 *       ======= ===[final | static]
 *       [public|private|default|protected]
 *       
 *       => ���������� �ɼ� 
 *          public static
 *       => �ɼ� ���������� 
 *          static public 
 */
class Student
{
	private int hakbun;
	public String name;
	protected String sex;
	int kor=100;
	public void aaa() {
		final int a=10;
		// only final 
	}
	private void bbb() {
		
	}
	void ccc() {}
	protected void ddd() {}
	
	public Student() {}
	private Student(int a) {}
	Student(int a,int b){}
	protected Student(int a,int b,int c) {}
}
class Student2 extends Student{
	int kor=200;
	public Student2()
	{
		//this.kor=200;
		//super.kor=300;
		this.kor=10000;
		super.kor=20000;
		System.out.println("super.kor:"+super.kor);
		System.out.println("this.kor:"+this.kor);
	}
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student();
        Object o=new Student();
        Student s1=(Student)o;
        System.out.println(s1.kor=100);
        s=new Student2();
        Student2 s2=(Student2)s;
        System.out.println(s2.kor=1000);
        /*Student2 s2=new Student2();
        s2=(Student2)s;
        s2.kor=1000;
        System.out.println(s2.kor);*/
	}

}



