/*
 *    �ֻ��� 2���� ������ ���� 6�� ������ ����ϰ� �� ������ ����� ��� 
 */
public class ����21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if((i+j)>=10)
				{
					count++;
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		System.out.println("����:"+count);

	}

}
