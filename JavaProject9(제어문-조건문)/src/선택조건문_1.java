/*
 *     ����)
 *         if(���ǹ�) => ���ǹ�(������,����,��,��)
 *         {
 *             ���ǹ��� true�϶� ó���ϴ� ����
 *             (���������� ������ �� �ִ�)
 *         }
 *         else
 *         {
 *             ���ǹ��� false�϶� ó���ϴ� ����
 *             (���������� ���� �� �� �ִ�)
 *         }
 *         
 *     ����)
 *          if(���ǹ�)
 *          {
 *            ���๮�� 1
 *            ���๮�� 2
 *          }
 *          else =======> if�ؿ��� ó�� (else�� �ܵ� ���๮���� ���� �� ����)
 *            ���๮�� 3
 *          
 *          // �ڹ�
 *          if(���ǹ�){
 *          }
 *          // C
 *          if(���ǹ�)
 *          {
 *          
 *          }
 *          
 *         []
 *         int[] arr
 *         int arr[]
 */
// 3���� ������ �Է� => ��� ==> 60�̻��� Pass �ƴϸ� Non-Pass
import java.util.Scanner;
public class �������ǹ�_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �Է¹��� �����͸� ������ ������ �ʿ� => ���� 4
		int kor,eng,math,avg;
		Scanner scan=new Scanner(System.in);
		// ����� �Է� : ����
		System.out.print("���� ���� ���� ���� �Է�:");// enter, space
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		/*System.out.print("���� ���� �Է�:");
		kor=scan.nextInt();
		
		System.out.print("���� ���� �Է�:");
		eng=scan.nextInt();
		
		System.out.print("���� ���� �Է�:");
		math=scan.nextInt();
		*/
		
		// ��� => ���� (������)
		avg=(kor+eng+math)/3;  // ����/����=���� (�Ҽ��� �����Ѵ�)
		
		// ������� ��� 
		if(avg>=60)
			System.out.println("Pass");
		else
			System.out.println("Non-Pass");
	}
}



















