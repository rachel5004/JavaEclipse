/*
 *   for 
 *   1. ���ó => �ݺ�Ƚ���� ������ ��쿡 �ַ� ��� 
 *   2. while,do~while(1��) ==> for(2�� for)
 *   3. for�� ���� 
 *      1-1. �Ϲ� for    false => ����
 *                 ��  ��  ��  �� ��      
 *                 i=1 i<=10  i++ 
 *                 1���� 10���� 1������              ��  ��  ��
 *           for(�ʱⰪ;���ǽ�;������)
 *           {          �� true
 *                   ��       ��
 *                  �ݺ����๮�� 
 *           }
 *           
 *           ���� ���� 
 *             �ʱⰪ => ���ǽ� (���ǰ˻�)                 �� 
 *                       = true  : => �ݺ����๮�� => �ʱⰪ�� ����(������)
 *                       = false : for���� ���� 
 *      ***1-2. ���� for (JDK1.5�̻�) => web (forEach����)
 *           ==========
 *           1. �迭 , 2. �÷��� 
 *           
 */
public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� Ȧ���� ¦���� �� 
		// �ڡڡ١ڡڡ١ڡڡ١�
        for(int i=1;i<=10;i++)
        {
			 
        	if(i%3==0)
        		System.out.print("��");
        	else
        		System.out.print("��");
        		
        }
	}

}
