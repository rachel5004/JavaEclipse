// for-each
public class �迭��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        // �ʱ�ȭ
        for(int i=0;i<arr.length;i++)//index��ȣ �̿� 
        {
        	arr[i]=(int)(Math.random()*100)+1; // 1~100������ ������ ���� 
        }
        // ��� => forEach����
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}

}
