/*
 *    switch(���ǽ�) => ����, ���� 
 *    switch(avg/10)
 *    1) ���ǽ��� ��� => ����,���� 
 *    2) ���� ������ case�� ã�´� 
 *    3) case�ؿ� �ִ� ������ ���� 
 *    4) break�� �ִ� ��쿡�� switch�� ���� => break�� ���� ��쿡�� �ؿ� �ִ� case�� ���� 
 *    ***** ������ ������� , ���� ���� ��� �� �� ���� 
 *    ***** ������ break�� ����ϴ� ���� �ƴϴ� 
 *    switch(����)
 *    {
 *      case 1:
 *      case 1:  ===> ���� 
 *    } 
 *    
 *    switch(����) ==> ���� ���ϱ� 
 *    {
 *      case 5:
 *      case 1:
 *      case 3:
 *      case 4:
 *      case 2:  ===> ������ �ƴϴ� (������๮��)
 *    }
 *    
 *    switch(����) ���� => 3
 *    {
 *       case 1:
 *          ���� 1
 *       case 2:
 *          ���� 2
 *       case 3:     ==> ���� 3 , ���� 4 , ���� 5
 *          ���� 3
 *         
 *       case 4:
 *          ���� 4
 *           break;
 *       default :
 *          ���� 5
 *    }
 *    break�� �����ϴ� ��ġ ���� 
 *    
 *    1. switch 
 *       1) case�� ����� �� �ִ� �������� (����, ���� , ���ڿ�)
 *          => �Ǽ� (float,double) , boolean ���� 
 *       2) break �����ġ => case ��ġ���� break�� �ִ� case���� ���� 
 *       3) case�� ����� �ȵ� �����Ͱ� ��� ������ ó���ϱ� ���ؼ��� 
 *          default�� ����Ѵ� (default�� ������ ����)
 *          
 *          ** char�� ������� 
 *          byte < char < int < long < float < double
 *                ======
 *          page 148 
 *          ���ڿ� : jdk1.7�̻� ==> 14.0.2 => ���ڿ��� ��� 
 *          *** case�� ���� �ߺ��Ǹ� �ȵȴ� (����)
 */
// ��Ģ���� (+,-,*,/)
import java.util.Scanner;// ����ڷκ��� Ű���� �Է°��� �޴� ��� 
/*
 *   ���α׷� ���� 
 *   ==========
 *     ����(�迭,Ŭ����) 
 *     ������ 
 *     ��� 
 *     ==============
 *       ���� (�޼ҵ� => ������+���)  println("") Math.random() , nextInt()
 *       �޼ҵ� ������ => Ŭ����
 */
public class ���ù�_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� ������ => ���׿����� (�� 2���� �ʿ�)
		int num1,num2;
		String op;
		// ����ڷκ��� ������ �ޱ� 
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է�:");
		num1=scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		num2=scan.nextInt();
		
		System.out.print("������ �Է�(+,-,*,/):");
		// Scanner => char�� ���� ���ϰ� => ���ڿ��θ� �޴´�  => ���ڿ� �������� (String)
		op=scan.next();
		char c=op.charAt(0);// ���ڿ����� ù��° ���ڸ� �о� �´� 
		
		// ������ ó�� => ���� => 5
		switch(c)
		{
		case 43:
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;
		case 45:
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case 42:
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case 47:
			if(num2==0) // ����ó��
				System.out.println("0���� ���� �� �����ϴ�");
			else
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			break;
		default:
			System.out.println("�߸��� �������Դϴ�");
		}
		
		System.out.println((int)'+');// '+' 43
		System.out.println((int)'-');// '-' 45
		System.out.println((int)'*');// '*' 42
		System.out.println((int)'/');// '/' 47
		// ���ڿ� , ���� , ����

	}

}






