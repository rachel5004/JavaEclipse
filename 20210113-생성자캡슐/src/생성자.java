/*
 *   1. �����ڰ� �Ѱ��� �����ϸ� �����Ϸ��� �����ڸ� ��������� �ʴ´� 
 *   ��)
 *       class A
 *       {
 *          // �����Ϸ��� A(){}
 *       }
 *       class A
 *       {
 *          A(){} => ������(����Ʈ ������)
 *       }
 *       class A
 *       {
 *          A(int a){}
 *       }
 *       class A
 *       {
 *          A(int a,int b){}  new A()(X) , new A(10,20)
 *       }
 *       
 *       �޼ҵ� 
 *       void display(int a){}  => display(int)
 *       void display(int b){}  => display(int)
 *       int display(int a,int b){} => display(int,int)
 *       int display(String a){}    => display(String)
 *       
 *       display() => �����߻� 
 *       display(10)
 *       
 *       
 *       ==> class A
 *       
 *           => A(){}       => new A()
 *           => A(int a){}  => new A(10)
 *           => A(int a,int b){} => new A(10,20)
 *           => A(String name){} => new A("Hong")
 *           => A(char a){}      => new A('A')
 *           
 *           => A(double d1,double d2,double d3){}
 *              new A(10.5,10.6,10.7)
 *              d1='A' ==> d1=65.0
 *              d2=10  ==> d2=10.0
 *              d3=10.5F ==> d3=10.5
 *              new A('A',10,10.5F)
 *              
 *              
 *              ���� = �ݵ�� �ʱⰪ
 *       
 */
public class ������ {
  // ������(){}
  // �����ε� : �ߺ��޼ҵ� ���� => ���� �޼ҵ����� ������ ����� ó�� (������)
  // ���ο� ����� �߰��� �߰� (new)
  // �����ڴ� �ʿ�ø��� ���� => �������� ,����Ŭ���� ,���������� 
  int a=10;
  ������(int a){ System.out.println("a="+a); }
	
  ������(char a)
  {
	  System.out.println("a="+a);
	  {
		  int b=10;
	  }
  }
  ������(double d1,double d2,double d3)
  {
	  System.out.println("d1="+d1);
	  System.out.println("d2="+d2);
	  System.out.println("d3="+d3);
  }
  public static void main(String[] args) {
	//������ aa1=new ������();
	������ aa2=new ������('A');// �Ű������� ���� �߰� => ���� ��,���� ��
	������ aa3=new ������('A',10,10.5F);
	������ aa4=new ������('B');
	������ aa5=new ������(67);
	
	// new ������('A');
	// �ʱ�ȭ�� => �ڵ� ȣ�� 
	// int a=10;
	// System.out.println("a="+a);
  }
}








