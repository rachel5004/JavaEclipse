/*
 *   �ζ� => 1~45���� 6�� ==> �迭 
 */
public class �迭Ȱ��_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 6���� ��ȣ �����ϴ� �޸� ���� : �迭 
		int[] lotto=new int[6];
		// �ʱ�ȭ 
		for(int i=0;i<lotto.length;i++)
		{
			// 0.0 and less than 1.0(0.99) 0~99.0
			lotto[i]=(int)(Math.random()*45)+1;
		}
		// ��� 
		for(int i:lotto)
		{
			System.out.print(i+" ");
			/*
			 * try { Thread.sleep(1000); }catch(Exception ex) {}
			 */
		}
	}

}








