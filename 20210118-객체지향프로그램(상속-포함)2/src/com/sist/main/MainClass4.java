package com.sist.main;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	/*
	 *   Object(�޼ҵ� : clone,equals,finalize(),hashCode,toString) 
	 *     |
	 *   Sawon 
	 */
	// ������
	public Sawon(int sabun,String name,String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	
	public String toString()
	{
		return "���:"+sabun+",�̸�:"+name+",�μ�:"+dept;
	}
}
/*
 *    Object 
 *      |
 *    Human => clone,equals,finalize(),hashCode,toString
 *    
 *    
 *    Object 
 *      |
 *    �Խ��� 
 *    
 *    �Խ���       �Խ���      �Խ���      �Խ���   ==> ����Ŭ������ ��� Ŭ������ ������ �� �ִ� 
 *      |          |         |           |        ======== �޼ҵ带 �ݵ�� ������(�������̵�)
 *    ��۰Խ���   �������Խ���  �亯���Խ���   �ڷ�� 
 *    (����߰�)    (�̹����߰�)  (�亯)     (���ε�/�ٿ�ε�)
 */
class Human
{
	private String name;
	private String sex;
	public Human(String name,String sex)
	{
		this.name=name;
		this.sex=sex;
	}
	/*
	 *    ��� => �޼ҵ带 ���Ǹ� ���� (�������̵�)
	 *    ==================================
	 *    
	 *    class A extends Object
	 *    {
	 *    }
	 *    class B extends A  => A,Object
	 */
    public String toString()
	{
    	
		return "�̸�:"+name+",����:"+sex;
	}
	/*
	 * public void toString(int a) {
	 * 
	 * }
	 */
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Sawon s=new Sawon(1, "ȫ�浿", "���ߺ�");
        String res=s.toString();
        System.out.println(res);
        Human h=new Human("��û��", "����");
        res=h.toString();
        System.out.println(res);*/
		Object o=new Sawon(1, "ȫ�浿", "���ߺ�");
		String res=o.toString();
		System.out.println(res);
		
		o=new Human("��û��", "����");
		res=o.toString();
		System.out.println(res);
        
	}

}






