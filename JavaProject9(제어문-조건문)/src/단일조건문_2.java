// ���� ���� �� ����
/*
 *   ����� �Է� : 0(����),1(����),2(��)
 *   ��ǻ�� �Է� : ���� (0,1,2)
 *   ==============================
 *   ��� : ��ø if
 *   if()
 *   {
 *     if()
 *     {
 *     }
 *   }
 *   
 *   ��ǻ�� ==> �˰��� (3)
 *     ����
 *       ����� 
 *       ����
 *       ���� 
 *       ��
 *     ����
 *       ����� 
 *       ����
 *       ���� 
 *       ��
 *     ��
 *       ����� 
 *       ����
 *       ���� 
 *       ��
 */
import java.util.Scanner;// �Է��� �޴� ��쿡 ����ϴ� Ŭ���� (����)
public class �������ǹ�_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����ڰ� �Է��� ���� �޴´� (0,1,2)
		int user; // �Է��� �Է°��� �����ϴ� ���� 
		// ����ڰ� �Է��� �� �� �ְ� ó�� 
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0),����(1),��(2) �Է�:");
		user=scan.nextInt();
		// Ȯ�� => ����ڰ� �� �´��� 
		if(user==0)// ����ڰ� �Է��� ���� 0�̸� 
			System.out.println("�����:����");
		if(user==1)
			System.out.println("�����:����");
		if(user==2)
			System.out.println("�����:��");
		
		////// ��ǻ�� (����)
		int com=(int)(Math.random()*3); // 0,1,2
		/*
		 *     Math.random() ==> 0.0~0.99
		 *     Math.random()*3 ==> 0.0~2.9...
		 *     (int)=>0.0~2.9..==> 0~2
		 */
		if(com==0)
			System.out.println("��ǻ��:����");
		if(com==1)
			System.out.println("��ǻ��:����");
		if(com==2)
			System.out.println("��ǻ��:��");
		
		/// ������� ��� 
		System.out.println("******���******");
		/*
		 *                           com-user
		 *      ��ǻ�� (���� 0)
		 *         ����� (���� 0)        0 ���� 
		 *               (���� 1)      -1  ����� 
		 *               (�� 2)       -2   ��ǻ��
		 *      ��ǻ�� (���� 1)
		 *         ����� (���� 0)       1    ��ǻ��
		 *               (���� 1)       0    ����
		 *               (�� 2)        -1   �����
		 *      ��ǻ�� (�� 2)
		 *         ����� (���� 0)       2     �����
		 *               (���� 1)       1    ��ǻ��
		 *               (�� 2)        0     ���� 
		 *               
		 *               ==> ����ڰ� Win ==> -1,2
		 *                   ��ǻ�Ͱ� Win ==> -2,1
		 */
		/*//  ����      ����
		if(com==0 && user==0)
			System.out.println("����!!");
		//  ����       ����
		if(com==0 && user==1)
			System.out.println("����� Win!!");
		// ����       ��
		if(com==0 && user==2)
			System.out.println("��ǻ�� Win!!");
		
		//  ����        ����
		if(com==1 && user==0)
			System.out.println("��ǻ�� Win!!");
		//  ����       ����
		if(com==1 && user==1)
			System.out.println("����!!");
		// ����       ��
		if(com==1 && user==2)
			System.out.println("����� Win!!");
		
	        //  ��        ����
			if(com==2 && user==0)
				System.out.println("����� Win!!");
			//  ��       ����
			if(com==2 && user==1)
				System.out.println("��ǻ�� Win!!");
			// ��       ��
			if(com==2 && user==2)
				System.out.println("����!!");*/
		/*
		 *   ==> ����ڰ� Win ==> -1,2
		 *       ��ǻ�Ͱ� Win ==> -2,1
		 *                   
		 */
		int res=com-user;
		if(res==-1 || res==2)
			System.out.println("����� Win!!");
		if(res==-2 || res==1)
			System.out.println("��ǻ�� Win!!");
		if(res==0)
			System.out.println("����!!");
		
		
	}

}


























