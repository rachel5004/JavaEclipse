/*
 *   ���ڸ� ���ؼ� ���� => true, ���� => false
 *   6==9 => false
 *   6==6 => true
 *   ============= �񱳿����ڴ� ������� true/false
 *   �񱳿������� ���� 
 *   =============
 *   == ���� 
 *   != ���� �ʴ�
 *   < �۴�
 *   > ũ�� 
 *   <= �۰ų� ����
 *   >= ũ�ų� ���� 
 *   
 *   == 
 *    10==10 true
 *    10!=10 false
 *    10<11 true
 *    10>11 false
 *    10<=10 true  (10==10 || 10<10)
 *                  true       false
 *    10>=10 true  (10==10 || 10>10)
 *                  true      false  ==> ||�� ���߿� �Ѱ��� true => true
 *                  
 *    => ���ϴ� �����͸� ����� �ϰ� ���� ��� 
 */
public class �񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ �ΰ� ���� => ���ؼ� ó��
		int a=10;
		int b=11;
		System.out.println("a==b?"+(a==b));// a�� b���� ������? => false
		System.out.println("a!=b?"+(a!=b));// a�� b���� ���� �ʴ� ? => true
		System.out.println("a<b?"+(a<b));// true
		System.out.println("a>b?"+(a>b));// false
		System.out.println("a<=b?"+(a<=b));// true
		System.out.println("a>=b?"+(a>=b));// false
		// ��� ==> ���ǹ� , �ݺ���(����)���� �ַ� ��� 
		// �Ѿ� => �����ȿ� ��� ������ ���� 
		
		//String dap=b%2==0?"¦��":"Ȧ��";
		//System.out.println(dap);
	}

}























