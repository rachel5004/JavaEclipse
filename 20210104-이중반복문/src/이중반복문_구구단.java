/*
 *    2*1=2   =======   9*1=9  ���� 8 ==> ���� for
 *    
 *    
 *    2*9=18  =======   9*9=81
 *    ���� 9 ==> ���� for
 *    
 *    ������ , ������������
 *    (���� for) (1�� for)  => �ݺ��� (if)
 */
public class ���߹ݺ���_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=9;i++) //�ټ� 
        {
        	for(int j=2;j<=9;j++)
        	{
        		System.out.print(j+"*"+i+"="+i*j+"\t");
        		// \t => ���� ����
        	}
        	System.out.println();
        }
	}

}
