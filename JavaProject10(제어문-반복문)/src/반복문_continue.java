/*
 *    continue : Ư���κ��� �����ϰ� �ٽ� �����Ѵ� 
 *    ========= �ݺ��������� ��� 
 *    
 *    for(�ʱⰪ;���ǽ�;������)
 *    {
 *         �ݺ����� ���� 
 *         if(���ǹ�)
 *           break;  ========> if�� �ִ� ���ǹ��� true => for�� �ߴ� 
 *    }
 *    
 *    �ʱⰪ int i=1
 *    while(���ǽ�) i<=10
 *    {
 *       �ݺ����๮�� 
 *       if(���ǹ�) i==5
 *         continue; ==> ���ǹ��� true�� ��� => while�� ���ǽ����� �̵�  
 *         
 *       ������ 
 *    }
 *        int i=1;i<=10;i++)
 *    for(�ʱⰪ;���ǽ�;������) i=6
 *    {
 *       
 *       if(���ǹ�) i==5
 *         continue; ==> true ==> ���������� �̵� 
 *       �ݺ����๮�� i=1,2,3,4,6,7,8,9,10
 *    }
 */
public class �ݺ���_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=1;
		while(i<=10)
		{
			System.out.println("i="+i);
			if(i==5)
				continue; // ���ǽ����� ����
			
			i++;
		}*/
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;// i++ �̵� 
			System.out.println("i="+i);
		}
		

	}

}














