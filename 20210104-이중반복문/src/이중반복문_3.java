/*
 *     *
 *     **
 *     ***
 *     ****
 *     --
 *     --
 *     n��° ==> ����ڰ� �Է��� ���� 
 *      i     j    ===>    i=j ==> j=i
 *     �ټ�   ��ǥ
 *     1      1
 *     2      2
 *     3      3
 *     =
 *     =
 *     =
 *     n      n
 */
// �Է��� ������ŭ ��� 
import java.util.Scanner;
public class ���߹ݺ���_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        // �Էµ� ������ �޾Ƽ� ���� 
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print("��");
        	}
        	System.out.println();
        }
	}

}










