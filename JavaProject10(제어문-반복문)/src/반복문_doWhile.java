/*
 *    do~while : ���ǰ˻��� ���߿� �ϱ� ������ �ݵ�� �ѹ��̻��� ���� 
 *    ����)
 *         �ʱⰪ  int i=1; =====> 1
 *         do
 *         {
 *             �ݺ�����  ======> 2
 *             ������    ======> 3
 *         }while(���ǽ�); =====> 4  ======> 2 ===> 3 ==== 4
 *                                         ================ 4(false�ϰ�쿡 ����)
 *                                         
 *                                         
 *         int i=1; ======================= 1
 *         do{
 *              System.out.println("i="+i);  i=1 i=2 i=3 i=4 i=5
 *              i++; => i=2 i=3 i=4 i=5 i=6
 *         }while(i<=5); 2<=5 true 3<=5 true  4<=5 true  5<=5 true 6<=5 false => ����
 */
// 1~10���� ��� 
// while(i<=10)';' 
// while(���ǽ�) => ������ �� ����  ==> true
public class �ݺ���_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // 1. �ʱⰪ 
		int i=10;
		do
		{
			// 2. �ݺ����� ����Ǵ� ���� 
			System.out.println("i="+i);
			// i���� ���� i=1~i=10
			i++;
		}while(i<=5);
		
		int j=10;// �ѹ��� ������ ���� ���� �ִ�
		while(j<=5)
		{
			System.out.println("Hello");
			i++;
		}
		
	}

}











