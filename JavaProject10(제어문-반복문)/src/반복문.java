/*
 *   �ڹٿ��� �����ϴ� �ݺ��� 
 *   => ���� �ҽ��� ������ �ڵ��� �� ��쿡 ��� ��� 
 *   1. while : �ݺ� Ƚ���� �������� ���� ��� (�����ͺ��̽�(����Ŭ))
 *      �Խù� , �����Ǹ�� , ��ȭ��ϵ� ==> web  
 *   2. do~while : �ѹ� �̻��� �ݺ��ϴ� ��쿡 ��� 
 *                 ============= ���ǰ˻� (���߿�)
 *   3. for : �ݺ�Ƚ���� ������ ���
 *      =====
 *      
 *      1) ���� : while,for => �����ǰ˻� ,do~while => �����ǰ˻�
 *      2) ���� :
 *           1-1 while
 *               �ʱⰪ int i=1; ======================== 1
 *               while(���ǹ�) => i<=10  ================ 2
 *               {
 *                  �ݺ����� System.out.println("i="+i); ==== 3
 *                  ������ i++;  ======================== 4 ========> 2������ �̵� 
 *               }
 *               1 (�ʱⰪ) => 2 (�ʱⰪ�� ���� ���ǰ˻�) => 3 �ݺ����� ���� === 4. ������
 *                        => ������ ���� ���� ���ǰ˻� => 3 �ݺ����� ���� === 4. ������
 *                           ====================
 *                           true : 3=>4
 *                           false : ���� 
 *      3) ���ó
 *      
 *      
 *      *
 *      **
 *      ***
 *      ****    
 *      
 *      **
 *      *
 *      ********
 *      ***
 *      **
 *      *
 */
public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======�ݺ����� ������� �ʴ� ���========");
		System.out.println("i=1");
		System.out.println("i=2");
		System.out.println("i=3");
		System.out.println("i=4");
		System.out.println("i=5");
		System.out.println("i=6");
		System.out.println("i=7");
		System.out.println("i=8");
		System.out.println("i=9");
		System.out.println("i=10");
		System.out.println("====== �ݺ����� ����� ��=====");
		int i=1;
		while(i<=10)
		{
			System.out.println("i="+i);
			i++;
		}
		

	}

}











