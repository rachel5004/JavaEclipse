/*
 *     1.	100~999���̿� 7�� ����� ������ ���� ����ϴ� ���α׷� �ۼ�
 *     2.	100~999 ������ 4�ǹ���� �ƴ� ���� ����,���� ����ϴ� ���α׷� �ۼ�
 *     3.	1~30 ¦����,Ȧ������ ����ϴ� ���α׷��� �ۼ�
 *     4.	1~100 3�� ����̰� 5�� ����� ����ϴ� ���α׷� �ۼ�
 *     5.	1~1000�������� 7�� ����� �� ,9�� ����� ��
 *     6.	10~99���� �����߿� ���� �ڸ��� ������ ����Ͻÿ�
 *     7.	���� �Է��� �޾Ƽ� 60�̻� �հ� =>���հ�  if~else
 *     
		8.	int[] num = { 94, 85, 95, 88, 90 };
		
		���� �迭���� �ִ밪,�ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�

        9.	������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� 
			�迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
			��) ������ ������ : 3 6 3 6 1 3 8 9 6 9 
			����� 5.4
			[Hint] 1���� 10���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�.
			int i  = (int)(Math.random()*10)+1;
	    10.	������ ���� ������ ������ �迭�� �����ϰ� �����ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
public class ����Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1��
		/*int count=0,a7=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				count++;
				a7+=i;
			}
		}
		System.out.println(count);
		System.out.println(a7);*/
		// 2��
		/*int count=0,a4=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				count++;
				a4+=i;
			}
		}
		System.out.println(count);
		System.out.println(a4);*/
		//3��
		/*int even=0,odd=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
			else
			{
				odd+=i;
			}
		}
		System.out.println(even);
		System.out.println(odd);*/
		// 4��
		/*for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}*/
		//5��
		/*
		int a7=0,a9=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
				a7+=i;
			if(i%9==0)
				a9+=i;
		}
		System.out.println(a7);
		System.out.println(a9);
		System.out.println(a7+a9);*/
		// 6��
		/*for(int i=10;i<=99;i++)
		{
			int a=i/10;
			int b=i%10;
			if(a==b)
			{
				System.out.print(i+" ");
			}
		}*/
		// 7��
		/*
		int score=(int)(Math.random()*101);//0~100
		if(score>=60)
			System.out.println(score+":�հ�");
		else
			System.out.println(score+":���հ�");*/
		/*
		int[] num = { 94, 85, 95, 88, 90 };
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i]) // 94/94 , max=94,  94/95 max=95 
				max=num[i];
			if(min>num[i])
				min=num[i];
		}
		System.out.println(max);
		System.out.println(min);*/
		int[] arr=new int[10];// ��� �� : 0
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		int sum=0;
		//double avg=0.0;
		for(int i:arr)
		{
			sum+=i;
		}
		
		// arr�� ����� ������ ���
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n���:"+(sum/10.0));
		
	}

}








