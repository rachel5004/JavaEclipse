/*
 *       *
 *      **
 *     ***
 *    ****
 *    ========================
 *      i      j     k          i,j  i,k
 *      �ټ�   ����   ��ǥ
 *      1      3     1          i+j=4  ==> j=4-i  i=k  => k=i
 *      2      2     2
 *      3      1     3
 *      4      0     4
 *    ========================
 *    ****
 *     ***
 *      **
 *       *
 *     i     j    k               i+k=5 => k=5-i
 *    �ټ�   ����   ��ǥ
 *    1      0     4              j+1=i ==> j=i-1  (����) ==> ������
 *    2      1     3
 *    3      2     2
 *    4      3     1
 */
public class ���߹ݺ���_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=4;i++)
        {
        	// ������� 
        	for(int j=1;j<=i-1;j++)
        	{
        		System.out.print(" ");
        	}
        	// ��ǥ���
        	for(int k=1;k<=5-i;k++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}














