// char�� ���� => �빮�� , �ҹ��ڸ� Ȯ���ϴ� ���α׷� ���� ==> �ΰ��� ������ �̿��ؼ� ����ó�� => �������� 
// ��������� => char������ ������ �Ǹ� ���������� ���� 
/*
 *   char alpha='K'
 *   alpha>=65 && alpha<=90  ==> 
 *   alpha>='A' && alpha<='Z'
 *   ��� char���� => ����� ������ ���������� ���� 
 */
public class ��������_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println((int)'Z');
		char alpha=(char)((Math.random()*26)+65); // alpha���� �빮��? �ҹ���?
		// ���� 
		/*
		 *    (char)((Math.random()*25)+65)
		 *           ==================
		 *              1
		 *          =======================
		 *               2
		 *    ======
		 *      3
		 *      
		 *      1. Math.random() => 0.0~0.99*25 ==> 0.0~25.... + 65
		 *                                         (char)65.0~89.000
		 *                                           65~89
		 */
		boolean bCheck=alpha>='A' && alpha<='Z'; //'A'�� 'Z' ���̿� �ִ��� Ȯ��  (&&)
		String result=bCheck==true?"�빮��":"�ҹ���";
		System.out.println(alpha+"��(��) "+result);
		/*
		 *    ���� => �ʱ�ȭ 
		 *    1. ������� �ʱ�ȭ : int a=10;
		 *    2. �Է°� �ޱ� : int a=scan.nextInt()
		 *    3. ������ �ʱ�ȭ: Math.random()
		 */
		
	}

}












