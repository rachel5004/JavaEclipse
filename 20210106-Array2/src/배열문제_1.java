// ���� ���� 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�
// ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
public class �迭����_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        
        for(int i:arr)
        {
        	if(i%3==0)
        	{
        		System.out.print(i+" ");
        	}
        }*/
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		
		// sum
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n���:"+sum/10.0);
		
	}

}









