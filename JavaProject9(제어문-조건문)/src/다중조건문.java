import java.util.Scanner;

/*
 *    �������ǹ� 
 *      => �������� �����߿� �Ѱ��� ������ ������ �� �ְ� ����� ���
 *      ����)
 *           if(���ǹ�)
 *           {
 *               ���ǹ� true�� �����ϴ� ���� => ������ �����ϸ� ���� ===> 
 *           }
 *           else if(���ǹ�)
 *           {
 *               ���ǹ� true�� �����ϴ� ���� => ������ �����ϸ� ���� ===> 
 *           }
 *           else if(���ǹ�)
 *           {
 *               ���ǹ� true�� �����ϴ� ���� => ������ �����ϸ� ���� ===> 
 *           }
 *           --
 *           --
 *           --
 *           else
 *           {
 *                ���ǿ� �ش�Ǵ� ���ǹ��� ���� ��쿡 ����Ǵ� ���� (default) => ������ ����
 *           }
 *           
 *           ������� 
 *             90�̻� => A
 *             80�̻� => B
 *             70�̻� => C
 *             60�̻� => D
 *             ============= �ش� ������ ������ => F
 */
// 3���� ������ �޾Ƽ� ��� , ���� , ���� 
// �ڹٿ��� �����ϴ� Ŭ������ ������ �� ��쿡 ��� (import)
public class �������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����ϴ� �޸� ������ ���� 
		int kor,eng,math,total;
		double avg;
		char score;
		
		// 3���� ������ �޾Ƽ� ���� => ������ �ʱ�ȭ
        Scanner scan=new Scanner(System.in);//Ű����� �Էµ� �����͸� �о���� ��� 
        System.out.print("�������� �������� �������� �Է�(90 80 70):");
        kor=scan.nextInt();
        eng=scan.nextInt();// nextInt (�Ѱ��� �����͸� �о� �´�)
        math=scan.nextInt();
        
        // ���� (������)
        total=kor+eng+math;
        avg=total/3.0;
        
        // ����
        // avg=72.33
        score='A'; 
        if(avg>=90 && avg<=100)
        	score='A';
        ////////////////////////
        if(avg>=80 && avg<90)
        	score='B';
        ////////////////////////
        if(avg>=70 && avg<80)
        	score='C';
        ////////////////////////
        if(avg>=60 && avg<70)
        	score='D';
        if(avg<60)
        	score='F';
        ////////////////////////
        // ��� 
        System.out.println("���� ����:"+kor);
        System.out.println("���� ����:"+eng);
        System.out.println("���� ����:"+math);
        System.out.println("����:"+total);
        System.out.printf("���:%.2f\n",avg);
        System.out.println("����:"+score);
	}

}








