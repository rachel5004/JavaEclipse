/*
 *    ��
 *    �ڡ�
 *    �ڡڡ�
 *    �ڡڡڡ�
 *    =================================
 *       i   j
 *      �ټ�  ��ǥ
 *      1     1     i=j   ==> j=i
 *      2     2
 *      3     3
 *      4     4
 *    
 *    �ڡڡڡ�
 *    �ڡڡ�
 *    �ڡ�
 *    ��
 *    ==================================
 *     i   j
 *    �ټ� ��ǥ
 *    1  +  4  = 5 
 *    2  +  3  = 5
 *    3  +  2  = 5
 *    4  +  1  = 5   ==> ���� +
 *    i+j=5  ==> j=5-i  ===> ���� 
 *    
 *    �ڡڡڡڡڡڡڡڡڡ�
 *    �ڡڡڡڡڡڡڡڡڡ�
 *    �ڡڡڡڡڡڡڡڡڡ�
 *    �ڡڡڡڡڡڡڡڡڡ�
 *    �ڡڡڡڡڡڡڡڡڡ�
 *    
 *    ABCD
 *    EFGH
 *    IJKL
 *    MNOP
 *    
 *    ABCD
 *    ABCD
 *    ABCD
 *    ABCD
 */
public class ���߹ݺ���_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=1;i<=4;i++) { for(int j=1;j<=5-i;j++) { System.out.print("��"); }
		 * //�����ٷ� �̵� System.out.println(); }
		 */
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("��");
			}
			System.out.println();
		}*/
		//char c='A';
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=1;j<=4;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		
	}

}







