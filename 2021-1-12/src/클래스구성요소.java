
/*
 *    Ŭ���� 
 *     1) ������� 
 *        = ���� 
 *          ������� : Ŭ������ ������ �ִ� ���� : new�� ����ϸ� ���� �����Ǵ� �޸� ����  
 *          class A
 *          {
 *             ============== �ڵ� �ʱ�ȭ 
 *              String name; name=null
 *              int age;     age=0
 *             ==============
 *               int = 0
 *               double = 0.0
 *               float = 0.0F
 *               boolean = false
 *               String = null
 *          }
 *          �������� : Ŭ�������� �������� ���Ǵ� ���� : 1���� ���� 
 *          class A
 *          {
 *             ====================
 *             static String dept;
 *             ====================
 *          }
 *          �������� : �޼ҵ�ȿ��� ���� 
 *          class A
 *          {
 *              void display()
 *              {
 *                  ==========
 *                  int a=10; ===> ���������� �ݵ�� �ʱ�ȭ�� �Ѵ� 
 *                  ==========  display()�� �����ϸ� ������� ���� 
 *              }
 *          }
 *          
 *          �ڵ� ���� 
 *          =======
 *           class 
 *           {
 *              ���� ���� = ���� ���� , �޼ҵ� ���� => ������ �� �� ���� (�޼ҵ� ȣ��,����ó��,���(X))
 *           }
 *           method()
 *           {
 *               ����(��������) , �޼ҵ� ȣ�� ,����ó�� , ���
 *           }
 *           ==> ����� ��û => ó�� (����)
 *           ���α׷� : ����(�ʿ��� ������ ����) + ������ ó��(�б�,����,����ó��,���)
 *           
 *        = �޼ҵ� : ��� ó�� 
 *                 ��) ���Ǳ� 
 *                    ======
 *                    ����,���� ==> ���� 
 *                    ����� 
 *                    =======
 *                    ��� => ������ ÷��
 *                           ��ư�� Ŭ�� 
 *                           �ܵ��� ��� 
 *                           
 *                    Ŭ���� => ����� + ������
 *                            =====   =====
 *                             ����     �޼ҵ� 
 *          ����)
 *               = �޼ҵ�� �׻� Ŭ���� {}�ȿ� ���� 
 *                 ===== Ŭ���� ����
 *               class A
 *               {
 *                  �޼ҵ�1(){}
 *                  �޼ҵ�2(){}
 *                  �޼ҵ�3(){}
 *                  �޼ҵ�4(){}
 *                  �޼ҵ�5(){}
 *                  // ���� => ���� �޼ҵ� => main ���α׷��ȿ��� �ݵ�� main�� 1���̻� ���� 
 *               }
 *               
 *               �޼ҵ��� ���� ��� 
 *               ==============
 *               1. ������(��ȯ��)
 *               2. �޼ҵ�� 
 *               3. �Ű����� 
 *               
 *               => 1. ����ڰ� �Է��� �����͸� �޾Ƽ� => id,pwd
 *                  2. ��û ó��  => loginó�� {}
 *                  3. ������� ���� => true/false
 *                  
 *               ����)
 *                                    �޼ҵ�=> �ٸ�Ŭ������ �����Ҷ� �ַ� ��� (�ǹ̸� �ο�)=> ����
 *                                    =======
 *                    ������(��������)    �޼ҵ�� (�Ű�����...: ����ڷκ��� �޴� ��)
 *                    ============
 *                    �⺻��������
 *                     = ����(int,long,byte,short)
 *                     = �Ǽ�(float,double)
 *                     = ��(boolean)
 *                     = ����(char)
 *                    ������������(�����Ͱ� �������� ���) 
 *                     = �迭 : ������ 
 *                     = Ŭ���� : �󼼺��� 
 *                     
 *                = ������ (O) , �Ű�����(O) => �󼼺��� 
 *                = ������ (O) , �Ű�����(X) => ��� ��� 
 *                =============================================
 *                = ������ (X) , �Ű�����(O)
 *                = ������ (X) , �Ű�����(X) => ���� ������� �ʴ´� 
 *                =============================================
 *                �ݵ�� void��� ����Ѵ� ==> �����ͺ��̽� (����,����,�߰�)
 *                
 *                = ����޼ҵ� => ������ �޼ҵ��(�Ű�����...) => new�� �̿��ؼ� ���� 
 *                = �����޼ҵ� => static ������ �޼ҵ��(�Ű�����...) : �ڵ����� ���� 
 *                              �������� ��ȯ 
 *                              String.valueOf()
 *                              String s="Hello";
 *                              s.substring()
 *                              String s1="Java"
 *                              
 *                              String s="Hello Java!!";
 *                              s.substring(0,2)
 *                              String s1="Oracle Hello!!";
 *                              
 *                              String.valueOf(10)  => "10"
 *                              String.valueOf(true) => "true"
 *                              
 *                              Math.random()
 *                              
 *               
 *        = ������ 
 *        
 *        ���� : ��ġ ==> static 
 *        ���� : �ٸ��� ==> �ν��Ͻ� �޼ҵ� 
 */
/*
 *    �л� ���� ��� 
 *    ����Ǵ� ������ 
 *    ����
 *    ����
 *    ��� 
 *    ���� �Է� 
 */
import java.util.Scanner;

/*
 *   static�� ����޼ҵ� �ƴ϶� => �������� �޼ҵ� 
 */
public class Ŭ����������� {
	String name;
	int kor, eng, math; // ����� ������� ����� ����

	int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + " ���� �Է�:");
		return sc.nextInt();
	}

	void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է�:");
		kor = sc.nextInt();
		System.out.print("���� ���� �Է�:");
		eng = sc.nextInt();
		System.out.print("���� ���� �Է�:");
		math = sc.nextInt();
	}

	int jumsuTotal() {
		return kor + eng + math;
	}
	double jumsuAvg() {
		return (kor + eng + math) / 3.0;
	}

	public static void main(String[] args) {
		Ŭ����������� hong = new Ŭ�����������();
		Ŭ����������� shim = new Ŭ�����������();
		Ŭ����������� kim = new Ŭ�����������();
		// hong.kor=hong.input("����");
		// hong.eng=hong.input("����");
		// hong.math=hong.input("����");
		hong.input2();
		int total = hong.jumsuTotal();
		double avg = hong.jumsuAvg();

		shim.input2();
		kim.input2();

		
		System.out.println("��������:" + hong.kor);
		System.out.println("��������:" + hong.eng);
		System.out.println("��������:" + hong.math);
		System.out.println("����:" + total);
		System.out.printf("���:%.2f", avg);
	}
}
