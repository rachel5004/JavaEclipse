// 1~100������ ��
// 1+2+3+4....+100 ?
public class �ݺ���_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� => 1���� 100���� ����Ǵ� ���� => ��������
		int i=1;
		// 1~100���� ���Ѱ��� �������� 
		int sum=0; // + => ���� (0) , * => 1
		int odd=0;
		int even=0;
		while(i<=100) // 100���� �ݺ��Ѵ� 
		{
			//sum+=i;
			sum=sum+i;
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			/*
			 *   sum = sum +i  
			 *   
			 *   i=1 
			 *   sum =0+1 ==> sum=1
			 *   i=2
			 *   sum= 1+2 ==> sum=3
			 *   i=3
			 *   sum=3+3 ==> sum=6
			 *   --
			 *   --
			 *   --
			 *   sum=()+100 ==> sum=?
			 */
			System.out.println("i="+i+",sum="+sum);
			i++;
		}
		System.out.println("1~100������ ��:"+sum);
		System.out.println("1~100������ ¦����:"+even);
		System.out.println("1~100������ Ȧ����:"+odd);
	}

}
