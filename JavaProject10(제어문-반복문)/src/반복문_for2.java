/*
 *    page 156 
 *    1. for�� �ַ� �ݺ�Ƚ���� �˰� �ִ� ��쿡 ����
 *    2. ����
 *             1     2    4
 *        for(�ʱⰪ;���ǽ�;������)
 *             ���๮�� 3
 *             
 *              1->2->3->4
 *                 2->3->4
 *                 2->3->4
 *                 ==
 *                 false�� ���� 
 *         ***** {}�� ������ �ٷ� ���ִ� ���常 �ݺ����� �ȴ� 
 *         ��)
 *             for(int i=1;i<=5;i++)
 *                System.out.println("i="+i);
 *            ==================================
 *                System.out.println("Hello");
 *                
 *             for(int i=1;i<=5;i++)
 *             {
 *                System.out.println("i="+i);
 *                System.out.println("Hello");
 *             }
 *             
 *             1. �ʱ�ȭ 
 *                for(int i=0;
 *                    ========
 *                    => ���α׷��� �°� �ʱ�ȭ�� �Ѵ� (�⺻��, 0,1)
 *                    => �ڹٴ� ���� 0
 *             2. ���ǽ�
 *                for(int i=0;i<10;
 *                            ======
 *                    �ݺ��� ��� ���� ���� 
 *             3. ������ 
 *                for(int i=0;i<10;i++)
 *                                 ====
 *                     i-- , i+=2 , i+=3....
 */
public class �ݺ���_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // A~Z
		for(char alpha='A';alpha<='Z';alpha++)
		{
			System.out.print(alpha);
		}
		System.out.println();// �����ٿ� ��� 
		// Z~A
		for(char alpha='Z';alpha>='A';alpha--)
		{
			System.out.print(alpha);
		}
	}

}














