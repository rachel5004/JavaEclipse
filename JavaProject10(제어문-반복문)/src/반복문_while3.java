// 1~100���� �� , ¦���� , Ȧ���� 
/*
 *    while ����
 *    =========
 *    �ʱⰪ ==> ����      =====> int i=1
 *    while(���ǽ�) ==> �� =====> i<=10
 *    {
 *       �ݺ����� => ����,�� ������ ������ŭ ����
 *       ������ i++;
 *    }
 *    
 *    �ʱⰪ ==> ����    ====> int i=10
 *    while(i>=1)
 *    {
 *       �ݺ����� 
 *       ������ i--;  2���� => i+=2  , 3���� => i+=3 ....
 *    }
 *    
 *    
 *    ===> while�� Ƚ���� ���� ��쿡 �ַ� ��� 
 *         while(true) => ���ѷ���    for(;;)
 *         {
 *            ���� => break;
 *         }
 */
public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� 3�� sum(��ü �մ���) , even(¦����) , odd(Ȧ����)
		int sum=0,even=0,odd=0;
		int i=1; // 1���� 100���� ����Ǵ� ���� 
		while(i<=100)
		{
			// ��ü�� 
			sum=sum+i; // sum+=i
			// ¦���� 
			if(i%2==0)
				even=even+i;
			// Ȧ����
			else
				odd=odd+i;
			i++;
		}
		// ����� ��� 
		System.out.println("1~100������ ����:"+sum);
		System.out.println("1~100������ ¦���� ��:"+even);
		System.out.println("1~100������ Ȧ���� ��:"+odd);
	}

}
