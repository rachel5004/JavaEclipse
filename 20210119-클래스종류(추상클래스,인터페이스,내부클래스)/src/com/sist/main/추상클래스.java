package com.sist.main;
//page 375
/*
*    �߻� Ŭ���� 
*    1. ����
*       ����������  Ÿ��  class  className{}
*       ======== ====(final|abstract)
*       public|default
*       
*       public abstract class className
*       {
*           ==============
*             ���� 
*              = ������� (instance)
*              = ���뺯�� (static)
*           ==============
*             �޼ҵ�
*              =========== �Դ´� (��,��,����,���...)
*              = ������ �޼ҵ� 
*                 ��ǻ�� / ��Ʈ�� / �ڵ��� ==> �Ŀ��� Ŭ�� (�ʿ��ϸ� �������̵�)
*                 public ������ �޼ҵ�(�Ű�����..) => �����
*                 {
*                    ������ 
*                 }
*              = ����� �޼ҵ� ==> ������ �ȵ� ���� 
*                 ����� ���� => ������ �ٸ��� 
*                 public (abstract) ������ �޼ҵ�(�Ű�����); => �ϼ��� �ȵ� => ����� �޾Ƽ� �ϼ� 
*           ==============
*           ==============
*           
*       }
*       Ư¡ 
*       ====
*        1) �ڽ��� �޸��Ҵ��� �� �� ���� (�̿ϼ��� Ŭ����) => new�� ����� �� ����
*           abstract class A
*           A a=new A(); (X)
*        2) ����� ���� Ŭ�������� �̿ϼ� �޼ҵ带 �����ؼ� ��� 
*        3) �߻� Ŭ������ ����
*           ========= ����,���� , ������ 
*        4) ���������� ������ �Ǵ� ��ɸ� ���� 
*           �Խ��� (�۾���,����,����,���뺸��,ã��)
*             = �ϹݰԽ���
*             = ����� �Խ���
*             = �������Խ���
*             = ������ϱ�
*             = �ڷ�� 
*    2. ���ó 
*        = �䱸���� �м� (��ŷ) => ������ ���� 
*          �Ƿ� => �䱸���� �м� => �ʿ��� ������ ���� => UI => ���� => �׽���
*                 ==========    ==============    ===   ====   =====
*                   ��Ű����          DBA          �ۺ���  �����α׷��� �׽���  
*        = ����� ���� => �������°� �������� 
*          ========= ���α׷��� �°� �����ؼ� ��� 
*          ========= �������� ���� Ŭ������ ��Ƽ� ó�� (Ŭ������ ��Ƽ� �Ѱ��� �̸����� ����)
*          ========= ǥ��ȭ�� �ȴ� (���̺귯��)
*/
//�߻�Ŭ������ ��� => ���� ��Ӹ� ���� 
abstract class print {
	public abstract void list(); 
	public abstract void detail(); 
	public void reserve() {
		System.out.println("���� ����");
	}
}
class movie extends print{

	@Override
	public void list() {
		System.out.println("��ȭ ������");
	}

	@Override
	public void detail() {
		System.out.println("��ȭ ���� ������");
	}
	
	
}
class food extends print{

	@Override
	public void list() {
		System.out.println("���� ���̺�");
	}

	@Override
	public void detail() {
		System.out.println("���� ������ �޴� ���");
	}
	
	
}
class travel extends print{

	@Override
	public void list() {
		System.out.println("������ ���� ���̺����·� ���");
	}

	@Override
	public void detail() {
		System.out.println("�ð� ���");
	}
	public void reserve() {        // �߻��� �ƴ� ���� �ʿ��ϸ� �������̵� ����
		System.out.println("�װ� �ð� ����");
	}
	
}

public class �߻�Ŭ���� {
	public static void main(String[] args) {
		print p = new movie();   // �߻�Ŭ���� ������ ������ �ڼ�Ŭ������ ȣ��
		p.list();
		p.detail();
		p.reserve();
		// ���� �ٸ� Ŭ������ �����ؼ� ����� ���� 
		p = new food();
		p.list();
		p.detail();
		p.reserve();
		
		p = new travel();
		p.list();
		p.detail();
		p.reserve();
	}

}