/*   �ڹ� ǥ���� 
 *   =========
 *   
 *     1. ���� 
 *          = 10,20,30 => 10����
 *          = 012,013,011 => 8����  ==>
 *             ===
 *             8^1+8^0*2
 *             === ======
 *              8      2 ==> 10
 *            = 10,11,12
 *          = 0xFF ==> 16���� 
 *            ==
 *          = 0b00001010 ==> 2����
 *         =============== 
 *          0 => 8����
 *          0x => 16����
 *          0b => 2����
 *         ===============
 *     2. ���� :  ���� �Ѱ�    'A' 'ȫ'
 *     3. ���ڿ� : ���� ������  "ABC" "ȫ�浿"
 *     4. �� : true/false
 *     
 *     
 */

// ���� �ּ� => ������(���� ��ȯ) => �����Ͽ��� ���ܰ� �Ǵ� �κ�
// ���� => �ҽ� �м� 
/*
 *   ������ �ּ� 
 */
/*
 *   ================================
 *   1. ��ҹ��� ���� 
 *   2. ��ɹ��� ���� �Ǹ� ; (�Ѱ��� ���)
 *   ================================ ��Ŭ�������� �ٷ� ����ش� 
 *   3. �鿩���� (����ó��X)
 *   
 *   class A
 *   {
	 *   public void main()
	 *   {
		 *   System.out.println("ABCD");
		 *   System.out.println("ABCD");
		 *   System.out.println("ABCD");
	 *   }
 *   }
 *   
 *   4. ��� 
 *     ================ �ѱ۵� ���� 
 *     1) Ŭ������ : �빮�� ���� 
 *     2) ������ : �ҹ��� ����
 *     3) �޼ҵ�� : �ҹ��� ���� 
 *     
 *     github.com/chaijewon
 */
public class MainClass {
    // �ڵ����� ù��° �о ó�� (main=>��� ���α׷��� �Ѱ� �̻��� ����)
	// ���� 
	public static void main(String[] args) {
		System.out.println("Hello ");
		// �ҽ��� �ڵ��ϴ� ��ġ 
		/*System.out.println('A');//��ɹ�
		// ln => new Line
		System.out.println("ABCD");
		System.out.println(true);
		System.out.println(false);
		System.out.println(011);
		System.out.println(0b01111);
		System.out.println(0xFB);
		System.out.println(10+100);
		// ��� ��� 3���� 
		System.out.print("Hello");
		System.out.print("Java");*/
		/*
		 *   ����� ������ => ������ ó�� (�˰���) : ������ 
		 *                 =========
		 */
	}
	/*
	 *   MainClass.java =========> MainClass.class ========> "Hello Java"
	 *                    javac                     java
	 */

}
