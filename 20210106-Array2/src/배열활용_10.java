// ���� �߱����� 
/*
 *   UPDOWN 
 *   ======
 *     369 => 123 ==> 0S-1B
 *         => 345 ==> 1S-0B
 *         => 396 ==> 1S-2B
 *         => 369 ==> 3S-0B ==> Game Over!!
 *         
 *         1 2 3 4 5 6 7 9 10
 */
public class �迭Ȱ��_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// ������ �����ϴ� ���� 
		int su=0;
		// �ߺ����� Ȯ���ϴ� ���� 
		boolean bCheck=false;
		for(int i=0;i<arr.length;i++)
		{
			bCheck=true;
			// 1 ==> 2 ==> 2
			while(bCheck)
			{
				// ���� �߻� => �� (�ߺ� ���� Ȯ��)
				su=(int)(Math.random()*10)+1;
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(arr[j]==su)
					{
						bCheck=true;
						break;// continue ==> �ڽ��� �ݺ����� ����
					}
				}
			}
			arr[i]=su;
		}
		// ���
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
