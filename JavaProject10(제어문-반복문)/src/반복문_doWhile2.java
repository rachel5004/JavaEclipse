// 1~100 ��� ����, ¦���� , Ȧ���� => do~while
// ���α׷��� ������ ����: �䱸���� ���
public class �ݺ���_doWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �ʱⰪ => 1
		int i=1;
		// 1~100 ���� ������ �� �ִ� ����,¦���� ����,Ȧ���� ����
		int sum=0,even=0,odd=0;
		do 
		{
			//���� 
			sum+=i;
			// ¦����
			if(i%2==0)
				even+=i;
			else
				odd+=i;// Ȧ������ ���� 
			
			i++; //i=1~i=100 i=101�̸� ���� 
		}while(i<=100);
		// ������ �����͸� ���
		System.out.println("1~100���� ����:"+sum);
		System.out.println("1~100���� ¦����:"+even);
		System.out.println("1~100���� Ȧ����:"+odd);

	}

}
